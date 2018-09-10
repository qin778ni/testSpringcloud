package test.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:ms.y
 * @create 2018/9/10-11:24
 */
@RestController
public class TestClientController {

    @Value("${foo}")
    String foo;

    @RequestMapping("config")
    public String getConfig(){
        return foo;
    }
}
