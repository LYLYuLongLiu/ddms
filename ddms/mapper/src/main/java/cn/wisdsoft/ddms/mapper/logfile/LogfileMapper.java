package cn.wisdsoft.ddms.mapper.logfile;

import cn.wisdsoft.ddms.pojo.Logfile;
import cn.wisdsoft.ddms.pojo.LogfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogfileMapper {
    int countByExample(LogfileExample example);

    int deleteByExample(LogfileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Logfile record);

    int insertSelective(Logfile record);

    List<Logfile> selectByExample(LogfileExample example);

    Logfile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Logfile record, @Param("example") LogfileExample example);

    int updateByExample(@Param("record") Logfile record, @Param("example") LogfileExample example);

    int updateByPrimaryKeySelective(Logfile record);

    int updateByPrimaryKey(Logfile record);
}