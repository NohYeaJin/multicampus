package controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDAO;
import dao.ProductVO;

public class IndexAction implements Action{

	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "NonageServlet?command=join";
		ProductDAO productDAO = ProductDAO.getInstance();
		ArrayList<ProductVO> productVO = new ArrayList<>();
		ArrayList<ProductVO> newProductList = null;
		ArrayList<ProductVO> bestProductList = null;
		try {
			newProductList = productDAO.listNewProduct();
			bestProductList = productDAO.listBestProduct();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("newProductList", newProductList);
		request.setAttribute("bestProductList", bestProductList);
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}
	
	

}
