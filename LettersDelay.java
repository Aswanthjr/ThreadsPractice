/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiThreading;

/**
 *
 * @author ASWANTH S
 */

class Para implements Runnable
{
    @Override
    public void run()
    {
        String text = """
                      Hai Sir How Can I Help You
                      Can You Tell Me About Java
                      Sure,Jav Is A Programming Language
                      Which Is Used For Develop Applications With PlateForm Independent
                      """;
        for(int i=0;i<text.length();i++)
        {
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {}
            System.out.print(text.charAt(i));
        }
    }
}

public class LettersDelay
{
    public static void main(String[] args) {
        Runnable r = new Para();
        
        Thread ht = new Thread(r);
        ht.start();
    }
}


