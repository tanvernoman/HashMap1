/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapalgorithml;

/**
 *
 * @author afnan
 */
public class Map {

    //reference to the head node
    private Entry[] table;
    private int size = 10;
    private int nodeCount;
    private int head;

    public Map() {

        
        nodeCount = 0;
    }

    public boolean isEmpty() {
        return (nodeCount == 0);
    }

    public void append(Integer newKey, Integer data) {

      if(newKey==null)
           return;   
     
       int hash=hash(newKey);
       //create new entry.
       Entry newEntry = new Entry(newKey, data, null);
      
       //if table location does not contain any entry, store entry there.
        if(table[hash] == null){
         System.out.println("nothing");
        }else{
           Entry previous = null;
           Entry current = table[hash];
           
           while(current != null){ //we have reached last entry of bucket.
           if(current.key.equals(newKey)){           
               if(previous==null){  //node has to be insert on first of bucket.
                     newEntry.next=current.next;
                     table[hash]=newEntry;
                     return;
               }
               else{
                   newEntry.next=current.next;
                   previous.next=newEntry;
                   return;
               }
           }
           previous=current;
             current = current.next;
         }
         previous.next = newEntry;
        }

    }

    public void display(){
       
       for(int i=0;i<size;i++){
           if(table[i]!=null){
                  Entry entry=table[i];
                  while(entry!=null){
                        System.out.print("{"+entry.key+"="+entry.value+"}" +" ");
                        entry=entry.next;
                  }
           }
       }             
    
    }

    public int size() {
        return nodeCount;
    }

    private int hash(Integer k) {
        return Math.abs(k.hashCode()) % size;
    }
}
