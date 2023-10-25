package controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TblUsuariocl2;
import dao.CrudUsuario;


public class ControladorServletUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ControladorServletUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String usuariocl2= request.getParameter("usuariocl2");
		String passwordcl2= request.getParameter("passwordcl2");
		
		TblUsuariocl2 tbluser = new TblUsuariocl2();
		CrudUsuario curd= new CrudUsuario();
		
		tbluser.setUsuariocl2(usuariocl2);
		tbluser.setPasswordcl2(passwordcl2);
		
		curd.AccederUsuario(tbluser);
		
		request.getRequestDispatcher("/GestionProducto.jsp").forward(request, response);
		
		
	}

}
