package com.java4all.account.controller;

import com.java4all.account.service.AccountService;
import java.math.BigDecimal;

import com.java4all.account.service.AccountTcc;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author IT云清
 */
@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService accountServiceImpl;
    @Autowired
    private AccountTcc accountTccImpl;

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     * @return
     */
    @RequestMapping("decrease")
    public String decrease(@RequestParam("userId") Long userId,@RequestParam("money") BigDecimal money) throws InterruptedException {
        accountServiceImpl.decrease(userId,money);
        return "Account decrease success";
    }
    @GlobalTransactional
    @RequestMapping("add")
    public String add(@RequestParam("userId") Long userId,@RequestParam("money") BigDecimal money){
        accountTccImpl.prepareCreateOrder(null);
        return "Account decrease success";
    }
    @RequestMapping("findUser")
    public  String findUser(@RequestParam("userId") Long userId){
        return accountServiceImpl.findUser(userId);
    }
}
