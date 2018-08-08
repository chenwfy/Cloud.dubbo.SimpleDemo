package com.gwsoft.blockchainWallet.dogeCoinApi.controller

import com.gwsoft.blockchainWallet.chainProvider.impl.ChainProvider
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
class DogeCoinController : ChainProvider {
    @RequestMapping("/test")
    override fun createAccount(): String {
        return "狗币创建账号成功！"
    }
}