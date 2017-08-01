package com.everwing.servicezuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class LxFilter extends ZuulFilter{

    private static Logger logger= LogManager.getLogger(LxFilter.class);

    @Override
    public String filterType() {
        return "pre";//pre;routing;post;error;filterOrder;shouldFilter;run
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
        RequestContext context=RequestContext.getCurrentContext();
        HttpServletRequest request=context.getRequest();
        logger.info("方法:{},请求url:{}",request.getMethod(),request.getRequestURL().toString());
        Object accessToken =request.getHeader("token");
        if(accessToken==null){
            logger.warn("token is empty!");
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            try{
                context.getResponse().getWriter().write("token is empty");
            }catch (Exception e){

            }
            return null;
        }
        logger.info("find token!");
        return null;
    }
}
