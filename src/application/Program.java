package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("DIGITE O NOME DO ALUNO:");
		student.name = sc.nextLine();
		System.out.println("DIGITE A 1� NOTA:");
		student.grade1 = sc.nextDouble();
		System.out.println("DIGITE A 2� NOTA:");
		student.grade2 = sc.nextDouble();
		System.out.println("DIGITE A 3� NOTA:");
		student.grade3 = sc.nextDouble();
		
		System.out.println("\nRESULTADO FINAL:");
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		sc.close();
	}
}