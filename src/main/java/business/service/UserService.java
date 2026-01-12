package business.service;

import infrastructure.entity.User;
import infrastructure.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void saveUsers(User user){
        repository.saveAndFlush(user);
    }
}
