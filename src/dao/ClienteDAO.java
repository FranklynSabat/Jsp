package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import factory.ConexaoFactory;

import model.Cliente;

public class ClienteDAO {
	

		public int criar(Cliente cliente) throws ClassNotFoundException {
			String sqlInsert = "INSERT INTO cliente(nome, fone, email) VALUES (?, ?, ?)";
			// usando o try with resources do Java 7, que fecha o que abriu
			try (Connection conn = ConexaoFactory.conectar();
					PreparedStatement stm = conn.prepareStatement(sqlInsert);) {
				stm.setString(1, cliente.getNome());
				stm.setString(2, cliente.getFone());
				stm.setString(3, cliente.getEmail());
				stm.execute();
				String sqlQuery = "SELECT LAST_INSERT_ID()";
				try (PreparedStatement stm2 = conn.prepareStatement(sqlQuery);
						ResultSet rs = stm2.executeQuery();) {
					if (rs.next()) {
						cliente.setId(rs.getInt(1));
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return cliente.getId();
		}
	}

