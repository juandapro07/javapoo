package com.example;

public class Main {

    public static void main(String[] args) {

        // PRUEBA DE CUENTA BANCARIA
   
        Cuentabancaria cuenta = new Cuentabancaria("Juan Daniel", 500000);

        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        cuenta.depositar(200000);
        System.out.println("Saldo después de depositar: " + cuenta.getSaldo());

        cuenta.retirar(100000);
        System.out.println("Saldo después de retirar: " + cuenta.getSaldo());

        System.out.println("-----------------------------");
        
        // PRUEBA DE ESTUDIANTE
       
        Estudiante estudiante1 = new Estudiante("Carlos", 20, 3.5);

        estudiante1.mostrarInfo();

        System.out.println("-----------------------------");
      
        // PRUEBA DE LIBRO
        
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez");
        Libro libro3 = new Libro("El principito", "Antoine de Saint Exupery", 120);

        libro1.mostrarDetalles();
        libro2.mostrarDetalles();
        libro3.mostrarDetalles();

    }
}