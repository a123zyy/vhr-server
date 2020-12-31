package org.example.vhr;

import java.util.Date;
import lombok.Data;

@Data
public class Position {
    private Integer id;

    /**
     * 职位
     */
    private String name;

    private Date createdate;

    private Boolean enabled;
}