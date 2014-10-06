/**
 * 
 */
package it.polimi.hegira.utils;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

/**
 * @author Marco Scavuzzo
 *
 */
public class ComponentValidator implements IParameterValidator{

	@Override
	public void validate(String name, String value)
			throws ParameterException {
		switch(value){
			case "SRC":
				break;
			case "TWC":
				break;
			default:
				throw new ParameterException("Parameter " + name + 
						" should be SRC or TWC");
		}
		
	}
	
}