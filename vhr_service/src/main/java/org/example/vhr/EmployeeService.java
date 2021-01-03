package org.example.vhr;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class EmployeeService {

    @Resource
    private EmployeeMapper employeeMapper;


    public long countByExample(EmployeeExample example) {
        return employeeMapper.countByExample(example);
    }


    public int deleteByExample(EmployeeExample example) {
        return employeeMapper.deleteByExample(example);
    }


    public int deleteByPrimaryKey(Integer id) {
        return employeeMapper.deleteByPrimaryKey(id);
    }


    public int insert(Employee record) {
        return employeeMapper.insert(record);
    }


    public int insertSelective(Employee record) {
        return employeeMapper.insertSelective(record);
    }


    public List<Employee> selectByExample(EmployeeExample example) {
        return employeeMapper.selectByExample(example);
    }


    public Employee selectByPrimaryKey(Integer id) {
        return employeeMapper.selectByPrimaryKey(id);
    }


    public int updateByExampleSelective(Employee record, EmployeeExample example) {
        return employeeMapper.updateByExampleSelective(record, example);
    }


    public int updateByExample(Employee record, EmployeeExample example) {
        return employeeMapper.updateByExample(record, example);
    }


    public int updateByPrimaryKeySelective(Employee record) {
        return employeeMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Employee record) {
        return employeeMapper.updateByPrimaryKey(record);
    }

}




