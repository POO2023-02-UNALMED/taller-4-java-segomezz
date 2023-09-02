package classroom;

public class Asignatura {

    public String nombre;
    String n = nombre;
    public int codigoExterno;
    public Tipo tipo;
    public int codigoInterno;

    public Asignatura(String nombre,int codigoExterno,Tipo tipo,int codigoInterno) {
        this.nombre = nombre;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
        this.codigoInterno = codigoInterno;
    }
    public Asignatura() {
        this("Sin nombre",0,Tipo.FUNDAMENTACION,0);
        //codigoExterno=0; //this(0) para que si a asignatura no le ingresan valores, establezca por defecto cero, definimos los valores como atributo de instancia, o en la firma de la clase
        //codigoInterno=0;
    }

    public Asignatura(Tipo tipo,int codigoInterno) {
    	this("Sin nombre",0,tipo,codigoInterno);
    }

    public Asignatura(int codigoExterno,Tipo tipo) {
        this("Sin nombre",codigoExterno,tipo,0);
    }

    public Asignatura(String nombre, Tipo tipo) {
        this(nombre,0,tipo,0);
    }


    public void cambiarDatos(int codigoInterno, int codigoExterno, String nombre,Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void cambiarDatos(double codigoInterno) {         
       this.codigoInterno = (int)codigoInterno;
    }

    public void cambiarDatos(int codigoExterno) {         
        this.codigoExterno = codigoExterno;
    }

    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}
