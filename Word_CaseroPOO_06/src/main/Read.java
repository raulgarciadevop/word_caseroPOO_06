/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author SB-A1
 */
import java.io.*;
public class Read {
    //ATRIBUTOS
    FileReader archivo;
    BufferedReader lector;
    //CONSTRUCTOR
    public Read(){
        archivo=null;
        lector=null; 
    }
    //MÃ‰TODOS
    public String  leer(String ruta){
          String leido="";
          try{
              archivo = new FileReader(ruta);
              lector= new BufferedReader(archivo);
              leido=lector.readLine();
          }catch(Exception e){
              return "Error al leer";
             
          }finally{
                 try{
                     if(archivo!=null)
                         archivo.close();
                 }catch(Exception e2){
                   return "Error al intentar cerrar.";
                 }
          }
          return leido;
    }
    
    public String  leer(File ruta){
          String leido="";
          try{
              archivo = new FileReader(ruta);
              lector= new BufferedReader(archivo);
              leido=lector.readLine();
              
          }catch(Exception e){
              return "Error al leer";
             
          }finally{
                 try{
                     if(archivo!=null)
                         archivo.close();
                 }catch(Exception e2){
                   return "Error al intentar cerrar.";
                 }
          }
          return leido;
    }
    
    
    
    
}
