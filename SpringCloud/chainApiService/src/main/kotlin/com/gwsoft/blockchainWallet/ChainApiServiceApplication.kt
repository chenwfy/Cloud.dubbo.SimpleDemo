package com.gwsoft.blockchainWallet

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.feign.EnableFeignClients

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
open class ChainApiServiceApplication {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(ChainApiServiceApplication::class.java, *args)
        }
    }
}