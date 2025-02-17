package com.example.demo.Controllers;

import com.example.demo.Config.exceptions.ApiResponse;
import com.example.demo.Controllers.dto.EnterpriseDto;
import com.example.demo.Service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/enterprise")
public class EnterpriseController {

    @Autowired
    private EnterpriseService enterpriseService;

    @PostMapping("/register")
    public ResponseEntity<ApiResponse> registerEnterprise(@RequestBody EnterpriseDto enterprise) {
        System.err.println(enterprise.getRazonSocial());
        // Llamamos al servicio, que devuelve un ApiResponse
        return enterpriseService.registerEnterprise(enterprise.toEntity());
    }
}

