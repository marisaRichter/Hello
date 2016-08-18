/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uricer;

import java.time.Clock;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hello mesage;
        String nome;
        String result;
        
        while(true){
            System.out.println("Informe seu nome se quiser, ou <exit> para sair");
            nome = sc.nextLine();
            if(nome.equals("exit")){
                break;
            } else{
                if(nome != null){
                    mesage = new Hello(nome);
                    result = mesage.getMessage();
                } else{
                    mesage = new Hello();
                    result = mesage.getMessage();
                }
                System.out.println(result);
            }
            
        }
        
    }
    
}
