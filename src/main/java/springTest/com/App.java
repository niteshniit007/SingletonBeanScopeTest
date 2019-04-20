package springTest.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Car car1 = ctx.getBean("car1", Car.class);
        Car car1a = ctx.getBean("car1", Car.class);
        Car car2 = ctx.getBean("car2", Car.class);
    
        System.out.println("car1==car2" + (car1==car2)); //car1==car2false
        System.out.println("car1==car2" + (car1.equals(car2))); //car1==car2true
        System.out.println("car1==car2" + (car1==car1a)); //car1==car2true
    }
}
