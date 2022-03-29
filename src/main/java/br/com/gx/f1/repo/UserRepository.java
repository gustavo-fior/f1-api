package br.com.gx.f1.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gx.f1.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	Optional<String> findByEmail(String email);
	
}
