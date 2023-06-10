package service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.User;
import repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Long id, User user) {
        User existingUser = getUserById(id);
        if (existingUser != null) {
            existingUser.setUsername(user.getUsername());
            existingUser.setEmail(user.getEmail());
            return userRepository.save(existingUser);
        }
        return null;
    }

    public void deleteUser(Long id) {
        User existingUser = getUserById(id);
        if (existingUser != null) {
            userRepository.delete(existingUser);
        }
    }
}
