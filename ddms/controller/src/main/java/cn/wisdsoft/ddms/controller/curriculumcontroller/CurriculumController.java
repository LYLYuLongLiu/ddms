package cn.wisdsoft.ddms.controller.curriculumcontroller;

import cn.wisdsoft.ddms.pojo.Curriculum;
import cn.wisdsoft.ddms.service.curriculumservice.CurriculumService;
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
 * 课程Controller
 * @author songjunwei
 *2018年9月23日 下午8:14:12
 */
@Controller
public class CurriculumController {

	@Autowired
	private CurriculumService curriculumService;
	/**
	 *  跳转到curriculum页面
	 * songjunwei
	 * 2018年9月23日 下午8:26:48
	 * @return
	 */
	@RequestMapping(value="curriculum",method=RequestMethod.GET)
	public String curriculumpage() {
		return "/curriculum/curriculum_list";
	}
	/**
	 * 查询课程表中的最大id
	 * songjunwei
	 * 2018年9月23日 下午22:39:05
	 * @return max id 的下一个
	 */
	public String selcurriculummaxid() {
		String idvalue=null;
		String maxid = curriculumService.selectcurriculumMaxID();
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
			idvalue="HGCC0001";
		}		
		return idvalue;
	}
	/**
	 * 分页查询
	 * songjunwei
	 * 2018年9月23日 下午9:42:18
	 * @return
	 */
	@RequestMapping(value="/selectAllCurriculum",method=RequestMethod.GET)
	@ResponseBody
	public PageResult<Curriculum> selectAllCurriculum(int page, int limit) {
		return curriculumService.selectAllCurriculum(page, limit);	
	}
	
	/**
	 * 删除传入id的行
	 * songjunwei
	 * 2018年9月23日 下午10:10:27
	 * @return
	 */
	@RequestMapping(value="/delByidCurriculum",method=RequestMethod.POST)
	@ResponseBody
	public DdmsResult delByidCurriculum(String id) {	
		return curriculumService.delByidCurriculum(id);
	}
	
	/**
	 * 添加课程
	 * songjunwei
	 * 2018年9月23日 下午10:12:38
	 * @return
	 */
	@RequestMapping(value="/insertCurriculum",method=RequestMethod.POST)
	@ResponseBody
	public DdmsResult insertCurriculum(Curriculum curriculum) {
		curriculum.setId(selcurriculummaxid());
		DdmsResult result = curriculumService.insertCurriculum(curriculum);
		return result;
	}
	
	/**
	 *   根据id查询科目数据
	 * songjunwei
	 * 2018年9月23日 下午10:42:43
	 * @return
	 */
	@RequestMapping(value="/selAccordingtoid",method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView selAccordingtoid(String id) {
		ModelAndView mav = new ModelAndView();
		List<Curriculum> list = curriculumService.selAccordingtoid(id);
		mav.addObject("curriculumresult",list);
		mav.setViewName("/curriculum/curriculum_update");
		return mav;
	}
	
	/**
	 *  更新课程数据
	 * songjunwei
	 * 2018年9月23日 下午10:49:59
	 * @return
	 */
	@RequestMapping(value="/updateCurriculum",method=RequestMethod.POST)
	@ResponseBody
	public DdmsResult updateCurriculum(Curriculum curriculum) {
		return curriculumService.updateCurriculum(curriculum);	
	}
	
	/**
	 * 跳转到增加课程的页面
	 * songjunwei
	 * 2018年9月23日 下午11:03:01
	 * @return
	 */
	@RequestMapping(value="/addcurriculumpage",method=RequestMethod.GET)
	public String addcurriculumpage() {
		return "/curriculum/curriculum_add";
	}
	
	/**
	 * 根据课程名称和课程类型查询 并分页
	 * songjunwei
	 * 2018年9月24日 下午12:03:28
	 * @return
	 */
	@RequestMapping(value="/selCurriAccordingtoNameAndtype",method=RequestMethod.GET)
	@ResponseBody
	public PageResult<Curriculum> selCurriAccordingtoNameAndtype(Curriculum curriculum,int page,int limit) {
		return curriculumService.selCurriAccordingtoNameAndtype(curriculum, page, limit);
		
	}
}
