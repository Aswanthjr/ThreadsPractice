/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultiThreading;

/**
 *
 * @author ASWANTH S
 */
class Names extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            try 
            {
            Thread.sleep(2000);
            }   
            catch (InterruptedException ex) 
            {   
                
            }
            System.out.println("Aswanth");
        }
        
    }
}

class Names1 extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            try 
            {
            Thread.sleep(2000);
            }   
            catch (InterruptedException ex) 
            {   
                
            }
            System.out.println("Vasanth");
        }
        
    }
}

class Names2 extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            try 
            {
            Thread.sleep(2000);
            }   
            catch (InterruptedException ex) 
            {   
                
            }
            System.out.println("Saravanan");
        }
        
    }
}
class Names3 extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            try 
            {
            Thread.sleep(2000);
            }   
            catch (InterruptedException ex) 
            {   
                
            }
            System.out.println("Ganesh");
        }
        
    }
}
public class SleepInThread  {
    public static void main(String[] args) {
       Thread th = new Names();
       Thread th1 = new Names1();
       Thread th2 = new Names2();
       Thread th3 = new Names3();
       
       th.start();
       th1.start();
       th2.start();
       th3.start();
       
       
    }
}
