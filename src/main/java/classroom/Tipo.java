package classroom;

public enum Tipo {
	DISCIPLINAR(10,"DISCPLINAR"),FUNDAMENTACION(20,"FUNDAMENTAL"),ELECTIVA(30,"ELECTIVA");
	
	private int codigo;
	private String nombre;
	private Tipo(int codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
