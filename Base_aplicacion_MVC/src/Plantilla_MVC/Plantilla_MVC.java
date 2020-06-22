/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plantilla_MVC;

import Controlador.Controlador1;
import Modelo.Metodos1;
import Vistas.Vista1;
import javax.swing.JFrame;

/**
 *
 * @author davidf
 */
public class Plantilla_MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
               // TODO code application logic here
        //Declaramos OBJETOS de MODELO,VISTA y CONTROLADOR. El controlador, lo inicializaremos con su constructor parametrizado, pasandole la vista y el modelo
        Vista1 vista=new Vista1();
        Metodos1 modelo= new Metodos1();
        Controlador1 controlador;
        //Inicializando CONTROLADOR PASANDOLE MODELO Y VISTA
        controlador= new Controlador1(vista, modelo);
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Hacemos visile la vista a mostra PRIMERO
       vista.setVisible(true);
        
    }//Fin del metodo main
    
}//Fin de la clase principal
