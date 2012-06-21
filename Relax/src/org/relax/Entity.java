package org.relax;

import android.content.Context;

public abstract class Entity {
	public abstract void saveEntity(Context context);
	public abstract void createFromString(String data);
}
