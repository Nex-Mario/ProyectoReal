/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import entidades.*;
import java.time.LocalDate;
import logica.*;

public class VistaConsola {
    
    
    
    public void muestraMenu(){
        System.out.println("**********************");
        System.out.println("    [ Cooperator ]    ");
        System.out.println("**********************");
        System.out.println("   [Iniciar sesión]   ");
        System.out.println("---------------------------");
        System.out.println(" ¿Como desea a iniciar sesión? ");
        System.out.println(" 1. Administrador ");
        System.out.println(" 2. Conductor ");
        System.out.println(" 3. Usuario ");
        System.out.println(" 4. Salir del programa \n ");
    }
    
    public void ejecutarMenu() {
        int op;
        do {
            this.muestraMenu();
            op = LectorDatos.leerInt("Seleccione una opcion");
            switch (op) {
                case 1:
                    //this.();
                    break;
                case 2:
                    //this.();
                    break;
                case 3:
                    //this.();
                    break;
                case 4:
                    System.out.println("Ha sido un placer, cerrando programa...");
                    break;
                default:
                    System.out.println("!! Opcion no valida ¡¡\n");

            }

        } while (op != 4);

    }
}
