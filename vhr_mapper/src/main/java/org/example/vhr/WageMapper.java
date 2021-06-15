package org.example.vhr;

import java.util.List;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import org.example.vhr.Wage;
import org.example.vhr.WageExample;

public interface WageMapper {
    long countByExample(WageExample example);

    int deleteByExample(WageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Wage record);

    int insertSelective(Wage record);

    List<Wage> selectByExample(WageExample example);

    Wage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Wage record, @Param("example") WageExample example);

    int updateByExample(@Param("record") Wage record, @Param("example") WageExample example);

    int updateByPrimaryKeySelective(Wage record);

    int updateByPrimaryKey(Wage record);

    int deleteByUid(@Param("uid") int uid);

    IPage<Wage> selectPageText(Page<Wage> page, @Param("status") int status);
}