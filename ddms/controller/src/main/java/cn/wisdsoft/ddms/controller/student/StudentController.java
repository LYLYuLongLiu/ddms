package cn.wisdsoft.ddms.controller.student;

import cn.wisdsoft.ddms.pojo.Clazz;
import cn.wisdsoft.ddms.pojo.Student;
import cn.wisdsoft.ddms.service.students.StudentService;
import cn.wisdsoft.pojo.DdmsResult;
import cn.wisdsoft.pojo.PageResult;
import cn.wisdsoft.utils.ImportUtil;
import cn.wisdsoft.utils.JsonUtils;
import cn.wisdsoft.utils.TempUtil;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.util.List;

/**
 * @ Author     ：高伟萌
 * @ Date       ：Created in 2018/9/20 12:48
 * @ Description：学生控制器
 * @ Modified By：
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * 方法实现说明
     * @author 高伟萌
     * @Description 跳转至学生列表页面
     * @date 2018-09-20 13:29
     * @return java.lang.String
     */
    @RequestMapping("student")
    public ModelAndView openListPage(){
        ModelAndView mav = new ModelAndView();
        List<Clazz> clazzes = studentService.queryAllClazzName();
        mav.addObject("allClazz",clazzes);
        mav.setViewName("student/student_list");
        return mav;
    }

    /**
     * @Author Mr.Gao
     * @Description 查询学生数据
     * @Date 2018/9/22 17:19
     * @Param [page, limit]
     * @return cn.wisdsoft.pojo.PageResult<cn.wisdsoft.ddms.pojo.Student>
     */
    @RequestMapping(value = "configList",method= RequestMethod.GET)
    @ResponseBody
    public PageResult<Student> configList(int page,int limit){
        if(page == 1){
            page = 0;
        }else{
            page = (page - 1) * 10;
        }
        PageResult<Student> pageResult = studentService.queryAllStudent(page, limit);
        return pageResult;
    }

    /**
     * @Author Mr.Gao
     * @Description 查询所有第一次被删除的学生（用于数据恢复）
     * @Date 2018/9/24 18:23
     * @Param [page, limit]
     * @return cn.wisdsoft.pojo.PageResult<cn.wisdsoft.ddms.pojo.Student>
     */
    @RequestMapping(value = "configDelList",method = RequestMethod.GET)
    @ResponseBody
    public PageResult<Student> configDelList(int page,int limit){
        if(page == 1){
            page = 0;
        }else{
            page = (page - 1) * 10;
        }
        PageResult<Student> pageResult = studentService.queryAllDelStudent(page, limit);
        return pageResult;
    }

    /**
     * @Author Mr.Gao
     * @Description 跳转至查看页面
     * @Date 2018/9/22 17:21
     * @Param [id]
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping(value = "goToSee",method= RequestMethod.GET)
    public ModelAndView goToSee(int id){
        ModelAndView mav = new ModelAndView();
        Student student = studentService.queryStudentById(id);
        mav.addObject("oneStudent",student);
        mav.setViewName("student/student_see");
        return mav;
    }

    /**
     * @Author Mr.Gao
     * @Description 根据ID删除学生（将stu_delFlag由0变为1）
     * @Date 2018/9/23 22:52
     * @Param [id]
     * @return cn.wisdsoft.pojo.DdmsResult
     */
    @RequestMapping(value = "firstDelStudent",method = RequestMethod.GET)
    @ResponseBody
    public DdmsResult firstDelStudent(int id){
        int flag = studentService.firstDelStudent(id);
        return DdmsResult.ok(flag);
    }

    /**
     * @Author Mr.Gao
     * @Description 根据ID彻底删除学生
     * @Date 2018/9/24 19:26
     * @Param [id]
     * @return cn.wisdsoft.pojo.DdmsResult
     */
    @RequestMapping(value = "secondDelStudent",method = RequestMethod.GET)
    @ResponseBody
    public DdmsResult secondDelStudent(int id){
        int flag = studentService.secondDelStudent(id);
        return DdmsResult.ok(flag);
    }

    /**
     * @Author Mr.Gao
     * @Description 根据ID更新学生信息
     * @Date 2018/9/24 11:25
     * @Param [id]
     * @return cn.wisdsoft.pojo.DdmsResult
     */
    @RequestMapping(value = "updateStudent",method = RequestMethod.POST)
    @ResponseBody
    public DdmsResult updateStudent(String student){
        Student students = JsonUtils.jsonToPojo(student, Student.class);
        int flag = studentService.updateStudent(students);
        return DdmsResult.ok(flag);
    }

    @RequestMapping(value = "restoreStudent",method = RequestMethod.POST)
    @ResponseBody
    public DdmsResult restoreStudent(String[] id){
        int[] ids = new int[id.length];
        for (int i = 0;i<id.length;i++) {
            ids[i] = Integer.parseInt(id[i]);
        }
        int flag = studentService.restoreStudent(ids);
        return DdmsResult.ok(flag);
    }

    /**
     * @Author Mr.Gao
     * @Description 跳转至编辑页面
     * @Date 2018/9/24 11:46
     * @Param []
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping(value = "goToEdit",method = RequestMethod.GET)
    public ModelAndView goToEdit(int id){
        ModelAndView mav = new ModelAndView();
        Student student = studentService.queryStudentById(id);
        List<Clazz> clazzes = studentService.queryAllClazzName();
        mav.addObject("allClazz",clazzes);
        mav.addObject("oneStudent",student);
        mav.setViewName("student/student_edit");
        return mav;
    }

    /**
     * @Author Mr.Gao
     * @Description 跳转至数据恢复页面
     * @Date 2018/9/24 18:28
     * @Param []
     * @return java.lang.String
     */
    @RequestMapping("openDelPage")
    public ModelAndView openDelPage(){
        ModelAndView mav = new ModelAndView();
        List<Clazz> clazzes = studentService.queryAllClazzName();
        mav.addObject("allClazz",clazzes);
        mav.setViewName("student/student_del");
        return mav;
    }

    /**
     * Filter student list page result.
     *
     * @param stuId    the stu id
     * @param stuName  the stu name
     * @param stuClass the stu class
     * @param delFlag  the del flag
     * @param page     the page
     * @param limit    the limit
     * @return the page result
     */
    @RequestMapping(value = "filterStudentList",method = RequestMethod.GET)
    @ResponseBody
    public PageResult<Student> filterStudentList(String stuId,String stuName,String stuClass,String delFlag,int page,int limit){
        if(page == 1){
            page = 0;
        }else{
            page = (page - 1) * 10;
        }
        return studentService.filterStudent(stuId, stuName, stuClass,delFlag, page, limit);
    }


    @RequestMapping(value = "uploadExcel")
    public String uploadExcel(MultipartFile fileType){
        try {
            System.out.println(fileType.getOriginalFilename());
            InputStream inputStream = fileType.getInputStream();
            Workbook excel = ImportUtil.getExcel(inputStream, fileType.getOriginalFilename());
            List<List<Object>> listByExcel = ImportUtil.getListByExcel(excel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @RequestMapping(value = "downLoad")
    @ResponseBody
    public void downLoad(String sheetName,HttpServletResponse response){
        try {
            String[] header = new String[]{"学号","姓名","性别","出生日期","籍贯","入学时间","毕业时间","政治面貌","班级","家庭电话","家庭住址","手机号","身份证号","宿舍","民族","状态"};
            HSSFWorkbook excel = TempUtil.createExcel(sheetName, header);
            HSSFSheet hssfSheet = TempUtil.getHSSFSheet(excel, sheetName);
            List<Clazz> clazzes = studentService.queryAllClazzName();
            String[] clazz = new String[clazzes.size()];
            for (int i = 0; i < clazzes.size(); i++) {
                clazz[i] = clazzes.get(i).getClazzName();
            }
            TempUtil.setBoxes(1,100,8,8,clazz,hssfSheet);
            TempUtil.setDate(1,100,3,3,"1990-01-01","2099-01-01","yyyy-MM-hh",hssfSheet);
            TempUtil.setDate(1,100,5,5,"1990-01-01","2099-01-01","yyyy-MM-hh",hssfSheet);
            TempUtil.setDate(1,100,6,6,"1990-01-01","2099-01-01","yyyy-MM-hh",hssfSheet);
            TempUtil.setLength(1,100,11,11,hssfSheet,excel,"11","手机号");
            TempUtil.setLength(1,100,12,12,hssfSheet,excel,"18","身份证号");
            int[] x = new int[]{0,11,12};
            TempUtil.setCellFormat(1,100,x,excel,hssfSheet);
            TempUtil.getExcel(excel,"学生",response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
