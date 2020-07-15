package com.lyj.keycloak.common.config;

import org.keycloak.adapters.springsecurity.config.KeycloakWebSecurityConfigurerAdapter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.s
/**
 * @author lyj
 * @Date 2019/5/29
 * @Time 18:37
 */
@ConditionalOnProperty(name = "keycloak.enabled", havingValue = "true", matchIfMissing = true)
@ComponentScan(basePackages = "com.lyj.keycloak.common.filter")
public class KeycloakAutoConfig extends KeycloakWebSecurityConfigurerAdapter {

    @Override
    protected  sessionAuthenticationStrategy() {
        return null;
    }
}
