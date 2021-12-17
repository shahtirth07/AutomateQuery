package com.tirth.Day10.AutomateQuery.services;

import com.tirth.Day10.AutomateQuery.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Query(value= "select u from USer", nativeQuery = true)
//    for customised results i.e only selected results or by default it will return *

    public List<User> findByPassword(String pass);
    public List<User> findByPasswordAndUserID(String pass, String uid);

}
