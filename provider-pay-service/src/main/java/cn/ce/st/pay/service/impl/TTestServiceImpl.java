package cn.ce.st.pay.service.impl;

import cn.ce.st.pay.entity.TTest;
import cn.ce.st.pay.dao.TTestDao;
import cn.ce.st.pay.service.TTestService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TTest)表服务实现类
 *
 * @author makejava
 * @since 2019-04-03 15:47:15
 */
@Service("tTestService")
public class TTestServiceImpl implements TTestService {
    @Resource
    private TTestDao tTestDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TTest queryById(Integer id) {
        return this.tTestDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TTest> queryAll(int offset, int limit) {
        PageHelper.startPage(offset, limit);

        return this.tTestDao.queryAll();
    }

    /**
     * 新增数据
     *
     * @param tTest 实例对象
     * @return 实例对象
     */
    @Override
    public TTest insert(TTest tTest) {
        this.tTestDao.insert(tTest);
        return tTest;
    }

    /**
     * 修改数据
     *
     * @param tTest 实例对象
     * @return 实例对象
     */
    @Override
    public TTest update(TTest tTest) {
        this.tTestDao.update(tTest);
        return this.queryById(tTest.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tTestDao.deleteById(id) > 0;
    }
}