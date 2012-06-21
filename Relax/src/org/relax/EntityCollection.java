package org.relax;

import java.util.List;


public abstract class EntityCollection<T extends Entity> extends Entity{
	public abstract T createEntity();
	public abstract List<T> getEntities();
}
