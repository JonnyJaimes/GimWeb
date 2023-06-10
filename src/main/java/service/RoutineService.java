package service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Routine;
import entities.User;
import repository.RoutineRepository;
import repository.UserRepository;

import java.util.List;

@Service
public class RoutineService {

    @Autowired
    private RoutineRepository userRepository;

    public List<Routine> getAllUsers() {
        return userRepository.findAll();
    }

    public Routine getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Routine updateUser(Long id, User user) {
      
        return null;
    }

    public void deleteUser(Long id) {
        
    }

	public List<Routine> getAllRoutines() {
		// TODO Auto-generated method stub
		return null;
	}
}
