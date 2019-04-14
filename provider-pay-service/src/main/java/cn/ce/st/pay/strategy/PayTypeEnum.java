package cn.ce.st.pay.strategy;

/**
 * @author hx
 * @date 2019/4/14 13:46
 */
public enum PayTypeEnum {

    /** 支付宝支付 */
    ALI_PAY(1,new AliPay()),

    /** 微信支付 */
    WECHAT_PAY(2,new WechatPay());

    private int index;
    private Pay pay;
    PayTypeEnum(int index, Pay pay) {
        this.index = index;
        this.pay = pay;
    }

    public static Pay getPay(int index) {
        for (PayTypeEnum typeEnum : PayTypeEnum.values()) {
            if (typeEnum.index == index) {
                return typeEnum.pay;
            }
        }
        throw new RuntimeException("请选择正确的支付方式！");
    }
}
