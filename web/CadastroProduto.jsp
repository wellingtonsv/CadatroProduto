<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CadastroFuncionario</title>
    </head>
    <body>
        <form id="formPrincipal" action="Incluir" method="post" accept-charset="UTF-8">

            <h1>Cadastro Produto</h1>

            <fieldset style="border: 1px solid; color: gray; padding: 10px; width: 450px;">

                <label id="lblCodigo" style="padding: 10px; padding-top: 5px;" for="txtCodigo">
                    Codigo:
                </label>

                <input name="txtCodigo" 
                       type="text"
                       maxlenght="10" 
                       size="12"
                       style="margin-left: 28px;"/>

                <br/><br/>

                <label name="lblValor" 
                       style="padding: 10px;" 
                       for="txtValor">
                    Valor:
                </label>
                <input name="txtValor" 
                       type="text"
                       maxlenght="10" 
                       size="12"
                       style="margin-left: 28px;"/>

                <br/><br/>

                <label name="lblTipo"  
                       style="padding: 10px;" 
                       for="sltTipo">
                    Tipo:
                </label>

                <select name="sltTipo" 
                        style="margin-left: 32px;">
                    <option name="sltTipo" value=""> --- Selecione --- </option>
                    <%
                        List lista = (List) request.getAttribute("tipos");
                        Iterator it = lista.iterator();
                        while (it.hasNext()) {%>
                    <option name="sltTipo"><%
                        out.println(it.next());
                        out.println("<br>");
                        %>
                    </option>
                    <%
                        }
                    %>
                </select>

                <br/><br/>

                <label name="lblDescricao" 
                       style="padding: 10px;">
                    Descricao:
                </label>
                <input name="txtDescricao" 
                       type="text" 
                       maxlength="50" 
                       size="52"/>

                <br/><br/>

                <hr/>
                <div id="alinhamentoBotoes" 
                     style="text-align: right; padding: 5px;">
                    <input id="btnIncluir" type="submit" value="Incluir"/>
                    <input id="btnCancelar" type="reset" value="Cancelar"/>
                </div>

            </fieldset>
        </form>

    </body>
</html>
