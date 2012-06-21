package org.relax;

import android.content.Context;
import android.os.Bundle;

/**
 * Generic Command representing REST Services
 * 
 * Command is supposed to be stateless and reusable within single instance, saving state is highly discouraged.
 * 
 * It is registered to the application through Relax.registerCommand(Name, IServiceCommand)
 * 
 * @author andy
 * 
 */
public interface IServiceCommand {
	public static final int PRIORITY_HIGHEST = 100;
	public static final int PRIORITY_NORMAL = 10;
	
	public static final int FLAG_BLOCKING = 0x0001;
	public static final int FLAG_EXCLUSIVE = 0x0002;
	
	public String execute(Context context, Bundle params);
}