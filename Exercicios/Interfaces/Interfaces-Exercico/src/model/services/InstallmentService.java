package model.services;

import java.time.LocalDate;

public class InstallmentService {
    private LocalDate monthPay;
    private Double amount;

    public InstallmentService(){}
    public InstallmentService(LocalDate monthPay, Double amount) {
        this.monthPay = monthPay;
        this.amount = amount;
    }

    public LocalDate getMonthPay() {
        return monthPay;
    }

    public void setMonthPay(LocalDate monthPay) {
        this.monthPay = monthPay;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
