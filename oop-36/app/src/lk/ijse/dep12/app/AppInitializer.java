package lk.ijse.dep12.app;

import io.spring.core.context.ApplicationContext;
import io.spring.core.context.BeanFactory;
import io.spring.web.context.WebApplicationContext;
import io.spring.webmvc.api.HttpController;
import io.spring.webmvc.advice.ControllerAdvice;

public class AppInitializer {
    public static void main(String[] args) {
        new HttpController();
        new ControllerAdvice();
        new BeanFactory();
        new ApplicationContext();
        new WebApplicationContext();
    }
}
