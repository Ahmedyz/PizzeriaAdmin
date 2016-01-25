package fi.omapizzeria.admin.controller;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fi.omapizzeria.admin.bean.Pizza;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/controller")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControllerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TEHDÄÄN LISTALLINEN OLIOITA
		DecimalFormat f = new DecimalFormat("0.00");
		List<Pizza> lista = new ArrayList<Pizza>();
		lista.add(new Pizza(1, "Margarita", 7.90));
		lista.add(new Pizza(2, "Frutti di Mare", 9.90));
		lista.add(new Pizza(3, "Chicken Hawaii", 7.90));

		response.setContentType("text/html");
		java.io.PrintWriter out = response.getWriter();

		// KÄYDÄÄN LISTA LÄPI JA TULOSTETAAN KUKIN PIZZA HTML-MUOTOILTUNA
		for (Pizza p : lista) {
			out.println("<p>");
			out.println("<b>" + p.getNimi() + "</b>");
			out.println("<br/>");
			out.println("Hinta: " + f.format(p.getHinta()) + " EUR");
			out.println("</p>");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
