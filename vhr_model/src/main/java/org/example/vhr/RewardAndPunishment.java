package org.example.vhr;

import java.util.Date;
import lombok.Data;

@Data
public class RewardAndPunishment {
    private Integer id;

    /**
    * 1 奖励 2惩罚
    */
    private Boolean rewardPunishmentType;

    private Double rewardPunishmentPrice;

    private String rewardPunishmentItems;

    /**
    * 0 未生效 1已生效 3已取消
    */
    private Boolean status;

    private Date createDate;

    /**
    * 生效日期
    */
    private Date implementationData;
}