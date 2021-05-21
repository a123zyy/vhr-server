package org.example.vhr;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class RewardAndPunishment {
    private Integer id;

    /**
     * 1 奖励 0惩罚
     */
    private Boolean rewardPunishmentType;

    private Double rewardPunishmentPrice;

    /**
     * 奖惩物品
     */
    private String rewardPunishmentItems;

    /**
     * 0 未生效 1已生效 3已取消
     */
    private Integer status;

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date createDate;

    /**
     * 生效日期
     */
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date implementationData;

    private Integer empId;

    private String empName;

    private String deptName;

    private Integer deptId;

    private String positionName;

    private Integer positionId;

    private String positionType;

    private String remark;
}