package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cliente;
import service.ClienteService;

/**
 * Servlet implementation class CrudClientesServlet
 */
@WebServlet("/crudCliente")
public class CrudClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CrudClienteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
				RequestDispatcher dispatcher = request.getRequestDispatcher("cliente.jsp");
				dispatcher.forward(request, response);
				
				
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pNome = request.getParameter("nome");
		String pFone = request.getParameter("fone");
		String pEmail = request.getParameter("email");
//		instanciar o javabean
		Cliente cliente = new Cliente();
		cliente.setNome(pNome);
		cliente.setFone(pFone);
		cliente.setEmail(pEmail);
//		instanciar o service
		ClienteService cs = new ClienteService();
		
			try {
				cs.criar(cliente);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("confirmado.jsp");
			dispatcher.forward(request, response);
		
		// TODO Auto-generated method stub
			
}
	
	
}	//cliente = cs.carregar(cliente.getId());
		//enviar para o jsp
		
		
//		case "Consultar":
//			cliente = service.carregar(cliente.getId());
//			break;
//		case "Remover":
			//service.excluir(cliente);
			//break;
//		case "Atualizar":
//			service.atualizar(cliente);
//			break;
		
//		PrintWriter out = response.getWriter();
//		out.println("Operação realizada com sucesso");

	


