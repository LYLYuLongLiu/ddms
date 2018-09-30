package cn.wisdsoft.ddms.service.collegeservice.impl;

import cn.wisdsoft.ddms.mapper.college.CollegeMapper;
import cn.wisdsoft.ddms.pojo.College;
import cn.wisdsoft.ddms.pojo.CollegeExample;
import cn.wisdsoft.ddms.service.collegeservice.CollegeService;
import cn.wisdsoft.pojo.DdmsResult;
import cn.wisdsoft.pojo.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CollegeServiceImpl
 * @Description TODO
 * @Author LIZEYU
 * @Date 2018/9/19 16:57
 * @Version 1.0
 **/
@Service
public class CollegeServiceImpl implements CollegeService {

    @Autowired
    private CollegeMapper collegeMapper;
    /**
     * @Author 李泽宇
     * @Description //TODO 添加学院信息
     * @Date 2018/9/19 20:51
     * @Param
     * @return
     **/

    public DdmsResult addCollege(College college) {
        collegeMapper.insert(college);
        return DdmsResult.ok();
    }
/**
 * @Author 李泽宇
 * @Description //TODO 删除学院信息
 * @Date 2018/9/19 20:51
 * @Param
 * @return
 **/

    public DdmsResult delCollege(String id) {
        collegeMapper.deleteByPrimaryKey(id);
        return DdmsResult.ok();
    }
/**
 * @Author 李泽宇
 * @Description //TODO 更改学院信息
 * @Date 2018/9/19 20:52
 * @Param
 * @return
 **/

    public DdmsResult updateCollege(College college) {
        collegeMapper.updateByPrimaryKey(college);
        return DdmsResult.ok();
    }
/**
 * @Author 李泽宇
 * @Description //TODO 查询所有学院信息
 * @Date 2018/9/19 20:52
 * @Param
 * @return
 **/
    public PageResult<College> queryAllCollege(int rows, int limit) {
            CollegeExample example = new CollegeExample();
            //将分页的行和一页多少数据，传入
            PageHelper.startPage(rows, limit);
            List<College> list = collegeMapper.selectByExample(example);
            PageInfo<College> info = new PageInfo<>(list);
            return PageResult.ok(list,info.getTotal());
        }
/**
 * @Author 李泽宇
 * @Description //TODO 根据id 查询学院信息
 * @Date 2018/9/25 16:30 
 * @Param 
 * @return 
 **/
    @Override
    public List<College> selectCollegeAccrodingtoid(String id) {
        CollegeExample example = new CollegeExample();
        CollegeExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<College> colleges = collegeMapper.selectByExample(example);
        return colleges;
    }
    /**
     * @Author 李泽宇
     * @Description //TODO 查询所有学院
     * @Date 2018/9/25 16:51 
     * @Param 
     * @return 
     **/
    @Override
    public List<College> selcollege() {
        CollegeExample example = new CollegeExample();
        List<College> list = collegeMapper.selectByExample(example);
        return list;
    }
/**
 * @Author 李泽宇
 * @Description //TODO 根据名称查询学院
 * @Date 2018/9/25 16:51 
 * @Param 
 * @return 
 **/
    @Override
    public PageResult<College> queryCollegeByName(College college,int page, int limit) {
        PageHelper.startPage(page, limit);
        List<College> list = collegeMapper.queryBycollegeName(college);
        PageInfo<College> info = new PageInfo<>(list);
        return PageResult.ok(list,info.getTotal());
    }

    @Override
    public String selcollegemaxid() {
        synchronized(this) {
            String selcollegemaxid = collegeMapper.selcollegemaxid();
            return selcollegemaxid;
        }
    }
//此功能停用
//    @Override
//    public int insertpiliang(List<String[]> list) {
//        int i=0;
//        try {
//            i = collegeMapper.insertSalesCollege(list);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return i;
//    }
}
