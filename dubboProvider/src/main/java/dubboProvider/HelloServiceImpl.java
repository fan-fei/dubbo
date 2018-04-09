package dubboProvider;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0", application = "${dubbo.application.id}", protocol = "${dubbo.protocol.id}", registry = "${dubbo.registry.id}")
public class HelloServiceImpl implements HelloService {

    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }

}