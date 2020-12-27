package org.example.vhr;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.example.vhr.MenuRoleMapper;
import java.util.List;
import org.example.vhr.MenuRole;
import org.example.vhr.MenuRoleExample;
@Service
public class MenuRoleService{

    @Resource
    private MenuRoleMapper menuRoleMapper;

    
    public long countByExample(MenuRoleExample example) {
        return menuRoleMapper.countByExample(example);
    }

    
    public int deleteByExample(MenuRoleExample example) {
        return menuRoleMapper.deleteByExample(example);
    }

    
    public int deleteByPrimaryKey(Integer id) {
        return menuRoleMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(MenuRole record) {
        return menuRoleMapper.insert(record);
    }

    
    public int insertSelective(MenuRole record) {
        return menuRoleMapper.insertSelective(record);
    }

    
    public List<MenuRole> selectByExample(MenuRoleExample example) {
        return menuRoleMapper.selectByExample(example);
    }

    
    public MenuRole selectByPrimaryKey(Integer id) {
        return menuRoleMapper.selectByPrimaryKey(id);
    }

    
    public int updateByExampleSelective(MenuRole record,MenuRoleExample example) {
        return menuRoleMapper.updateByExampleSelective(record,example);
    }

    
    public int updateByExample(MenuRole record,MenuRoleExample example) {
        return menuRoleMapper.updateByExample(record,example);
    }

    
    public int updateByPrimaryKeySelective(MenuRole record) {
        return menuRoleMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(MenuRole record) {
        return menuRoleMapper.updateByPrimaryKey(record);
    }

}
