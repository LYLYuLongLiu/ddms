package cn.wisdsoft.ddms.mapper.teacher;

import cn.wisdsoft.ddms.pojo.Teacher;
import cn.wisdsoft.ddms.pojo.TeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    int countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(String worknumber);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(String worknumber);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    /**
     * 通过添加查询
     *
     * @param [condition]
     * @return java.util.List<cn.wisdsoft.ddms.pojo.Teacher>
     * @date 18:45 2018/9/19
     */
    List<Teacher> queryCondition(@Param(value = "condition") String condition);
}