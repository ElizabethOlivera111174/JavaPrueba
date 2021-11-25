package com.AclDemo.AclDemo.IServices;

import com.AclDemo.AclDemo.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserService extends JpaRepository<Users, Integer> {
    Users findByName(String name);
}
