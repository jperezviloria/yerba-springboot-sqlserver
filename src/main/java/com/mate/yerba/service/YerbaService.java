package com.mate.yerba.service;

import com.mate.yerba.model.Yerba;

import java.util.List;
import java.util.Optional;

public interface YerbaService {

    List<Yerba> getAllYerbas();

    Optional<Yerba> getYerbaById(int idYerba);

    String saveYerba(Yerba yerba);

}
