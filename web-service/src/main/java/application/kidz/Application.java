package application.kidz;

import application.kidz.servlet.Layout;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import platform.manager.GlobalDataManager;
import platform.webservice.manager.BoltViewManager;


@SpringBootApplication()
@ComponentScan(basePackages = {"controller","platform.webservice.map","platform.webservice.controller.base"})
public class Application  {
    static public void populate_default_database() {
        Thread  thread = new Thread(new Runnable() {
            @Override
            public void run() {
            }
        });
        thread.start();
    }

    public static void registerService() {


    }

    public static void registerHelpers() {

    }

    public static void registerdecorators() {

    }

    public static void main(String[] args) {
        GlobalDataManager.getInstance().setProduct("bolt");
        BoltViewManager.getInstance().setLayout(new Layout());
        registerHelpers();
        registerdecorators();
        registerService();
        populate_default_database();
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        System.out.println("Let's inspect the beans provided by Spring Boot:");
    }

}

