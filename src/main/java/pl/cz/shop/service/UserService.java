package pl.cz.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.cz.shop.entity.Product;
import pl.cz.shop.entity.User;
import pl.cz.shop.repository.ProductRepository;
import pl.cz.shop.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserByLogin(String login){
        return userRepository.findByLogin(login).orElse(null);
    }
}