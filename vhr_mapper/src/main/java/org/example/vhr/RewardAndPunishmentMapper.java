package org.example.vhr;

import org.example.vhr.RewardAndPunishment;

public interface RewardAndPunishmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RewardAndPunishment record);

    int insertSelective(RewardAndPunishment record);

    RewardAndPunishment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RewardAndPunishment record);

    int updateByPrimaryKey(RewardAndPunishment record);
}