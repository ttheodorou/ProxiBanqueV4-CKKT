/**
 * 
 */
package com.proxibanquev4.ckkt.service;

import org.aspectj.lang.JoinPoint.StaticPart;

/**
 * Classe Logger.java Represente
 * @author CKKT
 */
public class Logger {
	
	/* Cette méthode est appelée à chaque fois (et après) qu'une méthode du
	   package com.objis..service est interceptée. 'result' correspondant au retour de la méthode interceptée
	 */
	public void logMethodExit(StaticPart staticPart, Object result) {
		// Information sur le point de jonction
		String name = staticPart.getSignature().toLongString();

		System.out.println(name + " retourne : [" + result + "]");
	}
}
