package br.com.gx.f1_email.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gx.f1_email.model.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long>{

	Optional<String> findByEmail(String email);
	
}
