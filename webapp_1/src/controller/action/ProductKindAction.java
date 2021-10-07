package controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDAO;

public class ProductKindAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int kind = Integer.parseInt(request.getAttribute("kind").toString());
		ProductDAO productDao = new ProductDAO();
		//productDao.listKindProduct(kind);
		
		
	}

}
