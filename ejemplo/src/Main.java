public class Main {
    public static void main(String[] args) {
  
        Usuario usuario = new Usuario("Isac", "Pacheco", "1053122542", "isacpacheco@gmail.com", "Masculino");
        
        Imc imc = new Imc(90.0, 1.89, usuario, "10-09-2024");
        
        imc.mostrarResultado();
    }
}