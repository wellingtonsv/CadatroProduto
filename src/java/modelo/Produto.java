package modelo;

import java.util.List;

public class Produto {

    private Integer codigo;
    private Double valor;
    private String descricao;
    private List<Tipo> tipoProduto;
    private Tipo tipo;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Tipo> getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(List<Tipo> tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    public double getDescontoMostruario() {
        return getValor() * 0.50;
        
    }
    
}
