package com.gwsoft.blockchainWallet

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
open class DogeCoinProviderApplication {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(DogeCoinProviderApplication::class.java, *args)
        }
    }
}