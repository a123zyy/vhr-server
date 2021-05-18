package org.example.vhr;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;

@ApiModel(value = "org-example-vhr-Employee")
public class Employee {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Object getWedlock() {
        return wedlock;
    }

    public void setWedlock(Object wedlock) {
        this.wedlock = wedlock;
    }

    public Integer getNationId() {
        return nationId;
    }

    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public Integer getPoliticId() {
        return politicId;
    }

    public void setPoliticId(Integer politicId) {
        this.politicId = politicId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getJobLevelId() {
        return jobLevelId;
    }

    public void setJobLevelId(Integer jobLevelId) {
        this.jobLevelId = jobLevelId;
    }

    public Integer getPosId() {
        return posId;
    }

    public void setPosId(Integer posId) {
        this.posId = posId;
    }

    public String getEngageForm() {
        return engageForm;
    }

    public void setEngageForm(String engageForm) {
        this.engageForm = engageForm;
    }

    public Object getTiptopDegree() {
        return tiptopDegree;
    }

    public void setTiptopDegree(Object tiptopDegree) {
        this.tiptopDegree = tiptopDegree;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Object getWorkState() {
        return workState;
    }

    public void setWorkState(Object workState) {
        this.workState = workState;
    }

    public String getWorkID() {
        return workID;
    }

    public void setWorkID(String workID) {
        this.workID = workID;
    }

    public Double getContractTerm() {
        return contractTerm;
    }

    public void setContractTerm(Double contractTerm) {
        this.contractTerm = contractTerm;
    }

    public Date getConversionTime() {
        return conversionTime;
    }

    public void setConversionTime(Date conversionTime) {
        this.conversionTime = conversionTime;
    }

    public Date getNotWorkDate() {
        return notWorkDate;
    }

    public void setNotWorkDate(Date notWorkDate) {
        this.notWorkDate = notWorkDate;
    }

    public Date getBeginContract() {
        return beginContract;
    }

    public void setBeginContract(Date beginContract) {
        this.beginContract = beginContract;
    }

    public Date getEndContract() {
        return endContract;
    }

    public void setEndContract(Date endContract) {
        this.endContract = endContract;
    }

    public Integer getWorkAge() {
        return workAge;
    }

    public void setWorkAge(Integer workAge) {
        this.workAge = workAge;
    }

    /**
     * 员工编号
     */
    @ApiModelProperty(value = "员工编号")
    private Integer id;

    /**
     * 员工姓名
     */
    @ApiModelProperty(value = "员工姓名")
    private String name;

    /**
     * 性别
     */
    @ApiModelProperty(value = "性别")
    private String gender;

    /**
     * 出生日期
     */
    @ApiModelProperty(value = "出生日期")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date birthday;

    /**
     * 身份证号
     */
    @ApiModelProperty(value = "身份证号")
    private String idCard;

    /**
     * 婚姻状况
     */
    @ApiModelProperty(value = "婚姻状况")
    private Object wedlock;

    /**
     * 民族
     */
    @ApiModelProperty(value = "民族")
    private Integer nationId;

    /**
     * 籍贯
     */
    @ApiModelProperty(value = "籍贯")
    private String nativePlace;

    /**
     * 政治面貌
     */
    @ApiModelProperty(value = "政治面貌")
    private Integer politicId;

    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 电话号码
     */
    @ApiModelProperty(value = "电话号码")
    private String phone;

    /**
     * 联系地址
     */
    @ApiModelProperty(value = "联系地址")
    private String address;

    /**
     * 所属部门
     */
    @ApiModelProperty(value = "所属部门")
    private Integer departmentId;

    /**
     * 职称ID
     */
    @ApiModelProperty(value = "职称ID")
    private Integer jobLevelId;

    /**
     * 职位ID
     */
    @ApiModelProperty(value = "职位ID")
    private Integer posId;

    /**
     * 聘用形式
     */
    @ApiModelProperty(value = "聘用形式")
    private String engageForm;

    /**
     * 最高学历
     */
    @ApiModelProperty(value = "最高学历")
    private Object tiptopDegree;

    /**
     * 所属专业
     */
    @ApiModelProperty(value = "所属专业")
    private String specialty;

    /**
     * 毕业院校
     */
    @ApiModelProperty(value = "毕业院校")
    private String school;

    /**
     * 入职日期
     */
    @ApiModelProperty(value = "入职日期")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date beginDate;

    /**
     * 在职状态
     */
    @ApiModelProperty(value = "在职状态")
    private Object workState;

    /**
     * 工号
     */
    @ApiModelProperty(value = "工号")
    private String workID;

    /**
     * 合同期限
     */
    @ApiModelProperty(value = "合同期限")
    private Double contractTerm;

    /**
     * 转正日期
     */
    @ApiModelProperty(value = "转正日期")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date conversionTime;

    /**
     * 离职日期
     */
    @ApiModelProperty(value = "离职日期")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date notWorkDate;

    /**
     * 合同起始日期
     */
    @ApiModelProperty(value = "合同起始日期")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date beginContract;

    /**
     * 合同终止日期
     */
    @ApiModelProperty(value = "合同终止日期")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date endContract;

    /**
     * 工龄
     */
    @ApiModelProperty(value = "工龄")
    private Integer workAge;
}

