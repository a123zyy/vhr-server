package org.example.vhr;

import java.util.Date;
import lombok.Data;

@Data
public class Joblevel {
    private Integer id;

    /**
     * 职称名称
     */
    private String name;

    private Object titlelevel;

    private Date createdate;

    private Boolean enabled;
}