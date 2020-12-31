package org.example.vhr;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import org.example.vhr.Employeeremove;
import org.example.vhr.EmployeeremoveMapper;
import org.example.vhr.EmployeeremoveExample;

@Service
public class EmployeeremoveService {

    @Resource
    private EmployeeremoveMapper employeeremoveMapper;


    public long countByExample(EmployeeremoveExample example) {
        return employeeremoveMapper.countByExample(example);
    }


    public int deleteByExample(EmployeeremoveExample example) {
        return employeeremoveMapper.deleteByExample(example);
    }


    public int deleteByPrimaryKey(Integer id) {
        return employeeremoveMapper.deleteByPrimaryKey(id);
    }


    public int insert(Employeeremove record) {
        return employeeremoveMapper.insert(record);
    }


    public int insertSelective(Employeeremove record) {
        return employeeremoveMapper.insertSelective(record);
    }


    public List<Employeeremove> selectByExample(EmployeeremoveExample example) {
        return employeeremoveMapper.selectByExample(example);
    }


    public Employeeremove selectByPrimaryKey(Integer id) {
        return employeeremoveMapper.selectByPrimaryKey(id);
    }


    public int updateByExampleSelective(Employeeremove record, EmployeeremoveExample example) {
        return employeeremoveMapper.updateByExampleSelective(record, example);
    }


    public int updateByExample(Employeeremove record, EmployeeremoveExample example) {
        return employeeremoveMapper.updateByExample(record, example);
    }


    public int updateByPrimaryKeySelective(Employeeremove record) {
        return employeeremoveMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Employeeremove record) {
        return employeeremoveMapper.updateByPrimaryKey(record);
    }

}



