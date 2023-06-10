package repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Trainer;
import entities.User;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Long> {
    Trainer findByName(String name);
}