package org.example.vhr;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class EmployeeecService {

    @Resource
    private EmployeeecMapper employeeecMapper;


    public long countByExample(EmployeeecExample example) {
        return employeeecMapper.countByExample(example);
    }


    public int deleteByExample(EmployeeecExample example) {
        return employeeecMapper.deleteByExample(example);
    }


    public int deleteByPrimaryKey(Integer id) {
        return employeeecMapper.deleteByPrimaryKey(id);
    }


    public int insert(Employeeec record) {
        return employeeecMapper.insert(record);
    }


    public int insertSelective(Employeeec record) {
        return employeeecMapper.insertSelective(record);
    }


    public List<Employeeec> selectByExample(EmployeeecExample example) {
        return employeeecMapper.selectByExample(example);
    }


    public Employeeec selectByPrimaryKey(Integer id) {
        return employeeecMapper.selectByPrimaryKey(id);
    }


    public int updateByExampleSelective(Employeeec record, EmployeeecExample example) {
        return employeeecMapper.updateByExampleSelective(record, example);
    }


    public int updateByExample(Employeeec record, EmployeeecExample example) {
        return employeeecMapper.updateByExample(record, example);
    }


    public int updateByPrimaryKeySelective(Employeeec record) {
        return employeeecMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Employeeec record) {
        return employeeecMapper.updateByPrimaryKey(record);
    }

}




