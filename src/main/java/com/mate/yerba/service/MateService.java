package com.mate.yerba.service;

import com.mate.yerba.model.Mate;

import java.util.List;
import java.util.Optional;

public interface MateService {

    List<Mate> getAllMate();

    Optional<Mate> getMateById(int idMate);

    String saveMate(Mate mate);

}
