package org.example.vhr.controller.ControllerRequest;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;


/**
 * @author zyy
 */
@Data
public class RewardAndPunishmentRequest {

    public int id;

    public Boolean rewardPunishmentType;

    public Double rewardPunishmentPrice;

    public String rewardPunishmentItems;

    @NotNull(message = "用户ID不能为空")
    public Integer empId;

    public String empName;

    public String deptName;

    public Integer deptId;

    public String positionName;

    public Integer positionId;

    public String positionType;

//    @SizeJudge(message = "长度不能超于100")
    @Size(message = "长度不能超于100",max = 100)
    public String remark;


    /**
     * 0 未生效 1已生效 3已取消
     */
    public Boolean status;

    /**
     * 生效日期
     */
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @NotNull(message = "时间不能为null")
    public Date implementationData;

}
