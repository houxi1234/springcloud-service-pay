package cn.ce.st.pay.service;

import cn.ce.st.pay.model.req.PayReq;

/**
 * @author hx
 * @date 2019/4/14 14:55
 */
public interface PayService {

    /**
     * 付款
     * @param req
     */
    void pay(PayReq req);
}
