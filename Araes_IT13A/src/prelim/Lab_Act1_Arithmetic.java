/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prelim;

/**
 *
 * @author yielc
 */
public class Lab_Act1_Arithmetic {
    public static void main(String[] args){
        int araes = 10;
        int jer = 4;
        int jer1 = 6;
        int jer2 = 3;
        
        int araes1 = araes * jer + jer1;
        int araes2 = (araes - jer) % jer1;
        int araes3 = (araes + jer + jer1) / jer2;
        int araes4 = araes * jer1 - (jer * jer);
        
        System.out.println("10 * 4 + 6 = " + araes1);
        System.out.println("10 - 4 % 6 = " + araes2);
        System.out.println("10 + 4+ 6 / 3 = " + araes3);
        System.out.println("10 * 6 - 4 * 4 = " + araes4);
        
    }
    
}
