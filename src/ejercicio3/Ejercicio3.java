/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        String nombre = null;
        String apellido = null;
        String telefono = null;
        Busquedas buscar = new Busquedas();
        Scanner teclado = new Scanner(System.in);
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        int option;
        option = 0;
        
        
        do{
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar por nombre");
            System.out.println("3. Buscar por apellido");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Imprimir todos los contactos");
            System.out.println("6. SALIR");
            option = teclado.nextInt();
            switch(option){
                case 1:
                    teclado.nextLine();
                    System.out.print("Ingrese el nombre: ");
                    nombre = teclado.nextLine();
                    System.out.println("");
                    System.out.print("Ingrese el apellido: ");
                    apellido = teclado.nextLine();
                    System.out.println("");
                    System.out.print("Ingrese el numero telefonico: ");
                    telefono = teclado.nextLine();
                    System.out.println("");
                    listaPersonas.add(new Persona(nombre,apellido,telefono));
                    break;
                case 2:
                    System.out.print("Ingrese nombre a buscar: ");
                    teclado.nextLine();
                    nombre = teclado.nextLine();
                    buscar.buscarPorNombre(nombre, listaPersonas);
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("Ingrese apellido a buscar: ");
                    teclado.nextLine();
                    apellido = teclado.nextLine();
                    buscar.buscarPorApellido(apellido, listaPersonas);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del contacto a eliminar: ");
                    teclado.nextLine();
                    nombre=teclado.nextLine();
                    buscar.eliminarContacto(nombre, listaPersonas);
                    break;
                case 5:
                    
                    for(int i=0;i < listaPersonas.size();i++){
                        System.out.println("Persona #"+i+1);
                        System.out.println("Nombre: "+listaPersonas.get(i).getNombre());
                        System.out.println("Apellido: "+listaPersonas.get(i).getApellido());
                        System.out.println("Telefono: "+listaPersonas.get(i).getTelefono());
                        System.out.println("");
                    }
                    break;      
                case 6:
                    break;
            }        
        }while(option<6);
    }
    
}
