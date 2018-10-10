package cn.wisdsoft.ddms.mapper.college;

import cn.wisdsoft.ddms.pojo.College;
import cn.wisdsoft.ddms.pojo.CollegeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CollegeMapper {
    int countByExample(CollegeExample example);

    int deleteByExample(CollegeExample example);

    int deleteByPrimaryKey(String id);

    int insert(College record);

    int insertSelective(College record);

    List<College> selectByExample(CollegeExample example);

    College selectByPrimaryKey(String id);
    int updateByExampleSelective(@Param("record") College record, @Param("example") CollegeExample example);

    int updateByExample(@Param("record") College record, @Param("example") CollegeExample example);

    int updateByPrimaryKeySelective(College record);

    int updateByPrimaryKey(College record);

    /**
     * @Author 李泽宇
     * @Description //TODO 通过名称查询学院信息
     * @Date 2018/9/19 21:09
     * @Param
     * @return
     **/
    List<College> queryBycollegeName(College college);
    /**
     * @Author 李泽宇
     * @Description //TODO 查询最大id
     * @Date 2018/9/27 19:40
     * @Param
     * @return
     **/

    String selcollegemaxid();

    /**
     * @Author 李泽宇
     * @Description //TODO 插入信息，导入数据用
     * 此功能停用
     * @Date 2018/9/29 16:13
     * @Param
     * @return
     **/
//    int insertSalesCollege(@Param("list") List<String[]> list);
}