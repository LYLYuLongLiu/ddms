package cn.wisdsoft.ddms.service.teacherservice;

import cn.wisdsoft.ddms.pojo.Teacher;
import cn.wisdsoft.pojo.DdmsResult;
import cn.wisdsoft.pojo.PageResult;

import java.io.InputStream;

/**
 * <p>ClassName: TeacherService</p>
 * <p>Description:</p>
 *
 * @author 刘玉龙
 * @version 1.0
 * @date 2018/9/18 20:15
 */
public interface TeacherService {

    /**
     * 添加教师
     *
     * @param [teacher]
     * @return cn.wisdsoft.pojo.DdmsResult
     * @throws
     * @date 10:56 2018/9/19
     */
    DdmsResult addTeacher(Teacher teacher);

    /**
     * 查询所有教师
     *
     * @param []
     * @return cn.wisdsoft.pojo.DdmsResult
     * @throws
     * @date 10:58 2018/9/19
     */
    DdmsResult queryAllTeacher();

    /**
     * 更新教师信息
     *
     * @param [teacher]
     * @return cn.wisdsoft.pojo.DdmsResult
     * @throws
     * @date 16:06 2018/9/19
     */
    DdmsResult updateTeacher(Teacher teacher);

    /**
     * 通过条件查询
     *
     * @param [condition 查询条件]
     * @return cn.wisdsoft.pojo.DdmsResult
     * @throws
     * @date 17:58 2018/9/19
     */
    DdmsResult queryCondition(String condition);

    /**
     * 通过教师id删除教师
     *
     * @param [id 教师id]
     * @return cn.wisdsoft.pojo.DdmsResult
     * @date 20:35 2018/9/19
     */
    DdmsResult deleteTeacher(String id);

    /**
     * 无条件分页
     *
     * @param page 当前页数
     * @param rows  显示行数
     * @return cn.wisdsoft.pojo.PageResult<cn.wisdsoft.ddms.pojo.Teacher> 
     * @date 17:18 2018/9/20
     */
    PageResult<Teacher> queryAllPageTeacher(int page, int rows);

    /**
     * 通过条件查询分页
     *
     * @param page  当前页数
     * @param rows  显示行数
     * @param condition  查询条件
     * @return cn.wisdsoft.pojo.PageResult<cn.wisdsoft.ddms.pojo.Teacher>
     * @date 18:49 2018/9/20
     */
    PageResult<Teacher> queryConditionPageTeacher(int page, int rows, String condition);

    /**
     * 通过id查询单个教师信息
     *
     * @param id  教师id
     * @return cn.wisdsoft.ddms.pojo.Teacher
     * @date 19:47 2018/9/27
     */
    Teacher queryTeahcerId(String id);

}
