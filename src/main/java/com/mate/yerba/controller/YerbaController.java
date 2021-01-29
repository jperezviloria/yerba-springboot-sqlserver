package com.mate.yerba.controller;

import com.mate.yerba.model.Yerba;
import com.mate.yerba.service.implementation.YerbaServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("yerba")
public class YerbaController {

    @Autowired
    YerbaServiceImplementation yerbaServiceImplementation;


    @GetMapping("/all")
    public List<Yerba> getAllYerbas(){
        return yerbaServiceImplementation.getAllYerbas();
    }

    @GetMapping("/id/{idYerba}")
    public Optional<Yerba> getYerbaById(@PathVariable int idYerba){
        return yerbaServiceImplementation.getYerbaById(idYerba);
    }

    @GetMapping("/brand/{brandYerba}")
    public Yerba getYerbaByBrand(@PathVariable String brandYerba){
        return yerbaServiceImplementation.getYerbaByBrand(brandYerba);
    }

    @GetMapping("/price/{priceYerba}")
    public Yerba getYerbaByPrice(@PathVariable int priceYerba){
        return yerbaServiceImplementation.getYerbaByPrice(priceYerba);
    }



    @PostMapping
    public String saveYerba(@RequestBody Yerba yerba){
        return yerbaServiceImplementation.saveYerba(yerba);
    }



}
