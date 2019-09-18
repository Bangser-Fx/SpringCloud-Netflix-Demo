package com.fx.springcloudzuul.filter;

import com.fx.springcloudzuul.ZuulApplication;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: SpringCloudNetflixTest->ZuulFilter
 * @description: 网关过滤器
 * @author: Bangser
 * @create: 2019-09-18 11:11
 **/
@Component
public class CloudZuulFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        Object token = request.getAttribute("token");
        if (token == null ) {
            //不在转发
            currentContext.setSendZuulResponse(false);
            //设置response返回
            try {
                HttpServletResponse response = currentContext.getResponse();
                response.setStatus(401);
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("未登录");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
