/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7;

import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class Libro {
    String tit;
    String aut;
    int num;
    int num2;
    int prest;
     
    public void Libro(){}
    public void Libro(String tit, String aut, int num, int prest){
    this.aut=aut;
    this.num=num;
    this.tit=tit;
    
    }    
    public void setTit(String tit){
    this.tit=tit;}
    public void setAut(String aut){
    this.aut=aut;}
    public void setNum(int num){
    this.num=num;}
    public void amosar1(){
    JOptionPane.showMessageDialog(null,"titulo"+ tit+ " de "+aut+ " quedan "+ num);}
    public void Prestamo(int prest){
     prest=Integer.parseInt(JOptionPane.showInputDialog("Número de libros a prestamo"));
        if(prest!=0){num=num-prest;}}
       
          public void Devolucion(int devol){   if((devol!=0)&& (prest!=0)){
     devol=Integer.parseInt(JOptionPane.showInputDialog("Número de libros a devolver"));
     num=num+devol;}
        else{JOptionPane.showMessageDialog(null, "Todos los libros devueltos");}
       
    }
}
