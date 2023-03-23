package pronosticosdeportivos;

//Creacion de la primera clase.
//Para crear las proximas clases deben darle click en "Nuevo" o "New".
//Luego en "Clase" o "Class.
//Seguido de ello ponerle el nombre de la clase a realizar.
//La siguiente clase será Partido.

public class Equipo {
	//Atributos
	private String nombre;
	private String descripcion;
	
	//Constructor sin parámetros
	public Equipo() {
		
	}
	
	//Constructor con parámetros
	public Equipo(String Nombre, String Descripcion) {
		this.nombre=Nombre;
		this.descripcion=Descripcion;
		
	}
	
	//Propiedades Set y Get para cada atributo
	public String getNombre() {
		return nombre;//Retorna nombre
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;//Toma el valor pasado por parámetro
	}

	public String getDescripcion() {
		return descripcion;//retorna descripcion
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;//toma el valor pasado por parametro
	}
}
