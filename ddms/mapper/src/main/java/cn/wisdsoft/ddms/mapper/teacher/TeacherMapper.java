package cn.wisdsoft.ddms.mapper.teacher;

import cn.wisdsoft.ddms.pojo.Teacher;
import cn.wisdsoft.ddms.pojo.TeacherExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    int countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(Integer worknumber);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(Integer worknumber);

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
    List<Teacher> queryCondition(String condition);
}