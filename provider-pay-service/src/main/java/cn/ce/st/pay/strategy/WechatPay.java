package cn.ce.st.pay.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 微信支付
 * @author hx
 * @date 2019/4/14 13:42
 */
@Slf4j
public class WechatPay implements Pay {

    @Override
    public Boolean payAmount(double amount) {
        log.info("微信支付-----> {}", amount);
        return Boolean.TRUE;
    }
}
