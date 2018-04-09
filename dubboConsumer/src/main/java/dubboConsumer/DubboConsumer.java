package dubboConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

@SpringBootApplication
@EnableDubboConfiguration
public class DubboConsumer {

    public static void main(String[] args) {

        SpringApplication.run(DubboConsumer.class, args);

    }
}
