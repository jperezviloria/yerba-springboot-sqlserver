package com.mate.yerba.service.implementation;

import com.mate.yerba.model.Yerba;
import com.mate.yerba.repository.YerbaRepository;
import com.mate.yerba.service.YerbaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class YerbaServiceImplementation implements YerbaService {


    @Autowired
    YerbaRepository yerbaRepository;

    @Override
    public List<Yerba> getAllYerbas() {
        return yerbaRepository.findAll();
    }

    @Override
    public Optional<Yerba> getYerbaById(int idYerba) {
        return yerbaRepository.findById(idYerba);
    }

    @Override
    public String saveYerba(Yerba yerba) {
        yerbaRepository.save(yerba);
        return "yerba was saved";
    }

    @Override
    public Yerba getYerbaByBrand(String brandYerba) {
        return yerbaRepository.getYerbaByBrand(brandYerba);
    }

    @Override
    public Yerba getYerbaByPrice(int priceYerba) {
        return yerbaRepository.getYerbaByPrice(priceYerba);
    }
}
