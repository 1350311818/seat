package com.java4all.account.service;

import org.springframework.cache.annotation.CachePut;

import java.math.BigDecimal;

/**
 * @author IT云清
 */
public interface AccountService {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(Long userId, BigDecimal money) throws InterruptedException;
    String findUser(Long userId);
}
