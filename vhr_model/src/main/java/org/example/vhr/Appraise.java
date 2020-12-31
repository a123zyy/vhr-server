package org.example.vhr;

import java.util.Date;
import lombok.Data;

@Data
public class Appraise {
    private Integer id;

    private Integer eid;

    /**
     * 考评日期
     */
    private Date appdate;

    /**
     * 考评结果
     */
    private String appresult;

    /**
     * 考评内容
     */
    private String appcontent;

    /**
     * 备注
     */
    private String remark;
}