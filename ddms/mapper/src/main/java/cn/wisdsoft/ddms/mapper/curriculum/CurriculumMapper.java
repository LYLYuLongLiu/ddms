package cn.wisdsoft.ddms.mapper.curriculum;

import cn.wisdsoft.ddms.pojo.Curriculum;
import cn.wisdsoft.ddms.pojo.CurriculumExample;
import cn.wisdsoft.pojo.DdmsResult;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CurriculumMapper {
    int countByExample(CurriculumExample example);

    int deleteByExample(CurriculumExample example);

    int deleteByPrimaryKey(String id);

    int insert(Curriculum record);

    int insertSelective(Curriculum record);

    List<Curriculum> selectByExample(CurriculumExample example);

    Curriculum selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Curriculum record, @Param("example") CurriculumExample example);

    int updateByExample(@Param("record") Curriculum record, @Param("example") CurriculumExample example);

    int updateByPrimaryKeySelective(Curriculum record);

    int updateByPrimaryKey(Curriculum record);

    /**
     *  查询最大id
     * songjunwei
     * 2018年9月23日 下午10:35:42
     * @return
     */
    String selcurriculumMaxID();
    /**
     * 根据课程名称和课程类型 课时查询 并分页
     * songjunwei
     * 2018年9月24日 上午11:28:47
     * @return
     */
    List<Curriculum> selCurriAccordingtoName(@Param("names") String names);
    
    /**
     * 批量插入数据
     * songjunwei
     * 2018年9月29日 下午5:30:54
     * @param list
     * @return
     */
    DdmsResult insertAllCurriculum(@Param("list") List<String[]> list);
}