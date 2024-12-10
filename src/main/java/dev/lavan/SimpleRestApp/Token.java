package dev.lavan.SimpleRestApp;

import org.springframework.stereotype.Component;

@Component
public class Token {

    private static final String STATIC_TOKEN = "123";

    public boolean authenticate(String token) {
        return STATIC_TOKEN.equals(token);
    }

    public String provideToken() {
        return STATIC_TOKEN;
    }
}
