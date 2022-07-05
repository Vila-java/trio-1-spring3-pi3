package com.concessionariat1.concessionariat1.controller;

import com.concessionariat1.concessionariat1.dto.CarDto;
import com.concessionariat1.concessionariat1.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/v1/api/cars")
@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public ResponseEntity<List<CarDto>> getAll() {
        List<CarDto> carList = carService.getAll();
        return ResponseEntity.ok(carList);
    }
}
