package pl.edu.wszib.project.cardiary.dto;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;
import java.math.BigDecimal;
import java.util.Date;

public class CarDTO {

    int id;

    @NotEmpty
    BigDecimal carTank;

    @PastOrPresent
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date carTime;

    @NotEmpty
    BigDecimal pricePerLiter;

    @NotEmpty
    BigDecimal totalPrice;

    @NotEmpty
    int mileage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getCarTank() {
        return carTank;
    }

    public void setCarTank(BigDecimal carTank) {
        this.carTank = carTank;
    }

    public Date getCarTime() {
        return carTime;
    }

    public void setCarTime(Date carTime) {
        this.carTime = carTime;
    }

    public BigDecimal getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(BigDecimal pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
