package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component // spring framework lo reconoce como componente
public class Calculator {
 private int numbera;
 private int numberb;
 
 public Calculator() {
	// TODO Auto-generated constructor stub
}

public int getNumbera() {
	return numbera;
}

public void setNumbera(int numbera) {
	this.numbera = numbera;
}

public int getNumberb() {
	return numberb;
}

public void setNumberb(int numberb) {
	this.numberb = numberb;
}
 

public int solvesum() {
	return numbera + numberb;
	
}

public int solvesub() {
	return numbera - numberb;
	
}
public int solvediv() {
	return numbera / numberb;
	
}
public int solvemult() {
	return numbera * numberb;
	
}
public double solvepot() {
return Math.pow(numbera,numberb);
}
public double solvesqroot() { //borrar

return Math.sqrt(numbera);
}
public float solvesqroot3() { // numbera es el radicando y numberb el indice

	// para resolver se eleva el radicando a la potencia del exponente del radicando sobre el indice
	double base,exp;
	base = numbera;
	exp = numberb;
	
	return (float) Math.pow(base, 1 / exp);
}
public double solvesqroot2() { // borrar

return Math.sqrt(numberb);
}
}


