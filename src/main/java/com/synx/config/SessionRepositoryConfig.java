package com.synx.config;

//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.session.data.redis.config.ConfigureRedisAction;
//import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
//import org.springframework.session.web.http.SessionRepositoryFilter;
//import org.springframework.web.filter.DelegatingFilterProxy;
//
//import java.util.Collections;

//@Configuration
//@EnableRedisHttpSession
public class SessionRepositoryConfig {

//    @Bean
//    @Order(value = 0)
//    public FilterRegistrationBean sessionRepositoryFilterRegistration(SessionRepositoryFilter springSessionRepositoryFilter) {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new DelegatingFilterProxy(springSessionRepositoryFilter));
//        filterRegistrationBean.setUrlPatterns(Collections.singletonList("/*"));
//        return filterRegistrationBean;
//    }
//
//    @Bean
//    public static ConfigureRedisAction configureRedisAction() {
//        return ConfigureRedisAction.NO_OP;
//    }
}
