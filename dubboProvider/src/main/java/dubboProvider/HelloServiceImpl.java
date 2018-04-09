package dubboProvider;

import com.alibaba.dubbo.config.annotation.Service;

@Service(interfaceClass = HelloService.class)
public class HelloServiceImpl implements HelloService {

    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }

}