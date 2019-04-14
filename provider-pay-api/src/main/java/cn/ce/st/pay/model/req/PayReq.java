package cn.ce.st.pay.model.req;

import cn.ce.st.pay.enums.PayType;
import lombok.Data;

/**
 * 支付请求参数
 * @author hx
 * @date 2019/4/14 13:53
 */
@Data
public class PayReq {

    /** 付款人id */
    private Long creatorId;
    /** 交易流水号 */
    private String flowId;
    /** 单号 **/
    private String orderId;
    /** 付款方式（1支付宝2微信） */
    private Integer payType;
    /** 付款金额 */
    private Double payAmount;
}
