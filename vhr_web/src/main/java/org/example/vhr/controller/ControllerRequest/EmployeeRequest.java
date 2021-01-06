package org.example.vhr.controller.ControllerRequest;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.example.vhr.Department;
import org.example.vhr.Employee;
import org.example.vhr.Joblevel;
import org.example.vhr.Nation;
import org.example.vhr.Politicsstatus;
import org.example.vhr.Position;
import org.example.vhr.Salary;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeRequest extends Employee {
  private  Integer pageNo;
  private  Integer pageSize;
  private Long total;
  private List<EmployeeRequest> data;

  private Nation nation;

  private Politicsstatus politicsstatus;

  private Department department;

  private Position position;

  private Joblevel jobLevel;

  private Salary salary;


//  private String birthday;
//  private String begindate;
//  private String conversiontime;
//  private String begincontract;
//  private String endcontract;





}
