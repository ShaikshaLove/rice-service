package io.s3rice.riceservice.dto;

import java.util.Date;

public class RiceTypeDto {

    private String riceName;
    private String riceType;
    private double mrp;
    private double currentCost;
    private String packedDate;
    private String description;
    private int ageOfTheRiceInDays;
    private int soldUnits;
    private int availableUnits;
    private int netWeight;

    public int getSoldUnits() {
        return soldUnits;
    }

    public void setSoldUnits(int soldUnits) {
        this.soldUnits = soldUnits;
    }

    public int getAvailableUnits() {
        return availableUnits;
    }

    public void setAvailableUnits(int availableUnits) {
        this.availableUnits = availableUnits;
    }

    public int getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(int netWeight) {
        this.netWeight = netWeight;
    }

    public RiceTypeDto(String riceName, String riceType, double mrp, double currentCost, String description, int ageOfTheRiceInDays) {
        this.riceName = riceName;
        this.riceType = riceType;
        this.mrp = mrp;
        this.currentCost = currentCost;
        this.description = description;
        this.ageOfTheRiceInDays = ageOfTheRiceInDays;
    }

    public String getRiceName() {
        return riceName;
    }

    public void setRiceName(String riceName) {
        this.riceName = riceName;
    }

    public String getRiceType() {
        return riceType;
    }

    public void setRiceType(String riceType) {
        this.riceType = riceType;
    }

    public double getMrp() {
        return mrp;
    }

    public void setMrp(double mrp) {
        this.mrp = mrp;
    }

    public double getCurrentCost() {
        return currentCost;
    }

    public void setCurrentCost(double currentCost) {
        this.currentCost = currentCost;
    }

    public String getPackedDate() {
        return packedDate;
    }

    public void setPackedDate(String packedDate) {
        this.packedDate = packedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAgeOfTheRiceInDays() {
        return ageOfTheRiceInDays;
    }

    public void setAgeOfTheRiceInDays(int ageOfTheRiceInDays) {
        this.ageOfTheRiceInDays = ageOfTheRiceInDays;
    }

    public RiceTypeDto() {
    }
}
