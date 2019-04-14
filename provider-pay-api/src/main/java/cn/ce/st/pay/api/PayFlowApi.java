package cn.ce.st.pay.api;

import cn.ce.st.pay.model.req.PayFlowReq;
import org.bouncycastle.asn1.ocsp.ResponseData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author hx
 * @date 2019/4/14 18:25
 */
@FeignClient(value = "provider-pay-service",path = "payFlow")
public interface PayFlowApi {

    /**
     * 付款流水单列表查询
     * @param payFlowReq
     * @return
     */
    @PostMapping("findAll")
    ResponseData findAll(@RequestBody PayFlowReq payFlowReq);
}
