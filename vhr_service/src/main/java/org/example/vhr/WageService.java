package org.example.vhr;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.example.vhr.Wage;
import org.example.vhr.WageMapper;import java.util.List;

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

    public long countByExample(WageExample example) {
        return wageMapper.countByExample(example);
    }

    public int deleteByExample(WageExample example) {
        return wageMapper.deleteByExample(example);
    }

    public List<Wage> selectByExample(WageExample example) {
        return wageMapper.selectByExample(example);
    }

    public int updateByExampleSelective(Wage record, WageExample example) {
        return wageMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(Wage record, WageExample example) {
        return wageMapper.updateByExample(record, example);
    }

    public IPage<Wage> selectPageText(Page<Wage> page,int status) {
        return wageMapper.selectPageText(page,status);
    }




}



