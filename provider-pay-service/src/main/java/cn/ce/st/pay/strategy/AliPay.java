package cn.ce.st.pay.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 支付宝支付
 * @author hx
 * @date 2019/4/14 13:42
 */
@Slf4j
public class AliPay implements Pay {

    @Override
    public Boolean payAmount(double amount) {
        log.info("支付宝支付-----> {}", amount);
        return Boolean.TRUE;
    }
}
