package cn.ce.st.pay.dao;

import cn.ce.st.pay.entity.TTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TTest)表数据库访问层
 *
 * @author makejava
 * @since 2019-04-03 15:47:15
 */
@Mapper
public interface TTestDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TTest queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @return 对象列表
     */
    List<TTest> queryAll();


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tTest 实例对象
     * @return 对象列表
     */
    List<TTest> queryAllByTest(TTest tTest);

    /**
     * 新增数据
     *
     * @param tTest 实例对象
     * @return 影响行数
     */
    int insert(TTest tTest);

    /**
     * 修改数据
     *
     * @param tTest 实例对象
     * @return 影响行数
     */
    int update(TTest tTest);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}