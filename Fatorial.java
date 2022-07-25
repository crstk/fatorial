/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unicesumar.exercicios.fatorial;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Fatorial {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double fator;
        
        
        System.out.println("Informe o numero que deseja obter o fatorial: ");
        fator = scan.nextDouble();
        
        double soma = fator;
        
        while(fator > 1){
            
            soma = soma*(fator-1);
            fator--;
            
            System.out.println(soma);
            
        }
    }
}