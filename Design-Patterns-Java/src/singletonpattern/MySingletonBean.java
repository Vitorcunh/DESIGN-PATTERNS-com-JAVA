package singletonpattern;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MySingletonBean mySingletonBean() {
        return new MySingletonBean();
    }
}

// MySingletonBean.java
public class MySingletonBean {
    // implementação
}

// Uso do Singleton no Spring
ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
MySingletonBean bean1 = context.getBean(MySingletonBean.class);
MySingletonBean bean2 = context.getBean(MySingletonBean.class);

System.out.println(bean1 == bean2); // Output: true
