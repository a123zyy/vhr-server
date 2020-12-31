package org.example.vhr;

import lombok.Data;

@Data
public class Department {
    private Integer id;

    /**
     * 部门名称
     */
    private String name;

    private Integer parentid;

    private String deppath;

    private Boolean enabled;

    private Boolean isparent;
}