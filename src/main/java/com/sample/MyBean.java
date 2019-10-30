package com.sample;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MyBean {
    private List<String> messages = new ArrayList<>();

    public MyBean() {
        super();
        messages.add("This is Bean sample");
    }

    public void addMessage(String message) {
        messages.add(message);
    }

    public String getMessage(int n) {
        return messages.get(n);
    }

    public void setMessages(int n, String message) {
        messages.add(n, message);
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        String result = "MyBean{\n";

        for (String message : messages) {
            result += "\t'" + message + "'\n";
        }
        result += "}";
        return result;
    }
}
