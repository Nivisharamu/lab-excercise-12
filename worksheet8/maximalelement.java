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
public class maximalelement {
    public static void main(String[] args) 
    {
        Integer num[]={1,12,23,34,45,56,67,78};
        m<Integer>obj1=new m<>(num);
        obj1.display();  
    }
}


class m<T >
{
    T[] value;    
    public m(T[] value)
    {
        this.value=value;
        
    }

    public void display()
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the range:");
        System.out.println("Beginning limit of the list:");
        int b=obj.nextInt();
        System.out.println("Ending limit of the list:");
        int e=obj.nextInt();
        int ma=0;
        
        for(b=0;b<e;b++)
            {
                int w =Integer.parseInt(""+ value[b]);
                if(w>ma)
                {
                    ma=w;
                }
            }
        System.out.println("Maximum number in the range:"+ma);
    } 
}
