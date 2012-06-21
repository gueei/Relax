package org.relax;

import android.content.Context;

public abstract class EntityCollection<T extends Entity> extends Entity{
	public abstract T createEntity();
	public abstract void saveCollection(Context context);
}
