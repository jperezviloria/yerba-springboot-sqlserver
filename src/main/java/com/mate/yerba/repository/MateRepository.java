package com.mate.yerba.repository;

import com.mate.yerba.model.Mate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateRepository extends JpaRepository<Mate, Integer> {
}
