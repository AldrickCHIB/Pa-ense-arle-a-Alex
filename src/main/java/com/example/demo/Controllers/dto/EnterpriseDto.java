package com.example.demo.Controllers.dto;

import com.example.demo.Models.Enterprise;
import lombok.Data;

import java.util.UUID;

@Data
public class EnterpriseDto {

    private Long id;
    private UUID uuid;  // Agregar el campo uuid
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
        this.uuid = enterprise.getUuid();
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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
