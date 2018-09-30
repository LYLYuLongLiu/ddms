package cn.wisdsoft.ddms.controller.clazzcontroller;

import cn.wisdsoft.ddms.pojo.Clazz;
import cn.wisdsoft.ddms.pojo.College;
import cn.wisdsoft.ddms.pojo.Major;
import cn.wisdsoft.ddms.service.clazzservice.ClazzService;
import cn.wisdsoft.pojo.DdmsResult;
import cn.wisdsoft.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @ClassName ClazzController
 * @Description TODO
 * @Author LIZEYU
 * @Date 2018/9/19 22:39
 * @Version 1.0
 **/

@Controller
@RequestMapping(value = "/clazz")
public class ClazzController {

    @Autowired
    private ClazzService clazzService;
/**
 * @Author 李泽宇
 * @Description //TODO 跳转至班级页面
 * @Date 2018/9/20 22:59
 * @Param
 * @return
 **/
    @RequestMapping(value = "/",method= RequestMethod.GET)
    public String openListPage(){
        return "clazz/clazz_list";
    }



    /**
     * @Author 李泽宇
     * @Description //TODO 查询全部班级信息(分页)
     * @Date 2018/9/19 23:03
     * @Param
     * @return
     **/
  /**  @RequestMapping(value = "clazz_configList",method= RequestMethod.GET)
    @ResponseBody
    public PageResult<Clazz> configList(int page, int limit){
        return clazzService.queryAllClazz(page,limit);
    }**/

/**
 * @Author 李泽宇
 * @Description //TODO 跳转至增加班级信息页面
 * @Date 2018/9/26 9:00
 * @Param
 * @return
 **/

    @RequestMapping(value="/addclazz",method=RequestMethod.GET)
    public ModelAndView addclazz() {
        ModelAndView mav = new ModelAndView();
        List<Major> selmajor = clazzService.selMajor();
        List<College> selcollege = clazzService.selCollege();
        mav.addObject("selmajor",selmajor);
        mav.addObject("selcollege",selcollege);
        mav.setViewName("/clazz/clazz_add");
        return mav;
}
 /**
  * @Author 李泽宇
  * @Description //TODO 添加班级信息
  * @Date 2018/9/19 23:02 
  * @Param 
  * @return 
  **/
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public DdmsResult addClazz(Clazz clazz){
        clazz.setId(selclazzmaxid());
        return clazzService.addClazz(clazz);
    }
/**
 * @Author 李泽宇
 * @Description //TODO 更改班级信息
 * @Date 2018/9/19 23:03 
 * @Param 
 * @return 
 **/
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public DdmsResult updateClazz(Clazz clazz){
       return clazzService.updateClazz(clazz);
    }


    /**
     * @Author 李泽宇
     * @Description //TODO 删除班级信息
     * @Date 2018/9/19 23:03 
     * @Param 
     * @return 
     **/
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    @ResponseBody
    public DdmsResult delClazz(String id){
        return clazzService.delClazz(id);
    }


    /**
     * @Author 李泽宇
     * @Description //TODO 根据id查询班级信息
     * @Date 2018/9/26 9:02
     * @Param
     * @return
     **/
    @RequestMapping(value="/selectClazzAccrodingtoid",method=RequestMethod.GET)
    @ResponseBody
    public ModelAndView selectClazzAccrodingtoid(String id) {
        ModelAndView view = new ModelAndView();
        //int id = Integer.parseInt(ids);
        List<Clazz> clazzes = clazzService.selectClazzAccrodingtoid(id);
        List<Major> selmajor = clazzService.selMajor();
        List<College> selcollege = clazzService.selCollege();
        view.addObject("selmajor",selmajor);
        view.addObject("selcollege",selcollege);
        view.addObject("clazzresult",clazzes);
        view.setViewName("/clazz/clazz_update");
        return view;
    }

    /**
     * @Author 李泽宇
     * @Description //TODO 通过班级名称或专业名称查询
     * @Date 2018/9/26 9:05
     * @Param
     * @return
     **/
    @RequestMapping("/queryClazzByNameOrmajorName")
    @ResponseBody
    public PageResult<Clazz> queryClazzByNameOrMajorId(Clazz clazz,int page,int limit) {
        return clazzService.queryClazzByNameOrmajorName(clazz, page, limit);
    }
    /**
     * @Author 李泽宇
     * @Description //TODO 查询所有学院
     * @Date 2018/9/26 10:44
     * @Param
     * @return
     **/
//    @RequestMapping(value="selcollege",method=RequestMethod.GET)
//    @ResponseBody
//    public ModelAndView selcollege() {
//        ModelAndView view = new ModelAndView();
//        List<College> result = clazzService.selCollege();
//        view.addObject("collegelist", result);
//        view.setViewName("/clazz/clazz_add");
//        return view;
//    }

    /**
     * @Author 李泽宇
     * @Description //TODO 查询所有专业
     * @Date 2018/9/26 10:44
     * @Param
     * @return
     **/
//    @RequestMapping(value="selmajor",method=RequestMethod.GET)
//    @ResponseBody
//    public ModelAndView selmajor() {
//        ModelAndView view = new ModelAndView();
//        List<Major> result = clazzService.selMajor();
//        view.addObject("majorlist", result);
//        view.setViewName("/clazz/clazz_add");
//        return view;
//    }

    /**
     * @Author 李泽宇
     * @Description //TODO 查询所有关于班级的信息并分页
     * @Date 2018/9/26 18:52
     * @Param
     * @return
     **/
    @RequestMapping(value = "clazz_configList",method= RequestMethod.GET)
    @ResponseBody
    public PageResult<Clazz> configList(int page, int limit){
        return clazzService.selAllClazz(page,limit);
    }


    /**
     * @Author 李泽宇
     * @Description //TODO 查询所有班级
     * @Date 2018/9/26 22:56
     * @Param
     * @return
     **/
    @RequestMapping("/selAllClazz")
    @ResponseBody
    public List<Clazz> selAllClazz(){
        return	clazzService.selClazz();
}


    /**
     * @Author 李泽宇
     * @Description //TODO 查询最大id
     * @Date 2018/9/27 20:05
     * @Param
     * @return
     **/
    public String selclazzmaxid() {
        String idvalue=null;
        String maxid = clazzService.selclazzmaxid();
        if(maxid!=null && !"".equals(maxid)) {
            String a = maxid.substring(0, 4);
            String b = maxid.substring(maxid.length()-4);
            int num = Integer.parseInt(b);
            //计算有几个0开头
            int size = b.length()-String.valueOf(num).length();
            if(size==3) {
                int c = Integer.parseInt(b.substring(3));
                if(c==9) {
                    idvalue = a+"00"+(c+1);
                }else {
                    idvalue = a+"000"+(c+1);
                }
            }else if(size==2) {
                int c = Integer.parseInt(b.substring(2));
                if(c==99) {
                    idvalue = a+"0"+(c+1);
                }else {
                    idvalue = a+"00"+(c+1);
                }
            }else if(size==1) {
                int c = Integer.parseInt(b.substring(1));
                if(c>=999) {
                    idvalue = a+(c+1);
                }else {
                    idvalue = a+"0"+(c+1);
                }
            }else {
                idvalue="数值大于9999，请联系管理员";
            }
        }else {
            idvalue="HGBJ0001";
        }
        return idvalue;
    }
}


