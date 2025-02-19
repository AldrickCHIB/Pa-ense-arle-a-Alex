package com.example.demo.Controllers;

import com.example.demo.Config.exceptions.ApiResponse;
import com.example.demo.Controllers.dto.EnterpriseDto;
import com.example.demo.Service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/enterprise")
@CrossOrigin({"*"})
public class EnterpriseController {

    @Autowired
    private EnterpriseService enterpriseService;

    @GetMapping("/all")
    public ResponseEntity<ApiResponse> getAllEnterprises() {
        return enterpriseService.getAllEnterprises();
    }

    @PostMapping("/register")
    public ResponseEntity<ApiResponse> registerEnterprise(@RequestBody EnterpriseDto enterprise) {
//        System.err.println(enterprise.getRazonSocial());
        // Llamamos al servicio, que devuelve un ApiResponse
        return enterpriseService.registerEnterprise(enterprise.toEntity());
    }

    @GetMapping("/uuid/{uuid}")
    public ResponseEntity<ApiResponse> getEnterpriseByUuid(@PathVariable UUID uuid) {
        return enterpriseService.getEnterpriseByUuid(uuid);
    }
}

