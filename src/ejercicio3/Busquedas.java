/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public class Busquedas {

    public Busquedas() {
    }
    
    /**
     *
     * @param nombre
     * @param listaPersona
     */
    public void buscarPorNombre(String nombre,ArrayList<Persona>listaPersona){
        boolean encontrado=FALSE;
        int iterador=0;
        do{
            if(listaPersona.get(iterador).getNombre().equals(nombre)){
                encontrado = TRUE;
                System.out.println("Nombre: "+listaPersona.get(iterador).getNombre());
                System.out.println("Apellido: "+listaPersona.get(iterador).getApellido());
                System.out.println("Telefono: "+listaPersona.get(iterador).getTelefono());
            }else{
                iterador = iterador + 1;
            }
          }while((!encontrado)&&(iterador<listaPersona.size()));
        
        if(!encontrado){
            System.out.println("El usuario no existe");
        }
    }
    
    public void buscarPorApellido(String apellido,ArrayList<Persona>listaPersona){
        boolean encontrado=FALSE;
        int iterador=0;
        do{
            if(listaPersona.get(iterador).getApellido().equals(apellido)){
                encontrado = TRUE;
                System.out.println("Nombre: "+listaPersona.get(iterador).getNombre());
                System.out.println("Apellido: "+listaPersona.get(iterador).getApellido());
                System.out.println("Telefono: "+listaPersona.get(iterador).getTelefono());
            }else{
                iterador = iterador + 1;
            }
          }while((!encontrado)&&(iterador<listaPersona.size()));
        
        if(!encontrado){
            System.out.println("El usuario no existe");
        }
    }
    
    public void buscarPorTelefono(String telefono,ArrayList<Persona>listaPersona){
        boolean encontrado=FALSE;
        int iterador=0;
        do{
            if(listaPersona.get(iterador).getTelefono().equals(telefono)){
                encontrado = TRUE;
                System.out.println("Nombre: "+listaPersona.get(iterador).getNombre());
                System.out.println("Apellido: "+listaPersona.get(iterador).getApellido());
                System.out.println("Telefono: "+listaPersona.get(iterador).getTelefono());
            }else{
                iterador = iterador + 1;
            }
          }while((!encontrado)&&(iterador<listaPersona.size()));
        
        if(!encontrado){
            System.out.println("El usuario no existe");
        }
    }
    
    
    public void eliminarContacto(String nombre,ArrayList<Persona>listaPersona){
        boolean encontrado=FALSE;
        int iterador=0;
        do{
            if(listaPersona.get(iterador).getNombre().equals(nombre)){
                encontrado = TRUE;
            }else{
                iterador = iterador + 1;
            }
          }while((!encontrado)&&(iterador<listaPersona.size()));
        
        if(encontrado){
            System.out.println("Se eliminara el siguiente usuario:");
            System.out.println("Nombre: "+listaPersona.get(iterador).getNombre());
            System.out.println("Apellido: "+listaPersona.get(iterador).getApellido());
            System.out.println("Numero: "+listaPersona.get(iterador).getTelefono());
            listaPersona.remove(iterador);
        }else{
            System.out.println("No se encontro ningun usuario con nombre "+nombre);
        }
    }

}
