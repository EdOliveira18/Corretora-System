package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Definit;
import entities.Ground;
import entities.House;
import entities.PropertyLease;
import serviceGround.GroundPaymentService;
import serviceGround.ServiceGround;
import serviceHouse.HousePaymentService;
import serviceHouse.ServiceHouse;
import servicePropertyLease.ServicePropertyLease;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Enter with ' H - House ' / ' G - Ground ' / ' P - PropertyLease ': ");
		char local = entrada.next().charAt(0);
		if(local == 'h' || local == 'H') {
		System.out.println("Enter with house contract");
		System.out.println("Name: ");
		String name = entrada.next();
		System.out.println("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(entrada.next());
		System.out.println("House value: ");
		Double value = entrada.nextDouble();
		
		House house = new House(name, date, value);
		
		System.out.println("Enter number of Plots: ");
		int plots = entrada.nextInt();
		
		ServiceHouse sh = new ServiceHouse(new HousePaymentService());
		sh.processContract(house, plots);
		
		
		System.out.println("Plots: ");
		for(Definit df : house.getDefinit()) {
			System.out.println(df);
		}
		}
		if(local == 'g' || local == 'G') {
			System.out.println("Enter with ground contract");
			System.out.println("Name: ");
			String name = entrada.next();
			System.out.println("Date (dd/MM/yyyy): ");
			Date date = sdf.parse(entrada.next());
			System.out.println("Ground value: ");
			Double value = entrada.nextDouble();
			
			Ground ground = new Ground(name, date, value);
			
			System.out.println("Enter number of Plots: ");
			int plots = entrada.nextInt();
			
			ServiceGround sg = new ServiceGround(new GroundPaymentService());
			sg.processContract(ground, plots);
			
			System.out.println("Plots: ");
			for(Definit df : ground.getDefinit()) {
				System.out.println(df);
			}
				}
		
		if(local == 'p' || local == 'P') {
			
			System.out.println("Enter with PropertyLease contract");
			System.out.println("Name: ");
			String name = entrada.next();
			System.out.println("Date Start (dd/MM/yyyy): ");
			Date dateStart = sdf.parse(entrada.next());
			System.out.println("Contract time (in month): ");
			Integer contractTime = entrada.nextInt();
			System.out.println("PropertyLease monthly value: ");
			Double value = entrada.nextDouble();		
			
			PropertyLease propertyLease = new PropertyLease(name, dateStart, value);
			
			ServicePropertyLease spl = new ServicePropertyLease();
			spl.processContract(propertyLease, contractTime);
			
			System.out.println("Contract Finish: ");
			for(Definit df : propertyLease.getDefinit()) {
				System.out.println(df);
			}
			
		}
			}
			
		
	

}
