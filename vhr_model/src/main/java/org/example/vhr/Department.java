package org.example.vhr;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Department {
    /**
     *
     */
    private Integer id;

    /**
     * 部门名称
     */
    private String name;

    /**
     *
     */
    private Integer parentId;

    /**
     *
     */
    private String depPath;

    /**
     *
     */
    private Boolean enabled;

    /**
     *
     */
    private Boolean isParent;


    private Integer result;

    private List<Department> children;

}

