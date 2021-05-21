package org.example.vhr.controller.webcontroller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.example.vhr.Employee;
import org.example.vhr.RewardAndPunishment;
import org.example.vhr.RewardAndPunishmentExample;
import org.example.vhr.RewardAndPunishmentService;
import org.example.vhr.controller.ControllerRequest.RewardAndPunishmentRequest;
import org.example.vhr.controller.config.enums.RewardAndPunishmentEnum;
import org.example.vhr.controller.until.Global;
import org.example.vhr.controller.until.Result;
import org.example.vhr.controller.until.ResultController;
import org.example.vhr.controller.until.ResultMsg;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rewardAndPunish")
@CrossOrigin(origins = "*")
public class RewardAndPunishController {

    @Autowired
    public RewardAndPunishmentService punishmentService;

    @GetMapping("/")
    public Result getRewardAndPunish(int pageSize,int pageNum){
        RewardAndPunishmentExample example = new RewardAndPunishmentExample();
        example.or().andStatusEqualTo(RewardAndPunishmentEnum.IS_STATUS.val);
        PageHelper.startPage(pageSize,pageNum,true);
        PageInfo<RewardAndPunishment> pageInfo = new PageInfo<RewardAndPunishment>(punishmentService.selectByExample(example));
        ResultController resultController = new ResultController();
        resultController.setList(pageInfo.getList());
        resultController.setTotal(pageInfo.getTotal());
        return Result.success(resultController);
    }

    @PostMapping("/add")
    public Result add(@RequestBody RewardAndPunishmentRequest andPunishmentRequest){
        if (andPunishmentRequest == null){
            return Result.error(ResultMsg.CLASS_NOT_FOUND_ERR);
        }
        if (andPunishmentRequest.getRewardPunishmentType() == null ||andPunishmentRequest.getEmpId() == null || andPunishmentRequest.getImplementationData() == null){
            return Result.error(ResultMsg.CLASS_NOT_FOUND_ERR);
        }
        RewardAndPunishment rewardAndPunishment = new RewardAndPunishment();
        BeanUtils.copyProperties(andPunishmentRequest,rewardAndPunishment);
        punishmentService.insertSelective(rewardAndPunishment);
        return Result.success("成功");

    };

    @PostMapping("/update")
    public Result update(@RequestBody RewardAndPunishmentRequest andPunishmentRequest){
        if (andPunishmentRequest == null){
            return Result.error(ResultMsg.CLASS_NOT_FOUND_ERR);
        }
        if (andPunishmentRequest.getRewardPunishmentType() == null ||andPunishmentRequest.getEmpId() == null || andPunishmentRequest.getImplementationData() == null){
            return Result.error(ResultMsg.CLASS_NOT_FOUND_ERR);
        }
        RewardAndPunishment rewardAndPunishment = punishmentService.selectByPrimaryKey(andPunishmentRequest.getId());
        BeanUtils.copyProperties(andPunishmentRequest,rewardAndPunishment);
        punishmentService.updateByPrimaryKeySelective(rewardAndPunishment);
        return Result.success("成功");
    };

    @GetMapping("/del")
    public Result delById(int id,int status){
        if (0 == id){
            return Result.error(ResultMsg.CLASS_NOT_FOUND_ERR);
        }
        RewardAndPunishment rewardAndPunishment = punishmentService.selectByPrimaryKey(id);
        rewardAndPunishment.setStatus(status);
        punishmentService.updateByPrimaryKeySelective(rewardAndPunishment);
        return Result.success("成功");
    };
}
