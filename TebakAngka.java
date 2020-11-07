/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author LENOVO
 */
public class TebakAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ATRIBUTE
        int agk_random;
        int tebakan;
        
        Random acak = new Random();
        agk_random = acak.nextInt(101);
        System.out.println("Hai..nama saya Rafi, saya telah memilih angka dari 0 -100. Silahkan tebak ya!!");
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.print("Tebakkan anda : ");
            tebakan = input.nextInt();
            
            if ( tebakan > agk_random ){
                System.out.println("Hehehe... bilangan tebakan anda terlalu besar" + "\n");
            }else if ( tebakan < agk_random ){
                System.out.println("Hehehe...bilangan tebakan anda terlalu kecil" + "\n");
            }else{
                System.out.println("Yeee...bilangan tebakan anda benar");
            }
        }while( tebakan != agk_random );
    }
    
}
