package com.challenge.goldpocketchallenge.service;

import com.challenge.goldpocketchallenge.entity.Pocket;

import java.util.List;

public interface PocketService {
    public void createNewPocket(Pocket pocket);
    public Pocket findPocketById(String id);
    public List<Pocket> findAllPocketsById(String id);
    public void topUp(Pocket pocket, Double qty);
    public void sell(Pocket pocket, Double qty);
}
