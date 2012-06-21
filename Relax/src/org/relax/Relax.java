package org.relax;

import java.util.Hashtable;

import android.content.Context;

public class Relax {
	private static Relax _instance;
	protected final Context mContext;
	
	protected Relax(Context context) {
		mContext = context;
    }
	
	public static Relax getInstance(Context context){
		if (_instance==null){
			_instance = new Relax(context);
		}
		return _instance;
	}
	
	private Hashtable<String, IServiceCommand> commands =
			new Hashtable<String, IServiceCommand>();
	
	/**
	 * Register the command to be executed later
	 * @param name
	 * @param command
	 */
	public void registerCommand(String name, IServiceCommand command){
		commands.put(name, command);
	}
}
