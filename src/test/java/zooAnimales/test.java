package zooAnimales;
import gestion.*;

public class test {

	public static void main(String[] args) {
//		Zoologico zz = new Zoologico("manri","col");
//		Zona z = new Zona("casa",zz);
//		Animal a = new Animal("daniel",7,"campV","M");
//		System.out.println(a.getClass());
//		Mamifero.crearCaballo("bojack", 50, "macho");
//		z.agregarAnimales(Mamifero.crearCaballo("muujack", 50, "hembra"));
//		System.out.println(Mamifero.caballos);
//		System.out.println(Mamifero.cantidadMamiferos());
//		Pez.crearSalmon("nemo", 2, "payaso", z);
//		System.out.println(Pez.salmones);
//		System.out.println(Pez.cantidadPeces());
//		System.out.println(Animal.getTotalAnimales());
		
		
//		new Anfibio();
//		new Anfibio();
//		new Mamifero();
//		new Mamifero();
//		new Mamifero();
//		new Reptil();
//		new Pez();
//		new Ave();
//		new Ave();
//		
//		String  comp = "Mamiferos: 4\n" + 
//				"Aves: 4\n" + 
//				"Reptiles: 2\n" + 
//				"Peces: 2\n" + 
//				"Anfibios: 3";
//		System.out.println(Animal.totalPorTipo());
//		System.out.println("---------------------");
//		System.out.println(Animal.totalPorTipo().equals(comp));
//		System.out.println("---------------------");
//		System.out.println(comp);
		
		Animal a1 = new Anfibio();
		Animal a2 = new Ave();
		Animal a3 = new Mamifero();
		Animal a4 = new Pez();
		Animal a5 = new Reptil();
		
		System.out.println(a1.movimiento().equals("saltar"));
		System.out.println(a2.movimiento().equals("volar"));
		System.out.println(a3.movimiento().equals("desplazarse"));
		System.out.println(a4.movimiento().equals("nadar"));
		System.out.println(a5.movimiento().equals("reptar"));

		
	}

}
