package com.devsenior;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Iniciando el programa de gestion de empleados");

        Empleado empleado = new Empleado("juan", 25, 3000);
        Gerente gerente = new Gerente("Ana", 35, 5000, null);

        //mostar informacion
        logger.info("informacion de empleado creado: "+empleado);
        logger.info("informacion del gerente: "+gerente);

        empleado.aumentarSalario(500);
        gerente.aumentarSalario(1000);

        logger.info("despues del aumento...");
        logger.info("informacion empleado: "+empleado);
        logger.info("informacion del gerente: "+gerente);

        logger.info("programa finalizado");
        logger.trace("este es un mensaje trace");
        logger.debug("este es un mensaje debug");
        logger.warn("este es un mensaje warn");
        logger.error("este es un mensaje Error");
        logger.fatal("este es un mensaje fatal");
    }
}