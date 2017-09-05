package za.co.ajk.mongoatlas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import za.co.ajk.mongoatlas.domains.Domain;
import za.co.ajk.mongoatlas.repositories.DomainRepository;

@SpringBootApplication
public class MongoatlasApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(MongoatlasApplication.class, args);
        System.out.println("Started application. Ready for action!");
    }
    
    @Bean
    CommandLineRunner init(DomainRepository domainRepository) {
        
        return args -> {
            
            Domain obj = domainRepository.findOne(7L);
            System.out.println("Obj1 : " + obj);
            
            Domain obj2 = domainRepository.findFirstByDomain("andre");
            System.out.println("Obj2 : " + obj2);
            
            int n = domainRepository.updateDomain("andre", true);
            System.out.println("Number of records updated : " + n);
        };
        
    }
}
