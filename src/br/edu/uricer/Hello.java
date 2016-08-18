/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uricer;

/**
 *
 * @author Marisa Richter <marisa5.2@hotmail.com>
 */
public class Hello {
    private String nome;
    
    public Hello(String nome){
        this.nome = nome;
    }

    public Hello() {
    }
    
    public String getMessage(){
        String result = "Hello";
        if(nome != null){
            result = result + " "+ nome;
        }
        
        return result;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
