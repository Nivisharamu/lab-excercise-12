/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet8;

import java.util.Scanner;
/**
 *
 * @author ELCOT
 */
public class swapping {
   public static void main(String[] args) 
   { 
        Integer num[]={1,3,5,2,4,6};
        s<Integer,Integer>obj1=new s<>(num,0);
        obj1.display(); 
   }
    
}


class s<T,D>
{
    Scanner obj= new Scanner(System.in);
    T[] value;
    D v;
    public s(T[] value,D v)
            
    {
        this.value=value;
        this.v=v;
    }
    public void display()
    {
        int a=0,b=0;
        System.out.println("Enter two positions to be swapped: ");
        int c= obj.nextInt();
        int d=obj.nextInt();
        System.out.println("\n Before Swapping:");
        for(int i=0;i<value.length;i++)
        {
        System.out.println(value[i]);
        }
        for(int i=0;i<value.length;i++)
        {
            if(i==c)
            {
                 a=c;
            }
            else if(i==d)
            {
                b=d;
                
            }
        }
        
            v = (D) value[a];
            value[a]=value[b];
            value[b]=(T) v;
            
        System.out.println("\n After Swapiing:");
        System.out.println("Elements in the positions " + c + " and " + d + " are swapped");
        for(int i=0;i<value.length;i++)
        {
            System.out.println(value[i]);
        }
    }  
}
