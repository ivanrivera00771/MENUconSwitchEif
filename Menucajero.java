package menucajero;

import java.util.Scanner;

public class Menucajero {

    public static void main(String[] args) {
        //HACER UNPROGRAMA QUE SIMULE UN CAJERO
        //AUTOMATICO CON UN SALDO INICIAL DE 1000
        //DOLARES CON EL SIGUIETNE MENU DE OPCIONES:
        //1 INGRESAR DINERO A LA CUENTA
        //2 RETIRAR DINERO DELA CUENTA
        //3 SALIR

        final int saldo_inicial = 1000;
        int opcion;
        float ingreso;
        float saldo_actual;
        float retiro;

        Scanner entrada = new Scanner(System.in);
        System.out.println("BIENVENIDO A SU CAJERO AUTOMATICO \n"
                + "1. INGRESAR DINERO A LA CUENTA\n"
                + "2. RETIRAR DINERO DE LA CUENTA\n"
                + "3. SALIR");
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("CUANTO DINERO DESEA DEPOSITAR?");
                ingreso = entrada.nextFloat();
                saldo_actual = saldo_inicial + ingreso;
                System.out.println("SU SALDO ACTUAL ES DE :\n " + saldo_actual);
                break;
            case 2:
                System.out.println("CUANTO DINERO DESEA RETIRAR\n" + "SOLO PUEDE RETIRAR UNA CANTIDAD MENOR A 1000");
                retiro = entrada.nextFloat();
                if (retiro > saldo_inicial) {
                    System.out.println("LA CANTIDAD QUE DESEA RETIRAR EXEDE AL SALDO INICIAL");

                } else {
                    saldo_actual = saldo_inicial - retiro;
                    System.out.println("LA CANTIDAD RETIRADA DE :" + retiro + "FUE EXITOSA \n"
                            + "Y SU SALDO ACTUAL ES DE : " + saldo_actual);

                }
                break;
            case 3:
                break;
            default:
                System.out.println("SE EQUIVOCO DE OPCION, PORFAVOR DIGITA EL CORRECTO");

        }

    }

}
