package cn.wisdsoft.ddms.mapper.administrators;

import cn.wisdsoft.ddms.pojo.Administrators;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The interface Administrators mapper.
 */
public interface AdministratorsMapper {
    /**
     * 方法实现说明
     *
     * @param adminAccnum   the admin accnum
     * @param adminPassword the admin password
     * @return cn.wisdsoft.ddms.pojo.Administrators 管理员实体类
     * @author 高伟萌
     * @Description 根据用户名和密码查询用户或者管理员
     * @date 2018 -09-19 10:10
     */
    Administrators queryAdminByAccnumAndPassword(@Param("admin_accNum") String adminAccnum, @Param("admin_password") String adminPassword);

    /**
     * Insert administrator int.
     *
     * @param administrators the administrators
     * @return the int
     */
    int insertAdministrator(@Param("administrators") Administrators administrators);


    /**
     * Query all admin list.
     *
     * @param page  the page
     * @param limit the limit
     * @return the list
     */
    List<Administrators> queryAllAdmin(@Param("page") int page,@Param("limit") int limit);

    /**
     * Query count for administrator int.
     *
     * @return the int
     */
    int queryCountForAdministrator();

    /**
     * Del administrator int.
     *
     * @param id the id
     * @return the int
     */
    int delAdministrator(int id);

    /**
     * Select pwd by accnum administrators.
     *
     * @param accNum the acc num
     * @return the administrators
     */
    Administrators selectPwdByAccnum(String accNum);

    /**
     * Update pwd by acc num int.
     *
     * @param accNum the acc num
     * @return the int
     */
    int updatePwdByAccNum(@Param("accNum") String accNum,@Param("newPwd") String newPwd);
}