package za.co.ajk.mongoatlas.services;

import java.util.Date;

import org.springframework.stereotype.Component;

import za.co.ajk.mongoatlas.domains.Domain;

/**
 * Created by andrekapp on 2017/07/12.
 */
@Component
public class DomainServices {
    
    public void createDomain (){
        
        Domain domain1 = new Domain();
        domain1.setCreatedDate(new Date());
        domain1.setDisplayAdds(true);
        domain1.setDomain("TestDomain1");
        
        
    }
}
