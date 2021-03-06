package org.example.vhr.controller.ControllerRequest;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
/**
 * @Scope("prototype") prototype原型模式(多例) -- 每次获取Bean的时候会有一个新的实例
 * */
//@Scope("prototype")
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
