package cn.ce.st.pay.enums;

/**
 * @author hx
 * @date 2019/4/14 15:30
 */
public enum RefundStatus {
    /** 退款中 */
    Refund_ING(0, "退款中"),
    /** 退款成功 */
    Refund_SUCCESS(1,"退款成功"),
    /** 退款失败 */
    Refund_FAIL(2,"退款失败");
    private int key;

    private String value;

    RefundStatus(int key, String value) {
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
