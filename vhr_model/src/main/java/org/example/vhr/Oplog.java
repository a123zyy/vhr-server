package org.example.vhr;

import java.util.Date;
import lombok.Data;

@Data
public class Oplog {
    private Integer id;

    /**
     * 添加日期
     */
    private Date adddate;

    /**
     * 操作内容
     */
    private String operate;

    /**
     * 操作员ID
     */
    private Integer hrid;
}