package org.example.vhr;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.example.vhr.Position;
import java.util.List;
import org.example.vhr.PositionExample;
import org.example.vhr.PositionMapper;
@Service
public class PositionService{

    @Resource
    private PositionMapper positionMapper;

    
    public long countByExample(PositionExample example) {
        return positionMapper.countByExample(example);
    }

    
    public int deleteByExample(PositionExample example) {
        return positionMapper.deleteByExample(example);
    }

    
    public int deleteByPrimaryKey(Integer id) {
        return positionMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(Position record) {
        return positionMapper.insert(record);
    }

    
    public int insertSelective(Position record) {
        return positionMapper.insertSelective(record);
    }

    
    public List<Position> selectByExample(PositionExample example) {
        return positionMapper.selectByExample(example);
    }

    
    public Position selectByPrimaryKey(Integer id) {
        return positionMapper.selectByPrimaryKey(id);
    }

    
    public int updateByExampleSelective(Position record,PositionExample example) {
        return positionMapper.updateByExampleSelective(record,example);
    }

    
    public int updateByExample(Position record,PositionExample example) {
        return positionMapper.updateByExample(record,example);
    }

    
    public int updateByPrimaryKeySelective(Position record) {
        return positionMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Position record) {
        return positionMapper.updateByPrimaryKey(record);
    }

}
