package id.co.pegadaian.gadai.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import id.co.pegadaian.gadai.dao.UserDao;
import id.co.pegadaian.gadai.entity.User;

@RestController
@RequestMapping("/api")
public class UserApiController {
    
    @Autowired private UserDao userDao;
    
    @PreAuthorize("hasAuthority('USER_VIEW')")
    @GetMapping("/user")
    public Page<User> semuaUser(Pageable page){
        return userDao.findAll(page);
    }
    
    @PreAuthorize("hasAuthority('USER_EDIT')")
    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public void userBaru(@RequestBody @Valid User u, HttpServletRequest req){
        userDao.save(u);
    }
}
