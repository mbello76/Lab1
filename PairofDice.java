/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author mbello
 */
public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        // a simple random number
        double x = Math.random();
        System.out.println("Double between 0.0 and 1.0: x = "+x);
         
        // double between [0.0, 20.0)
        double y = Math.random()*20.0;
        System.out.println("Double between 0.0 and 20.0: y = "+y);
         
        // integer between [3,7]
        int r1 = (int) (Math.random()*5)+3;
        System.out.println("Integer between 3 and 8: r1 = "+r1);
         
        // integer between [-10,10) - maximum 9
        int r2 = (int) (Math.random()*20)-10;
        System.out.println("Integer between -10 and 10: r2 = "+r2);
         
    }
 
}
 
}
