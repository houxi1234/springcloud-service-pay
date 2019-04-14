package cn.ce.st.pay.enums;

/**
 * @author hx
 * @date 2019/4/14 15:11
 */
public enum IsDeleted {

    /** 默认值 */
    DEFAULT(0, "默认值"),

    /** 删除标示 */
    IS_DELETED(1, "删除标示");

    private int key;

    private String value;

    IsDeleted(int key, String value) {
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
