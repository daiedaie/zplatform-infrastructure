/* 
 * MerchDAOImpl.java  
 * 
 * version TODO
 *
 * 2015年9月11日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.member.dao.impl;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.zlebank.zplatform.commons.dao.impl.HibernateBaseDAOImpl;
import com.zlebank.zplatform.member.bean.enums.MerchStatusType;
import com.zlebank.zplatform.member.dao.MerchDAO;
import com.zlebank.zplatform.member.pojo.PojoMerchDeta;

/**
 * Class Description
 *
 * @author yangpeng
 * @version
 * @date 2015年9月11日 上午10:13:08
 * @since 
 */
@Repository
public class MerchDAOImpl  extends HibernateBaseDAOImpl<PojoMerchDeta> implements MerchDAO{

    /**
     *
     * @param memberId
     * @return
     */
    @Override
    public PojoMerchDeta getParentMerch(String memberId) {
//     Criteria crite=this.getSession().createCriteria(PojoMerchDeta.class);
//    return  (PojoMerchDeta)crite .add(Restrictions.eq("dateMemberid", memberId)).uniqueResult();
    
    PojoMerchDeta pojoMerchDeta =(PojoMerchDeta) getSession().createCriteria(PojoMerchDeta.class)
            .add(Restrictions.eq("dateMemberid", memberId)).add(Restrictions.eq("status", MerchStatusType.NORMAL)).uniqueResult(); 
            if (pojoMerchDeta != null)
                getSession().evict(pojoMerchDeta);
            return pojoMerchDeta;
       
        
    }


    /**
     *
     * @param taxno
     * @return
     */
    @Override
    public PojoMerchDeta getMerchByTaxno(String taxno) {
        Criteria crite=this.getSession().createCriteria(PojoMerchDeta.class);
        crite .add(Restrictions.eq("taxno", taxno));
        crite .add(Restrictions.eq("status", MerchStatusType.NORMAL));
        @SuppressWarnings("unchecked")
        List<PojoMerchDeta> pojos = crite.list();
        return pojos.size() > 0 ? (PojoMerchDeta) pojos.get(0) : null;
    }

    /**
     *
     * @param licenceNo
     * @return
     */
    @Override
    public PojoMerchDeta getMerchByLicenceNo(String licenceNo) {
        Criteria crite=this.getSession().createCriteria(PojoMerchDeta.class);
        crite .add(Restrictions.eq("licenceno", licenceNo));
        crite .add(Restrictions.eq("status", MerchStatusType.NORMAL));
        @SuppressWarnings("unchecked")
        List<PojoMerchDeta> pojos = crite.list();
        return pojos.size() > 0 ? (PojoMerchDeta) pojos.get(0) : null;
    }


    /**
     *
     * @param email
     * @return
     */
    @Override
    public PojoMerchDeta getMerchByEmail(String email) {
        Criteria crite=this.getSession().createCriteria(PojoMerchDeta.class);
        crite .add(Restrictions.eq("email", email));
        crite .add(Restrictions.eq("status", MerchStatusType.NORMAL));
        @SuppressWarnings("unchecked")
        List<PojoMerchDeta> pojos = crite.list();
        return pojos.size() > 0 ? (PojoMerchDeta) pojos.get(0) : null;
    }


    /**
     *
     * @param phone
     * @return
     */
    @Override
    public PojoMerchDeta getMerchByPhone(String phone) {
        Criteria crite=this.getSession().createCriteria(PojoMerchDeta.class);
        PojoMerchDeta merch = (PojoMerchDeta) crite
                .add(Restrictions.eq("contphone", phone))
                .add(Restrictions.eq("status", MerchStatusType.NORMAL))
                .uniqueResult();
        return merch;
    }


    /**
     *
     * @param memberId
     * @return
     */
    @Override
    public PojoMerchDeta getMerchBymemberId(String memberId) {
        PojoMerchDeta pojoMerchDeta = (PojoMerchDeta) getSession()
                .createCriteria(PojoMerchDeta.class)
                .add(Restrictions.eq("dateMemberid", memberId))
                .add(Restrictions.eq("status", MerchStatusType.NORMAL))
                .uniqueResult();
        if (pojoMerchDeta != null)
            getSession().evict(pojoMerchDeta);
        return pojoMerchDeta;
    } 
}