package impl;/**
 * Created by Administrator on 2016/11/14.
 */

import Interface.BookFacade;
import Interface.BookFuck;

/**
 * author : Administrator
 **/
public class BookFacadeIml implements BookFacade, BookFuck
{
    public void addBook()
    {
        System.out.println("我实现了addbooke接口");
    }

    @Override
    public void bookFuck()
    {
        System.out.println("我实现了bookfuck接口");
    }
}
