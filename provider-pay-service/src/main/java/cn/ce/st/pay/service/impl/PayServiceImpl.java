package cn.ce.st.pay.service.impl;

import cn.ce.st.pay.converter.PayConverter;
import cn.ce.st.pay.model.req.PayReq;
import cn.ce.st.pay.service.PayFlowService;
import cn.ce.st.pay.service.PayService;
import cn.ce.st.pay.strategy.Pay;
import cn.ce.st.pay.strategy.PayTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hx
 * @date 2019/4/14 14:56
 */
@Service
public class PayServiceImpl implements PayService {


    @Autowired
    private PayFlowService payFlowService;

    @Override
    public void pay(PayReq req) {

        //TODO 入付款流水表
        int rows = payFlowService.insert(PayConverter.initPayFlow(req));
        if (rows == 1) {
            //TODO 付款
            Pay pay = PayTypeEnum.getPay(req.getPayType());
            pay.payAmount(req.getPayAmount());
        }
    }
}
