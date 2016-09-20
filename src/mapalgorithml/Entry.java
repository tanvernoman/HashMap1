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
public class Entry {

    public Integer key; //can be any type
    public Integer value;
    public Entry next;   //reference for next node 

    public Entry(Integer k, Integer v,Entry next) {
        this.key = k;
        this.value=v;
        this.next = next;
    }

   

    public Integer setKey(Integer k) {
        this.key = k;
        return this.key;
    }

    public Integer getKey() {
        return this.key;
    }

    public Integer getValue() {
        return value;
    }

    public Integer setValue(Integer v) {
        this.value = v;
        return this.value;
    }
    
    public Entry setNext(Entry next){
        this.next= next;
        return this.next;
    }
    public Entry getNext(){
        return this.next;
    }
}
