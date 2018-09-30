package cn.wisdsoft.ddms.controller.clazzroomcontroller;

import cn.wisdsoft.ddms.pojo.ClazzRoom;
import cn.wisdsoft.ddms.service.clazzroomservice.ClazzRoomService;
import cn.wisdsoft.pojo.DdmsResult;
import cn.wisdsoft.pojo.PageResult;
import cn.wisdsoft.utils.ImportUtil;
import cn.wisdsoft.utils.JsonUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>ClassName: ClazzRoomController</p>
 * <p>Description:</p>
 *
 * @author 刘玉龙
 * @version 1.0
 * @date 2018/9/24 21:16
 */
@Controller
@RequestMapping(value = "/clazzroom")
public class ClazzRoomController {

    @Autowired
    private ClazzRoomService clazzRoomService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String clazzRoomPage() {
        return "clazzroom/clazzroom_list";
    }
    /**
     * 通过条件查询所有数据
     *
     * @param condition  查询条件
     * @return cn.wisdsoft.pojo.DdmsResult
     * @date 21:24 2018/9/24
     */
    @RequestMapping(value = "/condition", method = RequestMethod.GET)
    @ResponseBody
    public DdmsResult queryAllCondition(String condition) {
        return clazzRoomService.queryAllCondition(condition);
    }

    /**
     * 通过查询条件查询所有数据并分页
     *
     * @param page  当前页数
     * @param limit  显示条数
     * @param condition  查询条件
     * @return cn.wisdsoft.pojo.PageResult<cn.wisdsoft.ddms.pojo.ClazzRoom>
     * @date 21:39 2018/9/24
     */
    @RequestMapping(value = "/querypageacondition", method = RequestMethod.GET)
    @ResponseBody
    public PageResult<ClazzRoom> queryPageConditionPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer limit, String condition) {
        return clazzRoomService.queryPageConditionPage(page, limit , condition);
    }

    /**
     * 添加教室
     *
     * @param result  教室的json字符串
     * @return cn.wisdsoft.pojo.DdmsResult
     * @date 21:07 2018/9/25
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public DdmsResult addClazzRoom(String result) {
        ClazzRoom clazzRoom = JsonUtils.jsonToPojo(result, ClazzRoom.class);
        return clazzRoomService.addClazzRoom(clazzRoom);
    }

    /**
     * 删除教室
     *
     * @param id  教室id
     * @return cn.wisdsoft.pojo.DdmsResult
     * @date 21:11 2018/9/25
     */
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    @ResponseBody
    public DdmsResult delClazzRoom(String id) {
        return clazzRoomService.delClazzRoom(id);
    }

    /**
     * 查询所有数据并分页
     *
     * @param page  当前页数
     * @param limit  显示条数
     * @return cn.wisdsoft.pojo.PageResult<cn.wisdsoft.ddms.pojo.ClazzRoom>
     * @date 21:19 2018/9/25
     */
    @RequestMapping(value = "/querypageall", method = RequestMethod.GET)
    @ResponseBody
    public PageResult<ClazzRoom> queryPageAll(int page, int limit) {
        return clazzRoomService.queryPageAll(page, limit);
    }

    /**
     * 跳转编辑界面
     *
     * @param result  前台json数据
     * @param model
     * @return java.lang.String
     * @date 21:13 2018/9/27
     */
    @RequestMapping(value = "/update/{result}", method = RequestMethod.GET)
    public String clazzRoomEditPage(@PathVariable("result") String result, Model model) {
        ClazzRoom clazzRoom = JsonUtils.jsonToPojo(result, ClazzRoom.class);
        model.addAttribute(clazzRoom);
        return "clazzroom/clazzroom_edit";
    }

    /**
     * 更新教室
     *
     * @param result  前台json数据
     * @return cn.wisdsoft.pojo.DdmsResult
     * @date 21:13 2018/9/27
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public DdmsResult updateClazzRoom(String result) {
        ClazzRoom clazzRoom = JsonUtils.jsonToPojo(result, ClazzRoom.class);
        return clazzRoomService.updateClazzRoom(clazzRoom);
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String insertClazzRoomPage() {
        return "clazzroom/clazzroom_add";
    }

    @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
    @ResponseBody
    public DdmsResult imortExcel(MultipartFile excelFile) {
        try {
            Workbook excel = ImportUtil.getExcel(excelFile.getInputStream(), excelFile.getOriginalFilename());
            return clazzRoomService.importExcel(ImportUtil.getListByExcel(excel));
        } catch (Exception e) {
            e.printStackTrace();
            return DdmsResult.build(500, e.getMessage());
        }
    }
}
