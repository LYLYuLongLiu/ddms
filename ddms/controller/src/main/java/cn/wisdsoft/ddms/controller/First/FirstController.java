package cn.wisdsoft.ddms.controller.First;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ Author     ：高伟萌
 * @ Date       ：Created in 2018/9/19 16:39
 * @ Description：首页控制器
 * @ Modified By：
 * @Version: 1.0$
 */
@Controller
public class FirstController {

    @RequestMapping(value = "/first")
    public String first(){
        return "/first/first";
    }
}
