package org.example.vhr;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.example.vhr.RoleMapper;
import org.example.vhr.Role;
import java.util.List;
import org.example.vhr.RoleExample;
@Service
public class RoleService{

    @Resource
    private RoleMapper roleMapper;

    
    public long countByExample(RoleExample example) {
        return roleMapper.countByExample(example);
    }

    
    public int deleteByExample(RoleExample example) {
        return roleMapper.deleteByExample(example);
    }

    
    public int deleteByPrimaryKey(Integer id) {
        return roleMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(Role record) {
        return roleMapper.insert(record);
    }

    
    public int insertSelective(Role record) {
        return roleMapper.insertSelective(record);
    }

    
    public List<Role> selectByExample(RoleExample example) {
        return roleMapper.selectByExample(example);
    }

    
    public Role selectByPrimaryKey(Integer id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    
    public int updateByExampleSelective(Role record,RoleExample example) {
        return roleMapper.updateByExampleSelective(record,example);
    }

    
    public int updateByExample(Role record,RoleExample example) {
        return roleMapper.updateByExample(record,example);
    }

    
    public int updateByPrimaryKeySelective(Role record) {
        return roleMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(Role record) {
        return roleMapper.updateByPrimaryKey(record);
    }

}
