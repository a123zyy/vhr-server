package org.example.vhr.controller.ControllerRequest;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.example.vhr.controller.customConfig.SizeJudge;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;


/**
 * @author zyy
 */
@Data
public class RewardAndPunishmentRequest {

    public int id;

    public Boolean rewardPunishmentType;

    @Min(value = 1, message = "年龄有误！")
    @Max(value = 100, message = "年龄有误！")
    public Double rewardPunishmentPrice;

    public String rewardPunishmentItems;

    @NotNull(message = "用户ID不能为空")
    public Integer empId;

    @NotEmpty
    public String empName;

    @NotEmpty
    public String deptName;

    @NotNull(message = "部门id不能为空")
    public Integer deptId;

    @NotEmpty
    public String positionName;

    @NotNull(message = "职位id不能为空")
    public Integer positionId;

    @NotNull(message = "职位类型不能为空")
    public String positionType;

    @SizeJudge(message = "长度不能超于100")
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
