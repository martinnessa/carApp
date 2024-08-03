package com.madsennessa.carprojectapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Car")
public class
Car {

    @Id
    @GeneratedValue(generator = "car_seq_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "car_seq_gen", sequenceName = "car_seq", allocationSize = 1)
    @Column (name = "car_id")
    private Long id;

    @Column (name = "make")
    private String make;

    @Column (name = "model")
    private String model;

    @Column (name = "year")
    private int year;

    @Column (name = "range_driven")
    private Long rangeDriven = 0L;

    @Column (name = "listed_price")
    private Long listedPrice = 0L;

    @Column (name = "previous_owner")
    private int previousOwners;

    @Column (name = "registration_number")
    private String registrationNumber;

    @Column (name = "color")
    private String color;

    @Column (name = "gearbox")
    private GearboxType gearboxType;

    @Column (name = "drivetrain")
    private Drivetrain drivetrain;

    @Column (name = "fuel")
    private FuelType fuelType;
}
