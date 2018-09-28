package cn.wisdsoft.ddms.service.students.impl;

import cn.wisdsoft.ddms.mapper.student.StudentMapper;
import cn.wisdsoft.ddms.pojo.Student;
import cn.wisdsoft.ddms.service.students.StudentService;
import cn.wisdsoft.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author     ：高伟萌
 * @ Date       ：Created in 2018/9/20 13:09
 * @ Description：学生业务层实现类
 * @ Modified By：
 * @Version: 1.0$
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    /**
     * 方法实现说明
     * @author 高伟萌
     * @Description 查询所有学生
     * @date 2018-09-20 13:10
     * @return java.util.List<cn.wisdsoft.ddms.pojo.Student>
     */
    @Override
    public PageResult<Student> queryAllStudent(int page,int limit) {
        List<Student> list = studentMapper.queryAllStudents(page,limit);
        int rows = studentMapper.queryAllCount();
        PageResult<Student> pageResult = PageResult.ok(list, rows);
        return pageResult;
    }

    /**
     * @Author Mr.Gao
     * @Description 查询所有第一次删除的学生（用于数据恢复）
     * @Date 2018/9/24 18:21
     * @Param [page, limit]
     * @return cn.wisdsoft.pojo.PageResult<cn.wisdsoft.ddms.pojo.Student>
     */
    @Override
    public PageResult<Student> queryAllDelStudent(int page, int limit) {
        List<Student> list = studentMapper.queryAllDelStudents(page, limit);
        int rows = studentMapper.queryAllDelCount();
        PageResult<Student> pageResult = PageResult.ok(list,rows);
        return pageResult;
    }

    /**
     * @Author Mr.Gao
     * @Description 根据ID查询单个学生
     * @Date 2018/9/22 17:18
     * @Param [id]
     * @return cn.wisdsoft.ddms.pojo.Student
     */
    @Override
    public Student queryStudentById(int id) {
        return studentMapper.queryStudentById(id);
    }

    /**
     * @Author Mr.Gao
     * @Description 根据ID删除学生（将stu_delFlag由0变为1）
     * @Date 2018/9/23 22:46
     * @Param [id]
     * @return int
     */
    @Override
    public int firstDelStudent(int id) {
        return studentMapper.firstDelStudent(id);
    }

    /**
     * @Author Mr.Gao
     * @Description 根据ID更新学生信息
     * @Date 2018/9/24 11:22
     * @Param [student]
     * @return int
     */
    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    /**
     * @Author Mr.Gao
     * @Description 根据ID彻底删除学生
     * @Date 2018/9/24 19:23
     * @Param [id]
     * @return int
     */
    @Override
    public int secondDelStudent(int id) {
        return studentMapper.secondDelStudent(id);
    }

    /**
     * @Author Mr.Gao
     * @Description 根据ID恢复第一次被删除的学生
     * @Date 2018/9/24 22:03
     * @Param [id]
     * @return int
     */
    @Override
    public int restoreStudent(int[] id) {
        return studentMapper.restoreStudent(id);
    }
}
