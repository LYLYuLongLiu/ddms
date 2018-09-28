package cn.wisdsoft.ddms.mapper.major;

import cn.wisdsoft.ddms.pojo.Major;
import cn.wisdsoft.ddms.pojo.MajorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MajorMapper {
    int countByExample(MajorExample example);

    int deleteByExample(MajorExample example);

    int deleteByPrimaryKey(String id);

    int insert(Major record);

    int insertSelective(Major record);

    List<Major> selectByExample(MajorExample example);

    Major selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Major record, @Param("example") MajorExample example);

    int updateByExample(@Param("record") Major record, @Param("example") MajorExample example);

    int updateByPrimaryKeySelective(Major record);

    int updateByPrimaryKey(Major record);

    /**
     *   根据学历和专业名字查询专业
     * songjunwei
     * 2018年9月23日 下午12:32:41
     * @return
     */
    List<Major> selectByEducationOrName(Major major);
    /**
     *  分页查询数据
     * songjunwei
     * 2018年9月23日 下午12:34:10
     * @return
     */
    List<Major> selectByRowsAndlimit();
    /**
     * 查询专业的最大id
     * songjunwei
     * 2018年9月23日 下午12:36:34
     * @return
     */
    String selmajormaxid();
}