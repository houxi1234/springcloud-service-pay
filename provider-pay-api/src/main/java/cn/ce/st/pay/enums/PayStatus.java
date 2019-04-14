package cn.ce.st.pay.enums;

/**
 * 支付状态
 * @author hx
 * @date 2019/4/14 15:24
 */
public enum PayStatus {

    /** 支付中 */
    PAY_ING(0, "支付中"),
    /** 支付成功 */
    PAY_SUCCESS(1,"支付成功"),
    /** 支付失败 */
    PAY_FAIL(2,"支付失败");
    private int key;

    private String value;

    PayStatus(int key, String value) {
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
