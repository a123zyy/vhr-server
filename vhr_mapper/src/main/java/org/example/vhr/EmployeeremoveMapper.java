package org.example.vhr;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.example.vhr.Employeeremove;
import org.example.vhr.EmployeeremoveExample;

public interface EmployeeremoveMapper {
    long countByExample(EmployeeremoveExample example);

    int deleteByExample(EmployeeremoveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Employeeremove record);

    int insertSelective(Employeeremove record);

    List<Employeeremove> selectByExample(EmployeeremoveExample example);

    Employeeremove selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Employeeremove record, @Param("example") EmployeeremoveExample example);

    int updateByExample(@Param("record") Employeeremove record, @Param("example") EmployeeremoveExample example);

    int updateByPrimaryKeySelective(Employeeremove record);

    int updateByPrimaryKey(Employeeremove record);
}