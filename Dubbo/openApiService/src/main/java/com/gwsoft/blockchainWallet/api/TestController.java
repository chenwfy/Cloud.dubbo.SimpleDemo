package com.gwsoft.blockchainWallet.api;

import com.gwsoft.blockchainWallet.service.ChainCoinService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private ChainCoinService bitCoinProtocolService;

    @RequestMapping("/")
    public String hello(){
        return bitCoinProtocolService.createAccount("", "");
    }
}