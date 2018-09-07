package test.testrpc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableFeignClients
public class TestrpcApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestrpcApplication.class, args);
	}
}
