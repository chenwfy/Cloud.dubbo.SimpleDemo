package com.gwsoft.blockchainWallet.serviceApi.service

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping

@FeignClient(name = "blockchainWallet-dogeCoinProvider")
interface RemoteService {
    @RequestMapping(value = "/test")
    fun createAccount(): String
}