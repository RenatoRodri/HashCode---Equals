package application;

import inteteis.Clients;

public class Program {

	public static void main(String[] args) {
		
		Clients c1 = new Clients("Maria", "maria@gmail.com");
		Clients c2 = new Clients("Maria", "maria@gmail.com");

		
		System.out.println(c2.hashCode());
		System.out.println(c1.hashCode());
		System.out.println(c2.equals(c1));
	}

}
