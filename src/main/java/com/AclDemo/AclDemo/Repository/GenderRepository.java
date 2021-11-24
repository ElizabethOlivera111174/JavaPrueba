package com.AclDemo.AclDemo.Repository;

import com.AclDemo.AclDemo.Models.GenderModel;
import com.AclDemo.AclDemo.Models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GenderRepository extends JpaRepository<GenderModel, Long> {
    Optional<UserModel> findByEmail(String email);

    boolean existsByEmail(String email);
}
