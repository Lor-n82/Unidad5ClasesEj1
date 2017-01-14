

/**
 *
 * @author admin1
 */
public class PruebaCEuros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CEuros eu1=new CEuros();
        System.out.println("Pruebas con el cambio a 0.92");
        
        System.out.println("1000 euros son "+eu1.eurosToDolares(1000)+" dolares");
        
        System.out.println("1000 dolares son "+eu1.dolaresToEuros(1000)+" euros");
        
        System.out.println();
        
        CEuros eu2=new CEuros(2);
        
        System.out.println("Pruebas con el cambio a 2");
        
        System.out.println("1000 euros son "+eu2.eurosToDolares(1000)+" dolares");
        
        System.out.println("1000 dolares son "+eu2.dolaresToEuros(1000)+" euros");
        
    }
}
