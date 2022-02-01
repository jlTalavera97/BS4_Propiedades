package com.example.BS4_Propiedades;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VarControllerImpl {

    @Autowired
    Variables variables;

    public String returnValue(String valor){

        String var;

        if(valor.equals("VAR1")){
            var = variables.getVAR1();
        }else if(valor.equals("My.VAR2")){
            var = variables.getMyVAR2();
        }else{
            var = valor+" no tiene valor";
        }
        return var;
    }
}
