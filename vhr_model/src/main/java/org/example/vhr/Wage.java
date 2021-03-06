package org.example.vhr;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class Wage {
    private Integer id;

    private Integer uid;

    /**
     * 员工名
     */
    private String staffName;

    private Integer salaryId;

    /**
     * 基础工资
     */
    private Double baseSalary;

    /**
     * 项目奖金
     */
    private Double projectBonus;

    /**
     * 工龄奖金
     */
    private Double jobsYearBonus;

    /**
     * 其他奖金
     */
    private Double otherBonus;

    /**
     * 职能奖金
     */
    private Double positionBonus;

    /**
     * 绩效奖金
     */
    private Double performanceBonus;

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date createTime;

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date updateTime;

    /**
     * 状态 1 可用 0不可用
     */
    private Boolean status;
}