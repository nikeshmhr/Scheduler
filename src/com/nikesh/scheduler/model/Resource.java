package com.nikesh.scheduler.model;

import com.nikesh.scheduler.constants.RESOURCE_TYPE;

/**
 *
 * @author Nikesh Maharjan
 */
public class Resource extends RESOURCE_TYPE {
    
    private int resourceType;
    private String resourceCode;
    private String resourceName;
    
    
    public Resource(String name, int type, String resourceCode){
        this.resourceName = name;
        this.resourceType = type;
        this.resourceCode = resourceCode;
    }
    
    
    public String getResourceName(){
        return this.resourceName;
    }
    
    public int getResourceType(){
        return this.resourceType;
    }
    
    public String getResourceId(){
        return this.getResourceId();
    }
    
}
