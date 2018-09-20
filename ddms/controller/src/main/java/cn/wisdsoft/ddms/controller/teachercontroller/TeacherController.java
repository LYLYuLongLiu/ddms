package cn.wisdsoft.ddms.controller.teachercontroller;

import cn.wisdsoft.ddms.pojo.Teacher;
import cn.wisdsoft.ddms.service.teacherservice.TeacherService;
import cn.wisdsoft.pojo.DdmsResult;
import cn.wisdsoft.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>ClassName: TeacherController</p>
 * <p>Description:</p>
 *
 * @author 刘玉龙
 * @version 1.0
 * @date 2018/9/18 20:26
 */

@Controller
@RequestMapping(value = "/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String teacherPage() {
        return "teacher/teacher_list";
    }
    /**
     * t添加教师
     * @date 10:55 2018/9/19
     * @param [teacher]
     * @return cn.wisdsoft.pojo.DdmsResult
     * @throws
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public DdmsResult addTeacher(Teacher teacher) {
        return teacherService.addTeacher(teacher);
    }

    /**
     * 查询所有教师
     * @date 11:08 2018/9/19
     * @param []
     * @return cn.wisdsoft.pojo.DdmsResult
     * @throws
     */
    @RequestMapping(value = "/queryall", method = RequestMethod.GET)
    @ResponseBody
    public DdmsResult queryAllTeacher() {
        return teacherService.queryAllTeacher();
    }

    /**
     * 更新教师信息
     * @date 16:12 2018/9/19
     * @param [teacher]
     * @return cn.wisdsoft.pojo.DdmsResult
     * @throws
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public DdmsResult updateTeacher(Teacher teacher) {
        return teacherService.updateTeacher(teacher);
    }

    /**
     * 通过条件查询
     *
     * @param [filter 查询条件]
     * @return cn.wisdsoft.pojo.DdmsResult
     * @date 20:31 2018/9/19
     */
    @RequestMapping(value = "/condition", method = RequestMethod.GET)
    @ResponseBody
    public DdmsResult queryCondition(String filter) {
        return teacherService.queryCondition(filter);
    }

    /**
     * 根据id删除教师信息
     *
     * @param [id 教师id]
     * @return cn.wisdsoft.pojo.DdmsResult
     * @date 20:54 2018/9/19
     */
    @RequestMapping(value = "/del", method = RequestMethod.GET)
    @ResponseBody
    public DdmsResult del(Integer id) {
        return teacherService.deleteTeacher(id);
    }

    /**
     * 无条件分页
     *
     * @param page  当前页数
     * @param limit  显示行数
     * @return cn.wisdsoft.pojo.PageResult<cn.wisdsoft.ddms.pojo.Teacher>
     * @date 20:24 2018/9/20
     */
    @RequestMapping(value = "/queryallpage", method = RequestMethod.GET)
    @ResponseBody
    public PageResult<Teacher> queryAllPageTeacher(Integer page, Integer limit) {
        return teacherService.queryAllPageTeacher(page, limit);
    }

    /**
     * 筛选分页
     *
     * @param page  当前页数
     * @param limit  显示行数
     * @param conditionpage
     * @return cn.wisdsoft.pojo.PageResult<cn.wisdsoft.ddms.pojo.Teacher>
     * @date 20:24 2018/9/20
     */
    @RequestMapping(value = "/queryconditionpage", method = RequestMethod.GET)
    @ResponseBody
    public PageResult<Teacher> queryConditionpagePageTeacher(Integer page, Integer limit, String conditionpage) {
        return teacherService.queryConditionPageTeacher(page, limit, conditionpage);
    }

}
