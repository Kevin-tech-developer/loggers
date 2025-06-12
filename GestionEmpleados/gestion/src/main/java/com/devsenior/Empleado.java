package com.devsenior;

import org.apache.logging.log4j.LogManager;//import de las librerias para el logger
import org.apache.logging.log4j.Logger;

public class Empleado {
    //indicacion de donde va a trabajar el logger
    private static final Logger logger = LogManager.getLogger(Empleado.class);
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;

        if(edad <18){
            logger.warn("Creando un empleado menor de edad: {} ({}años)",nombre, edad);
        }
    }

    public void aumentarSalario(double cantidad){
        if(cantidad <=0){
            logger.warn("intento de aumento no positivo (${}) para {}",cantidad, nombre);
            return;
        }
        double salarioAnterior = salario;
        this.salario +=cantidad;
        logger.debug("salario de {} paso de ${} a ${}",nombre, salarioAnterior, salario);
    }

    @Override
    public String toString(){//metodo de como se muestra el empleado
        return "empleado{"+
        "nombre= "+nombre+"\n"+
        ", edad= "+edad+
        ", salario= "+ salario+"}"; 
    }
    
}
