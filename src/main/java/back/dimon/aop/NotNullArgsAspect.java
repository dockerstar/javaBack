package back.dimon.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NotNullArgsAspect {

    @Around("@annotation(NotNullArgs)")
    public Object checkNull(
            ProceedingJoinPoint proceedingJoinPoint,
            NotNullArgs notNullArgs
    ) throws Throwable {
        System.out.println("Around before for method: " + proceedingJoinPoint.getSignature().getName());
        Object[] args = proceedingJoinPoint.getArgs();
        for (int i =0; i<args.length; i++) {
            if(args[i] == null) {
                throw new IllegalArgumentException("Аргумент " + i + "null");
            }
        }

        Object result;
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            System.out.println("Метод " + proceedingJoinPoint.getSignature().getName() + " упал");
            throw e;
        }

        System.out.println("Результат выполнения метода " + result);
        return result;
    }
}
