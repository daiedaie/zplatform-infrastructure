/* 
 * TradeInfo.java  
 * 
 * version v1.0
 *
 * 2015年8月31日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.acc.bean;

import java.math.BigDecimal;

/**
 * 交易流水表
 *
 * @author Luxiaoshuai
 * @version
 * @date 2015年8月31日 下午3:35:06
 * @since 
 */
public class TradeInfo {
    /**交易流水号**/
    private String txnseqno;
    /**支付订单号**/
    private String payordno;
    /**交易类型**/
    private String busiCode;
    /**付款方会员ID**/
    private String payMemberId;
    /**收款方会员ID**/
    private String payToMemberId;
    /**收款方父级会员ID**/
    private String payToParentMemberId;
    /**渠道代码（CHNLCODE）**/
    private String channelId;
    /**产品id**/
    private String productId;
    /**交易金额**/
    private BigDecimal amount;
    /**佣金**/
    private BigDecimal commission;
    /**手续费**/
    private BigDecimal charge;
    /**金额D**/
    private BigDecimal amountD;
    /**金额E**/
    private BigDecimal amountE;
    /**分账FLG**/
    private boolean isSplit;

    public String getTxnseqno() {
        return txnseqno;
    }
    public void setTxnseqno(String txnseqno) {
        this.txnseqno = txnseqno;
    }
    public String getPayordno() {
        return payordno;
    }
    public void setPayordno(String payordno) {
        this.payordno = payordno;
    }
    public String getBusiCode() {
        return busiCode;
    }
    public void setBusiCode(String busiCode) {
        this.busiCode = busiCode;
    }
    public String getPayMemberId() {
        return payMemberId;
    }
    public void setPayMemberId(String payMemberId) {
        this.payMemberId = payMemberId;
    }
    public String getPayToMemberId() {
        return payToMemberId;
    }
    public void setPayToMemberId(String payToMemberId) {
        this.payToMemberId = payToMemberId;
    }
    public String getChannelId() {
        return channelId;
    }
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public BigDecimal getCommission() {
        return commission;
    }
    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }
    public BigDecimal getCharge() {
        return charge;
    }
    public void setCharge(BigDecimal charge) {
        this.charge = charge;
    }
    public String getPayToParentMemberId() {
        return payToParentMemberId;
    }
    public void setPayToParentMemberId(String payToParentMemberId) {
        this.payToParentMemberId = payToParentMemberId;
    }
    public BigDecimal getAmountD() {
        return amountD;
    }
    public void setAmountD(BigDecimal amountD) {
        this.amountD = amountD;
    }
    public BigDecimal getAmountE() {
        return amountE;
    }
    public void setAmountE(BigDecimal amountE) {
        this.amountE = amountE;
    }
    public boolean isSplit() {
        return isSplit;
    }
    public void setSplit(boolean isSplit) {
        this.isSplit = isSplit;
    }
    public TradeInfo(String txnseqno, String payordno, String busiCode,
            String payMemberId, String payToMemberId,
            String payToParentMemberId, String channelId, String productId,
            BigDecimal amount, BigDecimal commission, BigDecimal charge,
            BigDecimal amountD, BigDecimal amountE, boolean isSplit) {
        super();
        this.txnseqno = txnseqno;
        this.payordno = payordno;
        this.busiCode = busiCode;
        this.payMemberId = payMemberId;
        this.payToMemberId = payToMemberId;
        this.payToParentMemberId = payToParentMemberId;
        this.channelId = channelId;
        this.productId = productId;
        this.amount = amount;
        this.commission = commission;
        this.charge = charge;
        this.amountD = amountD;
        this.amountE = amountE;
        this.isSplit = isSplit;
    }
    public TradeInfo() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
}