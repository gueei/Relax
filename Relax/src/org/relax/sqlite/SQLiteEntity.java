package org.relax.sqlite;

import org.relax.Entity;

import android.content.ContentValues;
import android.content.Context;

public abstract class SQLiteEntity extends Entity{

	protected final SQLiteEntityCollection<?> mCollection;
	
	public SQLiteEntity(SQLiteEntityCollection<?> collection){
		mCollection = collection;
	}
	
	@Override
    public void saveEntity(Context context) {
		mCollection.getDatabase().replace(mCollection.getTableName(), null, asContentValues());
    }

	@Override
    public void createFromString(String data) {
    }

	public abstract ContentValues asContentValues();
	
	public abstract int getId();
}
