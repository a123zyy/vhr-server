package org.example.vhr;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.vhr.Hr;
import org.example.vhr.HrExample;
public interface HrMapper {
    long countByExample(HrExample example);

    int deleteByExample(HrExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Hr record);

    int insertSelective(Hr record);

    List<Hr> selectByExample(HrExample example);

    Hr selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Hr record, @Param("example") HrExample example);

    int updateByExample(@Param("record") Hr record, @Param("example") HrExample example);

    int updateByPrimaryKeySelective(Hr record);

    int updateByPrimaryKey(Hr record);

    Hr findByUserName(@Param("username") String username);
}