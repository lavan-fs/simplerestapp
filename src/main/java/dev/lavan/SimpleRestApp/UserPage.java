package dev.lavan.SimpleRestApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPage implements AuthenticatedPage {

    @Autowired
    private Token tokenService;
    @Autowired
    private ResponseDTO responseDTO;

    @Override
    public boolean authenticate(String token) {
        return tokenService.authenticate(token);
    }

    @Override
    public ResponseDTO message() {
        responseDTO.setStatus("success");
        responseDTO.setError(null);
        responseDTO.setData("This is the user-specific home page");
        return responseDTO;
    }
}
