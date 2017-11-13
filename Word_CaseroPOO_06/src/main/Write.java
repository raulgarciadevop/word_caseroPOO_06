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
import java.nio.file.Path;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author SB-A1
 */
public class Write {
    FileWriter archivo;
    PrintWriter escritor;
    
    public Write(){
        archivo=null;
        escritor=null;
    }
    
     /*
            for(int i=0;i<24:i++){
            escritor.println("Linea #"+i);
                    */
    
    public void escribe(String filename, Path path) throws IOException{
        try{
            archivo= new FileWriter(filename+".txt");
            escritor=new PrintWriter(archivo);
            
            for(int i=0;i<24;i++){
                escritor.println("Linea #"+i);
            }
            
            showMessageDialog(null, "Se ha escrito correctamente.");
        }
        catch(Exception e){
            showMessageDialog(null, "Error creando/escribiendo el archivo");
        }
        finally{
            try{
                if(archivo!=null) archivo.close();
            }catch(Exception e){
                showMessageDialog(null, "Error.");
            }
        }
            
            
           
    }
    
    //Ruta en file
    public void writeIt(File ruta, String texto){
        FileWriter arch=null;
        PrintWriter esc=null;
        try{
            arch=new FileWriter(ruta);
            esc=new PrintWriter(arch);
            
            //Escribir el texto/parametro
            esc.println(texto);
            showMessageDialog(null, "Se ha escrito correctamente en la ruta:\n"+ruta.getPath());
            
        }catch(Exception e){
            showMessageDialog(null, "Error: no se pudo escribir/crear el archivo");
        }finally{
            try{
                if(arch!=null)arch.close();
                
            }catch(Exception e){
                showMessageDialog(null, "Error.");
            }
        }
    }
    
    //Ruta en string
    public void writeIt(String ruta, String texto){
        FileWriter arch=null;
        PrintWriter esc=null;
        try{
            arch=new FileWriter(ruta);
            esc=new PrintWriter(arch);
            
            //Escribir el texto/parametro
            esc.println(texto);
            showMessageDialog(null, "Se ha escrito correctamente en la ruta:\n"+ruta);
            
        }catch(Exception e){
            showMessageDialog(null, "Error: no se pudo escribir/crear el archivo");
        }finally{
            try{
                if(arch!=null)arch.close();
                
            }catch(Exception e){
                showMessageDialog(null, "Error.");
            }
        }
    }
    
}
