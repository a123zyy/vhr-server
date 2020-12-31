package org.example.vhr;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import org.example.vhr.HrRoleMapper;
import org.example.vhr.HrRoleExample;
import org.example.vhr.HrRole;

@Service
public class HrRoleService {

    @Resource
    private HrRoleMapper hrRoleMapper;


    public long countByExample(HrRoleExample example) {
        return hrRoleMapper.countByExample(example);
    }


    public int deleteByExample(HrRoleExample example) {
        return hrRoleMapper.deleteByExample(example);
    }


    public int deleteByPrimaryKey(Integer id) {
        return hrRoleMapper.deleteByPrimaryKey(id);
    }


    public int insert(HrRole record) {
        return hrRoleMapper.insert(record);
    }


    public int insertSelective(HrRole record) {
        return hrRoleMapper.insertSelective(record);
    }


    public List<HrRole> selectByExample(HrRoleExample example) {
        return hrRoleMapper.selectByExample(example);
    }


    public HrRole selectByPrimaryKey(Integer id) {
        return hrRoleMapper.selectByPrimaryKey(id);
    }


    public int updateByExampleSelective(HrRole record, HrRoleExample example) {
        return hrRoleMapper.updateByExampleSelective(record, example);
    }


    public int updateByExample(HrRole record, HrRoleExample example) {
        return hrRoleMapper.updateByExample(record, example);
    }


    public int updateByPrimaryKeySelective(HrRole record) {
        return hrRoleMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(HrRole record) {
        return hrRoleMapper.updateByPrimaryKey(record);
    }

    public List<Integer> getRids(Integer hrid) {
        return hrRoleMapper.getRids(hrid);
    }
}



