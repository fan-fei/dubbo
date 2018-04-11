package nordsoft.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import nordsoft.service.HelloService;

@RestController
public class HelloController {

    // @Reference(version = "1.0.0", application = "${dubbo.application.id}",
    // url = "dubbo://localhost:12345")
    @Reference(version = "1.0.0", application = "${dubbo.application.id}")
    private HelloService helloService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return helloService.sayHello(name);
    }

}
