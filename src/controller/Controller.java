package controller;

import model.*;
import view.*;

public class Controller implements IController {
	private IView view;
	private IModel model;
	public Controller(IModel model,IView view) {
		this.view=view;
		this.model=model;
		view.setController(this);
	}
	@Override
	public void action() {
		// TODO Auto-generated method stub
		this.model.increment();
		this.view.setCounter(this.model.getCounter());
	}
	
}
