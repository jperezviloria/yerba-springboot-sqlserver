package com.mate.yerba.service.implementation;

import com.mate.yerba.model.Mate;
import com.mate.yerba.repository.MateRepository;
import com.mate.yerba.service.MateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateServiceImplementation implements MateService {

    @Autowired
    MateRepository mateRepository;

    @Override
    public List<Mate> getAllMate() {
        return mateRepository.findAll();
    }

    @Override
    public Optional<Mate> getMateById(int idMate) {
        return mateRepository.findById(idMate);
    }

    @Override
    public String saveMate(Mate mate) {
        mateRepository.save(mate);
        return "mate was saved";
    }
}
