<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Clientes</title>
</head>
<body>
	<h3>Cadastro de Clientes</h3>
	<form action="crudCliente" method="post">          <!-- faz a requisicao para o servlet trazer a pagina cliente.jsp  --> 
		
		nome: <input type="text" name="nome"><br> 
		fone: <input type="text" name="fone"><br> 
		e-mail: <input type="text" name="email"><br> 
		
		<input type="submit" value="cadastrar">
	</form>
	
	
</body>
</html>