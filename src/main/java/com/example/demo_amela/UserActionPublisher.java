package com.example.demo_amela;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class UserActionPublisher {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishEvent(final String action) {
        UserActionEvent event = new UserActionEvent(this, action);
        applicationEventPublisher.publishEvent(event);
    }
}
