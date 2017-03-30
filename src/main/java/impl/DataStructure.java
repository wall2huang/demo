package impl;/**
 * Created by Administrator on 2016/12/11.
 */

import java.util.Optional;

/**
 * author : Administrator
 **/
public class DataStructure
{
    public static void main(String[] args)
    {
        Optional<DataStructure> dataStructureOptional = Optional.ofNullable(createFactory(4));
        DataStructure dataStructure = dataStructureOptional.orElseThrow(() -> new RuntimeException());

        DataStructure dataStructure1 = createFactory(1);
        if (dataStructure1 == null)
        {
            throw new RuntimeException("XXX");
        }
    }

    public static DataStructure createFactory(int i)
    {
        if (i % 2 == 0)
        {
            return new DataStructure();
        }
        else
        {
            return null;
        }
    }

    private void view()
    {
        System.out.println("i am born");
    }

}
