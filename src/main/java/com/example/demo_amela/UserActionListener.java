package com.example.demo_amela;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class UserActionListener {

    @Async
    @EventListener
    public void handleUserActionEvent(UserActionEvent event) {
        // Simulate a delay to mimic background processing
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // Handle the interruption
        }

        System.out.println("Action Received: " + event.getAction());
        // Here, you can implement the logic to handle the event
    }
}
