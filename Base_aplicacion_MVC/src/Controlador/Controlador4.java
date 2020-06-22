/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Metodos4;
import Modelo.Metodos1;
import Vistas.Vista1;
import Vistas.Vista4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author davidf
 */
public class Controlador4 {
    //AGREGAMOSOBJETOS DEL MODELO, VISTA, Y OBJETOS, QUE VAYAMOS A UTILIZAR EN ESTE CONTROLADOR

    public Vista4 vistaVentas;//Declaramos un oObjeto de la VISTA correspondiente (en este caSO "Vista1") | Establecemos como PUBLICO
    private Metodos4 metodosVentas;//DECLARAMOS OBJETO del MODELO que contiene los METODOS | Establecemoscomo PRIVADO


    public Controlador4(Vista4 vistaVentas, Metodos4 metodosVentas) {
        this.vistaVentas = vistaVentas;
        this.metodosVentas = metodosVentas;
     
        //Inicializando BOTONES que se encuentran EN LA "Vista1"
        this.vistaVentas.ButAgregarArticulo.addActionListener(new OyenteAgregarArticulo());
        this.vistaVentas.ButBorrarArticulo.addActionListener(new OyenteBorrarArticulo());
        this.vistaVentas.ButDelList.addActionListener(new OyenteEliminarLista());
        this.vistaVentas.ButFinalizarVenta.addActionListener(new OyenteFinalizarVenta());
        this.vistaVentas.ButSalir.addActionListener(new OyenteSalir());
      

        Iniciar();
        

    }

    
    
    private void Iniciar(){
        //INSERTAR CODIGO aqui!!
            
        
        //Aquí insertamos todo el codigo que tenga que iniciarse al entrar esta vista
        
       }
    
    
    
    
    
    
    class OyenteAgregarArticulo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

        }//Fin ActionPerformed
    }//FIn OyenteAlta

    //_________________________________________________________________________
    class OyenteBorrarArticulo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            //INSERTAR CODIGO aqui!!

        }//Fin ActionPerformed
    }//FIn OyenteBaja

//______________________________________________________________________________    
    //_________________________________________________________________________
    class OyenteEliminarLista implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            //INSERTAR CODIGO aqui!!

        }//Fin ActionPerformed
    }//FIn OyenteBaja

//______________________________________________________________________________    
    class OyenteFinalizarVenta implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {

        }//Fin ActionPerformed
    }//FIn OyenteConsulta

    
    
    //_____________________________________________________________________________-
    class OyenteSalir implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            //INSERTAR CODIGO aqui!!
            Vista1 menu = new Vista1();
            Metodos1 metodos = new Metodos1();
            Controlador1 controlMenu;
            //Inicializando CONTROLADOR PASANDOLE MODELO Y VISTA
            vistaVentas.setVisible(false);
            controlMenu = new Controlador1(menu, metodos);

        }//Fin ActionPerformed
    }//FIn OyenteSalir

    
}
