import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2016/9/11.
 */
public class StartService
{

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext  = new ClassPathXmlApplicationContext("spring-config.xml");

        Resource resource  = applicationContext.getResource("read.txt");

        InputStream inputStream = resource.getInputStream();

        InputStreamReader reader = new InputStreamReader(inputStream);

        BufferedReader bufferedReader = new BufferedReader(reader);

        while(bufferedReader.ready())
        {
            System.out.print(bufferedReader.readLine());
        }

    }




}
