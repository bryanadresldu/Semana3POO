public class cocinero {

    public String nombre;
    public int anioExperiencia;
    public String especialidad;

    public cocinero(String nombre, int anioExperiencia, String especialidad) {
        this.nombre = nombre;
        this.anioExperiencia = anioExperiencia;
        this.especialidad = especialidad;
    }

    public void mostraRInformacion (){
        System.out.println("-------------Informacion del cocinero---------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Anio Experiencia: "+anioExperiencia);
        System.out.println("Especialidad: "+especialidad);
    }
}
