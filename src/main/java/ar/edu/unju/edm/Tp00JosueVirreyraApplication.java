package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Student;
import ar.edu.unju.edm.model.Calculator;

@SpringBootApplication
public class Tp00JosueVirreyraApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp00JosueVirreyraApplication.class, args);
		String nombre = " Josue";
		System.out.println( "Virreyra Ruiz" + nombre + name2());
		
		Student astudent = new Student();
		astudent.setDni("50.000.000");
		astudent.setName("Virreyra");
		
		System.out.println( "EL estudiante " + astudent.getName() + " dice HOLA!");
		
		//crear un objeto de la clase calculadora
		
		Calculator acalculator = new Calculator(); // metodo constructor
		acalculator.setNumbera(125); // valor a
		acalculator.setNumberb(3); // valor b
		
		System.out.println( "Valor a: " + acalculator.getNumbera());
		System.out.println( "Valor b: " + acalculator.getNumberb());
		//suma
		System.out.println( "El resultado de la suma es: " + acalculator.solvesum());
		//resta
		System.out.println( "El resultado de la resta es: " + acalculator.solvesub());
		//division
		System.out.println( "El resultado de la division es: " + acalculator.solvediv());
		//multiplicacion
		System.out.println( "El resultado de la multiplicacion es: " + acalculator.solvemult());
		// potencia
		System.out.println( "El resultado de la potencia es: " + acalculator.solvepot());
		// raiz
		System.out.println("El resultado de la raiz del valor a con indice del valor b es: " + acalculator.solvesqroot3());
		System.out.println( "El resultado de la raiz cuadrada del valor a es: " + acalculator.solvesqroot());
		System.out.println( "El resultado de la raiz cuadrada del valor b es: " + acalculator.solvesqroot2());
	}

	public static String name2() {
		String nombre2 = " Natanael";
		return nombre2;		
	}
}
