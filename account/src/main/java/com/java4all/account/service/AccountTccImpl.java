package com.java4all.account.service;

import io.seata.rm.tcc.api.BusinessActionContext;
import io.seata.spring.annotation.GlobalTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service("accountTccImpl")
public class AccountTccImpl implements AccountTcc{
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountTccImpl.class);
    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean prepareCreateOrder(BusinessActionContext businessActionContext) {
        LOGGER.info("------->prepareCreateOrder中");
        return true;
    }
    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean commit(BusinessActionContext businessActionContext) {
        LOGGER.info("------->commit中");
        return true;
    }
    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean rollback(BusinessActionContext businessActionContext) {
        LOGGER.info("------->rollback中");
        return true;
    }
}
