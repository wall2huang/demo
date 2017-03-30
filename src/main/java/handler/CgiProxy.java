package handler;/**
 * Created by Administrator on 2016/11/15.
 */

import impl.CgilibInstance;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * author : Administrator
 **/
public class CgiProxy implements MethodInterceptor
{

    public Object getInstance(Object target)
    {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable
    {

        return methodProxy.invokeSuper(o ,objects);
    }

    public static void main(String[] args)
    {
        CgiProxy cgiProxy = new CgiProxy();
        CgilibInstance instance = (CgilibInstance) cgiProxy.getInstance(new CgilibInstance());
        instance.dosomething();
    }


}
