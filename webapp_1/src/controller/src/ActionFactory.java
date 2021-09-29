package controller.src;

import controller.action.Action;
import controller.action.IndexAction;
import controller.action.JoinAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		if(command.equals("")) {
			action = new IndexAction();
		}
		else if(command.equals("login")) {
			//action = new LoginAction();
		}
		else if(command.equals("join")) {
			action = new JoinAction();
		}
		return action;
	}
}