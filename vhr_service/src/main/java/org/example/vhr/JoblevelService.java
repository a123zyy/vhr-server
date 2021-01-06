package org.example.vhr;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class JoblevelService {

    @Resource
    private JoblevelMapper joblevelMapper;


    public long countByExample(JoblevelExample example) {
        return joblevelMapper.countByExample(example);
    }


    public int deleteByExample(JoblevelExample example) {
        return joblevelMapper.deleteByExample(example);
    }


    public int deleteByPrimaryKey(Integer id) {
        return joblevelMapper.deleteByPrimaryKey(id);
    }


    public int insert(Joblevel record) {
        return joblevelMapper.insert(record);
    }


    public int insertSelective(Joblevel record) {
        return joblevelMapper.insertSelective(record);
    }


    public List<Joblevel> selectByExample(JoblevelExample example) {
        return joblevelMapper.selectByExample(example);
    }


    public Joblevel selectByPrimaryKey(Integer id) {
        return joblevelMapper.selectByPrimaryKey(id);
    }


    public int updateByExampleSelective(Joblevel record, JoblevelExample example) {
        return joblevelMapper.updateByExampleSelective(record, example);
    }


    public int updateByExample(Joblevel record, JoblevelExample example) {
        return joblevelMapper.updateByExample(record, example);
    }


    public int updateByPrimaryKeySelective(Joblevel record) {
        return joblevelMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Joblevel record) {
        return joblevelMapper.updateByPrimaryKey(record);
    }

    public int deleteByIds(Integer[] ids){
        return joblevelMapper.deleteByIds(ids);
    }

}




