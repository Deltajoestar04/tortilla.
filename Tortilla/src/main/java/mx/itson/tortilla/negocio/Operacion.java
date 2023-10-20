/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tortilla.negocio;

/**
 * Contiene metodos para trabajar con cadenas de texto
 * @author Admin
 */
public class Operacion {
  /**
   * @espers uns cadena de texto en donde encuentren el caracter guion medio,
   * @param oracion Es la cracion que esta separada en fracciioones,
   * @return Array de String en cuyo cada componente sera una fraccion de la cadena cargada,
   */
    public String[] separar(String oracion){
        //holiwi uwu
         String[] resultado = oracion.split("-");
        return resultado;
    }
}
