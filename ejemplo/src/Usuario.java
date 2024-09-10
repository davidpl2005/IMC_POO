public class Usuario {
    private String nombre;
    private String apellido;
    private String cedula;
    private String email;
    private String genero;

    public Usuario(String nombre, String apellido, String cedula, String email, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.email = email;
        this.genero = genero;
    }

   
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getEmail() {
        return email;
    }

    public String getGenero() {
        return genero;
    }
    
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Cedula: " + cedula);
        System.out.println("Email: " + email);
        System.out.println("Genero: " + genero);
    }
}

