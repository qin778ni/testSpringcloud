package test.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:ms.y
 * @create 2018/9/10-16:23
 */
@RestController
public class TestController {

    @Value("${foo}")
    private String foo;

    @RequestMapping("config")
    public String config(){
        return foo;
    }
}
