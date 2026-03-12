package com.example;

public class Estudiante {

    // Atributos privados
    private String nombre;
    private int edad;
    private double promedio;

    // Constructor vacío (valores por defecto)
    public Estudiante() {
        this.nombre = "";
        this.edad = 0;
        this.promedio = 0.0;
    }

    // Constructor completo
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        setEdad(edad); // usamos el setter para validar
        this.promedio = promedio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe ser mayor que 0.");
        }
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // Método que retorna boolean
    public boolean haAprobado() {
        return promedio >= 3.0;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);

        if (haAprobado()) {
            System.out.println("Estado: Aprobó");
        } else {
            System.out.println("Estado: No aprobó");
        }
    }

}

}
