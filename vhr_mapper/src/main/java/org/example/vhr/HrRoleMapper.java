package org.example.vhr;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.example.vhr.HrRole;
import org.example.vhr.HrRoleExample;

public interface HrRoleMapper {
    long countByExample(HrRoleExample example);

    int deleteByExample(HrRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HrRole record);

    int insertSelective(HrRole record);

    List<HrRole> selectByExample(HrRoleExample example);

    HrRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HrRole record, @Param("example") HrRoleExample example);

    int updateByExample(@Param("record") HrRole record, @Param("example") HrRoleExample example);

    int updateByPrimaryKeySelective(HrRole record);

    int updateByPrimaryKey(HrRole record);

    List<Integer> getRids(@Param("hrid") int hrid);

    int insertBy(@Param("hrid") int hrid, @Param("rids") List<Integer> rids);
}