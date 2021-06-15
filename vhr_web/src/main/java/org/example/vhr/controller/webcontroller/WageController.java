package org.example.vhr.controller.webcontroller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.example.vhr.RewardAndPunishment;
import org.example.vhr.RewardAndPunishmentExample;
import org.example.vhr.Wage;
import org.example.vhr.WageExample;
import org.example.vhr.WageService;
import org.example.vhr.controller.ControllerRequest.EmployeeRequest;
import org.example.vhr.controller.ControllerRequest.RewardAndPunishmentRequest;
import org.example.vhr.controller.ControllerRequest.WageRequest;
import org.example.vhr.controller.config.checkConfig;
import org.example.vhr.controller.config.enums.RewardAndPunishmentEnum;
import org.example.vhr.controller.config.enums.WageEnum;
import org.example.vhr.controller.until.Global;
import org.example.vhr.controller.until.Result;
import org.example.vhr.controller.until.ResultController;
import org.example.vhr.controller.until.ResultMsg;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RequestMapping("/wage")
@RestController
@CrossOrigin(origins = "*")
public class WageController {

    @Autowired
    public WageService wageService;

    @GetMapping("/")
    public Result getWageList(int pageSize, int pageNum){
        Page<Wage> WagePage = new Page<>(pageNum, pageSize);
        IPage<Wage> iPage = wageService.selectPageText(WagePage, WageEnum.IS_STATUS.val);
        ResultController resultController = new ResultController();
        resultController.setList(
                iPage.getRecords().stream().map(item->{
                    WageRequest wageRequest = new WageRequest();
                    BeanUtils.copyProperties(item,wageRequest);
                    return wageRequest;
                }).collect(Collectors.toList())
        );
        resultController.setPageSize(pageSize);
        resultController.setTotal(iPage.getTotal());
        resultController.setPageNo(pageNum);
        return Result.success(resultController);
    }

    @PostMapping("/add")
    @Validated
    public Result add(@RequestBody WageRequest wageRequest){
        Wage wage = new Wage();
        BeanUtils.copyProperties(wageRequest,wage);
        wageService.insertSelective(wage);
        return Result.success("");


    };

    @PostMapping("/update")
    @Validated
    public Result update(@RequestBody WageRequest wageRequest){
        Wage wage = wageService.selectByPrimaryKey(wageRequest.getId());
        BeanUtils.copyProperties(wageRequest,wage);
        wageService.updateByPrimaryKeySelective(wage);
        return Result.success("");
    };
}
