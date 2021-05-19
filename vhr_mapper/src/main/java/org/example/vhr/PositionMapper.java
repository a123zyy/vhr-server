package org.example.vhr;

import org.apache.ibatis.annotations.Param;import org.example.vhr.Position;import java.util.List;

public interface PositionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);

    long countByExample(PositionExample example);

    int deleteByExample(PositionExample example);

    List<Position> selectByExample(PositionExample example);

    int updateByExampleSelective(@Param("record") Position record, @Param("example") PositionExample example);

    int updateByExample(@Param("record") Position record, @Param("example") PositionExample example);

    int deleteByIds(@Param("ids") Integer[] ids);
}