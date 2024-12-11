package dev.lavan.SimpleRestApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class TokenController implements Version {
    @Autowired
    Token token;

    @PostMapping("/token")
    public String getToken(){
        return token.provideToken();
    }

    @Override
    public String description() {
        return "Return Token";
    }

    @Override
    public String changesInfo() {
        return "Initial Version";
    }
}
