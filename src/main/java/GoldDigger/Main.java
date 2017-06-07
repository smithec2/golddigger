package GoldDigger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * start program at localhost:8080
 * @author Donovan Poland on 5/26/2017.
 */


@EnableAutoConfiguration
@Configuration
@ComponentScan
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }//end main method
}//end MainClass class

