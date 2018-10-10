package cn.wisdsoft.ddms.interceptors;

import cn.wisdsoft.ddms.mapper.logfile.LogfileMapper;
import cn.wisdsoft.ddms.pojo.Administrators;
import cn.wisdsoft.ddms.pojo.Logfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * <p>ClassName: LogInterceptors</p>
 * <p>Description:</p>
 *
 * @author 刘玉龙
 * @version 1.0
 * @date 2018/10/9 15:19
 */
@Component
public class LogInterceptors extends HandlerInterceptorAdapter {

    @Autowired
    private LogfileMapper logfileMapper;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if("GET".equals(request.getMethod())) {
            return true;
        }
        HttpSession session = request.getSession();
        Administrators administrators = (Administrators) session.getAttribute("administrator");
        String accnum = administrators.getAdminAccnum();
        Logfile logfile = new Logfile();
        logfile.setLogMethod(request.getRequestURI());
        logfile.setLogName(accnum);
        logfile.setLogTime(new Date());
        logfileMapper.insert(logfile);
        return true;
    }
}
