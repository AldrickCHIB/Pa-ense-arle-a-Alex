package com.example.demo.Models;

import com.example.demo.Models.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface EnterpriseRepository extends JpaRepository<Enterprise, Long> {
    Optional<Enterprise> findByUuid(UUID uuid);

}
