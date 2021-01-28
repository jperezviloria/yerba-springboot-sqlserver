package com.mate.yerba.repository;

import com.mate.yerba.model.Yerba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YerbaRepository extends JpaRepository<Yerba, Integer> {
}
