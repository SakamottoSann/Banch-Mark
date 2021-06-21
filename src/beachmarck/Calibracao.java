
package beachmarck;


/**
 *
 * @author Will-Not
 */


public class Calibracao implements Runnable {

    double l1, l2, lacoCalibracao,
            lacoStress,
            tempoFinalCalibracao,
            tempoInicialCalibracao,
            t2,
            tempoTotal;

    public void calibrar() {
        this.lacoCalibracao = 137000000;

        tempoInicialCalibracao = System.currentTimeMillis();
        // laço de calibração 20s
        for (l1 = 0; l1 < lacoCalibracao; l1++) {

            double log = Math.log(37.71);
            double sin = Math.sin(2.46);
            double cos = Math.cos(0.27);
            double raiz = Math.sqrt(7.35);
            double divi = 2.5 / 7.77;
            double exp = Math.exp(3.95);

        }

        this.tempoFinalCalibracao = ((System.currentTimeMillis() - tempoInicialCalibracao) * 0.001);
        //System.out.println("Calibração " + (System.currentTimeMillis() - tempoInicialCalibracao) * 0.001);
        System.out.println("tempo final calibraçao " + tempoFinalCalibracao);
        System.out.println("Laço Calibraçao = " +lacoCalibracao);
        //  this.tempoFinalCalibracao = (x/t2)*240;
        this.lacoStress = ((lacoCalibracao * 30) / tempoFinalCalibracao);
        System.out.println("Laço stress = "+lacoStress);
        System.out.println("fim calibração");
        System.out.println("-------------------------------------------------------");
//        Carrega carrega = new Carrega();
//        carrega.carregaStress(lacoCalibracao);
                
    }

    @Override
    public void run() {
        calibrar();
    }

}
