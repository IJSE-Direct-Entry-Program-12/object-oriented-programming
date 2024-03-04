package com.netflix.zuul.api;

import com.netflix.ribbon.service.CircuitBreaker;
import com.netflix.zuul.gateway_util.*;
import com.netflix.eureka.network.DiscoveryServer;

public class ApiGateway {
    Utility1 utility1;
    Utility2 utility2;
    Utility3 utility3;
    DiscoveryServer discoveryServer;
    CircuitBreaker circuitBreaker;
}
