package org.example.vhr;

import java.util.Date;
import lombok.Data;

@Data
public class Employeeec {
    private Integer id;

    /**
     * 员工编号
     */
    private Integer eid;

    /**
     * 奖罚日期
     */
    private Date ecdate;

    /**
     * 奖罚原因
     */
    private String ecreason;

    /**
     * 奖罚分
     */
    private Integer ecpoint;

    /**
     * 奖罚类别，0：奖，1：罚
     */
    private Integer ectype;

    /**
     * 备注
     */
    private String remark;
}