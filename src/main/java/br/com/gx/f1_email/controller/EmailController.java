package br.com.gx.f1_email.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gx.f1_email.controller.request.RequestEmail;
import br.com.gx.f1_email.model.Email;
import br.com.gx.f1_email.repo.EmailRepository;

@RestController
@RequestMapping("/email")
public class EmailController {

	@Autowired
	private EmailRepository emailRepository;

	@PostMapping
	public ResponseEntity<?> saveEmail(@RequestBody @Valid RequestEmail req) {

		String email = req.getEmail();

		if (emailRepository.findByEmail(email).isPresent()) {
			return ResponseEntity.badRequest().build();
		}

		emailRepository.save(new Email(email));

		return ResponseEntity.ok().build();

	}

}
