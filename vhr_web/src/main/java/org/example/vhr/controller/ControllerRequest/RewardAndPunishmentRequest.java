package org.example.vhr.controller.ControllerRequest;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.example.vhr.controller.customConfig.SizeJudge;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


/**
 * @author zyy
 */
public class RewardAndPunishmentRequest implements Serializable {

    public int id;

    public Boolean rewardPunishmentType;

    public Double rewardPunishmentPrice;

    public String rewardPunishmentItems;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getRewardPunishmentType() {
        return rewardPunishmentType;
    }

    public void setRewardPunishmentType(Boolean rewardPunishmentType) {
        this.rewardPunishmentType = rewardPunishmentType;
    }

    public Double getRewardPunishmentPrice() {
        return rewardPunishmentPrice;
    }

    public void setRewardPunishmentPrice(Double rewardPunishmentPrice) {
        this.rewardPunishmentPrice = rewardPunishmentPrice;
    }

    public String getRewardPunishmentItems() {
        return rewardPunishmentItems;
    }

    public void setRewardPunishmentItems(String rewardPunishmentItems) {
        this.rewardPunishmentItems = rewardPunishmentItems;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getPositionType() {
        return positionType;
    }

    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getImplementationData() {
        return implementationData;
    }

    public void setImplementationData(Date implementationData) {
        this.implementationData = implementationData;
    }

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

    @SizeJudge(message = "简介不能多于100个字")
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
