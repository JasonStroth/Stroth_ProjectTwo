/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.ProjectTwo;

/**
 *
 *                                               @author Jeffrey Jason Stroth
 */
public class LinkedList 
{
    private Link root = null; 
    int max = 500; // limit for link list.
    
    
    //This function adds 500 random numbers to Linked List
    public void randAdd(int value)
    {
        for ( int i = 1; i <= max; i++)
        {
            int b = 1;
            int r = Math.incrementExact(b);
            AddToList(r);
        }
    }
    
    public void AddToList(int value)  
    {
        if (root == null)
        {
            root = new Link();
            root.value = value;
        }
        else
        {
            add(value);
        }
    }
    
    private void add(int value)
    {
        recAdd(value, root);
    }
    
    private void recAdd(int value, Link myLink)
    {
        if (myLink.nextLL == null)
        {
            Link temp = new Link();
            temp.value = value;
            myLink.nextLL = temp;
        }
        else
        {
            recAdd(value, myLink.nextLL);
        }
    }    
    
    // Functions print out list
    public void printOut()
    {
        recPrintOut(root);        
    }
    
    private void recPrintOut(Link list)
    {
        // this will stop the list when null
        if(list != null)
        {
            System.out.print("\t"+list.value);
            recPrintOut(list.nextLL);
        }
    }
}
