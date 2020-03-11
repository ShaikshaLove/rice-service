package io.s3rice.riceservice.model;


import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
@Entity
@Table(name="RICE_TAB")
public class RiceType {

    @Id
    @GeneratedValue
    private int riceTypeId;
    private String riceName;
    private String riceType;
    private double mrp;
    private double currentCost;
    @Temporal(TemporalType.DATE)
    private Date packedDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
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

    public RiceType() {
    }

    public RiceType(String riceName, String riceType, double mrp, double currentCost, String description, int ageOfTheRiceInDays, int soldUnits,int availableUnits,int netWeight) {
        this.riceName = riceName;
        this.riceType = riceType;
        this.mrp = mrp;
        this.currentCost = currentCost;
        this.description = description;
        this.ageOfTheRiceInDays = ageOfTheRiceInDays;
        this.soldUnits=soldUnits;
        this.availableUnits=availableUnits;
        this.netWeight=netWeight;
    }

    public int getRiceTypeId() {
        return riceTypeId;
    }

    public void setRiceTypeId(int riceTypeId) {
        this.riceTypeId = riceTypeId;
    }

    public void setRiceName(String riceName) {
        this.riceName = riceName;
    }

    public void setRiceType(String riceType) {
        this.riceType = riceType;
    }

    public void setMrp(double mrp) {
        this.mrp = mrp;
    }

    public void setCurrentCost(double currentCost) {
        this.currentCost = currentCost;
    }

    public void setPackedDate(Date packedDate) {
        this.packedDate = packedDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAgeOfTheRiceInDays(int ageOfTheRiceInDays) {
        this.ageOfTheRiceInDays = ageOfTheRiceInDays;
    }



    public String getRiceName() {
        return riceName;
    }

    public String getRiceType() {
        return riceType;
    }

    public double getMrp() {
        return mrp;
    }

    public double getCurrentCost() {
        return currentCost;
    }

    public Date getPackedDate() {
        return packedDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public String getDescription() {
        return description;
    }

    public int getAgeOfTheRiceInDays() {
        return ageOfTheRiceInDays;
    }

    @Override
    public String toString() {
        return "Rice{" +
                "riceId=" + riceTypeId +
                ", riceName='" + riceName + '\'' +
                ", riceType='" + riceType + '\'' +
                ", mrp=" + mrp +
                ", currentCost=" + currentCost +
                ", packedDate=" + packedDate +
                ", createdDate=" + createdDate +
                ", lastModifiedDate=" + lastModifiedDate +
                ", description='" + description + '\'' +
                ", ageOfTheRiceInDays=" + ageOfTheRiceInDays +
                '}';
    }


}



