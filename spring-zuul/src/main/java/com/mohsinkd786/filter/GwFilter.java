package com.mohsinkd786.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import javax.servlet.http.HttpServletRequest;

public class GwFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
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
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();

        context.addZuulRequestHeader("token","12345");
        context.getResponse().setHeader("token","8888888");
        HttpServletRequest request = context.getRequest();
        System.out.println(request.getMethod() +" / "+request.getRequestURL());

        return null;
    }
}
