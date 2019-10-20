package pl.cz.shop.service;

import org.springframework.stereotype.Service;
import pl.cz.shop.entity.User;
import pl.cz.shop.enums.UserPriviledgeEnum;
import pl.cz.shop.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    //Autowired niepotrzebny
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {

        checkForUserLoginExists(user.getLogin());
        checkForUserEmailExists(user.getEmail());

        user.setUserPriviledge(UserPriviledgeEnum.CUSTOMER);

        return  userRepository.save(user);
    }

    private void checkForUserLoginExists(String login) {
        if(userRepository.findByLogin(login).isPresent()){
            throw new RuntimeException("login already exists");
        }
    }

    private void checkForUserEmailExists(String email) {
        if(userRepository.findByEmail(email).isPresent()){
            throw new RuntimeException("email already exists");
        }
    }
}