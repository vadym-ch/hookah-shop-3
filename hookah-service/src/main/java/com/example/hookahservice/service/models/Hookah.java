package com.example.hookahservice.service.models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Entity
@EnableAutoConfiguration

public final class Hookah {
    @Id
    private String id;
    private HookahProducer producer;
    private HookahMaterial material;
    private HookahSize size;
    private int price;

    public Hookah(HookahProducer producer, HookahMaterial material, HookahSize size, int price) {
        this.producer = producer;
        this.material = material;
        this.size = size;
        this.price = price;
        this.id = UUID.randomUUID().toString();
    }

    public Hookah() {

    }

    public String getId() {
        return id;
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
        return size + " " + material + " hookah made in " + producer + ". Price: " + price + ". Product Id: " + id;
    }

}
