package pl.edu.wszib.project.cardiary.dto;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;
import java.util.Date;

public class CarDTO {

    int id;

    @NotEmpty
    int carTank;

    @PastOrPresent
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date carTime;

    @NotEmpty
    int pricePerLiter;

    @NotEmpty
    int totalPrice;

    @NotEmpty
    int mileage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
