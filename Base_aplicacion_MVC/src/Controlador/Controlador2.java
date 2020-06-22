/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Metodos2;
import Modelo.Metodos1;
import Vistas.Vista2;
import Vistas.Vista1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;

/**
 *
 * @author davidf
 */
public class Controlador2 {

    //AGREGAMOSOBJETOS DEL MODELO, VISTA, Y OBJETOS, QUE VAYAMOS A UTILIZAR EN ESTE CONTROLADOR
    public Vista2 vistaCompras;
    private Metodos2 metodosCompras;//DECLARAMOS OBJETO del MODELO que contiene los METODOS | Establecemoscomo PRIVADO

  

    public Controlador2(Vista2 vistaCompras, Metodos2 metodos) {
        //Inicializamos los objetos de Vista y Modelo pasandole directamene el parametro, que a su vez el parametro trae los constructores inicializados del metodo MAIN(en este caso)
        this.vistaCompras = vistaCompras;
        this.metodosCompras = metodos;
       
        //  Inicializando BOTONES que se encuentran EN LA "Vista1"
        this.vistaCompras.ButAgregarArticulo.addActionListener(new OyenteAgregarArticulo());
        this.vistaCompras.ButBorrarArticulo.addActionListener(new OyenteBorrarArticulo());
        this.vistaCompras.ButDelList.addActionListener(new OyenteEliminarLista());
        this.vistaCompras.ButFinalizarVenta.addActionListener(new OyenteFinalizarVenta());
        this.vistaCompras.ButSalir.addActionListener(new OyenteSalir());

        Iniciar();
        

    }

    
    
    private void Iniciar(){
        //INSERTAR CODIGO aqui!!
            
        
        //Aquí insertamos todo el codigo que tenga que iniciarse al entrar esta vista
        
       }
    
    
    
    
    
    
    private void Cabecera() {
        //INSERTAR CODIGO aqui!!
            
    }//Fin cabecera

    
    
    class OyenteAgregarArticulo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            //INSERTAR CODIGO aqui!!
            
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
            vistaCompras.setVisible(false);
            controlMenu = new Controlador1(menu, metodos);

        }//Fin ActionPerformed
    }//FIn OyenteSalir


    
}//Fin del Controlador Menu

