package com.example.demo_amela;

import org.springframework.context.ApplicationEvent;

public class UserActionEvent extends ApplicationEvent {
    private String action;

    public UserActionEvent(Object source, String action) {
        super(source);
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
