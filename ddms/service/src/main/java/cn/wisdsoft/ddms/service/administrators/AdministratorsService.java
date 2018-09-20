package cn.wisdsoft.ddms.service.administrators;

import cn.wisdsoft.ddms.pojo.Administrators;

/**
 * @ Author     ：高伟萌
 * @ Date       ：Created in 2018/9/19 21:02
 * @ Description：管理员业务层
 * @ Modified By：
 * @Version: 1.0$
 */
public interface AdministratorsService {

    /**
     * 方法实现说明
     * @author 高伟萌
     * @Description 通过用户名密码获取管理员实体
     * @date 2018-09-19 21:08
     * @param username 用户名
     * @param password 密码
     * @return cn.wisdsoft.ddms.pojo.Administrators
     */
    public Administrators queryAdminByAccnumAndPassword(String username, String password);
}
