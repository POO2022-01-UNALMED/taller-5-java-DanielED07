package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Reptil extends Animal{
	 private static ArrayList<Reptil> listado;
	 public static int iguanas;
	 public static int serpientes;
	 private String colorEscamas;
	 private int largoCola;
	//--------------------------
	 public Reptil() {
		 super();
		 if(listado==null) {
			 listado=new ArrayList<Reptil>();
			 Reptil.listado.add(this);
		 }else {
			 Reptil.listado.add(this);
		 }
	 }
	//--------------------------
	 public Reptil(String nom,int edad,
			 String hab,String gen,Zona zon,
			 String colE,int larC) {
		 super(nom,edad,hab,gen,zon);
		 this.colorEscamas=colE;
		 this.largoCola = larC;
		 if(listado==null) {
			 listado=new ArrayList<Reptil>();
			 Reptil.listado.add(this);
		 }else {
			 Reptil.listado.add(this);
		 } 
	 }
	//--------------------------
	 public Reptil(String nom,int edad,
			 String hab,String gen,
			 String colE,int larC) {
		 super(nom,edad,hab,gen);
		 this.colorEscamas=colE;
		 this.largoCola = larC;
		 if(listado==null) {
			 listado=new ArrayList<Reptil>();
			 Reptil.listado.add(this);
		 }else {
			 Reptil.listado.add(this);
		 } 
	 }
	//--------------------------
	 public String movimiento() {
			return "reptar";
		}
	//--------------------------
	 public static Reptil crearIguana(String nom,int edad,String gen){
		 iguanas++;
		 return new Reptil(nom,edad,"humedal",gen,"verde",3);
		 
	 }
	//--------------------------
	public static Reptil crearSerpiente(String nom,int edad,String gen){
		serpientes++;
		return new Reptil(nom,edad,"jungla",gen,"blanco",1);
		 
	}
	//--------------------------
	public static int cantidadReptiles(){
		 return Reptil.iguanas+Reptil.serpientes+Reptil.listado.size();
	}
	//--------------------------
			public String getColorEscamas() {
				return this.colorEscamas;
			}
			//--------------------------
			public int getLargoCola() {
				return this.largoCola;
			}
}
