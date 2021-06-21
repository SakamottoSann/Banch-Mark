/**
 *
 * @author Will-Not
 */
package beachmarck;

public class Stress implements Runnable{
     double l2,
             lacoStress,
             tempoInicioStress,
             tempoFinalStress,
             pontuacao;
  
    double tempoCalibracao;
     
     
   public Stress(double lacoStress){
       this.lacoStress = lacoStress;
    }

     @Override
   public void run(){
        System.out.println("Entrou Principal");
        System.out.println("Limite Principal "+lacoStress);
        this.tempoInicioStress = System.currentTimeMillis();
       
        for (l2 = 0; l2 < lacoStress; l2++) {
           double log = Math.log(37.71);
            double sin = Math.sin(2.46);
            double cos = Math.cos(0.27);
            double raiz = Math.sqrt(7.35);
            double divi = 2.5 / 7.77;
            double exp = Math.exp(3.95);

        }
        
        this.tempoFinalStress= ((System.currentTimeMillis() - tempoInicioStress) * 0.001);
        this.pontuacao = lacoStress/tempoFinalStress;
        
        System.out.println("Tempo Principal = "+tempoFinalStress);
        System.out.println("pontuação " + (l2/tempoFinalStress));
        System.out.println("Fim do laço principal");
   }
   
}
