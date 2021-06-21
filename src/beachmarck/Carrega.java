/**
 *
 * @author Will-Not
 */
package beachmarck;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Carrega {

    double retornaCalibracao;

    Calibracao calibraThread1,
            calibraThread2,
            calibraThread3,
            calibraThread4,
            calibraThread5,
            calibraThread6,
            calibraThread7,
            calibraThread8;

    Stress stressThread1,
            stressThread2,
            stressThread3,
            stressThread4,
            stressThread5,
            stressThread6,
            stressThread7,
            stressThread8;

    Thread ThreadCalibra1,
            ThreadCalibra2,
            ThreadCalibra3,
            ThreadCalibra4,
            ThreadCalibra5,
            ThreadCalibra6,
            ThreadCalibra7,
            ThreadCalibra8;

    Thread ThreadStress1,
            ThreadStress2,
            ThreadStress3,
            ThreadStress4,
            ThreadStress5,
            ThreadStress6,
            ThreadStress7,
            ThreadStress8;
    InfoSistem info = new InfoSistem();

    public void carregaCalibracao() {

        switch (info.numeroThread()) {

            case 2:

                ThreadCalibra1 = new Thread(calibraThread1 = new Calibracao());
                ThreadCalibra1.setName("Thread 01");
                ThreadCalibra1.start();
                ThreadCalibra2 = new Thread(calibraThread2 = new Calibracao());
                ThreadCalibra2.setName("Thread 02");
                ThreadCalibra2.start();
                break;

            case 4:

                ThreadCalibra1 = new Thread(calibraThread1 = new Calibracao());
                ThreadCalibra1.setName("Thread 01");
                ThreadCalibra1.start();
                ThreadCalibra2 = new Thread(calibraThread2 = new Calibracao());
                ThreadCalibra2.setName("Thread 02");
                ThreadCalibra2.start();
                ThreadCalibra3 = new Thread(calibraThread3 = new Calibracao());
                ThreadCalibra3.setName("Thread 03");
                ThreadCalibra3.start();
                ThreadCalibra4 = new Thread(calibraThread4 = new Calibracao());
                ThreadCalibra4.setName("Thread 04");
                ThreadCalibra4.start();
                break;

            case 8:

                ThreadCalibra1 = new Thread(calibraThread1 = new Calibracao());
                ThreadCalibra1.setName("Thread 01");
                ThreadCalibra1.start();
                ThreadCalibra2 = new Thread(calibraThread2 = new Calibracao());
                ThreadCalibra2.setName("Thread 02");
                ThreadCalibra2.start();
                ThreadCalibra3 = new Thread(calibraThread3 = new Calibracao());
                ThreadCalibra3.setName("Thread 03");
                ThreadCalibra3.start();
                ThreadCalibra4 = new Thread(calibraThread4 = new Calibracao());
                ThreadCalibra4.setName("Thread 04");
                ThreadCalibra4.start();
                ThreadCalibra5 = new Thread(calibraThread5 = new Calibracao());
                ThreadCalibra5.setName("Thread 05");
                ThreadCalibra5.start();
                ThreadCalibra6 = new Thread(calibraThread6 = new Calibracao());
                ThreadCalibra6.setName("Thread 06");
                ThreadCalibra6.start();
                ThreadCalibra7 = new Thread(calibraThread7 = new Calibracao());
                ThreadCalibra7.setName("Thread 07");
                ThreadCalibra7.start();
                ThreadCalibra8 = new Thread(calibraThread8 = new Calibracao());
                ThreadCalibra8.setName("Thread 08");
                ThreadCalibra8.start();
                break;
        }

    }

    public double retornaCalibracao() {
        double temp1,
                temp2,
                temp3,
                temp4,
                temp5,
                temp6,
                temp7,
                temp8;

        switch (info.numeroThread()) {
            case 2:

                temp1 = calibraThread1.lacoStress;
                temp2 = calibraThread2.lacoStress;

                retornaCalibracao = (temp1 + temp2) / info.numeroThread();

                break;

            case 4:

                temp1 = calibraThread1.lacoStress;
                temp2 = calibraThread2.lacoStress;
                temp3 = calibraThread3.lacoStress;
                temp4 = calibraThread4.lacoStress;

                retornaCalibracao = (temp1 + temp2 + temp3 + temp4) / info.numeroThread();

                break;
            case 8:

                temp1 = calibraThread1.lacoStress;
                temp2 = calibraThread2.lacoStress;
                temp3 = calibraThread3.lacoStress;
                temp4 = calibraThread4.lacoStress;
                temp5 = calibraThread5.lacoStress;
                temp6 = calibraThread6.lacoStress;
                temp7 = calibraThread7.lacoStress;
                temp8 = calibraThread8.lacoStress;
                retornaCalibracao = (temp1 + temp2 + temp3 + temp4 + temp5 + temp6 + temp7 + temp8) / info.numeroThread();

                break;
        }

        return retornaCalibracao;
    }

    public void finalizaCalibracao() {
        switch (info.numeroThread()) {
            case 4:
                ThreadCalibra1.interrupt();

                ThreadCalibra2.interrupt();

                ThreadCalibra3.interrupt();

                ThreadCalibra4.interrupt();

                break;
        }
    }

    public void carregaStress(double tempoCalibracao) {

        switch (info.numeroThread()) {
            case 2:

                ThreadStress1 = new Thread(stressThread1 = new Stress(tempoCalibracao));
                ThreadStress1.setName("Thread 01");
                ThreadStress1.start();

                ThreadStress2 = new Thread(stressThread2 = new Stress(tempoCalibracao));
                ThreadStress2.setName("Thread 02");
                ThreadStress2.start();

                break;

            case 4:

                ThreadStress1 = new Thread(stressThread1 = new Stress(tempoCalibracao));
                ThreadStress1.setName("Thread 01");
                ThreadStress1.start();

                ThreadStress2 = new Thread(stressThread2 = new Stress(tempoCalibracao));
                ThreadStress2.setName("Thread 02");
                ThreadStress2.start();

                ThreadStress3 = new Thread(stressThread3 = new Stress(tempoCalibracao));
                ThreadStress3.setName("Thread 03");
                ThreadStress3.start();

                ThreadStress4 = new Thread(stressThread4 = new Stress(tempoCalibracao));
                ThreadStress4.setName("Thread 04");
                ThreadStress4.start();

                break;

            case 8:

                ThreadStress1 = new Thread(stressThread1 = new Stress(tempoCalibracao));
                ThreadStress1.setName("Thread 01");
                ThreadStress1.start();

                ThreadStress2 = new Thread(stressThread2 = new Stress(tempoCalibracao));
                ThreadStress2.setName("Thread 02");
                ThreadStress2.start();

                ThreadStress3 = new Thread(stressThread3 = new Stress(tempoCalibracao));
                ThreadStress3.setName("Thread 03");
                ThreadStress3.start();

                ThreadStress4 = new Thread(stressThread4 = new Stress(tempoCalibracao));
                ThreadStress4.setName("Thread 04");
                ThreadStress4.start();

                ThreadStress5 = new Thread(stressThread5 = new Stress(tempoCalibracao));
                ThreadStress5.setName("Thread 05");
                ThreadStress5.start();

                ThreadStress6 = new Thread(stressThread6 = new Stress(tempoCalibracao));
                ThreadStress6.setName("Thread 06");
                ThreadStress6.start();

                ThreadStress7 = new Thread(stressThread7 = new Stress(tempoCalibracao));
                ThreadStress7.setName("Thread 07");
                ThreadStress7.start();

                ThreadStress8 = new Thread(stressThread8 = new Stress(tempoCalibracao));
                ThreadStress8.setName("Thread 08");
                ThreadStress8.start();

                break;
        }

    }

    public double retornaPontuacao() {
        double pontuacao = 0,
                pontuacao1,
                pontuacao2,
                pontuacao3,
                pontuacao4,
                pontuacao5,
                pontuacao6,
                pontuacao7,
                pontuacao8,
                pontuacaoFinal;

        switch (info.numeroThread()) {

            case 2:

                pontuacao1 = stressThread1.pontuacao;
                pontuacao2 = stressThread2.pontuacao;

                pontuacao = pontuacao1 + pontuacao2;
                break;

            case 4:

                pontuacao1 = stressThread1.pontuacao;
                pontuacao2 = stressThread2.pontuacao;
                pontuacao3 = stressThread3.pontuacao;
                pontuacao4 = stressThread4.pontuacao;

                pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4;
                break;

            case 8:

                pontuacao1 = stressThread1.pontuacao;
                pontuacao2 = stressThread2.pontuacao;
                pontuacao3 = stressThread3.pontuacao;
                pontuacao4 = stressThread4.pontuacao;
                pontuacao5 = stressThread5.pontuacao;
                pontuacao6 = stressThread6.pontuacao;
                pontuacao7 = stressThread7.pontuacao;
                pontuacao8 = stressThread8.pontuacao;

                pontuacao = pontuacao1 + pontuacao2 + pontuacao3 + pontuacao4 + pontuacao5 + pontuacao6 + pontuacao7 + pontuacao8;
                break;
        }
        pontuacaoFinal = pontuacao/1000;
        try {
            ManupilaArquivo.escritor(Double.toString(pontuacaoFinal));
        } catch (IOException ex) {
            Logger.getLogger(Carrega.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pontuacaoFinal;
    }

}
