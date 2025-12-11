import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat cat1 =
                (Cat) applicationContext.getBean(Cat.class);
        Cat cat2 =
                (Cat) applicationContext.getBean(Cat.class);
        System.out.println("first cat = " + cat1);
        System.out.println("second cat = " + cat2);
    }
}