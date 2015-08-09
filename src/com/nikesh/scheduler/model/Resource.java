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
    
    
    public Resource(String name, int type){
        this.resourceName = name;
        this.resourceType = type;
    }
    
    
    public String getResourceName(){
        return this.resourceName;
    }
    
    public int getResourceType(){
        return this.resourceType;
    }
    
    public String getResourceCode(){
        return this.getResourceCode();
    }
    
    public void setResourceCode(String resourceCode){
        this.resourceCode = resourceCode;
    }
    
}
