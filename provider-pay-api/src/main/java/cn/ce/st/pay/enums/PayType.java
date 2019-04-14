package cn.ce.st.pay.enums;

import lombok.Data;

/**
 * @author hx
 * @date 2019/4/14 13:59
 */
public enum  PayType {

    /** 支付宝支付 */
    ALI_PAY(1, "支付宝支付"),

    /** 微信支付 */
    WECHAT_PAY(2, "微信支付");

    private int type;

    private String value;

    PayType(int type, String value) {
        this.type = type;
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

}
