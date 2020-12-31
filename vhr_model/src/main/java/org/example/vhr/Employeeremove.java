package org.example.vhr;

import java.util.Date;
import lombok.Data;

@Data
public class Employeeremove {
    private Integer id;

    private Integer eid;

    /**
     * 调动后部门
     */
    private Integer afterdepid;

    /**
     * 调动后职位
     */
    private Integer afterjobid;

    /**
     * 调动日期
     */
    private Date removedate;

    /**
     * 调动原因
     */
    private String reason;

    private String remark;
}