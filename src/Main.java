import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double peso;
        double estatura;
        double IMC;
        System.out.println("Digite Peso");
        peso = lector.nextDouble();
        System.out.println("Digite Estatura");
        estatura = lector.nextDouble();
        IMC = peso/(estatura*estatura);
        System.out.println("El indice de masa corporal es: "+IMC);
        if (IMC<=18.5){
            System.out.println("Peso Bajo");}
        if (IMC>=18.5 && IMC<=24.9){
            System.out.println("Peso Normal");
        }
        if (IMC>=25 && IMC<=26.9){
            System.out.println("Sobrepeso grado 1");
        }
        if (IMC>=27 && IMC<=29.9){
            System.out.println("Sobrepeso grado 2");
        }
        if (IMC>=30 && IMC<=34.9){
            System.out.println("Obesidad Tipo 1");
        }
        if (IMC>=35 && IMC<=39.9){
            System.out.println("Obesidad Tipo 2");
        }
        if (IMC>=40 && IMC<=49.9){
            System.out.println("Obesidad morbida");
        }
        if (IMC>=50){
            System.out.println("Obesidad extrema");
        }
    }

        }

