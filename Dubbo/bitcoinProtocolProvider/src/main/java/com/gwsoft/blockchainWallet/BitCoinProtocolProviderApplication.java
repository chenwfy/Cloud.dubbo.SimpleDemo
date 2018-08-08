package com.gwsoft.blockchainWallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableAutoConfiguration
@ImportResource({ "classpath:dubbo-config.xml" })
public class BitCoinProtocolProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(BitCoinProtocolProviderApplication.class);
    }
}
