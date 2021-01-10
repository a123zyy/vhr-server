package org.example.vhr;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class MenuService {

    @Resource
    private MenuMapper menuMapper;


    public long countByExample(MenuExample example) {
        return menuMapper.countByExample(example);
    }


    public int deleteByExample(MenuExample example) {
        return menuMapper.deleteByExample(example);
    }


    public int deleteByPrimaryKey(Integer id) {
        return menuMapper.deleteByPrimaryKey(id);
    }


    public int insert(Menu record) {
        return menuMapper.insert(record);
    }


    public int insertSelective(Menu record) {
        return menuMapper.insertSelective(record);
    }


    public List<Menu> selectByExample(MenuExample example) {
        return menuMapper.selectByExample(example);
    }


    public Menu selectByPrimaryKey(Integer id) {
        return menuMapper.selectByPrimaryKey(id);
    }


    public int updateByExampleSelective(Menu record, MenuExample example) {
        return menuMapper.updateByExampleSelective(record, example);
    }


    public int updateByExample(Menu record, MenuExample example) {
        return menuMapper.updateByExample(record, example);
    }


    public int updateByPrimaryKeySelective(Menu record) {
        return menuMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Menu record) {
        return menuMapper.updateByPrimaryKey(record);
    }

    public List<Menu> findIdsByMenus(int hrId){
        return menuMapper.findIdsByMenus(hrId);
    }
    public  List<Menu> findAll(){
        return menuMapper.findAll();
    }

    public List<Integer> getMidByRid(int rid){
        return menuMapper.getMidByRid(rid);
    }
}




