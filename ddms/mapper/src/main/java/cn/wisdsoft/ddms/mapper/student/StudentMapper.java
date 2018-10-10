package cn.wisdsoft.ddms.mapper.student;

import cn.wisdsoft.ddms.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 方法实现说明
 * @author 高伟萌
 * @Description 学生Mapper
 * @date 2018-09-20 13:00
 * @return null
 */
public interface StudentMapper {
    /**
     * 方法实现说明
     * @author 高伟萌
     * @Description 查询所有学生
     * @Date 2018-09-20 17:15
     * @param page 当前页数
     * @param limit 每页数量
     * @return java.util.List<cn.wisdsoft.ddms.pojo.Student>
     */
    List<Student> queryAllStudents(@Param("page") int page, @Param("limit") int limit);

    /**
     * @Author Mr.Gao
     * @Description 查询所有第一次被删除的学生（用于数据恢复）
     * @Date 2018/9/24 18:15
     * @Param [page, limit]
     * @return java.util.List<cn.wisdsoft.ddms.pojo.Student>
     */
    List<Student> queryAllDelStudents(@Param("page") int page, @Param("limit") int limit);

    /**
     * @Author Mr.Gao
     * @Description 根据条件对学生列表进行筛选
     * @Date 2018/9/25 23:07
     * @Param [stuId, stuName, stuClass, page, limit]
     * @return java.util.List<cn.wisdsoft.ddms.pojo.Student>
     */
    List<Student> filterStudent(@Param("stuId")String stuId,@Param("stuName")String stuName,@Param("stuClass")String stuClass,@Param("delFlag") String delFlag,@Param("page")int page,@Param("limit")int limit);

    /**
     * @Author Mr.Gao
     * @Description 获取筛选出来的数据的行数
     * @Date 2018/9/25 23:13
     * @Param [stuId, stuName, stuClass]
     * @return int
     */
    int filterStudentCount(@Param("stuId")String stuId,@Param("stuName")String stuName,@Param("stuClass")String stuClass);

    /**
     * 方法实现说明
     * @author 高伟萌
     * @Description 查询学生总数量（用于分页）
     * @Date 2018-09-20 13:05
     * @return int
     */
    int queryAllCount();

    /**
     * @Author Mr.Gao
     * @Description 查询所有第一次删除的学生数量
     * @Date 2018/9/24 18:19
     * @Param []
     * @return int
     */
    int queryAllDelCount();

    /**
     * @Author Mr.Gao
     * @Description 根据ID查询单个学生
     * @Date 2018/9/22 17:05
     * @Param [id]
     * @return java.util.List<cn.wisdsoft.ddms.pojo.Student>
     */
    Student queryStudentById(int id);

    /**
     * @Author Mr.Gao
     * @Description 第一次删除学生（将stu_delFlag由0变为1）
     * @Date 2018/9/23 22:38
     * @Param [id]
     * @return int
     */
    int firstDelStudent(int id);

    /**
     * @Author Mr.Gao
     * @Description 更新学生信息
     * @Date 2018/9/24 11:11
     * @Param [student]
     * @return int
     */
    int updateStudent(Student student);

    /**
     * @Author Mr.Gao
     * @Description 根据ID彻底删除学生
     * @Date 2018/9/24 19:19
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

    int insertStudent(@Param("list") List<List<Student>> list);
}