package com.example;

public class CuentaBancaria {
     // Atributos privados (encapsulamiento)
    private String titular;
    private double saldo;

    // Constructor
    public  CuentaBancaria(String titular, double saldoInicial){
        this.titular = titular;

        // Validación: si el saldo inicial es menor que 0, se asigna 0
        if (saldoInicial < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }
    }

    // Getter del titular
    public String getTitular() {
        return titular;
    }

    // Setter del titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // SOLO getter del saldo (NO setter)
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("Error: La cantidad debe ser mayor que 0.");
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (saldo >= cantidad) {
                saldo -= cantidad;
            } else {
                System.out.println("Error: Fondos insuficientes.");
            }
        } else {
            System.out.println("Error: La cantidad debe ser mayor que 0.");
        }
    }

}


