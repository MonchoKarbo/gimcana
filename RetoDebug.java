public class RetoDebug {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO SISTEMA DE VALIDACIÓN ---");

        
        int maxIntentos = "3"; 

        String usuario = null; 
        if (usuario.equals("admin")) {
            System.out.println("Acceso concedido.");
        }

        int contador = 0;
        while (contador < 3) {
            System.out.println("Verificando integridade... " + contador);
            // Falta: contador++;
        }

        // Sólo si se corrigen los bugs anteriores, se llegará a esta línea:
        System.out.println("--- SISTEMA OPERATIVO ---");
        System.out.println("FLAG: DAM_XINCANA_2024");
    }
}
