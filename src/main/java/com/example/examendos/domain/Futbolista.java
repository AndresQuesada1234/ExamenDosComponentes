package com.example.examendos.domain;

import javax.persistence.*;

@Entity
@Table
public class Futbolista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nombre;
    @Column
    private String apellido1;
    @Column
    private String apellido2;
    @Column
    private String nacimiento;
    @Column
    private String posicion;
    @Column
    private double estatura;
    @Column
    private double peso;
    @Column
    private char rama;
    @Column
    private int telefono;
    @Column
    private String direccion;
    @Column
    private double imc;


    //GETTERS
    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public String getPosicion() {
        return posicion;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }

    public char getRama() {
        return rama;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getImc() {
        return imc;
    }

    //SETTERS

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setRama(char rama) {
        this.rama = rama;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
}
