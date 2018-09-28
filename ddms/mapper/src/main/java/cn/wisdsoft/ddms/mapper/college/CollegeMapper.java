package cn.wisdsoft.ddms.mapper.college;

import cn.wisdsoft.ddms.pojo.College;
import cn.wisdsoft.ddms.pojo.CollegeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CollegeMapper {
    int countByExample(CollegeExample example);

    int deleteByExample(CollegeExample example);

    int deleteByPrimaryKey(String id);

    int insert(College record);

    int insertSelective(College record);

    List<College> selectByExample(CollegeExample example);

    College selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") College record, @Param("example") CollegeExample example);

    int updateByExample(@Param("record") College record, @Param("example") CollegeExample example);

    int updateByPrimaryKeySelective(College record);

    int updateByPrimaryKey(College record);
}