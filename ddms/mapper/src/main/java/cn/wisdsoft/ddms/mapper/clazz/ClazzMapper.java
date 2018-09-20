package cn.wisdsoft.ddms.mapper.clazz;

import cn.wisdsoft.ddms.pojo.Clazz;
import cn.wisdsoft.ddms.pojo.ClazzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClazzMapper {
    int countByExample(ClazzExample example);

    int deleteByExample(ClazzExample example);

    int deleteByPrimaryKey(Integer classid);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    List<Clazz> selectByExample(ClazzExample example);

    Clazz selectByPrimaryKey(Integer classid);

    int updateByExampleSelective(@Param("record") Clazz record, @Param("example") ClazzExample example);

    int updateByExample(@Param("record") Clazz record, @Param("example") ClazzExample example);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);
}