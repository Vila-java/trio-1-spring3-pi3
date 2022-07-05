package com.concessionariat1.concessionariat1.dto;

import com.concessionariat1.concessionariat1.model.Car;
import com.concessionariat1.concessionariat1.model.Service;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class CarDto {
    private String brand;
    private String model;
    private String manufacturingDate;
    private double numberOfKilometers;
    private int doors;
    private double price;
    private String currency;
    private List<Service> services;
    private int countOfOwners;

    public CarDto(Car car) {
        this.brand = car.getBrand();
        this.model = car.getModel();
        this.manufacturingDate = car.getManufacturingDate();
        this.numberOfKilometers = car.getNumberOfKilometers();
        this.doors = car.getDoors();
        this.price = car.getPrice();
        this.currency = car.getCurrency();
        this.services = car.getServices();
        this.countOfOwners = car.getCountOfOwners();
    }
}
