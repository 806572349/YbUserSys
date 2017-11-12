package com.yb.base.util;

import java.util.UUID;

public class GenerateGUID {
	/** 
     * 产生UUID 
     */  
    public static final String generateGUID()  
    {   
        UUID uuid=UUID.randomUUID();  
          return uuid.toString();  
    }  
      
    public static void main(String[] args)  
    {  
        System.out.println(generateGUID());  
          
    }  
}
