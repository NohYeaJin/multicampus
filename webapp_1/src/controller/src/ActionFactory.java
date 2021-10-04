package controller.src;

import controller.action.Action;
import controller.action.IndexAction;
import controller.action.JoinAction;
import controller.action.ProductKindAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		if(command.equals("index")) {
			action = new IndexAction();
		}
		else if(command.equals("login")) {
			//action = new LoginAction();
		}
		else if(command.equals("join")) {
			action = new JoinAction();
		}
		else if(command.startsWith("kind")) {
			String[] products = command.split("/");
			action = new ProductKindAction();	
			
		}
		
		else if(command.startsWith("product")) {
			String[] products = command.split("/");
			
			//action = new ProductInfoAction();	
		}
		
		
		return action;
	}
}
