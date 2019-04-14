package cn.ce.st.pay.converter;

import cn.ce.st.pay.entity.PayFlowEntity;
import cn.ce.st.pay.enums.IsDeleted;
import cn.ce.st.pay.enums.OrderType;
import cn.ce.st.pay.enums.PayStatus;
import cn.ce.st.pay.enums.RefundStatus;
import cn.ce.st.pay.model.req.PayReq;
import cn.ce.st.pay.model.res.PayFlowRes;

import java.util.Date;

/**
 * @author hx
 * @date 2019/4/14 15:07
 */
public class PayConverter {

    /**
     * init date PayRep To PayFlowEntity
     * @param req
     * @return
     */
    public static PayFlowEntity initPayFlow(PayReq req) {

        Date nowTime = new Date();
        PayFlowEntity payFlow = new PayFlowEntity();
        payFlow.setIsDeleted(IsDeleted.DEFAULT.getType());
        payFlow.setCreateTime(nowTime);
        payFlow.setUpdateTime(nowTime);
        payFlow.setDeleteTime(null);
        payFlow.setFlowId(req.getFlowId());
        payFlow.setOrderId(req.getOrderId());
        payFlow.setOrderType(OrderType.PAY.getType());
        payFlow.setPayStatus(PayStatus.PAY_ING.getType());
        payFlow.setRefundStatus(null);
        payFlow.setCreatorId(req.getCreatorId());
        payFlow.setPayType(req.getPayType());
        payFlow.setPayAmount(req.getPayAmount());
        return payFlow;

    }

    /**
     * PayFlowEntity To PayFlowRes
     * @param payFlow
     * @return
     */
    public static PayFlowRes PayFlowToRes(PayFlowEntity payFlow){
        PayFlowRes res = new PayFlowRes();
        res.setIsDeleted(payFlow.getIsDeleted());
        res.setCreateTime(payFlow.getCreateTime());
        res.setUpdateTime(payFlow.getUpdateTime());
        res.setDeleteTime(payFlow.getDeleteTime());
        res.setFlowId(payFlow.getFlowId());
        res.setOrderId(payFlow.getOrderId());
        res.setOrderType(payFlow.getOrderType());
        res.setPayStatus(payFlow.getPayStatus());
        res.setRefundStatus(payFlow.getRefundStatus());
        res.setPayType(payFlow.getPayType());
        res.setId(payFlow.getId());
        res.setCreatorId(payFlow.getCreatorId());
        res.setPayAmount(payFlow.getPayAmount());
        return res;
    }
}
