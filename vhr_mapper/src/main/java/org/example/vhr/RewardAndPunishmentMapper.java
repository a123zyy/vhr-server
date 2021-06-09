package org.example.vhr;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.example.vhr.RewardAndPunishment;
import org.example.vhr.RewardAndPunishmentExample;

public interface RewardAndPunishmentMapper {
    long countByExample(RewardAndPunishmentExample example);

    int deleteByExample(RewardAndPunishmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RewardAndPunishment record);

    int insertSelective(RewardAndPunishment record);

    List<RewardAndPunishment> selectByExample(RewardAndPunishmentExample example);

    RewardAndPunishment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RewardAndPunishment record, @Param("example") RewardAndPunishmentExample example);

    int updateByExample(@Param("record") RewardAndPunishment record, @Param("example") RewardAndPunishmentExample example);

    int updateByPrimaryKeySelective(RewardAndPunishment record);

    int updateByPrimaryKey(RewardAndPunishment record);

    int deleteByEmpId(@Param("empId") int empId);
}