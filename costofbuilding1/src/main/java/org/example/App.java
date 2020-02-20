package org.example;

/**
 * program created by pothulapalli hemanth sagar on feb 20 2020 for epam week4 submission
 *
 */
public class App extends Thread
{
    public void run()
    {
        //System.out.print("hi");
        creategui11 a=new creategui11();
        a.createguifunction();
    }
    public static void main(String args[])
    {
        App t1=new App();
        t1.start();
    }
}
