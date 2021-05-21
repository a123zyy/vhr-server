package org.example.vhr.controller.ControllerRequest;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmpAdvancRequest {

    private int id;

    private String username;

    private String deptName;

    private int deptId;

    private String email;

    private Long month;

    private int positionID;

    private String positionName;

    private String positionType;

}
