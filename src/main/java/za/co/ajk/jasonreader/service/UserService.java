package za.co.ajk.jasonreader.service;

import java.util.List;

import org.springframework.stereotype.Service;

import za.co.ajk.jasonreader.domain.User;
import za.co.ajk.jasonreader.repository.UserRepository;

@Service
public class UserService {
    
    private UserRepository userRepository;
    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public Iterable<User> list() {
        return userRepository.findAll();
    }
    
    public Iterable<User> save(List<User> users) {
        return userRepository.save(users);
    }
    
    public User save(User user) {
        return userRepository.save(user);
    }
}
