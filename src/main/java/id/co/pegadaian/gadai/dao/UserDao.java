package id.co.pegadaian.gadai.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import id.co.pegadaian.gadai.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, String> {

}
