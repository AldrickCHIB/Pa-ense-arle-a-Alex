package com.example.demo.Controllers.dto;

import com.example.demo.Models.Enterprise;
import lombok.Data;

@Data
public class EnterpriseDto {

    private Long id;
    private String razonSocial;
    private String rfc;
    private String telefono;
    private String contacto;
    private String correo;

    // Constructor vacío
    public EnterpriseDto() {}

    // Constructor que convierte la entidad Enterprise a EnterpriseDto
    public EnterpriseDto(Enterprise enterprise) {
        this.id = enterprise.getId();
        this.razonSocial = enterprise.getRazonSocial();
        this.rfc = enterprise.getRfc();
        this.telefono = enterprise.getTelefono();
        this.contacto = enterprise.getContacto();
        this.correo = enterprise.getCorreo();
    }

    // Método que convierte el DTO de nuevo a la entidad Enterprise
    public Enterprise toEntity() {
        return new Enterprise(null, razonSocial, rfc, telefono, contacto, correo);
    }
}
