package com.netflix.ribbon.service;

import com.netflix.ribbon.security.*;
import com.netflix.ribbon.config.*;

public class CircuitBreaker {
    DockerSecurity dockerSecurity;
    IpSecurity ipSecurity;
    WebAppConfig webAppConfig;
    WebRootConfig webRootConfig;
    WebSecurityConfig webSecurityConfig;
}
