package com.example.demo.Service;


import com.example.demo.Config.exceptions.ApiResponse;
import com.example.demo.Models.Enterprise;
import com.example.demo.Models.EnterpriseRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseService {

    @Autowired
    private EnterpriseRepository enterpriseRepository;

    public ApiResponse registerEnterprise(Enterprise enterprise1) {
        // Guardar la empresa
        enterprise1 = enterpriseRepository.save(enterprise1);

        // Retornar la respuesta con la ApiResponse
        return new ApiResponse("Empresa registrada correctamente", false, HttpStatus.OK, enterprise1);
    }
}


