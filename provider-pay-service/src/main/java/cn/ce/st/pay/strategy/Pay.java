package cn.ce.st.pay.strategy;

/**
 * 付款接口
 * @author hx
 * @date 2019/4/14 13:37
 */
public interface Pay {

    /**
     * 付款
     * @param amount
     * @return
     */
    Boolean payAmount(double amount);
}
