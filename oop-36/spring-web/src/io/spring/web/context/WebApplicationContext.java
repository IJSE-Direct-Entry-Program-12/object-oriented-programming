package io.spring.web.context;

import io.spring.core.context.ApplicationContext;
import io.spring.web.config.EnableWeb;
import io.spring.web.config.WebAppConfig;

public class WebApplicationContext {
    ApplicationContext context = new ApplicationContext();
    EnableWeb enableWeb = new EnableWeb();
    WebAppConfig appConfig = new WebAppConfig();
}
