/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista2ex3;
import java.util.Scanner; 
/**
 *
 * @author ALUNO
 */
public class Lista2Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float n1, n2, n3, media, condicao;
        
        
        
        Scanner leia = new Scanner(System.in);
        System.out.print("DIGITE A NOTA DO PRIMEIRO BIMESTRE:");
        n1 = leia.nextInt();
        System.out.print("DIGITE A NOTA DO SEGUNDO BIMESTRE:");
        n2 = leia.nextInt();
        System.out.print("DIGITE A NOTA DO PRIMEIRO BIMESTRE:");
        n3 = leia.nextInt();
        
        media = (n1*2+n2*3+n3*5)/(2+3+5);
        
        System.out.println("A media dos 3 primeiros bimestres é:");
        System.out.println(media);
        
        if(media>5){
            System.out.println("Parabens!!! Você já passou de ano!");
        }else{
        System.out.println("Ainda não passou de ano, se esforçe, você ainda tem tempo!!");
        
    }
    
}
}
