package cn.wisdsoft.ddms.service.administrators;

import cn.wisdsoft.ddms.pojo.Administrators;
import cn.wisdsoft.pojo.PageResult;

/**
 * @ Author     ：高伟萌
 * @ Date       ：Created in 2018/9/19 21:02
 * @ Description：管理员业务层
 * @ Modified By：
 * @Version: 1.0$
 */
public interface AdministratorsService {


    /**
     * Query admin by accnum and password administrators.
     *
     * @param username the username
     * @param password the password
     * @return the administrators
     */
    Administrators queryAdminByAccnumAndPassword(String username, String password);


    /**
     * Add administrator int.
     *
     * @param administrators the administrators
     * @return the int
     */
    int addAdministrator(Administrators administrators);


    /**
     * Query all admin page result.
     *
     * @param page  the page
     * @param limit the limit
     * @return the page result
     */
    PageResult<Administrators> queryAllAdmin(int page, int limit);

    /**
     * Del administrator int.
     *
     * @param id the id
     * @return the int
     */
    int delAdministrator(int id);

    /**
     * Query pwd by accnum administrators.
     *
     * @param accNum the acc num
     * @return the administrators
     */
    Administrators queryPwdByAccnum(String accNum);

    /**
     * Update pwd by accnum int.
     *
     * @param accNum the acc num
     * @param newPWD the new pwd
     * @return the int
     */
    int updatePwdByAccnum(String accNum,String newPWD);
}
