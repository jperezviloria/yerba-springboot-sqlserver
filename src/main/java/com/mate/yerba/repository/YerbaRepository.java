package com.mate.yerba.repository;

import com.mate.yerba.model.Yerba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface YerbaRepository extends JpaRepository<Yerba, Integer> {

    @Query(value = "SELECT * FROM yerba WHERE price_yerba = ?1", nativeQuery = true)
    Yerba getYerbaByPrice(int priceYerba);

    @Query(value = "SELECT * FROM yerba WHERE brand_yerba = ?1", nativeQuery = true)
    Yerba getYerbaByBrand(String brandYerba);

}
