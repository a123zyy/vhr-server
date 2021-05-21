package org.example.vhr;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.example.vhr.RewardAndPunishment;
import org.example.vhr.RewardAndPunishmentMapper;import java.util.List;

@Service
public class RewardAndPunishmentService {

    @Resource
    private RewardAndPunishmentMapper rewardAndPunishmentMapper;


    public int deleteByPrimaryKey(Integer id) {
        return rewardAndPunishmentMapper.deleteByPrimaryKey(id);
    }


    public int insert(RewardAndPunishment record) {
        return rewardAndPunishmentMapper.insert(record);
    }


    public int insertSelective(RewardAndPunishment record) {
        return rewardAndPunishmentMapper.insertSelective(record);
    }


    public RewardAndPunishment selectByPrimaryKey(Integer id) {
        return rewardAndPunishmentMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(RewardAndPunishment record) {
        return rewardAndPunishmentMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(RewardAndPunishment record) {
        return rewardAndPunishmentMapper.updateByPrimaryKey(record);
    }

    public long countByExample(RewardAndPunishmentExample example) {
        return rewardAndPunishmentMapper.countByExample(example);
    }

    public int deleteByExample(RewardAndPunishmentExample example) {
        return rewardAndPunishmentMapper.deleteByExample(example);
    }

    public List<RewardAndPunishment> selectByExample(RewardAndPunishmentExample example) {
        return rewardAndPunishmentMapper.selectByExample(example);
    }

    public int updateByExampleSelective(RewardAndPunishment record, RewardAndPunishmentExample example) {
        return rewardAndPunishmentMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(RewardAndPunishment record, RewardAndPunishmentExample example) {
        return rewardAndPunishmentMapper.updateByExample(record, example);
    }
}






