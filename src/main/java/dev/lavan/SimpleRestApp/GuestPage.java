package dev.lavan.SimpleRestApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestPage implements Page {
    @Autowired
    private ResponseDTO responseDTO;


    @Override
    public ResponseDTO message() {
        responseDTO.setStatus("success");
        responseDTO.setError(null);
        responseDTO.setData("This is the guest home page");
        return  responseDTO;
    }
}
