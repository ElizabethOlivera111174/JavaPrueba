package com.AclDemo.AclDemo.Repository;


import com.AclDemo.AclDemo.Mappers.DTOs.CharactersDTOs.CharacterDTO;
import com.AclDemo.AclDemo.Models.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {

    Optional<Character> findById(Long id);

    Character findByName(String name);
    List<Character> getAll();
}
