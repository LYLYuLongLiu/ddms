package cn.wisdsoft.ddms.service.clazzservice;

import cn.wisdsoft.ddms.pojo.Clazz;
import cn.wisdsoft.ddms.pojo.College;
import cn.wisdsoft.ddms.pojo.Major;
import cn.wisdsoft.pojo.DdmsResult;
import cn.wisdsoft.pojo.PageResult;

import java.util.List;

/**
 * @ClassName ClazzService
 * @Description TODO
 * @Author LIZEYU
 * @Date 2018/9/19 16:59
 * @Version 1.0
 **/
public interface ClazzService {
    /**
     * @Author 李泽宇
     * @Description //TODO 添加班级信息
     * @Date 2018/9/19 21:41
     * @Param
     * @return
     **/
    DdmsResult addClazz(Clazz clazz);
    /**
     * @Author 李泽宇
     * @Description //TODO 更改班级信息
     * @Date 2018/9/19 21:41
     * @Param
     * @return
     **/
    DdmsResult updateClazz(Clazz clazz);

    /**
     * @Author 李泽宇
     * @Description //TODO 删除班级信息
     * @Date 2018/9/19 21:42
     * @Param
     * @return
     **/
    DdmsResult delClazz(String id);
    
    /**
     * @Author 李泽宇
     * @Description //TODO 根据班级名称和专业名称模糊查询信息
     * @Date 2018/9/19 22:17 
     * @Param 
     * @return 
     **/
     PageResult queryClazzByNameOrmajorName(Clazz clazz, int page, int limit);

     /**
      * @Author 李泽宇
      * @Description //TODO 查询所有班级信息(分页)
      * @Date 2018/9/26 8:32
      * @Param
      * @return
      **/
     PageResult<Clazz> queryAllClazz(int rows, int limit);

     /**
      * @Author 李泽宇
      * @Description //TODO 通过id查询班级信息
      * @Date 2018/9/26 8:33
      * @Param
      * @return
      **/
     List<Clazz> selectClazzAccrodingtoid(String id);
     
     /**
      * @Author 李泽宇
      * @Description //TODO 查询所有和班级有关的信息(无条件)
      * @Date 2018/9/26 8:37 
      * @Param
      * @return 
      **/
     List<Clazz> selClazz();
     
     /**
      * @Author 李泽宇
      * @Description //TODO 查询所有专业
      * @Date 2018/9/26 10:25 
      * @Param 
      * @return 
      **/
     List<Major> selMajor();
     
     /**
      * @Author 李泽宇
      * @Description //TODO 查询所有学院
      * @Date 2018/9/26 10:26 
      * @Param 
      * @return
      **/
     List<College> selCollege();


     /**
      * @Author 李泽宇
      * @Description //TODO 查询所有和班级有关的信息
      * @Date 2018/9/26 18:01
      * @Param
      * @return
      **/
     PageResult<Clazz> selAllClazz(int rows, int limit);

     /**
      * @Author 李泽宇
      * @Description //TODO 查询最大id
      * @Date 2018/9/27 20:03
      * @Param
      * @return
      **/
     String selclazzmaxid();
}
