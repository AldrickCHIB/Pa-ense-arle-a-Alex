package com.example.demo.Service;


import com.example.demo.Config.exceptions.ApiResponse;
import com.example.demo.Models.Enterprise;
import com.example.demo.Models.EnterpriseRepository;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Service
public class EnterpriseService {

    @Autowired
    private EnterpriseRepository enterpriseRepository;

    public ResponseEntity<ApiResponse> registerEnterprise(Enterprise enterprise1) {
        // Guardar la empresa
        enterprise1 = enterpriseRepository.save(enterprise1);

        // Retornar la respuesta con la ApiResponse
//        System.err.println("antes de la response");
        return new ResponseEntity<>(new ApiResponse("Empresa registrada correctamente", false, HttpStatus.OK, enterprise1), HttpStatus.OK);
    }

    public ResponseEntity<ApiResponse> getAllEnterprises() {
        // Obtener todas las empresas
        List<Enterprise> enterprises = enterpriseRepository.findAll();
//        System.out.println(enterprises);
        // Retornar la respuesta con la ApiResponse
        return new ResponseEntity<>(new ApiResponse("Empresas obtenidas correctamente", false, HttpStatus.OK, enterprises), HttpStatus.OK);
    }

    public ResponseEntity<ApiResponse> getEnterpriseByUuid(UUID uuid) {
        // Buscar la empresa por uuid
        Enterprise enterprise = enterpriseRepository.findByUuid(uuid).orElse(null);

        if (enterprise == null) {
            return new ResponseEntity<>(new ApiResponse("Empresa no encontrada", true, HttpStatus.NOT_FOUND, null), HttpStatus.NOT_FOUND);
        }

        // Retornar la respuesta con la ApiResponse
        return new ResponseEntity<>(new ApiResponse("Empresa obtenida correctamente", false, HttpStatus.OK, enterprise), HttpStatus.OK);
    }
}


