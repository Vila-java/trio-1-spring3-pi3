package com.concessionariat1.concessionariat1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Car {
     private String id;
     private String brand;
     private String model;
     private String manufacturingDate;
     private double numberOfKilometers;
     private int doors;
     private double price;
     private String currency;
     private List<Service> services;
     private int countOfOwners;
}
