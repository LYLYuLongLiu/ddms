package cn.wisdsoft.ddms.service.teacherservice.impl;

import cn.wisdsoft.ddms.mapper.teacher.TeacherMapper;
import cn.wisdsoft.ddms.pojo.Teacher;
import cn.wisdsoft.ddms.pojo.TeacherExample;
import cn.wisdsoft.ddms.service.teacherservice.TeacherService;
import cn.wisdsoft.pojo.DdmsResult;
import cn.wisdsoft.pojo.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>ClassName: TeacherServiceImpl</p>
 * <p>Description:</p>
 *
 * @author 刘玉龙
 * @version 1.0
 * @date 2018/9/18 20:19
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;


    /**
     * 添加教师
     * @date 10:54 2018/9/19
     * @param [teacher]
     * @return cn.wisdsoft.pojo.DdmsResult
     * @throws
     */
    @Override
    public DdmsResult addTeacher(Teacher teacher) {
        teacherMapper.insert(teacher);
        return DdmsResult.ok();
    }

    /**
     * 查询所有教师
     * @date 10:59 2018/9/19
     * @param []
     * @return cn.wisdsoft.pojo.DdmsResult
     * @throws
     */
    @Override
    public DdmsResult queryAllTeacher() {
        TeacherExample example = new TeacherExample();
        List<Teacher> teachers = teacherMapper.selectByExample(example);
        return DdmsResult.ok(teachers);
    }

    /**
     * 更新教师信息
     * @date 16:06 2018/9/19
     * @param [teacher]
     * @return cn.wisdsoft.pojo.DdmsResult
     * @throws
     */
    @Override
    public DdmsResult updateTeacher(Teacher teacher) {
        teacherMapper.updateByPrimaryKey(teacher);
        return DdmsResult.ok();
    }

    /**
     * 通过条件查询
     * @date 18:01 2018/9/19
     * @param [condition 查询条件]
     * @return cn.wisdsoft.pojo.DdmsResult
     * @throws
     */
    @Override
    public DdmsResult queryCondition(String condition) {
        List<Teacher> teachers = teacherMapper.queryCondition(condition);
        return DdmsResult.ok(teachers);
    }

    /**
     * 通过id删除教师
     *
     * @param [id 教师id]
     * @return cn.wisdsoft.pojo.DdmsResult
     * @date 20:36 2018/9/19
     */
    @Override
    public DdmsResult deleteTeacher(String id) {
        teacherMapper.deleteByPrimaryKey(id);
        return DdmsResult.ok();
    }

    /**
     * 无条件分页
     *
     * @param page  当前页数
     * @param rows  显示行数
     * @return cn.wisdsoft.pojo.PageResult<cn.wisdsoft.ddms.pojo.Teacher>
     * @date 17:19 2018/9/20
     */
    @Override
    public PageResult<Teacher> queryAllPageTeacher(int page, int rows) {
        TeacherExample example = new TeacherExample();
        PageHelper.startPage(page, rows);
        List<Teacher> teachers = teacherMapper.selectByExample(example);
        PageInfo<Teacher> pageInfo = new PageInfo<>(teachers);
        return PageResult.ok(teachers, pageInfo.getTotal());
    }

    /**
     * 通过条件查询分页
     *
     * @param page  当前页数
     * @param rows  显示行数
     * @param condition  查询条件
     * @return cn.wisdsoft.pojo.PageResult<cn.wisdsoft.ddms.pojo.Teacher>
     * @date 18:49 2018/9/20
     */
    @Override
    public PageResult<Teacher> queryConditionPageTeacher(int page, int rows, String condition) {
        PageHelper.startPage(page, rows);
        List<Teacher> teachers = teacherMapper.queryCondition(condition);
        PageInfo<Teacher> pageInfo = new PageInfo<>(teachers);
        return PageResult.ok(teachers, pageInfo.getTotal());
    }

    /**
     * 通过id查询单个教师信息
     *
     * @param id  教师id
     * @return cn.wisdsoft.ddms.pojo.Teacher
     * @date 19:47 2018/9/27
     */
    @Override
    public Teacher queryTeahcerId(String id) {
        return teacherMapper.selectByPrimaryKey(id);
    }

}
