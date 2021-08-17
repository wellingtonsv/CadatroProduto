<%@page import="modelo.Tipo"%>
<%@page import="modelo.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>JSP Page</title>

    </head>

    <body>

        <h1>Produto cadastrado com sucesso...</h1>

        <form id="formPrincipal" action="Pesquisar" method="post" accept-charset="UTF-8">

            <fieldset style="border: 1px solid; color: gray; padding: 10px; width: 450px;">

                <label id="lblCodigo" 
                       style="padding: 10px; padding-top: 5px;">
                    Codigo:
                </label>
                    ${produto.getCodigo()}

                <br/><br/>

                <label name="lblValor" 
                       style="padding: 10px;">
                    Valor:
                </label>
                         ${produto.getValor()}

                <br/><br/>
                
                <% Produto prod = (Produto) request.getAttribute("produto");
                %> 
                <% if (Tipo.MOSTRUARIO.equals(prod.getTipo())) {
                        
                %> 
                <label name="lblValorDesconto" 
                       style="padding: 10px;">
                    Valor Desconto:
                </label>
                
                ${produto.getDescontoMostruario()}
                        
                <br/><br/>
                        
                <%
                }
                %>
                        
                <label name="lblTipo"  
                       style="padding: 10px;">
                    Tipo:
                </label>
                      ${produto.getTipo()}  

                <br/><br/>

                <label name="lblDescricao" 
                       style="padding: 10px;">
                    Descricao:
                </label>
                        ${produto.getDescricao()}
                        
                <br/><br/>

                <hr/>
                <div id="alinhamentoBotoes" 
                     style="text-align: right; padding: 5px;">
                    
                        <input id="btnPesquisar" type="submit" value="Pesquisar"/>
                        <input id="btnVoltar" type="reset" value="Voltar" onclick="javascript:history.back()"/>
                </div>

            </fieldset>
        </form>
    </body>
</html>
