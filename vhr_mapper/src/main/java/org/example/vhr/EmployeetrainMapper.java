package org.example.vhr;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.example.vhr.Employeetrain;
import org.example.vhr.EmployeetrainExample;

public interface EmployeetrainMapper {
    long countByExample(EmployeetrainExample example);

    int deleteByExample(EmployeetrainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Employeetrain record);

    int insertSelective(Employeetrain record);

    List<Employeetrain> selectByExample(EmployeetrainExample example);

    Employeetrain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Employeetrain record, @Param("example") EmployeetrainExample example);

    int updateByExample(@Param("record") Employeetrain record, @Param("example") EmployeetrainExample example);

    int updateByPrimaryKeySelective(Employeetrain record);

    int updateByPrimaryKey(Employeetrain record);
}