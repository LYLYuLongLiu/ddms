package cn.wisdsoft.ddms.mapper.administrators;

import cn.wisdsoft.ddms.pojo.Administrators;
import org.apache.ibatis.annotations.Param;

/**
 * 方法实现说明
 * @author 高伟萌
 * @Description 管理员Mapper接口
 * @date 2018-09-19 10:11
 * @param null
 * @return null
 */
public interface AdministratorsMapper {
    /**
     * 方法实现说明
     * @author 高伟萌
     * @Description 根据用户名和密码查询用户或者管理员
     * @date 2018-09-19 10:10
     * @param accnum 用户名
     * @param password 密码
     * @return cn.wisdsoft.ddms.pojo.Administrators 管理员实体类
     */
    Administrators queryAdminByAccnumAndPassword(@Param("admin_accNum") String adminAccnum, @Param("admin_password") String adminPassword);

}