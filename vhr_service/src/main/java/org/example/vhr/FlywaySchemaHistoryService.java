package org.example.vhr;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class FlywaySchemaHistoryService {

    @Resource
    private FlywaySchemaHistoryMapper flywaySchemaHistoryMapper;


    public long countByExample(FlywaySchemaHistoryExample example) {
        return flywaySchemaHistoryMapper.countByExample(example);
    }


    public int deleteByExample(FlywaySchemaHistoryExample example) {
        return flywaySchemaHistoryMapper.deleteByExample(example);
    }


    public int deleteByPrimaryKey(Integer installedRank) {
        return flywaySchemaHistoryMapper.deleteByPrimaryKey(installedRank);
    }


    public int insert(FlywaySchemaHistory record) {
        return flywaySchemaHistoryMapper.insert(record);
    }


    public int insertSelective(FlywaySchemaHistory record) {
        return flywaySchemaHistoryMapper.insertSelective(record);
    }


    public List<FlywaySchemaHistory> selectByExample(FlywaySchemaHistoryExample example) {
        return flywaySchemaHistoryMapper.selectByExample(example);
    }


    public FlywaySchemaHistory selectByPrimaryKey(Integer installedRank) {
        return flywaySchemaHistoryMapper.selectByPrimaryKey(installedRank);
    }


    public int updateByExampleSelective(FlywaySchemaHistory record, FlywaySchemaHistoryExample example) {
        return flywaySchemaHistoryMapper.updateByExampleSelective(record, example);
    }


    public int updateByExample(FlywaySchemaHistory record, FlywaySchemaHistoryExample example) {
        return flywaySchemaHistoryMapper.updateByExample(record, example);
    }


    public int updateByPrimaryKeySelective(FlywaySchemaHistory record) {
        return flywaySchemaHistoryMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(FlywaySchemaHistory record) {
        return flywaySchemaHistoryMapper.updateByPrimaryKey(record);
    }

}




