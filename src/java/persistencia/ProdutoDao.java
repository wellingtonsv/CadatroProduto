package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import modelo.Produto;
import modelo.Tipo;

/**
 *
 * @author Maq-01
 */
public class ProdutoDao {

    private Connection conexao = null;
    private Statement sentenca = null;
    private ResultSet resultado = null;

    public ProdutoDao() throws Exception {
        Class.forName("org.postgresql.Driver");
        conexao = DriverManager.getConnection("jdbc:postgresql:produtobd", "postgres", "postgres");
        sentenca = conexao.createStatement();
    }

    public void incluir(final Produto p) throws Exception {
        sentenca.executeUpdate("insert into produtobd.produtos values(" + p.getCodigo() + ",'" + p.getDescricao() + "'," + p.getValor() + ",'" + p.getTipo().getId() + "')");
    }

    public Produto consultar(final Produto p) throws Exception {
        Produto aux = null;
        resultado = sentenca.executeQuery("select * from  produtobd.produtos where codigo = '" + p.getCodigo() + "'");
        if (resultado.next()) {
            aux = new Produto();
            aux.setCodigo(resultado.getInt(1));
            aux.setDescricao(resultado.getString(2));
            aux.setValor(resultado.getDouble(3));
            if (Tipo.ESTOQUE.getId().equals(resultado.getString(4))) {
                aux.setTipo(Tipo.ESTOQUE);
            } else {
                aux.setTipo(Tipo.MOSTRUARIO);
            }
        }
        return aux;
    }
}
