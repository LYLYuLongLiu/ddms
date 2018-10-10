package cn.wisdsoft.ddms.service.administrators.impl;

import cn.wisdsoft.ddms.mapper.administrators.AdministratorsMapper;
import cn.wisdsoft.ddms.pojo.Administrators;
import cn.wisdsoft.ddms.service.administrators.AdministratorsService;
import cn.wisdsoft.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public int addAdministrator(Administrators administrators) {
        return administratorsMapper.insertAdministrator(administrators);
    }

    @Override
    public PageResult queryAllAdmin(int page, int limit) {
        List<Administrators> administrators = administratorsMapper.queryAllAdmin(page,limit);
        int count = administratorsMapper.queryCountForAdministrator();
        return PageResult.ok(administrators,count);
    }

    @Override
    public int delAdministrator(int id) {
        return administratorsMapper.delAdministrator(id);
    }

    @Override
    public Administrators queryPwdByAccnum(String accNum) {
        return administratorsMapper.selectPwdByAccnum(accNum);
    }

    @Override
    public int updatePwdByAccnum(String accNum, String newPWD) {
        return administratorsMapper.updatePwdByAccNum(accNum, newPWD);
    }
}
