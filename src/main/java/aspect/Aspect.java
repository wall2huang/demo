package aspect;/**
 * Created by Administrator on 2016/11/13.
 */



import annotation.TestAnnotation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import service.TestService;

/**
 * author : Administrator
 **/
@Component
@org.aspectj.lang.annotation.Aspect
public class Aspect
{

    @Pointcut("withthin(service.TestService)")
    public void testPoint(){}


    @Before(value = "args(param) && target(testService) && @annotation(annotation)",
            argNames = "param, testService, annotation")
    public void brforeAdvisor(JoinPoint jp, String param, TestService testService, TestAnnotation annotation){
        System.out.println("通知方法运行");
        System.out.println(jp.getArgs());
        System.out.println(param);
        System.out.println(testService.toString());
        System.out.println(annotation.value());
    }


}
