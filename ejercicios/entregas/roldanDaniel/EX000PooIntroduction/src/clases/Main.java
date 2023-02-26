/*
@Autor: Daniel Roldán
@ Fecha : 25/02/2023
@Objetivo: Entrega primer ejercicio Asig. Progra2
*/

package clases;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //mensaje de bienvenida
        System.out.println(LocalDate.now()+" Welcome to WorldBankSpanish");

        // Creating Account
        BankAccount account = new BankAccount("Daniel",0);

        //Message < Account created successfully >
        account.msgAccount();

        //Add amount 1
        System.out.println(LocalDate.now().plusDays(2));
        account.deposit(1000) ;
        System.out.println("");

        //Money withdrawal
        System.out.println(LocalDate.now().plusDays(3));
        account.withdrawal(150.50);
        System.out.println("");

        //Add amount 2
        System.out.println(LocalDate.now().plusDays(10));
        account.deposit(350) ;
        System.out.println("");

        //Money withdrawal 2
        System.out.println(LocalDate.now().plusDays(15));
        account.withdrawal(1200);
        System.out.println("");

    }

}