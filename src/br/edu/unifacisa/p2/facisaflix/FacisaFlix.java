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
		List<Serie> seriesPorEstilo = new ArrayList<>();
		for (Serie s : series) {
			if (s.getEstilo() == estilo) {
				seriesPorEstilo.add(s);
			}
		}
		return seriesPorEstilo;
	}

	public List<Serie> getSeriesPorClassificacao(int classificacao) {
		List<Serie> seriesPorIdade = new ArrayList<>();
		for (Serie s : series) {
			if (s.getClassificacao() <= classificacao) {
				seriesPorIdade.add(s);
			}
		}
		return seriesPorIdade;
	}

	public List<Serie> getSeriesQueViu(Usuario usuario) {
		List<Serie> seriesVistas = new ArrayList<>();
		for (Serie s : series) {
			seriesVistas.add(s);
			for (Usuario u : usuarios) {
				if (u.getVisualizacoes().contains(seriesVistas)) {
					
				}
			}
		}

		return seriesVistas;
	}

	public List<Serie> getSeriesEmComum(Usuario u1, Usuario u2) {
		List<Serie> seriesEmComum = new ArrayList<>();
		for (Serie s : series) {
			seriesEmComum.add(s);
			for (Usuario u : usuarios) {
				if (u.getVisualizacoes().contains(seriesEmComum)) {
					
				}
			}
		}
			
			
		return seriesEmComum;
	}

	public int getQuantidadeDeSeries() {
		return series.size();
	}

	public int getQuantidadeTotalDeEpisodios() {
		int numEpisodios = 0;
		for (Serie s : series) {
			for (Temporada t : s.getTemporadas()) {
				numEpisodios += t.getEpisodios().size();
			}
		}
		return numEpisodios;
	}

	public int getQuantidadeTotalDeMinutos() {
		int totalMinutos = 0;
		for (Serie s : series) {
			for (Temporada t : s.getTemporadas()) {
				for (Episodio e : t.getEpisodios()) {
					totalMinutos += e.getDuracao();
				}
			}
		}
		return totalMinutos;
	}
}
