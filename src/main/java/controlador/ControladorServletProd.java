package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TblProductocl2;
import dao.CrudProductocl2;


public class ControladorServletProd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ControladorServletProd() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/GestionProducto.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String nombrecl2=request.getParameter("nombrecl2");
		double precioventacl2=Double.parseDouble(request.getParameter("precioventacl2"));
		double preciocompcl2=Double.parseDouble(request.getParameter("preciocompcl2"));
		String estadocl2=request.getParameter("estadocl2");
		String descripcl2=request.getParameter("descripcl2");
		
		TblProductocl2 tblproduct = new TblProductocl2();
		CrudProductocl2 curd= new CrudProductocl2();
		
		tblproduct.setNombrecl2(nombrecl2);
		tblproduct.setPrecioventacl2(precioventacl2);
		tblproduct.setPreciocompcl2(preciocompcl2);
		tblproduct.setEstadocl2(estadocl2);
		tblproduct.setDescripcl2(descripcl2);
		
		curd.RegistrarProd(tblproduct);
		
		List<TblProductocl2> listadoproducto=curd.ListadoProduc();
		
		request.setAttribute("listar", listadoproducto);
		
		request.getRequestDispatcher("/GestionProducto.jsp").forward(request, response);
		
	}

}
