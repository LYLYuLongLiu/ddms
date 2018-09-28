package cn.wisdsoft.ddms.service.curriculumservice.curriculumserviceIimpl;

import cn.wisdsoft.ddms.mapper.curriculum.CurriculumMapper;
import cn.wisdsoft.ddms.pojo.Curriculum;
import cn.wisdsoft.ddms.pojo.CurriculumExample;
import cn.wisdsoft.ddms.pojo.CurriculumExample.Criteria;
import cn.wisdsoft.ddms.service.curriculumservice.CurriculumService;
import cn.wisdsoft.pojo.DdmsResult;
import cn.wisdsoft.pojo.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CurriculumServiceIimpl implements CurriculumService {

	@Autowired
	private CurriculumMapper curriculumMapper;
	/*
	 * 
	 * 描述：分页查询所有课程信息
	 * songjunwei
	 * 2018年9月23日 下午6:25:25
	 */
	@Override
	public PageResult<Curriculum> selectAllCurriculum(int rows, int limit) {
		CurriculumExample example = new CurriculumExample();
		//将分页的行和一页多少数据，传入
		PageHelper.startPage(rows, limit);
		List<Curriculum> list = curriculumMapper.selectByExample(example);
		PageInfo<Curriculum> info = new PageInfo<>(list);
		return PageResult.ok(list,info.getTotal());
	}
	/*
	 * 
	 * 描述：根据id 删除行
	 * songjunwei
	 * 2018年9月23日 下午7:34:06
	 */
	@Override
	public DdmsResult delByidCurriculum(String id) {
		curriculumMapper.deleteByPrimaryKey(id);
		return DdmsResult.ok();
	}
	
	/*
	 * 
	 * 描述：添加课程信息
	 * songjunwei
	 * 2018年9月23日 下午8:01:41
	 */
	@Override
	public DdmsResult insertCurriculum(Curriculum curriculum) {
		curriculumMapper.insert(curriculum);
		return DdmsResult.ok();
	}
	
	/*
	 * 
	 * 描述：根据id查询课程数据
	 * songjunwei
	 * 2018年9月23日 下午8:03:36
	 */
	@Override
	public List<Curriculum> selAccordingtoid(String id) {
		CurriculumExample example = new CurriculumExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		List<Curriculum> curriculum = curriculumMapper.selectByExample(example);
		return curriculum;
	}
	
	/*
	 * 描述：更新课程数据
	 * songjunwei
	 * 2018年9月23日 下午8:06:28
	 */
	@Override
	public DdmsResult updateCurriculum(Curriculum curriculum) {
		curriculumMapper.updateByPrimaryKey(curriculum);
		return DdmsResult.ok();
	}
	/*
	 * 
	 * 描述：查询MAX的ID值
	 * songjunwei
	 * 2018年9月23日 下午10:20:19
	 */
	@Override
	public String selectcurriculumMaxID() {
		synchronized(this) {
		return curriculumMapper.selcurriculumMaxID();
		}
	}
	/*
	 * 
	 * 描述：根据课程名称和课程类型查询 并分页
	 * songjunwei
	 * 2018年9月24日 下午12:01:34
	 */
	@Override
	public PageResult<Curriculum> selCurriAccordingtoNameAndtype(Curriculum curriculum, int page, int limit) {
		PageHelper.startPage(page, limit);
		List<Curriculum> result = curriculumMapper.selCurriAccordingtoNameAndtype(curriculum);
		PageInfo<Curriculum> info = new PageInfo<>(result);
		return PageResult.ok(result, info.getTotal());
	}
	
	

}
