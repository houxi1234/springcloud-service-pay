package cn.ce.st.pay.dao;

import cn.ce.st.framework.base.Pagination;
import cn.ce.st.pay.entity.PayFlowEntity;
import cn.ce.st.pay.model.req.PayFlowReq;
import cn.ce.st.pay.model.res.PayFlowRes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (PayFlowDao)表数据库访问层
 *
 * @author houxi
 * @since 2019-04-14 13:20:34
 */
@Mapper
public interface PayFlowDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PayFlowEntity queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PayFlowEntity> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param req 实例对象
     * @return 对象列表
     */
    List<PayFlowEntity> queryAll(PayFlowReq req);

    /**
     * 新增数据
     *
     * @param payFlowEntity 实例对象
     * @return 影响行数
     */
    int insert(PayFlowEntity payFlowEntity);

    /**
     * 修改数据
     *
     * @param payFlowEntity 实例对象
     * @return 影响行数
     */
    int update(PayFlowEntity payFlowEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    int count(PayFlowReq req);
}