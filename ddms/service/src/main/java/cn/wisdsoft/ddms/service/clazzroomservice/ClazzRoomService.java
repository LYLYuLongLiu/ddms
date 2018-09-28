package cn.wisdsoft.ddms.service.clazzroomservice;

import cn.wisdsoft.ddms.pojo.ClazzRoom;
import cn.wisdsoft.pojo.DdmsResult;
import cn.wisdsoft.pojo.PageResult;

/**
 * <p>ClassName: ClazzRoomService</p>
 * <p>Description:</p>
 *
 * @author 刘玉龙
 * @version 1.0
 * @date 2018/9/24 20:59
 */
public interface ClazzRoomService {

    /**
     * 通过条件查询所有数据
     *
     * @param condition  查询条件
     * @return cn.wisdsoft.pojo.DdmsResult
     * @date 21:01 2018/9/24
     */
    DdmsResult queryAllCondition(String condition);

    /**
     * 查通过条件查询所有数据并分页
     *
     * @param page  当前页数
     * @param limit  显示条数
     * @param condition  查询条件
     * @return cn.wisdsoft.pojo.PageResult<cn.wisdsoft.ddms.pojo.ClazzRoom>
     * @date 21:31 2018/9/24
     */
    PageResult<ClazzRoom> queryPageConditionPage(int page, int limit, String condition);

    /**
     * 添加教室
     *
     * @param clazzRoom  教室
     * @return cn.wisdsoft.pojo.DdmsResult
     * @date 21:04 2018/9/25
     */
    DdmsResult addClazzRoom(ClazzRoom clazzRoom);

    /**
     * 删除教室
     *
     * @param id  教室id
     * @return cn.wisdsoft.pojo.DdmsResult
     * @date 21:08 2018/9/25
     */
    DdmsResult delClazzRoom(String id);

    /**
     * 查询所有数据并分页
     *
     * @param page  当前页数
     * @param limit  显示条数
     * @return cn.wisdsoft.pojo.PageResult<cn.wisdsoft.ddms.pojo.ClazzRoom>
     * @date 21:14 2018/9/25
     */
    PageResult<ClazzRoom> queryPageAll(int page, int limit);

    /**
     * 更新教室
     *
     * @param clazzRoom  教室对象
     * @return cn.wisdsoft.pojo.DdmsResult
     * @date 21:08 2018/9/27
     */
    DdmsResult updateClazzRoom(ClazzRoom clazzRoom);
}
