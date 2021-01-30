package com.mate.yerba.controller;


import com.mate.yerba.model.Mate;
import com.mate.yerba.service.implementation.MateServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("mate")
public class MateController {

    @Autowired
    MateServiceImplementation mateServiceImplementation;

    @GetMapping
    public List<Mate> getAllMate(){
        return mateServiceImplementation.getAllMate();
    }

    @GetMapping("/{idMate}")
    public Optional<Mate> getMateById(@PathVariable int idMate){
        return mateServiceImplementation.getMateById(idMate);
    }

    @PostMapping
    public String saveMate(@RequestBody Mate mate){
        return mateServiceImplementation.saveMate(mate);
    }
}
