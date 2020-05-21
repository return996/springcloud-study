package com.wang.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KuangRule {

    @Bean
    public IRule myRule() {
        return new KuangRandomRule(); // 默认是轮询, 现在我们自定义为KuangRandomRule
    }

}
