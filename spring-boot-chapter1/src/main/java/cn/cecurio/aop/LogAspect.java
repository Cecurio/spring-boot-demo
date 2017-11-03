package cn.cecurio.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author: Cecurio
 * @create: 2017-10-16 13:49
 * @desc:
 **/
@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(cn.cecurio.aop.Action)")
    public void annotationPointCut() {}

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature =
            (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截：" + action.name());
    }

    @Before("execution(* cn.cecurio.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature =
            (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法拦截规则拦截，" + method.getName());
    }
}
