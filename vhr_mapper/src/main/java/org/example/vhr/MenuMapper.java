package org.example.vhr;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.vhr.Menu;
import org.example.vhr.MenuExample;

public interface MenuMapper {
    long countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

//    @Select(" select \n" +
//            " distinct \n" +
//            " m1.*,\n" +
//            " m2.`id` as id2,\n" +
//            " m2.`component` as component2,\n" +
//            " m2.`enabled` as enabled2,\n" +
//            " m2.`iconCls` as iconCls2,\n" +
//            " m2.`keepAlive` as keepAlive2,\n" +
//            " m2.`name` as name2,\n" +
//            " m2.`parentId` as parentId2,\n" +
//            " m2.`requireAuth` as requireAuth2,\n" +
//            " m2.`path` as path2 \n" +
//            " from menu m1,menu m2,hr_role hrr,menu_role mr \n" +
//            " where m1.`id`=m2.`parentId` \n" +
//            " and hrr.`hrid`= #{hrId} \n" +
//            " and hrr.`rid`=mr.`rid` \n" +
//            " and mr.`mid`=m2.`id` \n" +
//            " and m2.`enabled`= true \n" +
//            " order by m1.`id`,m2.`id`\n" +
//            " ")
    List<Menu> findIdsByMenus(@Param("hrId") int hrId);
}