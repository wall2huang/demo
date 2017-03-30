package annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2016/11/13.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface TestAnnotation
{
    String value() default "";
}
