package com.example.hookahservice.service;

import com.example.hookahservice.service.models.Hookah;
import com.example.hookahservice.service.models.HookahMaterial;
import com.example.hookahservice.service.models.HookahProducer;
import com.example.hookahservice.service.models.HookahSize;

public interface HookahService {

    void sellHookah(String id);

    int getHookahPrice(String id);

    Hookah deliverToShop(HookahProducer producer, HookahMaterial material, HookahSize size, int price);

    Hookah getHookahById(String id);

    String hookahRemainder();
}
