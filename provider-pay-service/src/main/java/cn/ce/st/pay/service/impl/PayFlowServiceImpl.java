package cn.ce.st.pay.service.impl;

import cn.ce.st.framework.base.Pagination;
import cn.ce.st.pay.converter.PayConverter;
import cn.ce.st.pay.entity.PayFlowEntity;
import cn.ce.st.pay.dao.PayFlowDao;
import cn.ce.st.pay.model.req.PayFlowReq;
import cn.ce.st.pay.model.res.PayFlowRes;
import cn.ce.st.pay.service.PayFlowService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * (PayFlow)表服务实现类
 *
 * @author houxi
 * @since 2019-04-14 13:25:27
 */
@Service("payFlowService")
@Slf4j
public class PayFlowServiceImpl implements PayFlowService {

    @Autowired
    private PayFlowDao payFlowDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PayFlowEntity queryById(Integer id) {
        return this.payFlowDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PayFlowEntity> queryAllByLimit(int offset, int limit) {
        return this.payFlowDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param payFlowEntity 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(PayFlowEntity payFlowEntity) {
        return this.payFlowDao.insert(payFlowEntity);
    }

    /**
     * 修改数据
     *
     * @param payFlowEntity 实例对象
     * @return 实例对象
     */
    @Override
    public int update(PayFlowEntity payFlowEntity) {
        return this.payFlowDao.update(payFlowEntity);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.payFlowDao.deleteById(id) > 0;
    }

    @Override
    public Pagination<PayFlowRes> findAll(PayFlowReq req) {
        int offset = req.getOffset();
        Integer limit = req.getLimit();
        PageHelper.startPage(offset, limit);
        List<PayFlowEntity> payFlows = this.payFlowDao.queryAll(req);
        List<PayFlowRes> payFlowRes = new ArrayList<>(payFlows.size());
        payFlows.forEach((payFlow) ->{
            payFlowRes.add(PayConverter.PayFlowToRes(payFlow));
        });
        Pagination<PayFlowRes> pageInfo = new Pagination<>();
        pageInfo.setList(payFlowRes);

        int total = this.payFlowDao.count(req);
        pageInfo.setTotalCount(total);
        pageInfo.setCurrentPage(offset);
        pageInfo.setPageSize(limit);
        log.info("pageinfo -->{} total -->{}", total, pageInfo);
        return pageInfo;
    }
}