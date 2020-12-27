package org.example.vhr;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.example.vhr.SysmsgMapper;
import java.util.List;
import org.example.vhr.SysmsgExample;
import org.example.vhr.Sysmsg;
@Service
public class SysmsgService{

    @Resource
    private SysmsgMapper sysmsgMapper;

    
    public long countByExample(SysmsgExample example) {
        return sysmsgMapper.countByExample(example);
    }

    
    public int deleteByExample(SysmsgExample example) {
        return sysmsgMapper.deleteByExample(example);
    }

    
    public int deleteByPrimaryKey(Integer id) {
        return sysmsgMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(Sysmsg record) {
        return sysmsgMapper.insert(record);
    }

    
    public int insertSelective(Sysmsg record) {
        return sysmsgMapper.insertSelective(record);
    }

    
    public List<Sysmsg> selectByExample(SysmsgExample example) {
        return sysmsgMapper.selectByExample(example);
    }

    
    public Sysmsg selectByPrimaryKey(Integer id) {
        return sysmsgMapper.selectByPrimaryKey(id);
    }

    
    public int updateByExampleSelective(Sysmsg record,SysmsgExample example) {
        return sysmsgMapper.updateByExampleSelective(record,example);
    }

    
    public int updateByExample(Sysmsg record,SysmsgExample example) {
        return sysmsgMapper.updateByExample(record,example);
    }

    
    public int updateByPrimaryKeySelective(Sysmsg record) {
        return sysmsgMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Sysmsg record) {
        return sysmsgMapper.updateByPrimaryKey(record);
    }

}
