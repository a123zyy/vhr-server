package org.example.vhr;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import org.example.vhr.HrMapper;
import org.example.vhr.HrExample;
import org.example.vhr.Hr;
@Service
public class HrService{

    @Resource
    private HrMapper hrMapper;

    
    public long countByExample(HrExample example) {
        return hrMapper.countByExample(example);
    }

    
    public int deleteByExample(HrExample example) {
        return hrMapper.deleteByExample(example);
    }

    
    public int deleteByPrimaryKey(Integer id) {
        return hrMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(Hr record) {
        return hrMapper.insert(record);
    }

    
    public int insertSelective(Hr record) {
        return hrMapper.insertSelective(record);
    }

    
    public List<Hr> selectByExample(HrExample example) {
        return hrMapper.selectByExample(example);
    }

    
    public Hr selectByPrimaryKey(Integer id) {
        return hrMapper.selectByPrimaryKey(id);
    }

    
    public int updateByExampleSelective(Hr record,HrExample example) {
        return hrMapper.updateByExampleSelective(record,example);
    }

    
    public int updateByExample(Hr record,HrExample example) {
        return hrMapper.updateByExample(record,example);
    }

    
    public int updateByPrimaryKeySelective(Hr record) {
        return hrMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Hr record) {
        return hrMapper.updateByPrimaryKey(record);
    }

    public Hr findByUserName(String useranme){
        return hrMapper.findByUserName(useranme);
    }


}
