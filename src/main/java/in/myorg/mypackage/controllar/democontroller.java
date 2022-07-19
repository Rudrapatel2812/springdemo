package in.myorg.mypackage.controllar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController

public class democontroller {
    @GetMapping("/")
    public String welcomeMessage(){
        return "welcome Rudra";
    }
    @GetMapping("/getDate")
    public Date getdate(){
        return new Date();
    }
}
