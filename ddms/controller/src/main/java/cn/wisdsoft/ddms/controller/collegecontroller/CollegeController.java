package cn.wisdsoft.ddms.controller.collegecontroller;

import cn.wisdsoft.ddms.pojo.College;
import cn.wisdsoft.ddms.service.collegeservice.CollegeService;
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
 * @ClassName CollegeController
 * @Description TODO
 * @Author LIZEYU
 * @Date 2018/9/20 22:00
 * @Version 1.0
 **/

@Controller
@RequestMapping(value = "/college")
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    /**
     * @Author 李泽宇
     * @Description //TODO 跳转至学院管理页面
     * @Date 2018/9/20 22:03
     * @Param
     * @return
     **/

    @RequestMapping(value = "/",method= RequestMethod.GET)
    public String openListPage(){
        return "college/college_list";
    }


 /**
  * @Author 李泽宇
  * @Description //TODO 分页查询全部
  * @Date 2018/9/25 0:07 
  * @Param 
  * @return 
  **/
    @RequestMapping(value="/college_configList",method=RequestMethod.GET)
    @ResponseBody
    public PageResult<College> selectAllCollege(int page, int limit) {
        return collegeService.queryAllCollege(page, limit);
    }


/**
 * @Author 李泽宇
 * @Description //TODO 根据id删除学院数据
 * @Date 2018/9/25 15:52 
 * @Param 
 * @return 
 **/
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    @ResponseBody
    public DdmsResult del(String id) {
        return collegeService.delCollege(id);
    }

/**
 * @Author 李泽宇
 * @Description //TODO 跳转至增加学院信息的页面
 * @Date 2018/9/25 15:54
 * @Param
 * @return
 **/
    @RequestMapping(value="/addcollege",method=RequestMethod.GET)
    public String addcollege() {
        return "/college/college_add";
    }
    
    /**
     * @Author 李泽宇
     * @Description //TODO 增加学院信息
     * @Date 2018/9/25 15:58 
     * @Param 
     * @return 
     **/
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public DdmsResult addCollege(College college) {
        college.setId(selcollegemaxid());
        return collegeService.addCollege(college);
    }

    /**
     * @Author 李泽宇
     * @Description //TODO 修改学院信息
     * @Date 2018/9/25 16:08
     * @Param
     * @return
     **/
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public DdmsResult updateCollege(College college) {
        return collegeService.updateCollege(college);
    }
    
    
    /**
     * @Author 李泽宇
     * @Description //TODO 根据id查询学院信息
     * @Date 2018/9/25 16:33 
     * @Param 
     * @return 
     **/
    @RequestMapping(value="/selectCollegeAccrodingtoid",method=RequestMethod.GET)
    @ResponseBody
    public ModelAndView selectCollegeAccrodingtoid(String id) {
        ModelAndView view = new ModelAndView();
        //int id = Integer.parseInt(ids);
        List<College> colleges = collegeService.selectCollegeAccrodingtoid(id);
        List<College> selcollege = collegeService.selcollege();
        view.addObject("collegename",selcollege);
        view.addObject("collegeresult",colleges);
        view.setViewName("/college/college_update");
        return view;
    }
    
    /**
     * @Author 李泽宇
     * @Description //TODO 通过名称查询学院
     * @Date 2018/9/25 16:59 
     * @Param 
     * @return 
     **/
    @RequestMapping("/queryCollegeByName")
    @ResponseBody
    public PageResult<College> queryCollegeByName(College college,int page,int limit){
        return	collegeService.queryCollegeByName(college,page,limit);
    }
    /**
     * @Author 李泽宇
     * @Description //TODO 无条件查询
     * @Date 2018/9/26 20:45
     * @Param
     * @return
     **/
    @RequestMapping("/selAllCollege")
    @ResponseBody
    public List<College> selAllCollege(){
        return	collegeService.selcollege();
    }

    /**
     * @Author 李泽宇
     * @Description //TODO 查询最大id
     * @Date 2018/9/27 19:42
     * @Param
     * @return
     **/
    public String selcollegemaxid() {
        String idvalue=null;
        String maxid = collegeService.selcollegemaxid();
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
            idvalue="HGXY0001";
        }
        return idvalue;
    }

    /**
     * @Author 李泽宇
     * @Description //TODO 批量导入数据
     * 此功能停用
     * @Date 2018/9/29 16:24
     * @Param
     * @return
     **/
//    @RequestMapping(value = "/readExcelData", method = RequestMethod.POST)
//    @ResponseBody
//    public String readExcelData( MultipartFile filePath) {
//        try {
//            List<String[]> list = InsertUtils.readExcel(filePath);
//            collegeService.insertpiliang(list);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

}
