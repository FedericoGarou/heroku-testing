package ar.com.pollo.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolloController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam String name) {
        return "Hola"+name;
    }
}