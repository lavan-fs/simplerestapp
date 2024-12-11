package dev.lavan.SimpleRestApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/v1/guest")
public class GuestPageController implements Version {
    @Override
    public String description() {
        return "Returns Guest Home Page";
    }

    @Override
    public String changesInfo() {
        return "Initial Version";
    }
    @Autowired
    private Page guestPage;

    @GetMapping("/home")
public ResponseEntity<ResponseDTO> guestHome() {
    ResponseDTO response = guestPage.message();
    return ResponseEntity.ok(response);
}
}
