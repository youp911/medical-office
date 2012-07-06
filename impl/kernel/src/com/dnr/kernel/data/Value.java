package com.dnr.kernel.data;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is aimed to be extended by all buisness classes
 * 
 * @author oussema
 * 
 */
public class Value implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7454169491499538587L;

	/**
	 * This method returns all fields of the class
	 * 
	 * @return All Fields of this class
	 */
	public List<String> getFields() {
		List<String> fields = new ArrayList<String>();
		Field[] declaredFields = this.getClass().getDeclaredFields();
		for (Field field : declaredFields) {
			fields.add(field.getName());
		}
		return fields;
	}

	
}
