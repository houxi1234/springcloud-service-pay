package cn.ce.st.service.controller;

import cn.ce.st.service.entity.TestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Descrition TODO
 * @Author houxi
 * @Date 2019/4/2 15:54
 * Version 1.0
 **/
@RestController
public class TestController {

    @GetMapping(value = "test")
    public TestEntity test() {
        return new TestEntity("houxi", "123456");
    }
}
