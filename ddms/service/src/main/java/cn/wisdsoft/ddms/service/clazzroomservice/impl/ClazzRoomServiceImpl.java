package cn.wisdsoft.ddms.service.clazzroomservice.impl;

import cn.wisdsoft.ddms.mapper.clazzroom.ClazzRoomMapper;
import cn.wisdsoft.ddms.pojo.ClazzRoom;
import cn.wisdsoft.ddms.pojo.ClazzRoomExample;
import cn.wisdsoft.ddms.service.clazzroomservice.ClazzRoomService;
import cn.wisdsoft.pojo.DdmsResult;
import cn.wisdsoft.pojo.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>ClassName: ClazzRoomServiceImpl</p>
 * <p>Description:</p>
 *
 * @author 刘玉龙
 * @version 1.0
 * @date 2018/9/24 21:00
 */
@Service
public class ClazzRoomServiceImpl implements ClazzRoomService {

    @Autowired
    private ClazzRoomMapper clazzRoomMapper;
    /**
     * 通过条件查询所有数据
     *
     * @param condition  查询条件
     * @return cn.wisdsoft.pojo.DdmsResult
     * @date 21:13 2018/9/24
     */
    @Override
    public DdmsResult queryAllCondition(String condition) {
        List<ClazzRoom> clazzRooms = clazzRoomMapper.queryAllCondition(condition);
        return DdmsResult.ok(clazzRooms);
    }

    /**
     * 查通过条件查询所有数据并分页
     *
     * @param page  当前页数
     * @param limit  显示条数
     * @param condition  查询条件
     * @return cn.wisdsoft.pojo.PageResult<cn.wisdsoft.ddms.pojo.ClazzRoom>
     * @date 21:31 2018/9/24
     */
    @Override
    public PageResult<ClazzRoom> queryPageConditionPage(int page, int limit, String condition) {
        PageHelper.startPage(page, limit);
        List<ClazzRoom> clazzRooms = clazzRoomMapper.queryAllCondition(condition);
        PageInfo<ClazzRoom> pageInfo = new PageInfo<>(clazzRooms);
        return PageResult.ok(clazzRooms, pageInfo.getTotal());
    }

    /**
     * 添加教室
     *
     * @param clazzRoom  教室
     * @return cn.wisdsoft.pojo.DdmsResult
     * @date 21:04 2018/9/25
     */
    @Override
    public DdmsResult addClazzRoom(ClazzRoom clazzRoom) {
        clazzRoomMapper.insert(clazzRoom);
        return DdmsResult.ok();
    }

    /**
     * 删除教室
     *
     * @param id  教室id
     * @return cn.wisdsoft.pojo.DdmsResult
     * @date 21:08 2018/9/25
     */
    @Override
    public DdmsResult delClazzRoom(String id) {
        clazzRoomMapper.deleteByPrimaryKey(id);
        return DdmsResult.ok();
    }

    /**
     * 查询所有数据并分页
     *
     * @param page  当前页数
     * @param limit  显示条数
     * @return cn.wisdsoft.pojo.PageResult<cn.wisdsoft.ddms.pojo.ClazzRoom>
     * @date 21:14 2018/9/25
     */
    @Override
    public PageResult<ClazzRoom> queryPageAll(int page, int limit) {
        ClazzRoomExample example = new ClazzRoomExample();
        PageHelper.startPage(page, limit);
        List<ClazzRoom> clazzRooms = clazzRoomMapper.selectByExample(example);
        PageInfo<ClazzRoom> pageInfo = new PageInfo<>(clazzRooms);
        return PageResult.ok(clazzRooms, pageInfo.getTotal());
    }

    /**
     * 更新教室
     *
     * @param clazzRoom  教室对象
     * @return cn.wisdsoft.pojo.DdmsResult
     * @date 21:08 2018/9/27
     */
    @Override
    public DdmsResult updateClazzRoom(ClazzRoom clazzRoom) {
        clazzRoomMapper.updateByPrimaryKey(clazzRoom);
        return DdmsResult.ok();
    }

}
