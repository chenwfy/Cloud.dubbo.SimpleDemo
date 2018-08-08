package com.gwsoft.blockchainWallet

import org.springframework.boot.SpringApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@EnableEurekaServer
open class ServiceCenterApplication {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(ServiceCenterApplication::class.java, *args)
        }
    }
}