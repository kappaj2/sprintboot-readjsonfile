package za.co.ajk.jasonreader;

import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import za.co.ajk.jasonreader.domain.User;
import za.co.ajk.jasonreader.service.UserService;

@SpringBootApplication
public class JasonreaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(JasonreaderApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(UserService userService){
		return args->{
			// read json and write to db.
			
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<User>> typeReference = new TypeReference<List<User>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/users.json");
			try{
				List<User> users = mapper.readValue(inputStream, typeReference);
				userService.save(users);
				System.out.println("Users saved to DB");
				
			}catch(Exception ex){
				System.out.println("Error reading JSON : "+ex.getMessage());
			}
		};
	}
}
