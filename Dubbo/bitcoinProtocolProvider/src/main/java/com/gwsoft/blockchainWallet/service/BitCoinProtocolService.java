package com.gwsoft.blockchainWallet.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service(interfaceClass = ChainCoinService.class)
public class BitCoinProtocolService implements ChainCoinService {
    @Override
    public String createAccount(String accountName, String accountPassword) {
        return "比特币协议系列注册成功！";
    }
}
