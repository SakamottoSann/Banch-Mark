/**
 *
 * @author Will-Not
 */
package beachmarck;


public class Testes {

    public static void main(String[] args) {
        InfoSistem nuc = new InfoSistem();

       
       


        System.out.println("Numero de Threads " + nuc.numeroThread());
        System.out.println("Total de ram " + (nuc.totalRam() / 1000) + " mb");
        System.out.println("Ram livre " + (nuc.livreRam() / 1000) + " mb");

        Carrega carrega = new Carrega();
        
        carrega.carregaCalibracao();
        
        
        
    }

}
