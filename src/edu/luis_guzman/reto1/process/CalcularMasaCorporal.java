package edu.luis_guzman.reto1.process;
public class CalcularMasaCorporal {
    public static double calcularIMC(double peso, double estatura) {
        double estaturaMetros = estatura / 100;
        return peso / (estaturaMetros * estaturaMetros);
    }

    public static String Codicion_De_IMC(double imc) {
        if (imc < 18.5) {
            return "Peso bajo";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidad leve";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidad media";
        } else {
            return "Obesidad mórbida";
        }
    }

    public static double calcularMasaCorporalMagra(double peso, double estatura, String sexo) {
        double estaturaMetros = estatura / 100;
        double masaMagra;
        if (sexo.equalsIgnoreCase("mujer")) {
            masaMagra = (1.07 * peso) - (148 * (peso * peso) / (estaturaMetros * estaturaMetros));
        } else {
            masaMagra = (1.10 * peso) - (128 * (peso * peso) / (estaturaMetros * estaturaMetros));
        }
        return masaMagra;
    }

    public static double calcularMetabolismoBasal(double peso, double estatura, int edad, String sexo) {
        double geb;
        if (sexo.equalsIgnoreCase("mujer")) {
            geb = 655.1 + (9.563 * peso) + (1.85 * estatura) - (4.676 * edad);
        } else {
            geb = 66.5 + (13.75 * peso) + (5.003 * estatura) - (6.775 * edad);
        }
        return geb;
    }
}
