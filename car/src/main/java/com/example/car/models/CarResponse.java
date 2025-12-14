package com.example.car.models;

import com.example.car.entities.Client;

public class CarResponse {
    private Long id;
    private String brand;
    private String model;
    private String matricue;
    private Client client;

    public CarResponse() {
    }

    public CarResponse(Long id, String brand, String model, String matricue, Client client) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.matricue = matricue;
        this.client = client;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMatricue() {
        return matricue;
    }

    public void setMatricue(String matricue) {
        this.matricue = matricue;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    // Builder pattern
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Long id;
        private String brand;
        private String model;
        private String matricue;
        private Client client;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder matricue(String matricue) {
            this.matricue = matricue;
            return this;
        }

        public Builder client(Client client) {
            this.client = client;
            return this;
        }

        public CarResponse build() {
            return new CarResponse(id, brand, model, matricue, client);
        }
    }

    // toString method
    @Override
    public String toString() {
        return "CarResponse{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", matricue='" + matricue + '\'' +
                ", client=" + client +
                '}';
    }
}