package com.mycompany.ExamenDiLuis;

public class Persona {

    private String nombre;
    private String sexo;
    private Integer edad;
    private Double peso;
    private Integer altura;
    private String actividad;
    private Float ger;
    private Float get;

    public Persona(String nombre, String sexo, Integer edad, Double peso, Integer altura, String actividad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.actividad = actividad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public Float getGer() {
        return ger;
    }

    public void setGer(Float ger) {
        this.ger = ger;
    }

    public double getGet() {
        return calculadoraGer();
    }

    public void setGet(Float get) {
        this.get = get;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", altura=" + altura +
                ", actividad='" + actividad + '\'' +
                ", ger=" + ger +
                ", get=" + get +
                '}';
    }

    public double calculadoraGer() {
        double ger = 0;
        if (this.sexo.equals("Hombre")) {
            ger = 88.36 + (13.4 * this.peso) + (4.8 * this.altura) - (5.7 * this.edad);
        } else if (this.sexo.equals("Mujer")) {
            ger = 447.6 + (9.2 * this.peso) + (3.1 * this.altura) - (4.3 * this.edad);
        }
        return ger;
    }

}
