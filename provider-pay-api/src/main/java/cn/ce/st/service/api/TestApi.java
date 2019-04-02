package cn.ce.st.service.api;

import cn.ce.st.service.entity.TestEntity;
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

    @GetMapping(value = "test")
    TestEntity test();
}
