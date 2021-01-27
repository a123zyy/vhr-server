package org.example.vhr.controller.config.chat;

import org.example.vhr.Hr;
import org.example.vhr.HrExample;
import org.example.vhr.HrService;
import org.example.vhr.controller.config.ChatMsg;
import org.example.vhr.controller.until.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
@CrossOrigin(origins = "*")
public class chatInfo {


    @Autowired
    private HrService hrService;

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @GetMapping("/chat/hrs")
    public Result getHrs(){
       return Result.success(hrService.selectByExample(new HrExample()));
    }

    @MessageMapping("/ws/chat")
    public void handleMsg(Authentication authentication, ChatMsg chatMsg) {
        System.out.println(chatMsg.getFromNickname());
        System.out.println(chatMsg.getContent());
        Hr hr = (Hr) authentication.getPrincipal();
        chatMsg.setFrom(hr.getUsername());
        chatMsg.setFromNickname(hr.getName());
        chatMsg.setDate(new Date());
        simpMessagingTemplate.convertAndSendToUser(chatMsg.getTo(), "/queue/chat", chatMsg);
    }


}
