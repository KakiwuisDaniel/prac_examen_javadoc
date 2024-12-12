package calculadora;

import java.util.ArrayList;
import java.util.Scanner;
//comentarios javadoc

/**
 * Clase que representa una calculadora básica con historial de operaciones.
 * Proporciona operaciones de suma, resta, multiplicación, división y potencia.
 * También permite ver y limpiar el historial.
 * @version 1.0
 * @author Marianito
 */
public class Calculadora {

    private ArrayList<String> historial;

    /**
     * Constructor de la clase Calculadora.
     * Inicializa el historial de operaciones.
     */
    public Calculadora() {
        historial = new ArrayList<>();
    }

    /**
     * Suma dos números enteros.
     *
     * @param a el primer número
     * @param b el segundo número
     * @return el resultado de la suma
     */
    public int sumar(int a, int b) {
        int resultado = a + b;
        historial.add("Suma: " + a + " + " + b + " = " + resultado);
        return resultado;
    }

    /**
     * Resta dos números enteros.
     *
     * @param a el minuendo
     * @param b el sustraendo
     * @return el resultado de la resta
     */
    public int restar(int a, int b) {
        int resultado = a - b;
        historial.add("Resta: " + a + " - " + b + " = " + resultado);
        return resultado;
    }

    /**
     * Multiplica dos números enteros.
     *
     * @param a el primer número
     * @param b el segundo número
     * @return el resultado de la multiplicación
     */
    public int multiplicar(int a, int b) {
        int resultado = a * b;
        historial.add("Multiplicación: " + a + " * " + b + " = " + resultado);
        return resultado;
    }

    /**
     * Divide dos números enteros.
     *
     * @param a el dividendo
     * @param b el divisor
     * @return el resultado de la división
     * @throws ArithmeticException si el divisor es cero
     */
    public double dividir(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        double resultado = (double) a / b;
        historial.add("División: " + a + " / " + b + " = " + resultado);
        return resultado;
    }

    /**
     * Calcula la potencia de un número base elevado a un exponente.
     *
     * @param base el número base
     * @param exponente el exponente
     * @return el resultado de la potencia
     * @throws IllegalArgumentException si el exponente es negativo
     */
    public double potencia(int base, int exponente) throws IllegalArgumentException {
        if (exponente < 0) {
            throw new IllegalArgumentException("El exponente no puede ser negativo.");
        }
        double resultado = Math.pow(base, exponente);
        historial.add("Potencia: " + base + " ^ " + exponente + " = " + resultado);
        return resultado;
    }

    /**
     * Devuelve el historial de operaciones realizadas.
     *
     * @return una lista con las operaciones realizadas
     */
    public ArrayList<String> verHistorial() {
        return historial;
    }

    /**
     * Limpia el historial de operaciones.
     */
    public void limpiarHistorial() {
        historial.clear();
        System.out.println("El historial ha sido limpiado.");
    }

    public static void main(String[] args) {
        // Código principal de la aplicación
    }
}
