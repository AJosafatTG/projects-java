package org.example;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);

        //Variables para las unidades de medida
        float MM; //Milimetros
        float CM; //Centimetros
        float M; //Metros
        float KM; //Kilometros
        float IN; //Pulgadas
        float FT; //Pies
        float YD; //Yardas
        float MI; //Millas
        float u; //Unidad
        int num;

        System.out.println("Conversor de Unidades");
        System.out.println("*****-----MENU-----*****");
        System.out.println("(1). Milimetros (mm).");
        System.out.println("(2). Centimetros (cm).");
        System.out.println("(3). Metros (m).");
        System.out.println("(4). Kilometros (km).");
        System.out.println("(5). Pulgadas (in).");
        System.out.println("(6). Pies (ft).");
        System.out.println("(7). Yardas (yd).");
        System.out.println("(8). Millas (mi).");
        System.out.println("(0). Salir...");
        System.out.println("Seleccione una opcion:");
        num = op.nextInt();

        switch (num){

            case 1:
                System.out.println("Medidas en milimetros (mm):");
                System.out.println("Ingresar el valor:");
                u = op.nextFloat();
                CM = (float) (u * 0.1);
                M = (float) (u * 0.001);
                KM = (float) (u * 0.000001);
                IN = (float) (u * 0.03937);
                FT = (float) (u * 0.00328084);
                YD = (float) (u * 0.00328084);
                MI = (float) (u * 0.0000006);
                System.out.println( "El resultado es: " + CM + " cm" +  " (Centimetros).");
                System.out.println( "El resultado es: " + M + " m" +  " (Metros).");
                System.out.println( "El resultado es: " + KM + " km" +  " (Kilometros).");
                System.out.println( "El resultado es: " + IN + " in" +  " (Pulgadas).");
                System.out.println( "El resultado es: " + FT + " ft" +  " (Pies).");
                System.out.println( "El resultado es: " + YD + " yd" +  " (Yardas).");
                System.out.println( "El resultado es: " + MI + " mi" +  " (Millas).");
            break;
            case 2:
                System.out.println("Medidas en centimetros (cm):");
                System.out.println("Ingresar el valor:");
                u = op.nextFloat();
                MM =  u * 10;
                M = (float) (u * 0.01);
                KM = (float) (u * 0.00001);
                IN = (float) (u * 0.393701);
                FT = (float) (u * 0.032808);
                YD = (float) (u * 0.010936);
                MI = (float) (u * 0.0000062137);
                System.out.println( "El resultado es: " + MM + " mm" +  " (Milimetros).");
                System.out.println( "El resultado es: " + M + " m" +  " (Metros).");
                System.out.println( "El resultado es: " + KM + " km" +  " (Kilometros).");
                System.out.println( "El resultado es: " + IN + " in" +  " (Pulgadas).");
                System.out.println( "El resultado es: " + FT + " ft" +  " (Pies).");
                System.out.println( "El resultado es: " + YD + " yd" +  " (Yardas).");
                System.out.println( "El resultado es: " + MI + " mi" +  " (Millas).");
            break;
            case 3:
                System.out.println("Medidas en metros (m):");
                System.out.println("Ingresar el valor:");
                u = op.nextFloat();
                MM = u * 1000;
                CM = u * 100;
                KM = (float) (u * 0.001);
                IN = (float) (u * 39.3701);
                FT = (float) (u * 3.2808);
                YD = (float) (u * 1.0936);
                MI = (float) (u * 0.00062137);
                System.out.println( "El resultado es: " + MM + " mm" +  " (Milimetros).");
                System.out.println( "El resultado es: " + CM + " cm" +  " (Centimetros).");
                System.out.println( "El resultado es: " + KM + " km" +  " (Kilometros).");
                System.out.println( "El resultado es: " + IN + " in" +  " (Pulgadas).");
                System.out.println( "El resultado es: " + FT + " ft" +  " (Pies).");
                System.out.println( "El resultado es: " + YD + " yd" +  " (Yardas).");
                System.out.println( "El resultado es: " + MI + " mi" +  " (Millas).");
            break;
            case 4:
                System.out.println("Medidas en kilometros (km):");
                System.out.println("Ingresar el valor:");
                u = op.nextFloat();
                MM =  u * 1000000;
                CM = u * 100000;
                M = u * 1000;
                IN = (float) (u * 39370.08);
                FT = (float) (u * 3280.84);
                YD = (float) (u * 1093.61);
                MI = (float) (u * 0.621371);
                System.out.println( "El resultado es: " + MM + " mm" +  " (Milimetros).");
                System.out.println( "El resultado es: " + CM + " cm" +  " (Centimetros).");
                System.out.println( "El resultado es: " + M + " m" +  " (Metros).");
                System.out.println( "El resultado es: " + IN + " in" +  " (Pulgadas).");
                System.out.println( "El resultado es: " + FT + " ft" +  " (Pies).");
                System.out.println( "El resultado es: " + YD + " yd" +  " (Yardas).");
                System.out.println( "El resultado es: " + MI + " mi" +  " (Millas).");
            break;
            case 5:
                System.out.println("Medidas en pulgadas (in):");
                System.out.println("Ingresar el valor:");
                u = op.nextFloat();
                MM =  (float) (u * 25.4);
                CM = (float) (u * 2.54);
                M = (float) (u * 0.0254);
                KM = (float) (u * 0.0000254);
                FT = (float) (u * 0.083333);
                YD = (float) (u * 0.027778);
                MI = (float) (u * 0.0000157828);
                System.out.println( "El resultado es: " + MM + " mm" +  " (Milimetros).");
                System.out.println( "El resultado es: " + CM + " cm" +  " (Metros).");
                System.out.println( "El resultado es: " + M + " m" +  " (Kilometros).");
                System.out.println( "El resultado es: " + KM + " km" +  " (Pulgadas).");
                System.out.println( "El resultado es: " + FT + " ft" +  " (Pies).");
                System.out.println( "El resultado es: " + YD + " yd" +  " (Yardas).");
                System.out.println( "El resultado es: " + MI + " mi" +  " (Millas).");
            break;
            case 6:
                System.out.println("Medidas en pies (ft):");
                System.out.println("Ingresar el valor:");
                u = op.nextFloat();
                MM =  (float) (u * 304.8);
                CM = (float) (u * 30.48);
                M = (float) (u * 0.3048);
                KM = (float) (u * 0.0003048);
                IN = u * 12;
                YD = (float) (u * 0.333333);
                MI = (float) (u * 0.00018939);
                System.out.println( "El resultado es: " + MM + " mm" +  " (Milimetros).");
                System.out.println( "El resultado es: " + CM + " cm" +  " (Metros).");
                System.out.println( "El resultado es: " + M + " m" +  " (Kilometros).");
                System.out.println( "El resultado es: " + KM + " km" +  " (Pulgadas).");
                System.out.println( "El resultado es: " + IN + " in" +  " (Pies).");
                System.out.println( "El resultado es: " + YD + " yd" +  " (Yardas).");
                System.out.println( "El resultado es: " + MI + " mi" +  " (Millas).");
            break;
            case 7:
                System.out.println("Medidas en yardas (yd):");
                System.out.println("Ingresar el valor:");
                u = op.nextFloat();
                MM =  (float) (u * 914.4);
                CM = (float) (u * 91.44);
                M = (float) (u * 0.9144);
                KM = (float) (u * 0.0009144);
                IN = u * 36;
                FT =  u * 3;
                MI = (float) (u * 0.00056818);
                System.out.println( "El resultado es: " + MM + " mm" +  " (Milimetros).");
                System.out.println( "El resultado es: " + CM + " cm" +  " (Metros).");
                System.out.println( "El resultado es: " + M + " m" +  " (Kilometros).");
                System.out.println( "El resultado es: " + KM + " km" +  " (Pulgadas).");
                System.out.println( "El resultado es: " + IN + " in" +  " (Pies).");
                System.out.println( "El resultado es: " + FT + " ft" +  " (Yardas).");
                System.out.println( "El resultado es: " + MI + " mi" +  " (Millas).");
            break;
            case 8:
                System.out.println("Medidas en millas (mi):");
                System.out.println("Ingresar el valor:");
                u = op.nextFloat();
                MM =  u * 1609344;
                CM = (float) (u * 160934.4);
                M = (float) (u * 1609.34);
                KM = (float) (u * 1.6093);
                IN = u * 63360;
                FT =  u * 5280;
                YD = u * 1760;
                System.out.println( "El resultado es: " + MM + " mm" +  " (Milimetros).");
                System.out.println( "El resultado es: " + CM + " cm" +  " (Metros).");
                System.out.println( "El resultado es: " + M + " m" +  " (Kilometros).");
                System.out.println( "El resultado es: " + KM + " km" +  " (Pulgadas).");
                System.out.println( "El resultado es: " + IN + " in" +  " (Pies).");
                System.out.println( "El resultado es: " + FT + " ft" +  " (Yardas).");
                System.out.println( "El resultado es: " + YD + " yd" +  " (Millas).");

            default:
                System.out.println("Ejecucion finalizada!");
            break;
        }
    }
}