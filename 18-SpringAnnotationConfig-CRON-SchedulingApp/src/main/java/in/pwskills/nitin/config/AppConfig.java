package in.pwskills.nitin.config;



import java.time.LocalDateTime;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;






@Configuration
@ComponentScan(basePackages="in.pwskills.nitin")
@EnableScheduling
public class AppConfig {
	
	
}
