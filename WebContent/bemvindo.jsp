<html>
	<body>
		<%-- Minha primeira p�gina JSP --%>
		
		<% String mensagem = "Bem vindo ao sistema de agenda do FJ-21"; %>
		<% out.println(mensagem);%>
		
		<br />
		
		<% String desenvolvido = "Desenvolvido por (Adriano)"; %>
		<%= desenvolvido %>
		
		<br />
		<% System.out.println("Tudo foi executado!"); %>
	</body>
</html>