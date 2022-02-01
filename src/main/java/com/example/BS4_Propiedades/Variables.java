package com.example.BS4_Propiedades;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Variables {

    @Value("${VAR1}")
    private String VAR1;

    @Value("${My.VAR2}")
    private String MyVAR2;
}
