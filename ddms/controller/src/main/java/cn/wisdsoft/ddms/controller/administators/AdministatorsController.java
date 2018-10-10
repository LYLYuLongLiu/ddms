package cn.wisdsoft.ddms.controller.administators;

import cn.wisdsoft.ddms.pojo.Administrators;
import cn.wisdsoft.ddms.service.administrators.AdministratorsService;
import cn.wisdsoft.pojo.DdmsResult;
import cn.wisdsoft.pojo.PageResult;
import cn.wisdsoft.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * The type Administators controller.
 *
 * @author ：高伟萌
 * @Date ：Created in 2018/9/19 10:29 @ Description：管理员控制类 @ Modified By：
 * @Version: $V1.0
 */
@Controller
public class AdministatorsController {

    @Autowired
    private AdministratorsService administratorsService;

    /**
     * 方法实现说明
     *
     * @param username 用户名
     * @param password 密码
     * @param request  the request
     * @return cn.wisdsoft.pojo.DdmsResult 实体
     * @author 高伟萌
     * @Description 登录验证
     * @date 2018 -09-19 11:00
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
     *
     * @param
     * @return java.lang.String string
     * @author 高伟萌
     * @Description 跳转至主页
     * @date 2018 -09-19 11:24
     */
    @RequestMapping(value = "/loginToIndex")
    public String loginToIndex(){
        return "common/index";
    }

    /**
     * 方法实现说明
     *
     * @param
     * @return java.lang.String string
     * @author 高伟萌
     * @Description 跳转至登录页面
     * @date 2018 -09-19 11:24
     */
    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }

    /**
     * Go to add admin string.
     * TODO
     * @return the string
     */
    @RequestMapping("/goToAddAdmin")
    public String goToAddAdmin(){
        return "common/addAdministrator";
    }

    /**
     * Config del list page result.
     *
     * @param page  the page
     * @param limit the limit
     * @return the page result
     */
    @RequestMapping(value = "/configDelAdminList",method = RequestMethod.GET)
    @ResponseBody
    public PageResult configDelList(int page, int limit){
        if(page == 1){
            page = 0;
        }else{
            page = (page - 1) * 10;
        }
        return administratorsService.queryAllAdmin(page, limit);
    }

    /**
     * Go to del admin string.
     *
     * @return the string
     */
    @RequestMapping("/goToDelAdmin")
    public String goToDelAdmin(){
        return "common/delAdministrator";
    }

    /**
     * Add administrator ddms result.
     *
     * @param administrators the administrators
     * @return the ddms result
     */
    @RequestMapping(value = "/addAdministrator",method = RequestMethod.POST)
    @ResponseBody
    public DdmsResult addAdministrator(String administrators){
        Administrators administrators1 = JsonUtils.jsonToPojo(administrators, Administrators.class);
        int i = administratorsService.addAdministrator(administrators1);
        return DdmsResult.ok(i);
    }


    /**
     * Del administrator ddms result.
     *
     * @param id the id
     * @return the ddms result
     */
    @RequestMapping(value = "/delAdministrator",method = RequestMethod.POST)
    @ResponseBody
    public DdmsResult delAdministrator(String id){

        int flag = administratorsService.delAdministrator(Integer.parseInt(id));
        return DdmsResult.ok(flag);
    }

    /**
     * Go to update pwd string.
     *
     * @return the string
     */
    @RequestMapping("/goToUpdatePwd")
    public String goToUpdatePwd(){
        return "common/updatePwd";
    }

    /**
     * Update pwd by accnum ddms result.
     *
     * @param oldPwd  the old pwd
     * @param newPwd  the new pwd
     * @param request the request
     * @return the ddms result
     */
    @RequestMapping(value = "/updatePwdByAccnum",method = RequestMethod.POST)
    @ResponseBody
    public DdmsResult updatePwdByAccnum(String oldPwd,String newPwd,HttpServletRequest request){
        HttpSession session = request.getSession();
        Administrators administrator = (Administrators) session.getAttribute("administrator");
        if (administrator != null) {
            String accNum = administrator.getAdminAccnum();
            Administrators currentAdministrator = administratorsService.queryPwdByAccnum(accNum);
            String currentPwd = currentAdministrator.getAdminPassword();
            if(oldPwd.equals(currentPwd)){
                int i = administratorsService.updatePwdByAccnum(accNum, newPwd);
                session.removeAttribute("administrator");
                return DdmsResult.ok(i);
            }else{
                return DdmsResult.ok("请输入正确的旧密码");
            }
        }else{
            return DdmsResult.ok("未查询到用户信息");
        }
    }
}
