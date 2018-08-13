package com.kuangclub.interceptor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class HttpLogAspect {
    private final Logger logger = LoggerFactory.getLogger(HttpLogAspect.class);

    @Pointcut("execution(public * com.kuangclub.controller..*.*(..))")
    public void log(){}

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        logger.info("doBefore");
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        //记录请求路径url
        logger.info("url={}",request.getRequestURL());

        //记录请求方式method
        logger.info("method={}",request.getMethod());

        //记录访问者ip
        logger.info("ip={}",request.getRemoteAddr());

        //记录访问的类方法
        logger.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());

        //记录传递的参数
        logger.info("args={}",joinPoint.getArgs());
    }

    @After("log()")
    public void doAfter() {
        logger.info("doAfter");
    }

    @AfterReturning(returning = "obj",pointcut = "log()")
    public void doAfterReturning(Object obj) {
        logger.info("doAfterReturning");
        logger.info("response={}", obj);
    }
}
