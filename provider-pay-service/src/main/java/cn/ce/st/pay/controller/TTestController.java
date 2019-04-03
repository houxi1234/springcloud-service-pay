package cn.ce.st.pay.controller;

import cn.ce.st.pay.entity.TTest;
import cn.ce.st.pay.service.TTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TTest)表控制层
 *
 * @author makejava
 * @since 2019-04-03 15:47:15
 */
@RestController
@RequestMapping("tTest")
public class TTestController {
    /**
     * 服务对象
     */
    @Autowired
    private TTestService tTestService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TTest selectOne(Integer id) {
        return this.tTestService.queryById(id);
    }

    @GetMapping("findAll")
    public List<TTest> findAll(int offset, int limit){
        return this.tTestService.queryAll(offset, limit);
    }

}