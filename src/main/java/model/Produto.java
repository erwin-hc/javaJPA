package model;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="PRODUTOS")
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional=false)
    @Column(name="ID")
    private Integer id;
    @Column(name="NOME")
    private String nome;
    @Column(name="QTD")
    private Integer qtd;
    private List<Produto> produtosList;

    public List<Produto> getProdutosList() {
        return produtosList;
    }

    public void setProdutosList(List<Produto> produtosList) {
        this.produtosList = produtosList;
    }

    public Produto(Integer id, String nome, Integer qtd) {
        this.id = id;
        this.nome = nome;
        this.qtd = qtd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    
    
    @Override
    public String toString() {
        return "< ID: " + id + " | NOME: " + nome + " | QTD: " + qtd + " >";
    }
    
    
}
