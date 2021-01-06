package org.example.vhr;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

@Service
public class EmpsalaryService {

    @Resource
    private EmpsalaryMapper empsalaryMapper;


    public long countByExample(EmpsalaryExample example) {
        return empsalaryMapper.countByExample(example);
    }


    public int deleteByExample(EmpsalaryExample example) {
        return empsalaryMapper.deleteByExample(example);
    }


    public int deleteByPrimaryKey(Integer id) {
        return empsalaryMapper.deleteByPrimaryKey(id);
    }


    public int insert(Empsalary record) {
        return empsalaryMapper.insert(record);
    }


    public int insertSelective(Empsalary record) {
        return empsalaryMapper.insertSelective(record);
    }


    public List<Empsalary> selectByExample(EmpsalaryExample example) {
        return empsalaryMapper.selectByExample(example);
    }


    public Empsalary selectByPrimaryKey(Integer id) {
        return empsalaryMapper.selectByPrimaryKey(id);
    }


    public int updateByExampleSelective(Empsalary record, EmpsalaryExample example) {
        return empsalaryMapper.updateByExampleSelective(record, example);
    }


    public int updateByExample(Empsalary record, EmpsalaryExample example) {
        return empsalaryMapper.updateByExample(record, example);
    }


    public int updateByPrimaryKeySelective(Empsalary record) {
        return empsalaryMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Empsalary record) {
        return empsalaryMapper.updateByPrimaryKey(record);
    }

    public Integer findSIDByEID(int eid){
        if (Objects.nonNull(empsalaryMapper.findByEID(eid))){
            return empsalaryMapper.findByEID(eid).getSid();
        }
       return 0;
    }
    public int intInsertUpdate(int eid,int sid){
         return empsalaryMapper.updateByID(eid,sid);
    }

}




