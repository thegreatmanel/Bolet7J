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
public class Boletin7 {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        



        String tit = JOptionPane.showInputDialog("Titulo del libro");
        libro1.setTit(tit);
String aut=JOptionPane.showInputDialog("Autor");
libro1.setAut(aut);
int num=Integer.parseInt(JOptionPane.showInputDialog("numero de libros"));
libro1.setNum(num);
libro1.amosar1();
if(num!=0){libro1.Prestamo(num);}
libro1.Devolucion(num);
libro1.amosar1();
    }}
