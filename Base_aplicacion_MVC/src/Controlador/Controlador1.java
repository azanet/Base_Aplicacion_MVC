/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Metodos2;
import Modelo.Metodos3;
import Modelo.Metodos4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import Modelo.Metodos1;
import Vistas.Vista2;
import Vistas.Vista3;

import Vistas.Vista1;
import Vistas.Vista4;
import javax.swing.JScrollPane;

/**
 *
 * @author davidf
 */
//LA Clase CONTROLADOR siempre IMPLEMENTARA de "ActionListener" y sobreescribiremos su metodo ActionPerformed
public class Controlador1 {

    //AGREGAMOSOBJETOS DEL MODELO, VISTA, Y OBJETOS, QUE VAYAMOS A UTILIZAR EN ESTE CONTROLADOR
    public Vista1 vistaMenu;//Declaramos un oObjeto de la VISTA correspondiente (en este caSO "Vista1") | Establecemos como PUBLICO
    
 
  //  private Metodos1 metodos;//DECLARAMOS OBJETO del MODELO que contiene los METODOS | Establecemoscomo PRIVADO
    
    Controlador2 controladorCompras;
    Controlador4 controladorVentas;
    Controlador3 controladorFacturas;
    
    JScrollPane scrollPanelesSup;
    JScrollPane scrollTextArea2;
    JScrollPane scrollTeaxArea1;
    

   
    public Controlador1(Vista1 vistaMenu, Metodos1 metodos) {
        //Inicializamos los objetos de Vista y Modelo pasandole directamene el parametro, que a su vez el parametro trae los constructores inicializados del metodo MAIN(en este caso)
        this.vistaMenu=vistaMenu;
     //   this.metodos = metodos;
        //Agregamops el PANEL MENU

       
      //Inicializando BOTONES que se encuentran EN LA "Vista1"
       this.vistaMenu.ButCompras.addActionListener(new OyenteCompras());
       this. vistaMenu.ButVentas.addActionListener(new OyenteVentas());
       this. vistaMenu.ButFacturas.addActionListener(new OyenteFacturas());
       this. vistaMenu.ButSalir.addActionListener(new OyenteSalir());
         // this.vistaMenu.ButBorrar.addActionListener(new OyenteBorrar());
    
       vistaMenu.setVisible(true);
       
        Iniciar();
        

    }

    
    
    private void Iniciar(){
        //INSERTAR CODIGO aqui!!
            
        
        //Aquí insertamos todo el codigo que tenga que iniciarse al entrar esta vista
        
       }
    
    
    
    
    
    

    class OyenteCompras implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
           //INTRODUCOR AQUI COPDIGOOOOOO
        
        //Declaramos OBJETOS de MODELO,VISTA y CONTROLADOR. El controlador, lo inicializaremos con su constructor parametrizado, pasandole la vista y el modelo
       Vista2 comp=new Vista2();
        Metodos2 modeloComp= new Metodos2();
        Controlador2 controladorComp;
        //Inicializando CONTROLADOR PASANDOLE MODELO Y VISTA
        vistaMenu.setVisible(false);
        controladorComp= new Controlador2(comp, modeloComp);
      
        
       
        
        }//Fin ActionPerformed
    }//FIn OyenteCompras
    //_________________________________________________________________________
    
    
    
    
    
   //_________________________________________________________________________
    class OyenteVentas implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            //INSERTAR CODIGO aqui!!
  
             //Declaramos OBJETOS de MODELO,VISTA y CONTROLADOR. El controlador, lo inicializaremos con su constructor parametrizado, pasandole la vista y el modelo
        Vista4 ventas=new Vista4();
        Metodos4 modeloVentas= new Metodos4();
        Controlador4 controladorVentas;
        //Inicializando CONTROLADOR PASANDOLE MODELO Y VISTA
        vistaMenu.setVisible(false);
        controladorVentas= new Controlador4(ventas, modeloVentas);
      
        }//Fin ActionPerformed
    }//FIn OyenteVentas
//______________________________________________________________________________    
    
    
    
    
    class OyenteFacturas implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
         
             Vista3 facturas=new Vista3();
        Metodos3 modeloFacturas= new Metodos3();
        Controlador3 controladorFacturas;
        //Inicializando CONTROLADOR PASANDOLE MODELO Y VISTA
        vistaMenu.setVisible(false);
        controladorFacturas= new Controlador3(facturas, modeloFacturas);
            
        }//Fin ActionPerformed
    }//FIn OyenteFacturas

//______________________________________________________________________-
    class OyenteSalir implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            //INSERTAR CODIGO aqui!!
            System.exit(0);

        }//Fin ActionPerformed
    }//FIn OyenteSalir

}//Fin del Controlador Menu
