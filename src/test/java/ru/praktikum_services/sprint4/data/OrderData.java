package ru.praktikum_services.sprint4.data;

public class OrderData {

    private final String name;
    private final String surName;
    private final String address;
    private final String metroStation;
    private final String telNumber;
    private final String date;
    private final RentalDuration rentalDuration;
    private final ScooterColor scooterColor;

    public OrderData(String name, String surName, String address, String metroStation, String telNumber, String date, RentalDuration rentalDuration, ScooterColor scooterColor) {
        this.name = name;
        this.surName = surName;
        this.address = address;
        this.metroStation = metroStation;
        this.telNumber = telNumber;
        this.date = date;
        this.rentalDuration = rentalDuration;
        this.scooterColor = scooterColor;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getAddress() {
        return address;
    }

    public String getMetroStation() {
        return metroStation;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public String getDate() {
        return date;
    }

    public RentalDuration getRentalDuration() {
        return rentalDuration;
    }

    public ScooterColor getScooterColor() {
        return scooterColor;
    }
}
