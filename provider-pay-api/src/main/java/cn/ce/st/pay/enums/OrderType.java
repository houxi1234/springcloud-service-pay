package cn.ce.st.pay.enums;

/**
 * 单据类型
 * @author hx
 * @date 2019/4/14 15:16
 */
public enum OrderType {

    /** 支付 */
    PAY(0, "支付"),

    /** 退款 */
    REFUND(1,"退款");

    private int key;

    private String value;

    OrderType(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getType() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
