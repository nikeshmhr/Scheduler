package com.nikesh.scheduler.model;

/**
 *
 * @author Nikesh Maharjan
 */
public class Classroom extends Resource {
    
    private int capacity;
    
    public Classroom(String name, int type, int capacity){
        super(name, type);
        
        this.capacity = capacity;
    }
    
    public Classroom(String name, int type, int capacity, String resCode){
        super(name, type);
        
        setResourceCode(resCode);
    }
    
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
    
}
