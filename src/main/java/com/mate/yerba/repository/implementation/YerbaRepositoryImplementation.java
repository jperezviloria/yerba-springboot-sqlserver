package com.mate.yerba.repository.implementation;

import com.mate.yerba.model.Yerba;
import com.mate.yerba.repository.YerbaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
@AllArgsConstructor
public abstract class YerbaRepositoryImplementation {


    @PersistenceContext
    @Autowired
    private EntityManager entityManager;


    public Yerba getYerbaByPrice(int priceYerba) {
        Yerba yerba = new Yerba();

        try{
            String sql = "SELECT * FROM yerba WHERE price_yerba = :price";
            Query query = entityManager.createNativeQuery(sql, Yerba.class).setParameter("price", priceYerba);
            yerba = (Yerba) query.getSingleResult();
        } catch (Exception e){
            e.printStackTrace();
        }
        return yerba;
    }


    public Yerba getYerbaByBrand(String brandYerba) {
        Yerba yerba = new Yerba();

        try{
            String sql = "SELECT * FROM yerba WHERE brand_yerba = :brand";
            Query query = entityManager.createNativeQuery(sql, Yerba.class).setParameter("brand", brandYerba);
            yerba = (Yerba) query.getSingleResult();
        } catch (Exception e){
            e.printStackTrace();
        }
        return yerba;
    }
}
