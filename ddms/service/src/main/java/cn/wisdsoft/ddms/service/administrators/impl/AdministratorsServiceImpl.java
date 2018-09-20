package cn.wisdsoft.ddms.service.administrators.impl;

import cn.wisdsoft.ddms.mapper.administrators.AdministratorsMapper;
import cn.wisdsoft.ddms.pojo.Administrators;
import cn.wisdsoft.ddms.service.administrators.AdministratorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ Author     ：高伟萌
 * @ Date       ：Created in 2018/9/19 21:05
 * @ Description：管理员与五层实现类
 * @ Modified By：
 * @Version: 1.0$
 */
@Service
public class AdministratorsServiceImpl implements AdministratorsService {

    @Autowired
    private AdministratorsMapper administratorsMapper;

    /**
     * 方法实现说明
     * @author 高伟萌
     * @Description 通过用户名密码获取管理员实体
     * @date 2018-09-19 21:08
     * @param username 用户名
     * @param password 密码
     * @return cn.wisdsoft.ddms.pojo.Administrators
     */
    @Override
    public Administrators queryAdminByAccnumAndPassword(String username, String password) {
        Administrators administrators = administratorsMapper.queryAdminByAccnumAndPassword(username, password);
        return administrators;
    }
}
