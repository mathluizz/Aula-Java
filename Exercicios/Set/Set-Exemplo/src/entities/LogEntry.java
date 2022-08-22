package entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {
    private String usernema;
    private Date moment;

    public LogEntry(String usernema, Date moment) {
        this.usernema = usernema;
        this.moment = moment;
    }

    public String getUsernema() {
        return usernema;
    }

    public void setUsernema(String usernema) {
        this.usernema = usernema;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(usernema, logEntry.usernema);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usernema);
    }

}
