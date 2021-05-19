package org.example.vhr;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class Position {


    private Integer id;

    /**
     * 职位
     */
    private String name;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createDate;

    /**
     * 0 实习 1 初级 2中级 3高级
     */
    private Byte positionType;

    private Boolean enabled;
}