package pl.edu.wszib.project.cardiary.domain;

import java.util.Date;

public class Car {
    private String name;
    private long mileage;
    private int carTank;
    private int pricePerLiter;
    private int totalPrice;
    private Date carTime;
    private String description;
    private int monthlyFuelCost;
    private int monthlyCostOfRepairs;

    public int getMonthlyFuelCost() {
        return monthlyFuelCost;
    }

    public void setMonthlyFuelCost(int monthlyFuelCost) {
        this.monthlyFuelCost = monthlyFuelCost;
    }

    public int getMonthlyCostOfRepairs() {
        return monthlyCostOfRepairs;
    }

    public void setMonthlyCostOfRepairs(int monthlyCostOfRepairs) {
        this.monthlyCostOfRepairs = monthlyCostOfRepairs;
    }

    public int getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(int pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    public int getCarTank() {
        return carTank;
    }

    public void setCarTank(int carTank) {
        this.carTank = carTank;
    }

    public Date getCarTime() {
        return carTime;
    }

    public void setCarTime(Date carTime) {
        this.carTime = carTime;
    }
}
