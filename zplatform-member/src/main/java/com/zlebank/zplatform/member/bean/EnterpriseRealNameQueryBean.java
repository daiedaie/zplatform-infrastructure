/* 
 * EnterpriseRealNameQueryBean.java  
 * 
 * version TODO
 *
 * 2016年8月29日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.member.bean;

import com.zlebank.zplatform.commons.bean.Bean;

/**
 * 查询
 *
 * @author houyong
 * @version
 * @date 2016年8月29日 下午2:06:39
 * @since 
 */
public class EnterpriseRealNameQueryBean implements Bean {
       private String status;
       private String memberId;
       private String enterpriseName;
    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }
    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * @return the memberId
     */
    public String getMemberId() {
        return memberId;
    }
    /**
     * @param memberId the memberId to set
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    /**
     * @return the enterpriseName
     */
    public String getEnterpriseName() {
        return enterpriseName;
    }
    /**
     * @param enterpriseName the enterpriseName to set
     */
    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }
       
       
}
