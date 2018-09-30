package cn.wisdsoft.ddms.mapper.clazzroom;

import cn.wisdsoft.ddms.pojo.ClazzRoom;
import cn.wisdsoft.ddms.pojo.ClazzRoomExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClazzRoomMapper {
    int countByExample(ClazzRoomExample example);

    int deleteByExample(ClazzRoomExample example);

    int deleteByPrimaryKey(String id);

    int insert(ClazzRoom record);

    int insertSelective(ClazzRoom record);

    List<ClazzRoom> selectByExample(ClazzRoomExample example);

    ClazzRoom selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ClazzRoom record, @Param("example") ClazzRoomExample example);

    int updateByExample(@Param("record") ClazzRoom record, @Param("example") ClazzRoomExample example);

    int updateByPrimaryKeySelective(ClazzRoom record);

    int updateByPrimaryKey(ClazzRoom record);

    /**
     * 通过条件查询
     *
     * @param condition  查询条件
     * @return java.util.List<cn.wisdsoft.ddms.pojo.ClazzRoom>
     * @date 21:04 2018/9/24
     */
    List<ClazzRoom> queryAllCondition(@Param("condition") String condition);

    /**
     * 导入excel
     *
     * @param list  excel数据
     * @return int
     * @date 11:42 2018/9/29
     */
    int importExcel(@Param("list")List list);
}