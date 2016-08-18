/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uricer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class HelloTest {
    
    @Test
    public void comString() {
        Hello mensagem = new Hello("Marisa");  
        
        assertEquals("Hello Marisa", mensagem.getMessage());
        
    }
    
    @Test
    public void semString() {
        Hello mensagem = new Hello();
        
        assertEquals("Hello", mensagem.getMessage());
        
    }
}
