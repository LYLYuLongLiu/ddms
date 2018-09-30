package cn.wisdsoft.ddms.controller.teachercontroller;

import cn.wisdsoft.ddms.pojo.Teacher;
import cn.wisdsoft.ddms.service.teacherservice.TeacherService;
import cn.wisdsoft.pojo.DdmsResult;
import cn.wisdsoft.pojo.PageResult;
import cn.wisdsoft.utils.ImportUtil;
import cn.wisdsoft.utils.JsonUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

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


    /**
     * 跳转教师页面
     *
     * @param
     * @return java.lang.String
     * @date 20:01 2018/9/26
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String teacherPage() {
        return "teacher/teacher_list";
    }
    /**
     * 添加教师
     * @date 10:55 2018/9/19
     * @param [teacher]
     * @return cn.wisdsoft.pojo.DdmsResult
     * @throws
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public DdmsResult addTeacher(String result) {
        Teacher teacher = JsonUtils.jsonToPojo(result, Teacher.class);
        return teacherService.addTeacher(teacher);
    }

    /**
     * 跳转添加页面
     *
     * @param
     * @return java.lang.String
     * @date 20:01 2018/9/26
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addTeacherPage() {
        return "teacher/teacher_add";
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
    public DdmsResult updateTeacher(String result) {
        Teacher teacher = JsonUtils.jsonToPojo(result, Teacher.class);
        return teacherService.updateTeacher(teacher);
    }

    /**
     * 通过条件查询
     *
     * @param [condition 查询条件]
     * @return cn.wisdsoft.pojo.DdmsResult
     * @date 20:31 2018/9/19
     */
    @RequestMapping(value = "/condition", method = RequestMethod.GET)
    @ResponseBody
    public DdmsResult queryCondition(String condition) {
        return teacherService.queryCondition(condition);
    }

    /**
     * 根据id删除教师信息
     *
     * @param [id 教师id]
     * @return cn.wisdsoft.pojo.DdmsResult
     * @date 20:54 2018/9/19
     */
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    @ResponseBody
    public DdmsResult del(String id) {
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
    public PageResult<Teacher> queryAllPageTeacher(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer limit) {
        return teacherService.queryAllPageTeacher(page, limit);
    }

    /**
     * 筛选分页
     *
     * @param page  当前页数
     * @param limit  显示行数
     * @param condition  过滤条件
     * @return cn.wisdsoft.pojo.PageResult<cn.wisdsoft.ddms.pojo.Teacher>
     * @date 20:24 2018/9/20
     */
    @RequestMapping(value = "/queryconditionpage", method = RequestMethod.GET)
    @ResponseBody
    public PageResult<Teacher> queryConditionpagePageTeacher(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer limit, String condition) {
        return teacherService.queryConditionPageTeacher(page, limit, condition);
    }

    /**
     * 跳转编辑界面
     *
     * @param
     * @return java.lang.String
     * @date 21:18 2018/9/21
     */
    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String teacherEditPage(@PathVariable("id") String id, Model model) {
        Teacher teacher = teacherService.queryTeahcerId(id);
        model.addAttribute(teacher);
        return "teacher/teacher_edit";
    }

    /**
     * 导入Excel
     *
     * @param excelFile  Excel文件
     * @return cn.wisdsoft.pojo.DdmsResult
     * @date 11:12 2018/9/29
     */
    @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
    @ResponseBody
    public DdmsResult importExcel(MultipartFile excelFile) {
        try {
            Workbook xls = ImportUtil.getExcel(excelFile.getInputStream(), excelFile.getOriginalFilename());
            List<List<Object>> listByExcel = ImportUtil.getListByExcel(xls);
            return teacherService.importExcel(listByExcel);
        } catch (Exception e) {
            e.printStackTrace();
            return DdmsResult.build(500, e.getMessage());
        }
    }

}
