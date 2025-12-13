import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean(HelloWorld.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean(HelloWorld.class);

        Cat cat =
                (Cat) applicationContext.getBean(Cat.class);
        Cat cat1 =
                (Cat) applicationContext.getBean(Cat.class);

        System.out.println("HelloWorld beans are the same? " + (bean == bean1));
        System.out.println("Cats beans are the same? " + (cat == cat1));
    }
}