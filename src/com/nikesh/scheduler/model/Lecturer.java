package com.nikesh.scheduler.model;

/**
 *
 * @author Nikesh Maharjan
 */
public class Lecturer extends Resource {
    
    
    public Lecturer(String name, int type){
        super(name, type);
    }
    
    public Lecturer(String name, int type, String resCode){
        super(name, type);
        
        setResourceCode(resCode);
        
    }
    
}
