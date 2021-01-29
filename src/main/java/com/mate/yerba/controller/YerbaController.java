package com.mate.yerba.controller;

import com.mate.yerba.dto.RestResponse;
import com.mate.yerba.model.Yerba;
import com.mate.yerba.service.implementation.YerbaServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @GetMapping("/v2/all")
    public RestResponse<List<Yerba>> getAllYerba() throws Exception{
        List<Yerba> allYerbas = null;
        HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        try{
            List<Yerba> response = yerbaServiceImplementation.getAllYerbas();
            if(!response.isEmpty()){
                httpStatus = HttpStatus.OK;
                allYerbas = response;
            }else{
                httpStatus = HttpStatus.NO_CONTENT;
            }
        }catch (Exception e){
            e.getCause();
        }
       return new RestResponse<>(httpStatus, allYerbas);
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
