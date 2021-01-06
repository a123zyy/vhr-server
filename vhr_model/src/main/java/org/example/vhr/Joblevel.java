package org.example.vhr;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class Joblevel {
    /**
     *
     */
    private Integer id;

    /**
     * 职称名称
     */
    private String name;

    /**
     *
     */
    private Object titleLevel;

    /**
     *
     */
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date createDate;

    /**
     *
     */
    private Boolean enabled;
}

