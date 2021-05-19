package org.example.vhr;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.example.vhr.Wage;
import org.example.vhr.WageMapper;

@Service
public class WageService {

    @Resource
    private WageMapper wageMapper;


    public int deleteByPrimaryKey(Integer id) {
        return wageMapper.deleteByPrimaryKey(id);
    }


    public int insert(Wage record) {
        return wageMapper.insert(record);
    }


    public int insertSelective(Wage record) {
        return wageMapper.insertSelective(record);
    }


    public Wage selectByPrimaryKey(Integer id) {
        return wageMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(Wage record) {
        return wageMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Wage record) {
        return wageMapper.updateByPrimaryKey(record);
    }

}


