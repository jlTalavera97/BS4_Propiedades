package com.example.BS4_Propiedades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VarController {

    @Autowired
    VarControllerImpl varControllerImpl;

    @GetMapping("/valores/{valor}")
    public String returnValue(@PathVariable String valor) {
        return varControllerImpl.returnValue(valor);
    }

}
