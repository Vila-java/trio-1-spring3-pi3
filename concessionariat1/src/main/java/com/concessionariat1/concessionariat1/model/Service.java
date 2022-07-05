package com.concessionariat1.concessionariat1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Service {
    private String date;
    private double kilometers;
    private String descriptions;
}
