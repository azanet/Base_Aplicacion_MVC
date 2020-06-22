/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;



import Modelo.Metodos3;
import Modelo.Metodos1;
import Vistas.Vista3;
import Vistas.Vista1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author davidf
 */
public class Controlador3 {

    //AGREGAMOSOBJETOS DEL MODELO, VISTA, Y OBJETOS, QUE VAYAMOS A UTILIZAR EN ESTE CONTROLADOR
    public Vista3 vistaFacturas;
    private Metodos3 metodosFacturas;//DECLARAMOS OBJETO del MODELO que contiene los METODOS | Establecemoscomo PRIVADO

    public Controlador3(Vista3 vistaFacturas, Metodos3 metodosFacturas) {
        this.vistaFacturas = vistaFacturas;
        this.metodosFacturas = metodosFacturas;
 
        //Inicializando BOTONES que se encuentran EN LA "Vista1"
        this.vistaFacturas.ButSalir.addActionListener(new OyenteSalir());
        this.vistaFacturas.ButFacturarContado.addActionListener(new OyenteFacturarContado());
        this.vistaFacturas.ButFacturarCredito.addActionListener(new OyenteFacturarCredito());
        this.vistaFacturas.ButListarAlbaranes.addActionListener(new OyenteListarAlbaranes());
        this.vistaFacturas.ButDelList.addActionListener(new OyenteBorrarLista());

        Iniciar();
        

    }

    
    
    private void Iniciar(){
        //INSERTAR CODIGO aqui!!
            
        
        //Aquí insertamos todo el codigo que tenga que iniciarse al entrar esta vista
        
       }
    
    
    
    
    //_________________________________________________________________________
    class OyenteFacturarContado implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
          //INSERTAR CODIGO aqui!!
            
        }//Fin ActionPerformed
    }//FIn OyenteBaja

//______________________________________________________________________________    
    //_________________________________________________________________________
    class OyenteFacturarCredito implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            //INSERTAR CODIGO aqui!!
           
        }//Fin ActionPerformed
    }//FIn OyenteBaja

//______________________________________________________________________________    
    class OyenteListarAlbaranes implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {

        }//Fin ActionPerformed
    }//FIn OyenteConsulta

    //_____________________________________________________________________   
    class OyenteBorrarLista implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            //INSERTAR CODIGO aqui!!

        }//Fin ActionPerformed
    }//FIn OyenteListado

//_____________________________________________________________________________-
    class OyenteSalir implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            //INSERTAR CODIGO aqui!!
            Vista1 menu = new Vista1();
            Metodos1 metodos = new Metodos1();
            Controlador1 controlMenu;
            //Inicializando CONTROLADOR PASANDOLE MODELO Y VISTA
            vistaFacturas.setVisible(false);
            controlMenu = new Controlador1(menu, metodos);
        }//Fin ActionPerformed
    }//FIn OyenteSalir


}
