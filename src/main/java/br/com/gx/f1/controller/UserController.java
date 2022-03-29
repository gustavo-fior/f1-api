package br.com.gx.f1.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gx.f1.controller.request.RequestUser;
import br.com.gx.f1.model.User;
import br.com.gx.f1.repo.UserRepository;

@RestController
@RequestMapping("/email")
public class UserController {

	@Autowired
	private UserRepository emailRepository;

	@PostMapping
	public ResponseEntity<?> saveEmail(@RequestBody @Valid RequestUser req) {

		String email = req.getEmail();

		if (emailRepository.findByEmail(email).isPresent()) {
			return ResponseEntity.badRequest().build();
		}

		emailRepository.save(new User(email, req.getNome()));

		return ResponseEntity.ok().build();

	}

}
