package model.services;

import model.entities.Contract;
import model.entities.Installments;

import java.util.Calendar;
import java.util.Date;

public class ContractService {
    private Integer months;

    private Contract contract;
    private PaymentService paymentService;

    public ContractService(){}
    public ContractService(Integer months, Contract contract, PaymentService paymentService) {
        this.months = months;
        this.contract = contract;
        this.paymentService = paymentService;
    }
    public Integer geMonths() {
        return months;
    }

    public void setMonths(Integer installment) {
        this.months = installment;
    }

    private Date addMonth(Date date, int N){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, N);
        return calendar.getTime();
    }

    public void processContract(){
        double basicQuota = contract.getTotal() / months;
        for (int i = 1; i<=months; i++){
            double updateQuota = basicQuota + PaypalService.installmentTax(basicQuota, i);
            double fullQuota = updateQuota * PaypalService.paymentTax();
            Date dueDate = addMonth(contract.getStart(), i);
            contract.getInstallments().add(new Installments(dueDate, fullQuota));
        }
    }


}
