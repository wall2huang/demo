import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.TestService;

import java.io.IOException;

/**
 * Created by Administrator on 2016/9/11.
 */
public class StartService
{

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext applicationContext  = new ClassPathXmlApplicationContext("spring-config.xml");

        TestService service = applicationContext.getBean(TestService.class);

        service.test("特使");

    }




}
