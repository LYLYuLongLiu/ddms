package cn.wisdsoft.ddms.controller.college;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ Author     ：高伟萌
 * @ Date       ：Created in 2018/9/19 16:19
 * @ Description：专业控制类
 * @ Modified By：
 * @Version: 1.0$
 */
@Controller
public class CollegeController {
    @RequestMapping(value = "college")
    public String college(){
        return "/college/college";
    }
}
