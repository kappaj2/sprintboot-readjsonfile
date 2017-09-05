package za.co.ajk.jasonreader.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import za.co.ajk.jasonreader.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    
}
