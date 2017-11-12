package com.yb.user.filter;

import com.yb.base.util.ResultUtil;
import com.yb.user.exception.TokenException;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.LogRecord;

/**
 * Created by 80657 on 2017/11/9.
 */
@SuppressWarnings("restriction")
//拦截器
public class TokenFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request= (HttpServletRequest) servletRequest;
        HttpServletResponse response= (HttpServletResponse) servletResponse;
        String token= request.getHeader("token");
        if (token==null){
            String result=  ResultUtil.getJsonResult(false,"Token is null");
            response.setContentType("application/json; charset=utf-8");
            response.getWriter().print(result);
            return;
        }
        filterChain.doFilter(servletRequest,servletResponse);



    }

    @Override
    public void destroy() {

    }
}
