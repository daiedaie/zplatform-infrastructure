/* 
 * BusiAcctService.java  
 * 
 * version 1.0
 *
 * 2015年8月31日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.acc.service;

import com.zlebank.zplatform.acc.bean.BusiAcct;
import com.zlebank.zplatform.acc.bean.enums.Usage;
import com.zlebank.zplatform.acc.exception.AbstractBusiAcctException;
import com.zlebank.zplatform.member.bean.Member;

/**
 * Class Description
 *
 * @author yangying
 * @version
 * @date 2015年8月31日 下午1:53:54
 * @since
 */
public interface BusiAcctService {
    /**
     * 开通业务账户
     * @param member
     * @param busiAcct
     * @param userId
     * @return
     * @throws AbstractBusiAcctException
     *             if the business account generated by given param is exist
     */
    String openBusiAcct(Member member, BusiAcct busiAcct, long userId)
            throws AbstractBusiAcctException;
    /**
     * 通过业务的账户号得到
     * @param acctCode
     * @return
     * @throws AbstractBusiAcctException
     *             if not exist
     */
    BusiAcct getByBusiAcctCode(String BusiAcctCode)
            throws AbstractBusiAcctException;
    /**
     * 通过 会员ID 标示得到科目代码
     * @param usage
     * @param memberId
     * @return account code
     * @throws AbstractBusiAcctException
     *             If business account is not exist 
     */
    String getAccount(Usage usage, String memberId)
            throws AbstractBusiAcctException;
    /**
     * 通过 会员ID 标示得到科目代码的ID
     * @param usage
     * @param memberId
     * @return account code
     * @throws AbstractBusiAcctException
     *             If business account is not exist 
     */
    long getAccountId(Usage usage, String memberId)
            throws AbstractBusiAcctException;
}