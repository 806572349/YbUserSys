package com.yb.user.aspect;

import com.yb.base.component.BaseController;
import com.yb.user.exception.TokenException;
import com.yb.user.model.YbUser;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 80657 on 2017/11/9.

 */
@Component
@Aspect
public class CheckTokenlegal extends BaseController
{

    private  final  static Logger logger= org.slf4j.LoggerFactory.getLogger(LogAspect.class);
    @Pointcut("execution(public * com.yb.user.api.*.*(..))&& !execution(public * com.yb.user.api.UserController.Login(..))")
    public void Check(){}

    @Before("Check()")
    public void CheckLeagl(){
        ServletRequestAttributes requestAttributes= (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request= requestAttributes.getRequest();
        YbUser ybUser=getUser(request);
        if (ybUser==null)
        throw  new TokenException("token 用户信息错误");
    }

}
