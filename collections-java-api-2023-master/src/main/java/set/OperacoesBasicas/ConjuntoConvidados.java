package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
  //atributo
  private Set<Convidado> convidadosSet;

  public ConjuntoConvidados() {
    this.convidadosSet = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int codigoConvite) {
    convidadosSet.add(new Convidado(nome, codigoConvite));
  }

  public void removerConvidadoPorCodigoConvite(int codigoConvite) {
    Convidado convidadoParaRemover = null;
    if (!convidadosSet.isEmpty()) {
      for (Convidado c : convidadosSet) {
        if (c.getCodigoConvite() == codigoConvite) {
          convidadoParaRemover = c;
          break;
        }
      }
      convidadosSet.remove(convidadoParaRemover);
    }
  }

  public int contarConvidados() {
    return convidadosSet.size();
  }

  public void exibirConvidados() {
    if (!convidadosSet.isEmpty()) {
      System.out.println(convidadosSet);
    } else {
      System.out.println("O conjunto está vazio!");
    }
  }

  public static void main(String[] args) {
    // Criando uma instância da classe ConjuntoConvidados
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

    // Exibindo o número de convidados no conjunto (deve ser zero)
    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

    // Adicionando convidados ao conjunto
    conjuntoConvidados.adicionarConvidado("Convidado 01", 1234);
    conjuntoConvidados.adicionarConvidado("Convidado 02", 1234);
    conjuntoConvidados.adicionarConvidado("Convidado 03", 1235);
    conjuntoConvidados.adicionarConvidado("Convidado 04", 1236);

//    // Exibindo os convidados no conjunto
       System.out.println("Convidados no conjunto:");
       conjuntoConvidados.exibirConvidados();

//    // Exibindo o número atualizado de convidados no conjunto
      System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
//
//    // Removendo um convidado do conjunto por código de convite
      conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
      System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");
//
//    // Exibindo os convidados atualizados no conjunto
      System.out.println("Convidados no conjunto após a remoção:");
      conjuntoConvidados.exibirConvidados();
  }
}