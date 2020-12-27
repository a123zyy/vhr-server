package org.example.vhr;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.example.vhr.Politicsstatus;
import org.example.vhr.PoliticsstatusExample;

public interface PoliticsstatusMapper {
    long countByExample(PoliticsstatusExample example);

    int deleteByExample(PoliticsstatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Politicsstatus record);

    int insertSelective(Politicsstatus record);

    List<Politicsstatus> selectByExample(PoliticsstatusExample example);

    Politicsstatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Politicsstatus record, @Param("example") PoliticsstatusExample example);

    int updateByExample(@Param("record") Politicsstatus record, @Param("example") PoliticsstatusExample example);

    int updateByPrimaryKeySelective(Politicsstatus record);

    int updateByPrimaryKey(Politicsstatus record);
}