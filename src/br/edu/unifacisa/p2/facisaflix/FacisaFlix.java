package br.edu.unifacisa.p2.facisaflix;

import java.util.ArrayList;
import java.util.List;

public class FacisaFlix {
  private List<Serie> series;
  private List<Usuario> usuarios;
  
  public FacisaFlix() {
    series = new ArrayList<>();
    usuarios = new ArrayList<>();
  }
  
  public void adicionaSerie(Serie serie) {
    series.add(serie);
  }
  
  public void adicionaUsuario(Usuario usuario) {
    usuarios.add(usuario);
  }
  
  public void registraVisualizacao(Usuario usuario, Episodio episodio, int nota) {
    Visualizacao v = new Visualizacao(episodio, nota);
    usuario.adicionaVisualizacao(v);
  }
  
  public List<Serie> getTodasAsSeries() {
    return series;
  }
  
  public List<Serie> getSeriesPorEstilo(int estilo) {
    return null;
  }
  
  public List<Serie> getSeriesPorClassificacao(int classificacao) {
    return null;
  }
  
  public List<Serie> getSeriesQueViu(Usuario usuario) {
    return null;
  }
  
  public List<Serie> getSeriesEmComum(Usuario u1, Usuario u2) {
    return null;
  }
  
  public int getQuantidadeDeSeries() {
    return 0;
  }
  
  public int getQuantidadeTotalDeEpisodios() {
    return 0;
  }
  
  public int getQuantidadeTotalDeMinutos() {
    return 0;
  }
}
