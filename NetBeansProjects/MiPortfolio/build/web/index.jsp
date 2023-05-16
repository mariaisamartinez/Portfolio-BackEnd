<%-- 
    Document   : index
    Created on : 11 may. 2023, 20:13:06
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Persona</title>
    </head>
    <body>
        <h1>Datos de la persona</h1>
        <form action="SvPersona" method="POST">
            <p><label>DNI:</label> <input type="text" name="dni"></p>
            <p><label>Nombre:</label> <input type="text" name="nombre"></p>
            <p><label>Apellido:</label> <input type="text" name="apellido"></p>
            <p><label>Teléfono:</label> <input type="text" name="tel"></p>
            <button type="submit">Enviar</button> 
        </form>
        <h1>Ver lista de personas</h1>
        <form action="SvPersona" method="GET"><button type="submit">Mostrar Personas</button> </form>
        <h1>Eliminar persona</h1>
        <p>Ingrese el id de la persona que quiere eliminar</p>
        <form action="SvEliminar" method="POST">
            <p><label>Id: </label><input type="text" name="id_eliminar"></p>
            <button type="submit">Eliminar</button> 
        </form>
        
    </body>
</html>
