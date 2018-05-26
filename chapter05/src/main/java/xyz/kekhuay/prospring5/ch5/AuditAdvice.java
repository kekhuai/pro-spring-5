package xyz.kekhuay.prospring5.ch5;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class AuditAdvice implements MethodBeforeAdvice {

    // public void simpleBeforeAdvide(JoinPoint joinPoint) {
    // System.out.println("Executing: " +
    // joinPoint.getSignature().getDeclaringTypeName() + " "
    // + joinPoint.getSignature().getName());
    // }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("Executing: " + method);
    }

}
