package org.example.vhr;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DepartmentService {

    @Resource
    private DepartmentMapper departmentMapper;


    public long countByExample(DepartmentExample example) {
        return departmentMapper.countByExample(example);
    }


    public int deleteByExample(DepartmentExample example) {
        return departmentMapper.deleteByExample(example);
    }


    public int deleteByPrimaryKey(Integer id) {
        return departmentMapper.deleteByPrimaryKey(id);
    }


    public int insert(Department record) {
        return departmentMapper.insert(record);
    }


    public int insertSelective(Department record) {
        return departmentMapper.insertSelective(record);
    }


    public List<Department> selectByExample(DepartmentExample example) {
        return departmentMapper.selectByExample(example);
    }


    public Department selectByPrimaryKey(Integer id) {
        return departmentMapper.selectByPrimaryKey(id);
    }


    public int updateByExampleSelective(Department record, DepartmentExample example) {
        return departmentMapper.updateByExampleSelective(record, example);
    }


    public int updateByExample(Department record, DepartmentExample example) {
        return departmentMapper.updateByExample(record, example);
    }


    public int updateByPrimaryKeySelective(Department record) {
        return departmentMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Department record) {
        return departmentMapper.updateByPrimaryKey(record);
    }

    public String findAll() {
        return departmentMapper.selectByPrimaryKey(1).getName();
    }

    public int addDep(Department department){
        return departmentMapper.addDep(department);
    }

    public List<Department> findAllByParendId() {
         List<Department> departments = departmentMapper.findAll();
       return departments.stream().peek(item->{
            List<Department> children =  departments.stream()
                    .filter(item2 ->item.getId().equals(item2.getParentId())).collect(Collectors.toList());
            item.setChildren(children);
        }).collect(Collectors.toList());

    }




}





