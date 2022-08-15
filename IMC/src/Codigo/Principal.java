package Codigo;
import java.text.DecimalFormat;//limitar los decimales
import java.util.Scanner;
import java.math.*;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Hola soy tu asistente virtual y te ayudare a saber tu IMC(Indice de Masa Corporal");
		calcular();
	}

	public static void calcular() {
     	DecimalFormat df = new DecimalFormat("#0.00");
		Solucion solucion = new Solucion();
    	Scanner teclado = new Scanner(System.in);
    	
    	System.out.println("Introduce tu peso en kg por favor: ");
     	float kg = teclado.nextFloat();
     	solucion.setKg(kg);
     	
     	System.out.println("Ahora introduce tu estatura: ");
     	float mt = teclado.nextFloat();
     	solucion.setMt(mt);
     	     	
     	double imc = solucion.getKg() / (Math.pow(solucion.getMt(),2));
     	solucion.setImc(imc);
     	     	
     	if(solucion.getImc() < 16) {
     		System.out.println("Tu IMC es de "+ df.format(solucion.getImc())
     		+"\nTienes DESNUTRICIÓN SEVERA,"
     		+"\nPor favor acude inmediatamente con un nutriologo");
     	}else if(solucion.getImc() < 18.5){
     		System.out.println("Tu IMC es de:" + df.format(solucion.getImc()) 
     		+ "\nTienes Desnutricion moderada");
     	}else if(solucion.getImc() < 22.1){
     		System.out.println("Tu IMC es de:" + df.format(solucion.getImc()) 
     		+ "\nTienes Bajo peso acude al doctor");
     	}else if(solucion.getImc() < 25){
     		System.out.println("Tu IMC es de:" + df.format(solucion.getImc()) 
     		+ "\nTienes Peso normal");
     	}else if(solucion.getImc() < 30){
     		System.out.println("Tu IMC es de:" + df.format(solucion.getImc()) 
     		+ "\nTienes sobrepeso cuida tu alimentacion");
     	}else if(solucion.getImc() < 35){
     		System.out.println("Tu IMC es de:" + df.format(solucion.getImc()) 
     		+ "\nTienes OBESEDIDAD tipo 1 acude al doctor");
     	}else if(solucion.getImc() < 40){
     		System.out.println("Tu IMC es de:" + df.format(solucion.getImc()) 
     		+ "\nTienes OBESEDIDAD tipo 2 acude al doctor");
     	}else if(solucion.getImc() <= 50){
     		System.out.println("Tu IMC es de:" + df.format(solucion.getImc()) 
     		+ "\nTienes BOBESESIDAD tipo 3 acude al doctor");
     	}else if(solucion.getImc() >50){
     		System.out.println("Tu IMC es de:" + df.format(solucion.getImc()) 
     		+ "\nTienes OBESESIDAD tipo 4 acude al doctor");
     	}else {
     		System.out.println("Vuelve a intentarlo");
     	}

	}

}
