/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ezemplojtextfield;

/**
 *
 * @author Admin
 */

import javax.swing.*;
import java.awt.*;

public class EzemploJTextField extends JFrame {
    JLabel rotulo1,rotulo2,rotulo3,rotulo4;
    JTextField texto1,texto2,texto3,texto4;
    public EzemploJTextField(){
        super("Ezemplo com JTextfield");
        Container tela = getContentPane();
        setLayout(null);
        rotulo1 = new JLabel("Nome");
        rotulo2 = new JLabel("Idade");
        rotulo3 = new JLabel("Telefone");
        rotulo4 = new JLabel("Celular");
        
        texto1 = new JTextField(50);
        texto2 = new JTextField(3);
        texto3 = new JTextField(10);
        texto4 = new JTextField(10);
        
        rotulo1.setBounds(50,20,80,20);
        rotulo2.setBounds(50,60,80,20);
        rotulo3.setBounds(50,100,200,20);
        rotulo4.setBounds(50,140,150,20);
        
        texto1.setBounds(110,20,200,20);
        texto2.setBounds(110,60,200,20);
        texto3.setBounds(140,100,200,20);
        texto4.setBounds(130,140,200,20);
        
        rotulo1.setFont(new Font("Arial",Font.BOLD,14));
        rotulo2.setFont(new Font("Comic Sans MS",Font.BOLD,16));
        rotulo3.setFont(new Font("Courier New",Font.BOLD,18));
        rotulo4.setFont(new Font("Times New Roman",Font.BOLD,20));

        
        rotulo1.setForeground(Color.red);
        rotulo2.setForeground(Color.black);
        rotulo3.setForeground(Color.yellow);
        rotulo4.setForeground(Color.green);
        
        tela.setBackground(Color.blue);

        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        
        setResizable(false);
        setSize(400, 250);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EzemploJTextField app = new EzemploJTextField();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}