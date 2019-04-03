package cn.ce.st.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderPayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderPayServiceApplication.class, args);
    }

}
