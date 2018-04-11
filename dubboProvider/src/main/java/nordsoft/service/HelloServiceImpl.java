package nordsoft.service;

import org.springframework.beans.factory.annotation.Value;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0", application = "${dubbo.application.id}", protocol = "${dubbo.protocol.id}", registry = "${dubbo.registry.id}")
public class HelloServiceImpl implements HelloService {

    @Value("${server.port}")
    private String serverPort;

    @Value("${management.port}")
    private String managementPort;

    @Value("${dubbo.protocol.port}")
    private String dubboProtocolPort;

    public String sayHello(String name) {

        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ");
        sb.append(name);
        sb.append(", serverPort: ");
        sb.append(serverPort);
        sb.append(", managementPort: ");
        sb.append(managementPort);
        sb.append(", dubboProtocolPort: ");
        sb.append(dubboProtocolPort);

        return sb.toString();
    }

}