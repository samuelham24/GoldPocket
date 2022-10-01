package com.challenge.goldpocketchallenge.controller;


import com.challenge.goldpocketchallenge.entity.Pocket;
import com.challenge.goldpocketchallenge.service.PocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PocketController {

    @Autowired
    PocketService pocketService;

    @GetMapping("/pocket/{id}")
    public Pocket findPocketById(@PathVariable(name = "id") String id){
        return pocketService.findPocketById(id);
    }

    @PostMapping("/pocket")
    public void createPocket(@RequestBody Pocket pocket){
        pocketService.createNewPocket(pocket);
    }

}
