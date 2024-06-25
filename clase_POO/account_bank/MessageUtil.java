package clase_POO.account_bank;

import java.util.Timer;

public class MessageUtil {

    public static void showOptions(String headline) {
        System.out.println("Hola, " + headline + "...");
        System.out.println("");

        System.out.println("Selecciona una opción: ");
        System.out.println("1. Depositar");
        System.out.println("2. Retirar");
        System.out.println("3. Ver saldo");
        System.out.println("4. Salir");
        System.out.println("");

        System.out.print("Digita una opción: ");

    }

    public static void showRequerimentsForAccount() {
        System.out.print("\n \n \n");
        System.out.println("Error: No tiene una cuenta asociada.");
        System.out.print("\n");

        System.out.print(
                "Para crear su cuenta por favor digite el nombre completo de quien será el titular de la cuenta: ");

    }

    public static void accountCreated() {
        System.out.print("\n \n");
        System.out.println("----------SUCCESS---------");
        System.out.println("| Cuenta creada con exito |");
        System.out.println("|_________________________|");
        System.out.print("\n \n");
    }

    public static void ammountOperation() {
        System.out.print("Digita el monto de la operación: ");
    }

    public static void operationDeposit() {
        System.out.print("\n \n");

        System.out.print("Ejecutando operación de deposito");

        messageWaiting();
    }

    public static void operationWithdraw() {
        System.out.print("\n \n");

        System.out.print("Ejecutando operación de retiro");

        messageWaiting();
    }

    public static void operationViewBalance(String headline) {
        System.out.print("\n \n");

        System.out.print("Consultando el balance de cuenta de: " + headline);

        messageWaiting();
    }

    public static void operationClose() {
        System.out.print("\n \n");

        System.out.print("Cerrando su cuenta y dejando sus datos a salvo");

        messageWaiting();
    }

    public static void showBalance(double balance) {
        System.out.print("\n \n");
        System.out.println("--------------SUCCESS------------");
        System.out.println("|El balance de su cuenta es: $" + balance );
        System.out.println("|________________________________");
        System.out.print("\n \n");
    }

    private static void messageWaiting() {
        for (int i = 0; i <= 15; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.print("\n \n");
    }

    public static void fundsInsufficient() {
        System.out.println("----------------------WARNING----------------------");
        System.out.println("| Fondos insuficientes para ejecutar la operación |");
        System.out.println("|_________________________________________________|");
        System.out.print("\n \n");
    }

    public static void operationSuccess() {
        System.out.println("--------------SUCCESS------------");
        System.out.println("| Operación realizada con exíto |");
        System.out.println("|_______________________________|");

        System.out.print("\n \n");
    }

    public static void closeApp() {
        System.out.println("----------SUCCESS---------");
        System.out.println("| Fue un placer servirte |");
        System.out.println("|________________________|");
        System.out.print("\n \n");
    }

    public static void operationCancel() {
        System.out.println("---------ERROR---------");
        System.out.println("| Operación cancelada |");
        System.out.println("|_____________________|");
        System.out.print("\n \n");
    }

    public static void operationNotValid() {
        System.out.println(".");
        System.out.println("----------------------ERROR-------------------");
        System.out.println("| Opción no válida, digite una opción válida |");
        System.out.println("|____________________________________________|");
        System.out.print("\n \n");
    }

    public static void valueNotValid() {
        System.out.println("---------------ERROR---------------");
        System.out.println("| La operación debe ser mayor a 0 |");
        System.out.println("|_________________________________|");
        System.out.print("\n \n");

    }
}
