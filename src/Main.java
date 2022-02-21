import com.umg.data.structures.LinkedList.SinglyLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    // Create Java Scanner
        Scanner scan = new Scanner(System.in);

        Menu menuInicial = new Menu();
        menuInicial.operacion();

        // capturando los datos del usuario
        System.out.print("\n   Ingresa el número de operación: ");
        int op = scan.nextInt();

        System.out.println("La operación digitada es " + op);

        switch (op) {
            case 1:
                SinglyLinkedList listHead = new SinglyLinkedList<>();
                listHead.insertAtHead();
                break;

            case 2:
                break;

            case 3:
                break;


            case 4:
                break;

            case 5:
                break;

            default:
                System.out.println("Error 404: La opción elegida no existe.");
                break;
        }
    }
}
