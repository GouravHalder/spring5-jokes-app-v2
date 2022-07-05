package guru.springframework.spring5jokesappv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.spring5jokesappv2.services.JokeServiceImpl;


@SpringBootApplication
public class Spring5JokesAppV2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5JokesAppV2Application.class, args);
		//JokesImpl jks = (JokesImpl) ctx.getBean(JokesImpl.class);
		JokeServiceImpl jks = (JokeServiceImpl) ctx.getBean(JokeServiceImpl.class);
		System.out.println(jks.getJoke());
		
	}

}
