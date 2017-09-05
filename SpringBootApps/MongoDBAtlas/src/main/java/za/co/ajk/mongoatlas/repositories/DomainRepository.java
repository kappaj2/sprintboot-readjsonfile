package za.co.ajk.mongoatlas.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import za.co.ajk.mongoatlas.domains.Domain;

/**
 * Created by andrekapp on 2017/07/12.
 */
public interface DomainRepository extends MongoRepository<Domain, Long>, DomainRepositoryCustom {
    
    Domain findFirstByDomain(String domain);
    
    Domain findByDomainAndDisplayAdds(String domain, boolean displayAdds);
    
    //  Support for native JSON query string
    @Query("{domain:'?0'}")
    Domain findCustomByDomain(String domain);
    
    @Query("{domain: { $regex: ?0 } })")
    List<Domain> findCustomerByRegExDomain(String domain);
    
}
