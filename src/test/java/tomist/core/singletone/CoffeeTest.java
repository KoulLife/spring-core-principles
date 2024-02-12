package tomist.core.singletone;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeTest {

    @Test
    void test(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(CoffeConfig.class);
        Coffee coffee1 = ac.getBean(Coffee.class);
        Coffee coffee2 = ac.getBean(Coffee.class);

        coffee1.register("americano", 4500);
        coffee2.register("chocolate", 6100);

        System.out.println("coffee1's name is " + coffee1.getName());
        System.out.println("coffee1's price is " + coffee1.getPrice());
    }

    static class CoffeConfig{
        @Bean
        public Coffee coffee(){
            return new Coffee();
        }
    }
}