package com.bigguy.springcloud.configclient.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author bigguy_hc
 * @create 2019-06-10 14:15
 */
@Component
public class UserApiKeyFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";       // 表示前置过滤器，在请求进入路由前都会经过这个过滤器
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;            // 是否执行过滤器
    }

    @Override
    public Object run() {

        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();

        String apikey = request.getParameter("apikey");

        if(StringUtils.isEmpty(apikey)){
            currentContext.setSendZuulResponse(false);  // 过滤该请，不进行路由
            currentContext.setResponseStatusCode(403);      // 设置响应状态码
            return "apikey error!";                     // 这里返回 字符串不知道有什么用，返回 null也可以
        }
        return null;                    // 这里返回 null 没事
    }
}
