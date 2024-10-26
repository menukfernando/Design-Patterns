package com.example.designpattern.question.two;

public class NotificationMain {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        Notification email = service.createNotification("email");
        Notification sms = service.createNotification("sms");
        Notification push = service.createNotification("push");

        email.send("Welcome to the Team!");
        sms.send("Your OTP is 243432");
        push.send("New message received");
    }
}
