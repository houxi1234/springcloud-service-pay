package cn.ce.st.pay.api;

import cn.ce.st.pay.entity.TestEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName TestApi
 * @Descrition TODO
 * @Author houxi
 * @Date 2019/4/2 15:57
 * Version 1.0
 **/
@FeignClient(value = "provider-pay-service")
public interface TestApi {

    /**
    * @Author houxi
    * @Description
    * @Date 11:35 2019/4/4
    * @Param []
    * return cn.ce.st.pay.entity.TestEntity
    **/
    @GetMapping(value = "test")
    TestEntity test();
}
