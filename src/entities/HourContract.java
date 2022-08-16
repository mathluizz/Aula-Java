package entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    public HourContract(){}
    public HourContract(Date date, Double valuePerHour, Integer hours) {
        this.valuePerHour = valuePerHour;
        this.hours = hours;
        this.date = date;
    }

    public void setDate(Date date){
        this.date = date;
    }
    public Date getDate() {
        return date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
    public double totalValue (){
        return hours * valuePerHour;
    }
}
