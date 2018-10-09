package cn.wisdsoft.ddms.interceptors;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <p>ClassName: LoginInterceptors</p>
 * <p>Description:</p>
 *
 * @author 刘玉龙
 * @version 1.0
 * @date 2018/9/19 16:03
 */
public class LoginInterceptors extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        System.out.println(request.getRequestURI());
        if(session.getAttribute("administrator") != null) {
            return true;
        }
        response.sendRedirect("/login");
        return false;
    }
}
