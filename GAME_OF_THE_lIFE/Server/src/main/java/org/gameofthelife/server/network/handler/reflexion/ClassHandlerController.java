package org.gameofthelife.server.network.handler.reflexion;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ClassHandlerController {
	public String value();
}