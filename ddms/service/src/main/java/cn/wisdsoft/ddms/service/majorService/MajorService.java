package cn.wisdsoft.ddms.service.majorService;

import cn.wisdsoft.ddms.pojo.College;
import cn.wisdsoft.ddms.pojo.Major;
import cn.wisdsoft.pojo.DdmsResult;
import cn.wisdsoft.pojo.PageResult;

import java.util.List;

/**
 * 
 *@author 宋军伟
 *@datatime 2018年9月19日 上午10:34:28
 *@file_name CollegeService.java
 *@describe
 */
public interface MajorService {

	/**
	 * 添加专业信息
	 * @return DdmsResult格式
	 */
	DdmsResult addMajor(Major major);
	/**
	 * 分页 查询专业信息
	 * songjunwei
	 * 2018年9月19日 上午11:10:37
	 * @return DdmsResult格式
	 */
	PageResult<Major> selectByRowsAndlimit(int page, int limit);
	
	/**
	 * 更新专业表中的信息
	 * songjunwei
	 * 2018年9月19日 下午3:55:10
	 * @return DdmsResult格式
	 */
	DdmsResult updateMajor(Major major);
	
	/**
	 * 对传入ID的专业行，进行删除
	 * songjunwei
	 * 2018年9月20日 上午11:30:15
	 * @param id
	 * @return
	 */
	DdmsResult deleteMajor(String id);
	
	/**
	 * 通过专本科或专业名称查询
	 * songjunwei
	 * 2018年9月20日 下午12:04:31
	 * @param major
	 * @return
	 */
	PageResult<Major> selectByEducationOrName(Major major, int page, int limit);
	
	/**
	 * 根据id查询专业Major数据
	 * songjunwei
	 * 2018年9月21日 下午5:51:53
	 * @param id
	 * @return
	 */
	List<Major> selectMajorAccrodingtoid(String id);

	/**
	 * 查询所有的学院
	 * songjunwei
	 * 2018年9月22日 下午7:48:18
	 * @return List格式的数据
	 */
	List<College> selcollege();
	
	/**
	 * 查询最大id
	 * songjunwei
	 * 2018年9月23日 下午12:50:22
	 * @return
	 */
	String selmajormaxid();
	/**
	 * 查询所有数据用于导出
	 * songjunwei
	 * 2018年9月21日 下午11:02:15
	 * @return
	 */
	DdmsResult selallmajor();

	 /**
	  * 批量导入
	  * songjunwei
	  * 2018年9月26日 下午7:51:02
	  * @param list
	  * @return
	  */
	 int insertpiliang(List<String[]> list);
}
