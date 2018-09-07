package test.testrpc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import test.testrpc.rpc.TestRpc;

/**
 * @author:ms.y
 * @create 2018/9/6-15:37
 */
@RestController
@RequestMapping("/")
public class TestController {

    @Autowired
    TestRpc rpc;

    @RequestMapping("login.do")
    public String login(String id){
        return rpc.login(id);
    }

}
