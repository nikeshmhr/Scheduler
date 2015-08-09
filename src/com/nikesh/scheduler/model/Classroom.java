package com.nikesh.scheduler.model;

/**
 *
 * @author Nikesh Maharjan
 */
public class Classroom extends Resource {
    
    private int capacity;
    
    public Classroom(String name, int type, String resCode, int capacity){
        super(name, type, resCode);
        
        this.capacity = capacity;
    }
    
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
    
}
