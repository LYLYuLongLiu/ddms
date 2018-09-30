package cn.wisdsoft.ddms.service.clazzservice.impl;

import cn.wisdsoft.ddms.mapper.clazz.ClazzMapper;
import cn.wisdsoft.ddms.mapper.college.CollegeMapper;
import cn.wisdsoft.ddms.mapper.major.MajorMapper;
import cn.wisdsoft.ddms.pojo.*;
import cn.wisdsoft.ddms.service.clazzservice.ClazzService;
import cn.wisdsoft.pojo.DdmsResult;
import cn.wisdsoft.pojo.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ClazzServiceImpl
 * @Description TODO
 * @Author LIZEYU
 * @Date 2018/9/19 17:00
 * @Version 1.0
 **/
@Service
public class ClazzServiceImpl implements ClazzService {
    @Autowired
    private ClazzMapper clazzMapper;
    @Autowired
    private CollegeMapper collegeMapper;
    @Autowired
    private MajorMapper majorMapper;
    /**
     * @Author 李泽宇
     * @Description //TODO 添加班级信息
     * @Date 2018/9/19 21:46
     * @Param
     * @return
     **/
    @Override
    public DdmsResult addClazz(Clazz clazz) {
        clazzMapper.insert(clazz);
        return DdmsResult.ok();
    }
    /**
     * @Author 李泽宇
     * @Description //TODO 更改班级信息
     * @Date 2018/9/19 21:46
     * @Param
     * @return
     **/
    @Override
    public DdmsResult updateClazz(Clazz clazz) {
        clazzMapper.updateByPrimaryKey(clazz);
        return DdmsResult.ok();
    }

    /**
     * @Author 李泽宇
     * @Description //TODO 删除班级信息
     * @Date 2018/9/19 21:47
     * @Param
     * @return
     **/
    @Override
    public DdmsResult delClazz(String classid) {
        clazzMapper.deleteByPrimaryKey(classid);
        return DdmsResult.ok();
    }
/**
 * @Author 李泽宇
 * @Description //TODO 通过班级名称或专业id查询信息
 * @Date 2018/9/26 8:46 
 * @Param 
 * @return 
 **/
    @Override
    public PageResult queryClazzByNameOrmajorName(Clazz clazz,int page, int limit) {
        PageHelper.startPage(page, limit);
        List<Clazz> list = clazzMapper.selectByclazzNameOrmajorName(clazz);
        PageInfo<Clazz> info = new PageInfo<>(list);
        return PageResult.ok(list,info.getTotal());
    }

/**
 * @Author 李泽宇
 * @Description //TODO 查询所有班级信息（分页）
 * @Date 2018/9/26 8:49 
 * @Param 
 * @return 
 **/
    @Override
    public PageResult<Clazz> queryAllClazz(int rows, int limit) {
        ClazzExample example = new ClazzExample();
        //将分页的行和一页多少数据，传入
        PageHelper.startPage(rows, limit);
        List<Clazz> list = clazzMapper.selectByExample(example);
        PageInfo<Clazz> info = new PageInfo<>(list);
        return PageResult.ok(list,info.getTotal());
    }
/**
 * @Author 李泽宇
 * @Description //TODO 根据id查询班级信息
 * @Date 2018/9/26 8:55
 * @Param
 * @return
 **/
    @Override
    public List<Clazz> selectClazzAccrodingtoid(String id) {
        ClazzExample example = new ClazzExample();
        ClazzExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<Clazz> clazzes = clazzMapper.selectByExample(example);
        return clazzes;
    }
/**
 * @Author 李泽宇
 * @Description //TODO 无条件查询和班级有关的信息，不分页
 * @Date 2018/9/26 8:55
 * @Param
 * @return
 **/
    @Override
    public List<Clazz> selClazz() {
        List<Clazz> list = clazzMapper.selectAllClazz();
        return list;
    }
/**
 * @Author 李泽宇
 * @Description //TODO 查询所有专业
 * @Date 2018/9/26 10:41 
 * @Param 
 * @return 
 **/
    @Override
    public List<Major> selMajor() {
        MajorExample example = new MajorExample();
        List<Major> list = majorMapper.selectByExample(example);
        return list;
    }
/**
 * @Author 李泽宇
 * @Description //TODO 查询所有学院
 * @Date 2018/9/26 10:43
 * @Param 
 * @return 
 **/
    @Override
    public List<College> selCollege() {
        CollegeExample example = new CollegeExample();
        List<College> list = collegeMapper.selectByExample(example);
        return list;
    }
/**
 * @Author 李泽宇
 * @Description //TODO 查询所有和班级有关的信息
 * @Date 2018/9/26 18:03
 * @Param
 * @return
 **/
    @Override
    public PageResult<Clazz> selAllClazz(int rows, int limit) {
        PageHelper.startPage(rows, limit);
        List<Clazz> list = clazzMapper.selectAllClazz();
        PageInfo<Clazz> info = new PageInfo<>(list);
        return PageResult.ok(list,info.getTotal());
    }

    @Override
    public String selclazzmaxid() {
        synchronized(this) {
            String selclazzmaxid = clazzMapper.selclazzmaxid();
            return selclazzmaxid;
        }
    }
}
