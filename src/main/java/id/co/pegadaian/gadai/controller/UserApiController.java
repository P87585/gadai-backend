package id.co.pegadaian.gadai.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.co.pegadaian.gadai.dao.UserDao;
import id.co.pegadaian.gadai.entity.User;

@RestController
@RequestMapping("/api")
public class UserApiController {

	@Autowired UserDao userDao;
	
	@GetMapping("/user")
	private Page<User> getAllUser(Pageable page) {
		return userDao.findAll(page);
	}
	
	@PostMapping("/user")
	private void saveUser(@RequestBody @Valid User u) {
		userDao.save(u);
	}
}
