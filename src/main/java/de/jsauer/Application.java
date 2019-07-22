package de.jsauer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Application class. Additional annotations enable more features of spring.
 *
 * Use @EnableScheduling if you want to use {@link org.springframework.scheduling.annotation.Scheduled} in another class
 *
 * @author Julian Sauer
 * @since 1.0
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
