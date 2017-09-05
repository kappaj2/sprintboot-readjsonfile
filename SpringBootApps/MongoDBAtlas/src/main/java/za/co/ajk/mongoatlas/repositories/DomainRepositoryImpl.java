package za.co.ajk.mongoatlas.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.mongodb.WriteResult;
import za.co.ajk.mongoatlas.domains.Domain;

/**
 * Created by andrekapp on 2017/07/12.
 */
public class DomainRepositoryImpl implements DomainRepositoryCustom {
    @Autowired
    private MongoTemplate mongoTemplate;
    
    @Override
    public int updateDomain(String domain, boolean displayAdds) {
        
        Query query = new Query(Criteria.where("domain").is(domain));
        Update update = new Update();
        WriteResult result = mongoTemplate.updateFirst(query, update, Domain.class);
        
        if(result != null){
            return result.getN();
        }else{
            return 0;
        }
    }
}
