package com.yb.user.aspect;

import com.yb.base.component.BaseController;
import com.yb.user.entity.YbUserLoginLogMapper;
import com.yb.user.model.YbUserLoginLog;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by 80657 on 2017/11/9.
 */
@Aspect
@Component
public class LogAspect extends BaseController{

    private  final  static Logger logger= org.slf4j.LoggerFactory.getLogger(LogAspect.class);
    @Pointcut("execution(public * com.yb.user.api.UserController.Login(..))")
    public void log(){}

    @Autowired
    YbUserLoginLogMapper userLoginLogMapper;

    @After("log()")
    public void Afterlog(){
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        HttpSession session = request.getSession();
        Integer uid = (Integer) session.getAttribute("uid");
        String requestURI = request.getRequestURI();
        String ip = request.getRemoteAddr();
        YbUserLoginLog ybUserLoginLog = new YbUserLoginLog();
        ybUserLoginLog.setLoginIp(ip);
        ybUserLoginLog.setUid(uid);
        ybUserLoginLog.setLoginTime(new Date());
        ybUserLoginLog.setBroswer(requestURI);
        logger.info("ip:"+ip+"requestURI:"+requestURI+"uid:"+uid);
        userLoginLogMapper.insert(ybUserLoginLog);

    }
    @Before("log()")
    public void before(){
        System.out.println("我开始记录了");
    }

}
