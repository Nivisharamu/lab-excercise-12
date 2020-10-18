/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet8;

/**
 *
 * @author ELCOT
 */
public class oddintegers {
    public static void main(String[]args)
    {
        
        Integer num[]={6,5,4,3,2,1};
        od<Integer>obj1=new od<>(num);
        obj1.display();   
    } 
}


class od<T >
{
    T[] value1;
    
    public od(T[] value1)
    {
        this.value1=value1; 
    }
    int c=0;
    public void display()
    {
     for(int i=0;i<value1.length;i++)
     {
        int j=Integer.parseInt(""+ value1[i]);
        if(j%2!=0)
        {
            c++;
        }
            
     }
     System.out.println("Number of odd numbers: " + c);
    }
}


