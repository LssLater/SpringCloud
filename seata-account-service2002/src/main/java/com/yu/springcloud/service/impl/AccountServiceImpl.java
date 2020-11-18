package com.yu.springcloud.service.impl;

import com.yu.springcloud.dao.AccountDao;
import com.yu.springcloud.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * 账户业务实现类
 *
 * @author Yang Hao
 * @date 2020-09-27 11:58
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        log.info("------------->account-service 中扣减库存开始");
        accountDao.decrease(userId, money);
        log.info("------------->account-service 中扣减库存结束");
    }
}
