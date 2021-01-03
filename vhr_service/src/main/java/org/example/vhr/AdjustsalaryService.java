package org.example.vhr;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class AdjustsalaryService {


    @Resource
    private AdjustsalaryMapper adjustsalaryMapper;


    public long countByExample(AdjustsalaryExample example) {
        return adjustsalaryMapper.countByExample(example);
    }


    public int deleteByExample(AdjustsalaryExample example) {
        return adjustsalaryMapper.deleteByExample(example);
    }


    public int deleteByPrimaryKey(Integer id) {
        return adjustsalaryMapper.deleteByPrimaryKey(id);
    }


    public int insert(Adjustsalary record) {
        return adjustsalaryMapper.insert(record);
    }


    public int insertSelective(Adjustsalary record) {
        return adjustsalaryMapper.insertSelective(record);
    }


    public List<Adjustsalary> selectByExample(AdjustsalaryExample example) {
        return adjustsalaryMapper.selectByExample(example);
    }


    public Adjustsalary selectByPrimaryKey(Integer id) {
        return adjustsalaryMapper.selectByPrimaryKey(id);
    }


    public int updateByExampleSelective(Adjustsalary record, AdjustsalaryExample example) {
        return adjustsalaryMapper.updateByExampleSelective(record, example);
    }


    public int updateByExample(Adjustsalary record, AdjustsalaryExample example) {
        return adjustsalaryMapper.updateByExample(record, example);
    }


    public int updateByPrimaryKeySelective(Adjustsalary record) {
        return adjustsalaryMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Adjustsalary record) {
        return adjustsalaryMapper.updateByPrimaryKey(record);
    }

}




