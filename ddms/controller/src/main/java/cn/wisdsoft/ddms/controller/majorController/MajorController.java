package cn.wisdsoft.ddms.controller.majorController;

import cn.wisdsoft.ddms.pojo.College;
import cn.wisdsoft.ddms.pojo.Major;
import cn.wisdsoft.ddms.service.majorService.MajorService;
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
 * 专业controller
 *@author 宋军伟
 *@datatime 2018年9月19日 下午4:07:52
 *@file_name MajorController.java
 *@describe
 */
@Controller
public class MajorController {
	
	@Autowired
	private MajorService majorService;
	/**
	 * 分页查询所有专业
	 * songjunwei
	 * 2018年9月19日 下午4:16:54
	 * @return DdmsResult格式数据
	 */
	@RequestMapping(value="/selmajor",method=RequestMethod.GET)
	@ResponseBody
	public PageResult<Major> selectByRowsAndlimit(int page, int limit) {
		return majorService.selectByRowsAndlimit(page,limit);		
	}
	
	/**
	 * 添加专业信息
	 * songjunwei
	 * 2018年9月19日 下午6:44:01
	 * @param major
	 * @return DdmsResult格式数据
	 */
	@RequestMapping(value="/addmajor",method=RequestMethod.POST)
	@ResponseBody
	public DdmsResult addMajor(Major major) {
		major.setId(selmajormaxid());
		return majorService.addMajor(major);
	}
	
	/**
	 * 修改专业信息
	 * songjunwei
	 * 2018年9月19日 下午7:55:48
	 * @param major
	 * @return
	 */
	@RequestMapping(value="/updatemajors",method=RequestMethod.POST)
	@ResponseBody
	public DdmsResult updateMajor(Major major) {
		return majorService.updateMajor(major);
	}
	/**
	 * 通过专本科或专业名称查询 分页
	 * songjunwei
	 * 2018年9月20日 下午5:13:25
	 * @param major
	 * @return
	 */
	@RequestMapping("/selectByEducationOrName")
	@ResponseBody
	public PageResult<Major> selectByEducationOrName(Major major,int page,int limit){
		return	majorService.selectByEducationOrName(major,page,limit);
	
	}
	/**
	 * 跳转到major专业表
	 * songjunwei
	 * 2018年9月20日 下午7:43:19
	 * @return
	 */
	@RequestMapping(value="/major",method=RequestMethod.GET)
    public String openListmajor(){
        return "major/major_list";
    }
	
	/**
	 * 根据主键id删除行
	 * songjunwei
	 * 2018年9月21日 下午5:08:01
	 * @param id
	 * @return
	 */
	@RequestMapping(value="delemajor",method=RequestMethod.POST)
	@ResponseBody
	public DdmsResult deleteMajor(String id) {
		return majorService.deleteMajor(id);
	}
	
	/**
	 * 根据id查询major信息
	 * songjunwei
	 * 2018年9月21日 下午5:56:08
	  *  修改：2018年9月23日 上午9:00:08
	 * @param major
	 * @return {"status":200,"msg":"OK","data":{id majorName,majorCollegeid,majorDisciplinecategories majorEducation,schoolsystem}}
	 */
	@RequestMapping(value="/selectMajorAccrodingtoid",method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView selectMajorAccrodingtoid(String id) {
		ModelAndView view = new ModelAndView();
		//int id = Integer.parseInt(ids);
		List<Major> major = majorService.selectMajorAccrodingtoid(id);
		List<College> selcollege = majorService.selcollege();
		view.addObject("collegename",selcollege);
		view.addObject("majorresult", major);
		view.setViewName("/major/major_update");
		return view;
	}
	
	/**
	 * 跳转增加专业信息页面
	 * songjunwei
	 * 2018年9月22日 下午18:34
	 * @return 增加专业信息页面
	 */
//	@RequestMapping(value="/addmajorpage",method=RequestMethod.GET)
//	public String openmajor_add() {
//		return "/major/major_add";
//	}
	
	/**
	 * 查询学院信息
	 * songjunwei
	 * 2018年9月22日 下午10:20:24
	 * @return
	 */
	@RequestMapping(value="selcollege",method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView selcollege() {
		ModelAndView view = new ModelAndView();
		List<College> result = majorService.selcollege();
		view.addObject("list", result);
		view.setViewName("/major/major_add");
		return view;	
	}
	/**
	 * 查询专业表中的最大id
	 * songjunwei
	 * 2018年9月23日 下午12:59:05
	 * @return
	 */
	public String selmajormaxid() {
		String idvalue=null;
		String maxid = majorService.selmajormaxid();
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
			idvalue="HGMJ0001";
		}
		return idvalue;
	}
	
} 
