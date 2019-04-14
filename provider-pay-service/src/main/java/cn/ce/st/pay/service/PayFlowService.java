package cn.ce.st.pay.service;

import cn.ce.st.framework.base.Pagination;
import cn.ce.st.pay.entity.PayFlowEntity;
import cn.ce.st.pay.model.req.PayFlowReq;
import cn.ce.st.pay.model.res.PayFlowRes;

import java.util.List;

/**
 * (PayFlow)表服务接口
 *
 * @author houxi
 * @since 2019-04-14 13:20:34
 */
public interface PayFlowService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PayFlowEntity queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PayFlowEntity> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param payFlowEntity 实例对象
     * @return 实例对象
     */
    int insert(PayFlowEntity payFlowEntity);

    /**
     * 修改数据
     *
     * @param payFlowEntity 实例对象
     * @return 实例对象
     */
    int update(PayFlowEntity payFlowEntity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    Pagination<PayFlowRes> findAll(PayFlowReq req);
}