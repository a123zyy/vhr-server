package org.example.vhr.controller.ControllerRequest;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class RewardAndPunishmentRequest  {

    private int id;

    private Boolean rewardPunishmentType;

    private Double rewardPunishmentPrice;

    private String rewardPunishmentItems;

    private Integer empId;

    private String empName;

    private String deptName;

    private Integer deptId;

    private String positionName;

    private Integer positionId;

    private String positionTypt;

    /**
     * 0 未生效 1已生效 3已取消
     */
    private Boolean status;

    /**
     * 生效日期
     */
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date implementationData;
}
