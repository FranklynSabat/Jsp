package service;

import java.sql.SQLException;

import dao.ClienteDAO;
import model.Cliente;

public class ClienteService {
	ClienteDAO dao = new ClienteDAO();

	public int criar(Cliente cliente) throws ClassNotFoundException, SQLException {
		return dao.criar(cliente);
	}
}
//	public void atualizar(Cliente cliente) {
//		dao.atualizar(cliente);
//	}

//	public void excluir(int id) {
//		dao.excluir(id);
//	}

//	public Cliente carregar(int id) {
//		return dao.carregar(id);
//	}

//}
