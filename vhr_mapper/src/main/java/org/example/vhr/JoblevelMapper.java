package org.example.vhr;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.example.vhr.Joblevel;
import org.example.vhr.JoblevelExample;

public interface JoblevelMapper {
    long countByExample(JoblevelExample example);

    int deleteByExample(JoblevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Joblevel record);

    int insertSelective(Joblevel record);

    List<Joblevel> selectByExample(JoblevelExample example);

    Joblevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Joblevel record, @Param("example") JoblevelExample example);

    int updateByExample(@Param("record") Joblevel record, @Param("example") JoblevelExample example);

    int updateByPrimaryKeySelective(Joblevel record);

    int updateByPrimaryKey(Joblevel record);

    int deleteByIds(@Param("ids") Integer[] ids);
}