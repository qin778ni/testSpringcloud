package test.zuul.service;

import org.springframework.stereotype.Service;

/**
 * @author:ms.y
 * @create 2018/9/10-9:18
 */
@Service
public class ZuulService {

    public boolean checkAothority(String str){
        boolean tag=true;
        if("1".equals(str)){
            tag=false;
        }
        return tag;
    }
}
