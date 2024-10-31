package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
  //atributo
  private Map<String, Integer> agendaContatoMap;

  public AgendaContatos() {
    this.agendaContatoMap = new HashMap<>();
  }

  public void adiocionarContato(String nome, Integer telefone) {
    agendaContatoMap.put(nome, telefone);
  }

  public void removerContato(String nome) {
    if (agendaContatoMap.isEmpty()) {
      agendaContatoMap.remove(nome);
    }
  }

  public void exibirContatos() {
    System.out.println(agendaContatoMap);
  }
  public Integer pesquisarPorNome(String nome) {
    Integer numeroPorNome = null;
    if (!agendaContatoMap.isEmpty()){
      agendaContatoMap.get(nome);
    }
    return numeroPorNome;
  }

  public static void main(String[] args) {

    AgendaContatos agendaContatos = new AgendaContatos();
    agendaContatos.adiocionarContato("Camila", 1265);
    agendaContatos.adiocionarContato("Leandro", 1268);
    agendaContatos.adiocionarContato("Cristiano", 1267);
    agendaContatos.adiocionarContato("Aranha", 1261);

    agendaContatos.exibirContatos();

    agendaContatos.removerContato("Camila");
    agendaContatos.exibirContatos();

    System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Leandro"));
  }
}

