package com.gwsoft.blockchainWallet.serviceApi.controller

import com.gwsoft.blockchainWallet.serviceApi.service.RemoteService
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired

@RestController
class RestController {
     @Autowired
     lateinit var remoteService: RemoteService

    @RequestMapping("/t/1")
    fun createAccount(): String {
        return remoteService.createAccount()
    }
}