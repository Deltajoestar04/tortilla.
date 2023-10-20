/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tortilla.negocio.iu;

import java.util.Scanner;
import mx.itson.tortilla.negocio.Operacion;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Escriba el enunciado a separar:");
        
        Scanner Scanner = new Scanner(System.in);
        String enunciado = Scanner.nextLine();
        String[] resultado= new Operacion().separar(enunciado);
        
        for(String q :resultado){
            System.out.println(q);
        }
                
    }    
}
