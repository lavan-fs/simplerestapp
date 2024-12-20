package dev.lavan.SimpleRestApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserPageController implements Version {
    @Autowired
    UserPage userpage;
    @Autowired
    ResponseDTO ResObj;
    @GetMapping("/home")
    public ResponseEntity<ResponseDTO> Homepage(@RequestHeader(value="Authorisation", required = false) String token ){
        if(token!=null && userpage.authenticate(token)){
        ResponseDTO response= userpage.message("success","","This is the user specific home page");
        return ResponseEntity.ok(response);
        }

        throw new ErrorDTOException("No token found or authorisation failure",null,ResObj);

    }


    @Override
    public String description() {
        return "Returns User Home Page when authenticated";
    }

    @Override
    public String changesInfo() {
        return "Initial version";
    }
}
