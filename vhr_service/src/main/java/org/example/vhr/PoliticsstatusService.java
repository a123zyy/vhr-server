package org.example.vhr;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import org.example.vhr.Politicsstatus;
import org.example.vhr.PoliticsstatusMapper;
import org.example.vhr.PoliticsstatusExample;
@Service
public class PoliticsstatusService{

    @Resource
    private PoliticsstatusMapper politicsstatusMapper;

    
    public long countByExample(PoliticsstatusExample example) {
        return politicsstatusMapper.countByExample(example);
    }

    
    public int deleteByExample(PoliticsstatusExample example) {
        return politicsstatusMapper.deleteByExample(example);
    }

    
    public int deleteByPrimaryKey(Integer id) {
        return politicsstatusMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(Politicsstatus record) {
        return politicsstatusMapper.insert(record);
    }

    
    public int insertSelective(Politicsstatus record) {
        return politicsstatusMapper.insertSelective(record);
    }

    
    public List<Politicsstatus> selectByExample(PoliticsstatusExample example) {
        return politicsstatusMapper.selectByExample(example);
    }

    
    public Politicsstatus selectByPrimaryKey(Integer id) {
        return politicsstatusMapper.selectByPrimaryKey(id);
    }

    
    public int updateByExampleSelective(Politicsstatus record,PoliticsstatusExample example) {
        return politicsstatusMapper.updateByExampleSelective(record,example);
    }

    
    public int updateByExample(Politicsstatus record,PoliticsstatusExample example) {
        return politicsstatusMapper.updateByExample(record,example);
    }

    
    public int updateByPrimaryKeySelective(Politicsstatus record) {
        return politicsstatusMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Politicsstatus record) {
        return politicsstatusMapper.updateByPrimaryKey(record);
    }

}
