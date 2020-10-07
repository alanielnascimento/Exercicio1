package br.edu.unifacisa.p2.romanos;

public class Romanos {
	private static int numeros(char romanos){
        return romanos == 'M' ? 1000 :
               romanos == 'D' ? 500 :
               romanos == 'C' ? 100 :
               romanos == 'L' ? 50 :
               romanos == 'X' ? 10 :
               romanos == 'V' ? 5 :
               romanos == 'I' ? 1 : 0;
        } 

	public static String paraRomanos(int decimal) {
		 int i, milhar, centenas, dezenas, unidades;
		    String romanos = "";
		  
		    milhar = decimal / 1000;
		    centenas = decimal / 100 % 10;
		    dezenas = decimal / 10 % 10;
		    unidades = decimal % 10;
		
		   //milhar
		    for (i = 1; i <= milhar; i++) {
		       romanos = romanos + "M";
		    }
		
		   //centenas
		    if (centenas == 9) {
		       romanos = romanos + "CM";
		    } else if (centenas >= 5) {
		        romanos = romanos + "D";
		        for (i = 6; i <= centenas; i++) {
		        	romanos = romanos + "C";
		        }
		    } else if (centenas == 4) {
		        romanos = romanos + "CD";
		    } else {
		        for (i = 1; i <= centenas; i++) {
		            romanos = romanos + "C";
		        }
		    }
		
		   //dezenas
		    if (dezenas == 9) {
		        romanos = romanos + "XC";
		    } else if (dezenas >= 5) {
		        romanos = romanos + "L";
		        for (i = 6; i <= dezenas; i++) {
		            romanos = romanos + "X";
		        }
		    } else if (dezenas == 4) {
		        romanos = romanos + "XL";
		    } else {
		        for (i = 1; i <= dezenas; i++) {
		            romanos = romanos + "X";
		        }
		    }
		
		   //unidades
		    if (unidades == 9) {
		       romanos = romanos + "IX";
		    } else if (unidades >= 5) {
		       romanos = romanos + "V";
		       for (i = 6; i <= unidades; i++) {
		           romanos = romanos + "I";
		       }
		    } else if (unidades == 4) {
		       romanos = romanos + "IV";
		    } else {
		       for (i = 1; i <= unidades; i++) {
		           romanos = romanos + "I";
		       }
		    }
		    return romanos;
	}

	public static int paraDecimal(String romanos) {
		int total = 0;
		int numero = 0;
		for(int i = 0; i < romanos.length(); i++) {
			int numAtual = numeros(romanos.charAt(i));
			
			if (numero == 0){
                numero = numAtual; continue;
			}
			if (numero < numAtual)
                numero = -numero;
            total += numero;
            numero = numAtual;
		}
		return total + numero;
	}
}