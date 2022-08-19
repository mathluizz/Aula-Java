package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private Integer number;
    private Date start;
    private Double total;

    List<Installments> installments = new ArrayList<>();

    public Contract() {}
    public Contract(Integer number, Double total, Date start) {
        this.number = number;
        this.total = total;
        this.start = start;
    }
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<Installments> getInstallments() {
        return installments;
    }

}