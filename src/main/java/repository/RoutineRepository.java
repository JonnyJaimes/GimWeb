package repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Routine;
import entities.Trainer;
import entities.User;

@Repository
public interface RoutineRepository extends JpaRepository<Routine, Long> {
	
	Routine findByUsername(String username);

	void delete(Routine existingUser);

	Routine save(Routine existingUser);

	User save(User user);
}