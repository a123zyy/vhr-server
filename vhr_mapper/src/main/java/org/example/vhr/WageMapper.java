package org.example.vhr;

import org.apache.ibatis.annotations.Param;
import org.example.vhr.Wage;

public interface WageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Wage record);

    int insertSelective(Wage record);

    Wage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Wage record);

    int updateByPrimaryKey(Wage record);

    int deleteByUid(@Param("uid") int uid);
}