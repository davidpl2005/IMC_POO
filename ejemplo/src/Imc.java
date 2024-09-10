public class Imc {
    
    protected double peso;
    protected double altura;
    private Usuario usuario;
    private String fecha;

    
    public Imc(double peso, double altura, Usuario usuario, String fecha) {
        this.peso = peso;
        this.altura = altura;
        this.usuario = usuario;
        this.fecha = fecha;
    }
    
    private double calcularImc() {
        return peso / (altura * altura);
    }

    public void mostrarResultado() {
        usuario.mostrarInformacion();
        System.out.println("Fecha: " + fecha);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("IMC: " + calcularImc());
    }
}
