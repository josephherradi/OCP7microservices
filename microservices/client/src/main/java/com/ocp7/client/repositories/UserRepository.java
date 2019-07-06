package com.ocp7.client.repositories;

import com.ocp7.client.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer>
{

}