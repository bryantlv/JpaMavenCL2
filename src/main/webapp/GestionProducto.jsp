<%@page import="java.util.*"%>
<%@page import="model.TblProductocl2"%>
<%@page import="java.io.Serializable" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Producto</title>
</head>
<body bgcolor="#c5dec9">

<h1 align="center">Registrar Producto</h1>
<form action="ControladorServletProd" method="post">
<table align ="center">
<tr>
<td>Nombre</td>
<td><input type="text" name="nombrecl2"></td>
</tr>
<tr>
<td>Precio</td>
<td><input type="text" name="preciocompcl2"></td>
</tr>
<tr>
<td>PrecioVen</td>
<td><input type="text" name="precioventacl2"></td>
</tr>
<tr>
<td>Estado</td>
<td><input type="text" name="estadocl2"></td>
</tr>
<tr>
<td>Descrip</td>
<td><input type="text" name="descripcl2"></td>
</tr>
<tr>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="Registrar ">
</td>
</tr>
</table>
</form>

<h1 align="center">Listado de Productos</h1>
<table align="center" border="1">
<tr>
<th>Codigo</th>
<th>Nombre</th>
<th>PrecioVenta</th>
<th>PrecioCompra</th>
<th>Estado</th>
<th>Descripcion</th>
</tr>

<%
@SuppressWarnings("unchecked")
List<TblProductocl2> ListadoProducto=(List<TblProductocl2>)request.getAttribute("listar");
if(ListadoProducto!=null){
	for(TblProductocl2 lis:ListadoProducto){
%>
<tr>
<td>
<%=lis.getIdproductocl2() %>
</td>
<td>
<%=lis.getNombrecl2() %>
</td>
<td>
<%=lis.getPrecioventacl2() %>
</td>
<td>
<%=lis.getPreciocompcl2() %>
</td>
<td>
<%=lis.getEstadocl2() %>
</td>
<td>
<%=lis.getDescripcl2() %>
</td>
</tr>


<%		
		
	}
}
%>

</table>
</body>
</html>