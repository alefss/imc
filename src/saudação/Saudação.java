
package saudação;

import java.util.Scanner;


public class Saudação {

   
    public static void main(String[] args) {
        String nome ;
        double peso ;
        double altura;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite seu Nome: ");
        nome = leia.nextLine();
        
        System.out.println("Digite sua altura: ");
        altura = leia.nextDouble();
        
        System.out.println("Digite seu peso ");
        peso = leia.nextDouble();
        
      double imc;    
        imc = peso / (altura*altura);
        if (imc <18.5){
         
         System.out.print("Abixo do peso ");
        }else if (imc >= 18.6 && imc <= 29.9){
        System.out.print("Saúdavel");
        }else if (imc >= 25 && imc <= 29.9){
         System.out.print("Peso em excesso");   
         }else if (imc >= 30 && imc <= 34.9){
       System.out.print("Obesidade grau I");
        }else if (imc >= 35 && imc <= 39.9){
       System.out.print("Obesidade grau II");
        }else{
          System.out.print("Obesidade grau II#");   
        }
          
        System.out.println("Seu IMC é:"+imc);
       
        
       
        {
            
            
        }
        
        
        
        
    }
    
}
