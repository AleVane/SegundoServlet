package mx.edu.uacm.progweb.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AlejandraMartinezServlet_2 extends HttpServlet{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Override
public void init (ServletConfig config) throws ServletException{
	super.init();
}
@Override
public void init() throws ServletException {
	super.init(); 
}
@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.service(req, resp);
	}

 @Override
 protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
    String nombre = req.getParameter("nombre");
 	System.out.println("El nombre es: "+ nombre);
 	
 	String apellido = req.getParameter("apellido");
 	System.out.println("El nombre es: "+ apellido);
 	
     PrintWriter salida = resp.getWriter();
     salida.println("Hola tu nombre es "+ nombre + "y tu apellido es " + apellido);         
 }
}
