package com.techsharezone.crud.model;/*
 * @created 07/11/2020 -01:09
 * @project This-spring-boot-login-aws-rds-jpa
 * @author  saurabhshcs
 */

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoty extends JpaRepository<User, Integer> {
    User findByName(String userName);
}
