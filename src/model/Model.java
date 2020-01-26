package model;

import model.IModel;

public class Model implements IModel {
	int i;
	public Model() {
		i=0;
	}

	@Override
	public void increment() {
		i++;
		
	}

	@Override
	public int getCounter() {
		// TODO Auto-generated method stub
		return i;
	}
}
