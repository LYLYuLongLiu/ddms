package cn.wisdsoft.ddms.controller.administators;

import cn.wisdsoft.ddms.pojo.Administrators;
import cn.wisdsoft.ddms.service.administrators.AdministratorsService;
import cn.wisdsoft.pojo.DdmsResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author     ：高伟萌
 * @Date       ：Created in 2018/9/19 10:29
 * @ Description：管理员控制类
 * @ Modified By：
 * @Version: $V1.0
 */
@Controller
public class AdministatorsController {

    @Autowired
    private AdministratorsService administratorsService;

    /**
     * 方法实现说明
     * @author 高伟萌
     * @Description 登录验证
     * @date 2018-09-19 11:00
     * @param username 用户名
     * @param password 密码
     * @return cn.wisdsoft.pojo.DdmsResult 实体
     */
    @RequestMapping(value = "/judge")
    @ResponseBody
    public DdmsResult loginJudge(String username, String password, HttpServletRequest request){
        DdmsResult ddmsResult = new DdmsResult();
        HttpSession session = request.getSession();
        Administrators administrators = administratorsService.queryAdminByAccnumAndPassword(username, password);
        if(administrators != null){
            ddmsResult.setStatus(200);
            ddmsResult.setMsg("success");
            administrators.setAdminPassword(null);
            session.setAttribute("administrator",administrators);
        }else{
            ddmsResult.setStatus(400);
            ddmsResult.setMsg("error");
        }
        return ddmsResult;
    }

    /**
     * 方法实现说明
     * @author 高伟萌
     * @Description 跳转至主页
     * @date 2018-09-19 11:24
     * @param
     * @return java.lang.String
     */
    @RequestMapping(value = "/loginToIndex")
    public String loginToIndex(){
        return "common/index";
    }

    /**
     * 方法实现说明
     * @author 高伟萌
     * @Description 跳转至登录页面
     * @date 2018-09-19 11:24
     * @param
     * @return java.lang.String
     */
    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }
}
