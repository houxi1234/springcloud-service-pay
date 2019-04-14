package cn.ce.st.pay.controller;

import cn.ce.st.framework.base.ErrorResponseData;
import cn.ce.st.framework.base.ResponseData;
import cn.ce.st.framework.base.SuccessResponseData;
import cn.ce.st.pay.model.req.PayReq;
import cn.ce.st.pay.service.PayFlowService;
import cn.ce.st.pay.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 付款接口
 *
 * @author hx
 * @date 2019/4/14 13:34
 */
@RestController
@RequestMapping(value = "pay")
@Slf4j
public class PayController {

    @Autowired
    private PayFlowService payFlowService;

    @Autowired
    private PayService payService;

    /**
     * @param req
     * @return
     */
    @PostMapping(value = "pay")
    public ResponseData pay(@RequestBody PayReq req) {
        try {
            payService.pay(req);
        } catch (Exception e) {
            log.error(e.getMessage());
            return new ErrorResponseData("付款流水单生成失败");
        }
        return new SuccessResponseData();
    }

    /**
     * 支付成功回调（保留接口-暂不开发）
     * @param req
     * @return
     */
    @PostMapping(value = "callback")
    public ResponseData callback(PayReq req) {
        try {

        } catch (Exception e) {
            log.error(e.getMessage());
            return new ErrorResponseData("付款失败");
        }

        return new SuccessResponseData();
    }

}
