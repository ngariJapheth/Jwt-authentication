package com.example.Jtech.repository;

import com.example.Jtech.entity.Userinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserinfoRepository extends JpaRepository<Userinfo,Integer> {
    Optional<Userinfo> findByName(String username);
}
