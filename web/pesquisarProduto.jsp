<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Produto</title>
    </head>
    <body>
        <form id="frmAlterar" action="Consultar" method="post" accept-charset="UTF-8">

            <h1>Pesquisar Produto</h1>

            <fieldset style="border: 1px solid; color: gray; padding: 10px; width: 450px;">

                <label id="lblCodigo" 
                       style="padding: 10px; padding-top: 5px;" 
                       for="txtCodigo">
                    Codigo:
                </label>
                <input name="txtCodigo" 
                       type="text" 
                       maxlength="10" 
                       size="11"/>
                <br/><br/>

                <hr/>
                <div id="alinhamentoBotoes" 
                     style="text-align: right; padding: 5px;">
                    
                    <input id="btnAlterar" type="submit" value="Consultar"/>
                    <input id="btnCancelar" type="reset" value="Cancelar"/>
                    
                </div>

            </fieldset>
        </form>

    </body>
</html>
