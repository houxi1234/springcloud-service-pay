package cn.ce.st.pay.model.res;

import lombok.Data;

import java.util.Date;

/**
 * @author hx
 * @date 2019/4/14 16:44
 */
@Data
public class PayFlowRes {

    private Integer id;
    /** 删除标示 **/
    private Integer isDeleted;
    /** 付款人id **/
    private Long creatorId;
    /** 创建时间 **/
    private Date createTime;
    /** 更新时间 **/
    private Date updateTime;
    /** 删除时间 **/
    private Date deleteTime;
    /** 交易流水号 **/
    private String flowId;
    /** 单号 **/
    private String orderId;
    /** 单据类型（0支付，1退款） **/
    private Integer orderType;
    /** 支付状态（0支付中，1支付成功，2支付失败） **/
    private Integer payStatus;
    /** 退款状态：0退款中，1退款成功，2退款失败 **/
    private Integer refundStatus;
    /** 付款方式（0支付宝1微信） **/
    private Integer payType;
    /** 付款金额 **/
    private Object payAmount;
}
