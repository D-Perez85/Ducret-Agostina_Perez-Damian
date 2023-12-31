package com.backend.clinicaodontologica.dto.entrada.odontologo;
import javax.validation.constraints.*;

public class OdontologoEntradaDto {

    @NotNull(message = "La matricula del odontologo no puede ser nulo")
    @NotBlank(message = "Debe especificarse la matricula del odontologo")
    @Size(max = 50, message = "La matricula puede tener hasta 50 caracteres")
    private String matricula;

    @NotNull(message = "El nombre del odontologo no puede ser nulo")
    @NotBlank(message = "Debe especificarse el nombre del odontologo")
    @Size(max = 50, message = "El nombre puede tener hasta 50 caracteres")
    private String nombre;

    @NotNull(message = "El apellido del odontologo no puede ser nulo")
    @NotBlank(message = "Debe especificarse el nombre del apellido")
    @Size(max = 50, message = "El apellido puede tener hasta 50 caracteres")
    private String apellido;


    public OdontologoEntradaDto(String matricula, String nombre, String apellido) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public OdontologoEntradaDto(){};


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


 }
