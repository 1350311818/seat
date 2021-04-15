package com.java4all.order.feign;

import java.math.BigDecimal;

import io.seata.rm.tcc.api.BusinessActionContext;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author IT云清
 */
@FeignClient(value = "account-server")
public interface AccountApi {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     * @return
     */
    @RequestMapping("/account/decrease")
    String decrease(@RequestParam("userId") Long userId,@RequestParam("money") BigDecimal money) throws InterruptedException;
    @RequestMapping("/account/add")
    String add(@RequestParam("userId") Long userId,@RequestParam("money") BigDecimal money);
}
