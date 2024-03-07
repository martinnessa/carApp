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
public class Car {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "Make")
    private String make;

    @Column (name = "Model")
    private String model;

    @Column (name = "Year")
    private int year;

    @Column (name = "RangeDriven")
    private Long rangeDriven;

    @Column (name = "ListedPrice")
    private Long listedPrice;

    @Column (name = "PreviousOwners")
    private int previousOwners;

    @Column (name = "RegistrationNumber")
    private String registrationNumber;

    @Column (name = "Color")
    private String color;

    @Column (name = "Gearbox")
    private GearBoxType gearBoxType;

    @Column (name = "Drivetrain")
    private Drivetrain drivetrain;

    @Column (name = "Fuel")
    private FuelType fuelType;
}
