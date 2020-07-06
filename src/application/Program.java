package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Emplyooe;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Emplyooe> emplyooes = new ArrayList<>();

		System.out.print("how many employees will be registered? ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 0; i < n; i++) {

			sc.nextLine();
			System.out.println("Employoee #" + (i + 1));
			System.out.print("ID: ");
			int Id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			emplyooes.add(new Emplyooe(Id, name, sc.nextDouble()));
			System.out.println();
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idTest = sc.nextInt();

		Emplyooe emp = emplyooes.stream().filter(x -> x.getId() == idTest).findFirst().orElse(null);

		if (emp == null)
			System.out.println("This id does not exist!");

		else {
			System.out.print("Enter the Percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of All Employees:");
		for (Emplyooe emplyooe : emplyooes) {
			System.out.println(emplyooe);
		}

		sc.close();

	}

}
