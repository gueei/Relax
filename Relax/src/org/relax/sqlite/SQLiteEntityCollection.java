package org.relax.sqlite;

import org.relax.EntityCollection;

import android.database.sqlite.SQLiteDatabase;

public abstract class SQLiteEntityCollection<T extends SQLiteEntity> extends EntityCollection<T> {
	public abstract SQLiteDatabase getDatabase();
	public abstract String getTableName();
}
