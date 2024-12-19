import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Scope("prototype")
    @Bean(value="cat")
    public Cat geCat() {
        Cat cat = new Cat();
        cat.setName("Барсик");
        return cat;
    }
}