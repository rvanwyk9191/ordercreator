package com.reinhardt.restaurant.ordercreator.zookeeper;

import com.reinhardt.utility.config.ZookeeperConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ZooKeeperConfig {

    @Value("${zookeeper.hostname}")
    private String zookeeperHostname;

    @Bean("ZookeepConfiguration")
    public ZookeeperConfiguration zookeeperConfiguration() throws IOException, InterruptedException {
        return new ZookeeperConfiguration(zookeeperHostname);
    }

}
