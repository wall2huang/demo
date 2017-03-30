package handler;/**
 * Created by Administrator on 2016/11/14.
 */

import Interface.BookFacade;
import Interface.BookFuck;
import impl.BookFacadeIml;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * author : Administrator
 **/
public class BookInvocationHandler implements InvocationHandler
{
    private Object obj;

    /** 需要自己实现调用处理器 **/
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        Object result = null;
        System.out.println("我在中间");
        result = method.invoke(obj, args);
        return result;
    }

    public BookInvocationHandler(Object obj)
    {
        this.obj = obj;
    }

    public static void main(String[] args)
    {
        BookFacadeIml bookFacadeIml = new BookFacadeIml();
        InvocationHandler handler = new BookInvocationHandler(bookFacadeIml);

        BookFacade proxy = (BookFacade) Proxy.newProxyInstance(bookFacadeIml.getClass().getClassLoader(),
                bookFacadeIml.getClass().getInterfaces(), handler);
        proxy.addBook();
        BookFuck s = (BookFuck) proxy;
        s.bookFuck();
    }

}
