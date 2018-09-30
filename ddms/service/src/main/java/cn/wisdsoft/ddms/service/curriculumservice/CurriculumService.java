package cn.wisdsoft.ddms.service.curriculumservice;

import cn.wisdsoft.ddms.pojo.Curriculum;
import cn.wisdsoft.pojo.DdmsResult;
import cn.wisdsoft.pojo.PageResult;

import java.util.List;

/**
 *  科目service层
 * @author songjunwei
 *2018年9月23日 下午6:13:55
 *
 */
public interface CurriculumService {

	/**
	 * 分页 查询科目
	 * songjunwei
	 * 2018年9月23日 下午6:21:56
	 * @return
	 */
	PageResult<Curriculum> selectAllCurriculum(int rows, int limit);
	
	/**
	 * 根据id 删除对应的行
	 * songjunwei
	 * 2018年9月23日 下午7:11:27
	 * @return
	 */
	DdmsResult delByidCurriculum(String id);
	
	/**
	 * 添加课程
	 * songjunwei
	 * 2018年9月23日 下午7:55:36
	 * @return DdmsResult格式数据
	 */
	DdmsResult insertCurriculum(Curriculum curriculum);
	
	/**
	 * 根据id查询科目数据
	 * songjunwei
	 * 2018年9月23日 下午7:57:08
	 * @return
	 */
	List<Curriculum> selAccordingtoid(String id);
	
	/**
	 * 更新课程数据
	 * songjunwei
	 * 2018年9月23日 下午7:59:14
	 * @return
	 */
	DdmsResult updateCurriculum(Curriculum curriculum);
	/**
	 * 查询最大id
	 * songjunwei
	 * 2018年9月23日 下午10:19:17
	 * @return
	 */
	String selectcurriculumMaxID();
	/**
     *  根据课程名称和课程类型查询 并分页
     * songjunwei
     * 2018年9月24日 上午11:50:47
     * @return
     */
    PageResult<Curriculum> selCurriAccordingtoName(String name, int page, int limit);
    
    /**
     * 查询所有课程数据
     * songjunwei
     * 2018年9月25日 下午5:24:31
     * @return
     */
    //DdmsResult selAllCurriculum(String selsearch);
    /**
     * 批量插入数据
     * songjunwei
     * 2018年9月29日 下午4:46:27
     * @param list
     * @return
     */
    DdmsResult insertAllCurriculum(List<String[]> list);
}
