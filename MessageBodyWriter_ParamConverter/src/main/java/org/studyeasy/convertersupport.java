package org.studyeasy;

import javax.ws.rs.ext.ParamConverter;

import org.studyeasy.model.*;
public class convertersupport implements ParamConverter<details> {

	details object=null;
	@Override
	public details fromString(String value) {
           switch(value)
           {
           case "junior":
        	 object= new details(100,"joker",4500.34,value,"male");
        	 break;
           case "senior":
        	   object=new details(200,"jigsaw",6000.23,value,"male");
               break;
           case "deveops":
        	   object=new details(300,"harelyqueen",4000.34,value,"female");
        	   break;
           }
		return object;
	}

	@Override
	public String toString(details value) {
		
		return value.toString();
	}

}
