package cn.ce.st.pay.api;


import cn.ce.st.pay.model.req.PayReq;
import org.bouncycastle.asn1.ocsp.ResponseData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author hx
 * @date 2019/4/14 18:23
 */

@FeignClient(value = "provider-pay-service")
public interface PayApi {

    /**
     * 付款
     * @param req
     * @return
     */
    @PostMapping(value = "payAmount")
    ResponseData pay(@RequestBody PayReq req);
}
