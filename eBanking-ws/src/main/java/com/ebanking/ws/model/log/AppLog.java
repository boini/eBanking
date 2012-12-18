package com.ebanking.ws.model.log;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "APP_LOG")
public class AppLog {
    @Id
    @Column(name = "LOG_ID")
    @GeneratedValue
    private long id;
    @Column(name = "LOG_DATE")
    private Date date;
    @Column(name = "LOG_ACTION")
    private String action;
    @Column(name = "LOG_MESSAGE")
    private String message;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
