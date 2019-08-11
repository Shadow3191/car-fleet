package pl.groupproject.carfleet;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.startup.Tomcat;

import org.apache.catalina.webresources.StandardRoot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.io.File;

@SpringBootApplication
@EnableWebMvc
public class CarFleetApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CarFleetApplication.class);
    }
    public static void main(String[] args) throws LifecycleException {
        SpringApplication.run(CarFleetApplication.class, args);

     /*   Tomcat tomcat = new Tomcat();
        Context context = tomcat.addWebapp("", new File("src/main/webapp/").getAbsolutePath());
        WebResourceRoot resources = new StandardRoot(context);
        context.setResources(resources);
        tomcat.start();
        tomcat.getServer().await();*/
    }

}