package service;/**
 * Created by Administrator on 2016/11/13.
 */

import annotation.TestAnnotation;
import org.springframework.stereotype.Service;

/**
 * author : Administrator
 **/
@Service
public class TestService
{

    @TestAnnotation("I am annotation")
    public void test(String param)
    {
        System.out.println("传入的参数为：" + param);
    }



}
