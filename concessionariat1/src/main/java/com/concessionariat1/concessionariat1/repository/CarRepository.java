package com.concessionariat1.concessionariat1.repository;

import com.concessionariat1.concessionariat1.dto.CarDto;
import com.concessionariat1.concessionariat1.model.Car;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@Repository
public class CarRepository {

    private final String LINK_FILE = "concessionariat1/src/main/resources/dados.json";

    public List<Car> getAll() {
        ObjectMapper mapper = new ObjectMapper();
        List<Car> carList = null;

        try {
            carList = Arrays.asList(mapper.readValue(new File(LINK_FILE), Car[].class));
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }

        return carList;
    }

}
