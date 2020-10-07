package br.edu.unifacisa.p2.logica;

import java.util.ArrayList;
import java.util.List;

public class ExerciciosDeLogica {
	public static int somaArray(int[] numeros) {
		int soma = 0;
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		return soma;
	}

	public static int getMaior(int[] numeros) {
		int maior = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
		}
		return maior;
	}

	public static int getMenor(int[] numeros) {
		int menor = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		return menor;
	}

	public static double getMedia(int[] numeros) {
		double soma = 0.0;
		for (int n : numeros) {
			soma += n;
		}
		double media = soma / numeros.length;
		return media;
	}

	public static String[] inverteArray(String[] nomes) {
		for (int i = 0; i < nomes.length / 2; i++) {
			String temp = nomes[i];
			nomes[i] = nomes[nomes.length - i - 1];
			nomes[nomes.length - i - 1] = temp;
		}
		for (int i = 0; i < nomes.length; i++) {

		}
		return nomes;

	}

	public static List<String> inverteLista(List<String> nomes) {
		List<String> inverter = new ArrayList<>();
		for (int i = nomes.size() - 1; i >= 0; i--) {
			String nome = nomes.get(i);
			inverter.add(nome);
		}
		return inverter;
	}

	public static String junta(List<String> nomes, String caractere) {
		String juntar = String.join(caractere, nomes);
		return juntar;
	}

	public static String substitui(String mensagem, String localizar, String substituir) {
		String msg = mensagem.replaceAll(localizar, substituir);

		return msg;
	}

	public static boolean ehNumero(String valor) {
		for (int i = 0; i < valor.length(); i++) {
			char caractere = valor.charAt(i);
			if (caractere < '0' || caractere > '9') {
				return false;
			}
		}
		return true;
	}

	public static boolean validaCEP(String cep) {
		String padrao = "^\\d{5}[-]\\d{3}$";
		if(cep.matches(padrao)){
			return true;
		}
		return false;
	}

	public static boolean validaCPF(String cpf) {
		int iDigito1Aux = 0, iDigito2Aux = 0, iDigitoCPF;
		int iDigito1 = 0, iDigito2 = 0, iRestoDivisao = 0;
		String strDigitoVerificador, strDigitoResultado;
		
		if (cpf.equals("00000000000") ||
	            cpf.equals("11111111111") ||
	            cpf.equals("22222222222") || cpf.equals("33333333333") ||
	            cpf.equals("44444444444") || cpf.equals("55555555555") ||
	            cpf.equals("66666666666") || cpf.equals("77777777777") ||
	            cpf.equals("88888888888") || cpf.equals("99999999999") ||
	            (cpf.length() != 11)) {
			 return(false);
		}
	           
		
		if (! cpf.substring(0,1).equals("")){
		    try{
		        cpf = cpf.replace('.',' ');
		        cpf = cpf.replace('-',' ');
		        cpf = cpf.replaceAll(" ","");
		        for (int iCont = 1; iCont < cpf.length() -1; iCont++) {
		            iDigitoCPF = Integer.valueOf(cpf.substring(iCont -1, iCont)).intValue();
		            iDigito1Aux = iDigito1Aux + (11 - iCont) * iDigitoCPF;
		            iDigito2Aux = iDigito2Aux + (12 - iCont) * iDigitoCPF;
		        }
		        iRestoDivisao = (iDigito1Aux % 11);
		        if (iRestoDivisao < 2) {
		            iDigito1 = 0;
		        } else {
		            iDigito1 = 11 - iRestoDivisao;
		        }
		        iDigito2Aux += 2 * iDigito1;
		        iRestoDivisao = (iDigito2Aux % 11);
		        if (iRestoDivisao < 2) {
		            iDigito2 = 0;
		        } else {
		            iDigito2 = 11 - iRestoDivisao;
		        }
		        strDigitoVerificador = cpf.substring(cpf.length()-2, cpf.length());
		        strDigitoResultado = String.valueOf(iDigito1) + String.valueOf(iDigito2);
		        strDigitoVerificador.equals(strDigitoResultado);
		        return true;
		    } catch (Exception e) {
		        return false;
		    }
		} else {
		    return false;
		}
	}	
	

	public static long fatorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * fatorial(n - 1);
	}

	public static int fibonacci(int n) {
		if (n < 2) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}

	}
}
