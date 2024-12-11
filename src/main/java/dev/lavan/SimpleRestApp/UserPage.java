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


    public ResponseDTO message(Object Status, Object error, Object data) {
        responseDTO.setStatus((String) Status);
        responseDTO.setError((String) error);
        responseDTO.setData((String) data);
        return responseDTO;
    }

    @Override
    public ResponseDTO message() {
      return null;

    }
}
