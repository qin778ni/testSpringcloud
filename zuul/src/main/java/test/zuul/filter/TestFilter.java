package test.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import test.zuul.service.ZuulService;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author:ms.y
 * @create 2018/9/10-9:11
 */
@Component
public class TestFilter extends ZuulFilter{

    @Autowired
    private ZuulService service;
    //过滤类型  四种 pre：路由之前 routing：路由之时 post： 路由之后 error：发送错误调用
    @Override
    public String filterType() {
        return "pre";
    }

    //过滤顺序
    @Override
    public int filterOrder() {
        return 0;
    }

    //用来判断是否要过滤
    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String id = request.getParameter("id");
        return service.checkAothority(id);
    }

    //过滤的具体逻辑
    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        try {
            ctx.getResponse().getWriter().write("without authority");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
