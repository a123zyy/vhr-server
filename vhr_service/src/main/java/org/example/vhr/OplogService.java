package org.example.vhr;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.example.vhr.OplogExample;
import java.util.List;
import org.example.vhr.OplogMapper;
import org.example.vhr.Oplog;
@Service
public class OplogService{

    @Resource
    private OplogMapper oplogMapper;

    
    public long countByExample(OplogExample example) {
        return oplogMapper.countByExample(example);
    }

    
    public int deleteByExample(OplogExample example) {
        return oplogMapper.deleteByExample(example);
    }

    
    public int deleteByPrimaryKey(Integer id) {
        return oplogMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(Oplog record) {
        return oplogMapper.insert(record);
    }

    
    public int insertSelective(Oplog record) {
        return oplogMapper.insertSelective(record);
    }

    
    public List<Oplog> selectByExample(OplogExample example) {
        return oplogMapper.selectByExample(example);
    }

    
    public Oplog selectByPrimaryKey(Integer id) {
        return oplogMapper.selectByPrimaryKey(id);
    }

    
    public int updateByExampleSelective(Oplog record,OplogExample example) {
        return oplogMapper.updateByExampleSelective(record,example);
    }

    
    public int updateByExample(Oplog record,OplogExample example) {
        return oplogMapper.updateByExample(record,example);
    }

    
    public int updateByPrimaryKeySelective(Oplog record) {
        return oplogMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Oplog record) {
        return oplogMapper.updateByPrimaryKey(record);
    }

}
