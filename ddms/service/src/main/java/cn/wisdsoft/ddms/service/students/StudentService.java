package cn.wisdsoft.ddms.service.students;

import cn.wisdsoft.ddms.pojo.Student;
import cn.wisdsoft.pojo.PageResult;

/**
 * @ Author     ：高伟萌
 * @ Date       ：Created in 2018/9/20 13:06
 * @ Description：学生业务层
 * @ Modified By：
 * @Version: 1.0$
 */
public interface StudentService {
    /**
     * 方法实现说明
     * @author 高伟萌
     * @Description 查询所有学生业务层
     * @Date 2018-09-20 17:16
     * @param page 当前页数
     * @param limit 每页数量
     * @return cn.wisdsoft.pojo.PageResult<cn.wisdsoft.ddms.pojo.Student>
     */
    PageResult<Student> queryAllStudent(int page, int limit);
    
    /**
     * @Author Mr.Gao
     * @Description 查询所有第一次被删除的学生（用于数据恢复）
     * @Date 2018/9/24 18:17
     * @Param [page, limit]
     * @return cn.wisdsoft.pojo.PageResult<cn.wisdsoft.ddms.pojo.Student>
     */
    PageResult<Student> queryAllDelStudent(int page, int limit);

    /**
     * @Author Mr.Gao
     * @Description 根据ID查询单个学生
     * @Date 2018/9/22 17:17
     * @Param [id]
     * @return cn.wisdsoft.ddms.pojo.Student
     */
    Student queryStudentById(int id);

    /**
     * @Author Mr.Gao
     * @Description 根据ID删除学生（将stu_delFlag由0变为1）
     * @Date 2018/9/23 22:41
     * @Param [id]
     * @return cn.wisdsoft.pojo.DdmsResult
     */
    int firstDelStudent(int id);

    /**
     * @Author Mr.Gao
     * @Description 根据ID更新学生信息
     * @Date 2018/9/24 11:21
     * @Param [student]
     * @return int
     */
    int updateStudent(Student student);

    /**
     * @Author Mr.Gao
     * @Description 根据ID彻底删除学生
     * @Date 2018/9/24 19:23
     * @Param [id]
     * @return int
     */
    int secondDelStudent(int id);

    /**
     * @Author Mr.Gao
     * @Description 根据ID恢复第一次被删除的学生
     * @Date 2018/9/24 22:02
     * @Param [id]
     * @return int
     */
    int restoreStudent(int[] id);
}
