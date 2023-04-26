/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Somar extends JFrame{
   
     JTextField texto1, texto2;
     JLabel rotulo1,rotulo2, exibir;
      JButton somar,divisao,subtracao,multiplicacao,limpar;
     
      public Somar(){
        super("Exemplo de soma");
        Container tela = getContentPane();
        setLayout(null);
    
        rotulo1= new JLabel("1° número");
        rotulo2= new JLabel("2° número");
        texto1= new JTextField (5);
        texto2= new JTextField (5);
        exibir= new JLabel ("");
        
        //botões
        somar = new JButton("Somar");
        divisao = new JButton("Dividir");
        subtracao = new JButton("Subtrair");
        multiplicacao = new JButton("Multiplicar");
        limpar = new JButton("Limpar");
        
        
         rotulo1 = new JLabel("1° Número; ");
         rotulo2 = new JLabel("2° Número; ");
         texto1 = new JTextField(5);
         texto2 = new JTextField(5);
         exibir = new JLabel("");
         
         //botão
         somar = new JButton("Somar");
         divisao = new JButton("Divisão");
         multiplicacao = new JButton("Multiplicação");
         subtracao = new JButton("Subtração");
         limpar = new JButton("Limpar");
         
         //definir tamanho, linha, largura 
         rotulo1.setBounds(50, 20, 100, 20);
         rotulo2.setBounds(50, 60, 100, 20);
         texto1.setBounds(120, 20, 200, 20);
         texto2.setBounds(120, 60, 200, 20);
         exibir.setBounds(50, 100, 200, 20);
         
          //definir tamanho, linha, largura dos botões
           somar.setBounds(50, 120, 80, 20);
         divisao.setBounds(50, 160, 80, 20);
   multiplicacao.setBounds(250, 120, 110, 20);
       subtracao.setBounds(250, 160, 100, 20);
        limpar.setBounds(150, 180, 80, 20); 
         
         //função do botão somar
          somar.addActionListener(
         new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 int numero1, numero2,soma;
                 soma=0;
                 numero1= Integer.parseInt(texto1.getText());
                 numero2= Integer.parseInt(texto2.getText());
                 soma = numero1 + numero2;
                 exibir.setVisible(true);
                 exibir.setText("A soma é: "+soma); 
             } 
       }
);      
            //função do botão 
              divisao.addActionListener(
         new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 int numero1, numero2,dividir;
                 dividir=0;
                 numero1= Integer.parseInt(texto1.getText());
                 numero2= Integer.parseInt(texto2.getText());
                 dividir = numero1 / numero2;
                 exibir.setVisible(true);
                 exibir.setText("A Divisão é: "+dividir);  
             } 
       }
);
              //função do botão 
              multiplicacao.addActionListener(
                new ActionListener(){
                public void actionPerformed(ActionEvent e){
                 int numero1, numero2,multiplicar;
                 multiplicar=0;
                 numero1= Integer.parseInt(texto1.getText());
                 numero2= Integer.parseInt(texto2.getText());
                 multiplicar = numero1 * numero2;
                 exibir.setVisible(true);
                 exibir.setText("A Multiplicação é: "+multiplicar);   
             } 
       }
);
              //função do botão 
               subtracao.addActionListener(
                new ActionListener(){
                public void actionPerformed(ActionEvent e){
                 int numero1, numero2,subtrair;
                 subtrair=0;
                 numero1= Integer.parseInt(texto1.getText());
                 numero2= Integer.parseInt(texto2.getText());
                 subtrair = numero1 - numero2;
                 exibir.setVisible(true);
                 exibir.setText("A Subtração é: "+subtrair);   
             } 
       }
);
               //função do botão 
          limpar.addActionListener(
         new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 texto1.setText(null);
                 texto2.setText(null);
                 texto1.requestFocus(null);
                  } 
       }
);
                 
                 
        //mostrar que não esta visivel
        exibir.setVisible(false);
          
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(exibir);
        tela.add(somar);
        tela.add(divisao);
        tela.add(subtracao);
        tela.add(multiplicacao);
         tela.add(limpar);
        
        //definindo tamanho
        setSize(400,250);
        
        setVisible(true);
        
          //centralizar
        setLocationRelativeTo(null);
    }
       //inicializando metodo main
         public static void main(String args[]){
        //criando obj a partir do metodo
        Somar app = new Somar();
        //mostrar as ferramentas 
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         }
}
