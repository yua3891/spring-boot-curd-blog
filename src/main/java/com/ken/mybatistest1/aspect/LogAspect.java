package com.ken.mybatistest1.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Aspect
@Component
public class LogAspect {
    private final Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("execution(* com.ken.mybatistest1.controller.*.*(..))")
    public void dolog() {}

    @Before("dolog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        //接收请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        logger.info("==============before begin===============");
        logger.info("URL: " + request.getRequestURL());
        logger.info("HTTP_METHOD: " + request.getMethod());
        logger.info("IP: " + request.getRemoteAddr());
        logger.info("CLASS_METHOD: " + joinPoint.getSignature().getDeclaringTypeName()
            + "."
            + joinPoint.getSignature().getName());
        logger.info("ARGS: " + Arrays.toString(joinPoint.getArgs()));
        logger.info("==============before end=================");
    }

    @After("dolog()")
    public void doAfter(JoinPoint joinPoint) throws Throwable {
        logger.info("=============after begin============");
        logger.info("=============after end============");
    }
}
