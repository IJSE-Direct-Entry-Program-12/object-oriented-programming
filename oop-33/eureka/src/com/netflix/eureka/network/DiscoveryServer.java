package com.netflix.eureka.network;

import com.netflix.eureka.client.DiscoveryClient;
import com.netflix.eureka.security.*;

import com.netflix.ribbon.docker.*;

public class DiscoveryServer {
    DiscoveryClient discoveryClient;
    SecurityConfig securityConfig;
    FilterChain filterChain;
    DockerInitializer dockerInitializer;
    DockerConnect dockerConnect;
}
