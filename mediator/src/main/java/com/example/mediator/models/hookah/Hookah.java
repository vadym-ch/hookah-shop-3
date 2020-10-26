package com.example.mediator.models.hookah;

import java.util.UUID;

public final class Hookah {
    private String hookahId;
    private HookahProducer producer;
    private HookahMaterial material;
    private HookahSize size;
    private int price;

    public Hookah(HookahProducer producer, HookahMaterial material, HookahSize size, int price) {
        this.producer = producer;
        this.material = material;
        this.size = size;
        this.price = price;
        this.hookahId = UUID.randomUUID().toString();
    }

    public Hookah() {

    }

    public String getHookahId() {
        return hookahId;
    }

    public HookahMaterial getMaterial() {
        return material;
    }

    public HookahProducer getProducer() {
        return producer;
    }

    public HookahSize getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return size + " " + material + " hookah made in " + producer + ". Price: " + price + ". Product Id: "
                + hookahId;
    }

}
