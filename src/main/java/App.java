import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        HelloWorld bean = context.getBean("helloworld", HelloWorld.class);
        HelloWorld bean1 = context.getBean("helloworld", HelloWorld.class);
        
        Cat catBean = context.getBean(Cat.class);
        Cat catBean1 = context.getBean(Cat.class);

        System.out.println(bean == bean1);
        System.out.println(catBean == catBean1);
    }
}