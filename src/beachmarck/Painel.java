/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beachmarck;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Will-Not
 */
public class Painel extends javax.swing.JFrame {

    InfoSistem info = new InfoSistem();
    Carrega carrega = new Carrega();
    Calibracao calibra = new Calibracao();
    Stress stress;

    /**
     * Creates new form Painel
     */
    public Painel() {
        initComponents();
        clear();

    }

    /**
     * Atuliza as label das thread referentes ao laço de calibração
     */
    public void atualizaLabel() {

        switch (info.numeroThread()) {

            case 2:
                jLThread1.setText("" + carrega.ThreadCalibra1.getName());
                jLEstadoThread1.setText("" + carrega.ThreadCalibra1.getState());

                jLThread2.setText("" + carrega.ThreadCalibra2.getName());
                jLEstadoThread2.setText("" + carrega.ThreadCalibra2.getState());
                break;
            case 4:

                jLThread1.setText("" + carrega.ThreadCalibra1.getName());
                jLEstadoThread1.setText("" + carrega.ThreadCalibra1.getState());

                jLThread2.setText("" + carrega.ThreadCalibra2.getName());
                jLEstadoThread2.setText("" + carrega.ThreadCalibra2.getState());

                jLThread3.setText("" + carrega.ThreadCalibra3.getName());
                jLEstadoThread3.setText("" + carrega.ThreadCalibra3.getState());

                jLThread4.setText("" + carrega.ThreadCalibra4.getName());
                jLEstadoThread4.setText("" + carrega.ThreadCalibra4.getState());

                break;
            case 8:

                jLThread1.setText("" + carrega.ThreadCalibra1.getName());
                jLEstadoThread1.setText("" + carrega.ThreadCalibra1.getState());

                jLThread2.setText("" + carrega.ThreadCalibra2.getName());
                jLEstadoThread2.setText("" + carrega.ThreadCalibra2.getState());

                jLThread3.setText("" + carrega.ThreadCalibra3.getName());
                jLEstadoThread3.setText("" + carrega.ThreadCalibra3.getState());

                jLThread4.setText("" + carrega.ThreadCalibra4.getName());
                jLEstadoThread4.setText("" + carrega.ThreadCalibra4.getState());

                jLThread5.setText("" + carrega.ThreadCalibra5.getName());
                jLEstadoThread5.setText("" + carrega.ThreadCalibra5.getState());

                jLThread6.setText("" + carrega.ThreadCalibra6.getName());
                jLEstadoThread6.setText("" + carrega.ThreadCalibra6.getState());

                jLThread7.setText("" + carrega.ThreadCalibra7.getName());
                jLEstadoThread7.setText("" + carrega.ThreadCalibra7.getState());

                jLThread8.setText("" + carrega.ThreadCalibra8.getName());
                jLEstadoThread8.setText("" + carrega.ThreadCalibra8.getState());
                break;
        }

    }

    /**
     * atuliza nome e estado das label referente as thread de stress
     */
    public void atualizaLabelStress() {
        switch (info.numeroThread()) {

            case 2:

                jLThreadStress1.setText("" + carrega.ThreadStress1.getName());
                jLEstadoThreadStress1.setText("" + carrega.ThreadStress1.getState());

                jLThreadStress2.setText("" + carrega.ThreadStress2.getName());
                jLEstadoThreadStress2.setText("" + carrega.ThreadStress2.getState());

                break;
            case 4:

                jLThreadStress1.setText("" + carrega.ThreadStress1.getName());
                jLEstadoThreadStress1.setText("" + carrega.ThreadStress1.getState());

                jLThreadStress2.setText("" + carrega.ThreadStress2.getName());
                jLEstadoThreadStress2.setText("" + carrega.ThreadStress2.getState());

                jLThreadStress3.setText("" + carrega.ThreadStress3.getName());
                jLEstadoThreadStress3.setText("" + carrega.ThreadStress3.getState());

                jLThreadStress4.setText("" + carrega.ThreadStress4.getName());
                jLEstadoThreadStress4.setText("" + carrega.ThreadStress4.getState());

                break;
            case 8:
                jLThreadStress1.setText("" + carrega.ThreadStress1.getName());
                jLEstadoThreadStress1.setText("" + carrega.ThreadStress1.getState());

                jLThreadStress2.setText("" + carrega.ThreadStress2.getName());
                jLEstadoThreadStress2.setText("" + carrega.ThreadStress2.getState());

                jLThreadStress3.setText("" + carrega.ThreadStress3.getName());
                jLEstadoThreadStress3.setText("" + carrega.ThreadStress3.getState());

                jLThreadStress4.setText("" + carrega.ThreadStress4.getName());
                jLEstadoThreadStress4.setText("" + carrega.ThreadStress4.getState());

                jLThreadStress5.setText("" + carrega.ThreadStress5.getName());
                jLEstadoThreadStress5.setText("" + carrega.ThreadStress5.getState());

                jLThreadStress6.setText("" + carrega.ThreadStress6.getName());
                jLEstadoThreadStress6.setText("" + carrega.ThreadStress6.getState());

                jLThreadStress7.setText("" + carrega.ThreadStress7.getName());
                jLEstadoThreadStress7.setText("" + carrega.ThreadStress7.getState());

                jLThreadStress8.setText("" + carrega.ThreadStress8.getName());
                jLEstadoThreadStress8.setText("" + carrega.ThreadStress8.getState());

                break;
        }
    }

    public void clear() {

        // Inicio limpar campos thread Calibração
        jLThread1.setText("");
        jLEstadoThread1.setText("");

        jLThread2.setText("");
        jLEstadoThread2.setText("");

        jLThread3.setText("");
        jLEstadoThread3.setText("");

        jLThread4.setText("");
        jLEstadoThread4.setText("");

        jLThread5.setText("");
        jLEstadoThread5.setText("");

        jLThread6.setText("");
        jLEstadoThread6.setText("");

        jLThread7.setText("");
        jLEstadoThread7.setText("");

        jLThread8.setText("");
        jLEstadoThread8.setText("");
        // fim limpar thread calibração

        // Inicio limpar thread stress
        jLThreadStress1.setText("");
        jLEstadoThreadStress1.setText("");

        jLThreadStress2.setText("");
        jLEstadoThreadStress2.setText("");

        jLThreadStress3.setText("");
        jLEstadoThreadStress3.setText("");

        jLThreadStress4.setText("");
        jLEstadoThreadStress4.setText("");

        jLThreadStress5.setText("");
        jLEstadoThreadStress5.setText("");

        jLThreadStress6.setText("");
        jLEstadoThreadStress6.setText("");

        jLThreadStress7.setText("");
        jLEstadoThreadStress7.setText("");

        jLThreadStress8.setText("");
        jLEstadoThreadStress8.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabelLegendaPontuacao = new javax.swing.JLabel();
        jBtnEntrar = new javax.swing.JToggleButton();
        jTextFieldPontuacao = new javax.swing.JTextField();
        jBtnRanking = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jProgressBarCalib = new javax.swing.JProgressBar();
        jProgressBarPrincipal = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelEstadoCalib = new javax.swing.JLabel();
        jLabelEstadoPrincipal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLEstadoThread1 = new javax.swing.JLabel();
        jLEstadoThread2 = new javax.swing.JLabel();
        jLEstadoThread3 = new javax.swing.JLabel();
        jLEstadoThread4 = new javax.swing.JLabel();
        jLEstadoThread5 = new javax.swing.JLabel();
        jLEstadoThread6 = new javax.swing.JLabel();
        jLEstadoThread7 = new javax.swing.JLabel();
        jLEstadoThread8 = new javax.swing.JLabel();
        jLThread1 = new javax.swing.JLabel();
        jLThread2 = new javax.swing.JLabel();
        jLThread3 = new javax.swing.JLabel();
        jLThread4 = new javax.swing.JLabel();
        jLThread5 = new javax.swing.JLabel();
        jLThread6 = new javax.swing.JLabel();
        jLabelTituloCalibracao = new javax.swing.JLabel();
        jLThread7 = new javax.swing.JLabel();
        jLThread8 = new javax.swing.JLabel();
        jLabelTituloStress = new javax.swing.JLabel();
        jLThreadStress1 = new javax.swing.JLabel();
        jLEstadoThreadStress1 = new javax.swing.JLabel();
        jLEstadoThreadStress2 = new javax.swing.JLabel();
        jLThreadStress2 = new javax.swing.JLabel();
        jLThreadStress3 = new javax.swing.JLabel();
        jLEstadoThreadStress3 = new javax.swing.JLabel();
        jLEstadoThreadStress4 = new javax.swing.JLabel();
        jLThreadStress4 = new javax.swing.JLabel();
        jLThreadStress5 = new javax.swing.JLabel();
        jLThreadStress6 = new javax.swing.JLabel();
        jLEstadoThreadStress5 = new javax.swing.JLabel();
        jLEstadoThreadStress6 = new javax.swing.JLabel();
        jLEstadoThreadStress7 = new javax.swing.JLabel();
        jLThreadStress7 = new javax.swing.JLabel();
        jLThreadStress8 = new javax.swing.JLabel();
        jLEstadoThreadStress8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BEACHMARK");

        jLabelLegendaPontuacao.setText("Pontuação:");

        jBtnEntrar.setText("Executar");
        jBtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEntrarActionPerformed(evt);
            }
        });

        jTextFieldPontuacao.setEditable(false);
        jTextFieldPontuacao.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldPontuacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldPontuacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPontuacaoActionPerformed(evt);
            }
        });

        jBtnRanking.setText("Ranking");
        jBtnRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRankingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLegendaPontuacao)
                    .addComponent(jTextFieldPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnRanking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jBtnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnRanking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelLegendaPontuacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabelTitulo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabelTitulo.setText("Beanckmarck Gamer");

        jProgressBarCalib.setStringPainted(true);

        jProgressBarPrincipal.setStringPainted(true);

        jLabel2.setText("Executando o Teste de Stress");

        jLabel1.setText("Executando Calibranção");

        jLabelEstadoCalib.setText("Estado");

        jLabelEstadoPrincipal.setText("Estado");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jProgressBarCalib, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelEstadoCalib))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jProgressBarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelEstadoPrincipal))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstadoCalib)
                    .addComponent(jProgressBarCalib, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jProgressBarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstadoPrincipal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLEstadoThread1.setText("jLabel1");
        jLEstadoThread1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThread2.setText("jLabel1");
        jLEstadoThread2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThread3.setText("jLabel1");
        jLEstadoThread3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThread4.setText("jLabel1");
        jLEstadoThread4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThread5.setText("jLabel1");
        jLEstadoThread5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThread6.setText("jLabel1");
        jLEstadoThread6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThread7.setText("jLabel1");
        jLEstadoThread7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThread8.setText("jLabel1");
        jLEstadoThread8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThread1.setText("jLabel1");
        jLThread1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThread2.setText("jLabel1");
        jLThread2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThread3.setText("jLabel1");
        jLThread3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThread4.setText("jLabel1");
        jLThread4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThread5.setText("jLabel1");
        jLThread5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThread6.setText("jLabel1");
        jLThread6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelTituloCalibracao.setText("       Calibração");
        jLabelTituloCalibracao.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThread7.setText("jLabel1");
        jLThread7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThread8.setText("jLabel1");
        jLThread8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabelTituloStress.setText("Thread de Stress");
        jLabelTituloStress.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThreadStress1.setText("jLabel1");
        jLThreadStress1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThreadStress1.setText("jLabel1");
        jLEstadoThreadStress1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThreadStress2.setText("jLabel1");
        jLEstadoThreadStress2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThreadStress2.setText("jLabel1");
        jLThreadStress2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThreadStress3.setText("jLabel1");
        jLThreadStress3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThreadStress3.setText("jLabel1");
        jLEstadoThreadStress3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThreadStress4.setText("jLabel1");
        jLEstadoThreadStress4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThreadStress4.setText("jLabel1");
        jLThreadStress4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThreadStress5.setText("jLabel1");
        jLThreadStress5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThreadStress6.setText("jLabel1");
        jLThreadStress6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThreadStress5.setText("jLabel1");
        jLEstadoThreadStress5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThreadStress6.setText("jLabel1");
        jLEstadoThreadStress6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThreadStress7.setText("jLabel1");
        jLEstadoThreadStress7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThreadStress7.setText("jLabel1");
        jLThreadStress7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLThreadStress8.setText("jLabel1");
        jLThreadStress8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLEstadoThreadStress8.setText("jLabel1");
        jLEstadoThreadStress8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLThread1)
                                    .addComponent(jLThread2)
                                    .addComponent(jLThread3)
                                    .addComponent(jLThread4))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLEstadoThread1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLEstadoThread2)
                                    .addComponent(jLEstadoThread3)
                                    .addComponent(jLEstadoThread4)
                                    .addComponent(jLEstadoThread5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLThread8)
                                    .addComponent(jLThread7)
                                    .addComponent(jLThread6)
                                    .addComponent(jLThread5))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLEstadoThread7)
                                    .addComponent(jLEstadoThread8)
                                    .addComponent(jLEstadoThread6)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTituloCalibracao, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(126, 126, 126)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLThreadStress8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLThreadStress1)
                            .addComponent(jLThreadStress2))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLEstadoThreadStress2)
                            .addComponent(jLEstadoThreadStress1)
                            .addComponent(jLEstadoThreadStress3)
                            .addComponent(jLEstadoThreadStress4)
                            .addComponent(jLEstadoThreadStress5)
                            .addComponent(jLEstadoThreadStress6)
                            .addComponent(jLEstadoThreadStress7)
                            .addComponent(jLEstadoThreadStress8)))
                    .addComponent(jLThreadStress3)
                    .addComponent(jLThreadStress4)
                    .addComponent(jLThreadStress5)
                    .addComponent(jLThreadStress6)
                    .addComponent(jLThreadStress7)
                    .addComponent(jLabelTituloStress))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTituloCalibracao)
                    .addComponent(jLabelTituloStress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLThread1)
                    .addComponent(jLEstadoThread1)
                    .addComponent(jLThreadStress1)
                    .addComponent(jLEstadoThreadStress1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLThread2)
                    .addComponent(jLEstadoThread2)
                    .addComponent(jLThreadStress2)
                    .addComponent(jLEstadoThreadStress2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLThread3)
                    .addComponent(jLEstadoThread3)
                    .addComponent(jLThreadStress3)
                    .addComponent(jLEstadoThreadStress3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLThread4)
                    .addComponent(jLEstadoThread4)
                    .addComponent(jLThreadStress4)
                    .addComponent(jLEstadoThreadStress4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLThread5)
                    .addComponent(jLEstadoThread5)
                    .addComponent(jLThreadStress5)
                    .addComponent(jLEstadoThreadStress5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLThread6)
                    .addComponent(jLEstadoThread6)
                    .addComponent(jLThreadStress6)
                    .addComponent(jLEstadoThreadStress6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLThread7)
                    .addComponent(jLEstadoThread7)
                    .addComponent(jLThreadStress7)
                    .addComponent(jLEstadoThreadStress7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLThread8)
                    .addComponent(jLEstadoThread8)
                    .addComponent(jLThreadStress8)
                    .addComponent(jLEstadoThreadStress8))
                .addGap(79, 79, 79))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 38, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(366, 366, 366)
                                .addComponent(jLabelTitulo)))
                        .addGap(0, 0, 0)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEntrarActionPerformed

        // Inicia laço de calibração
        carrega.carregaCalibracao();

        new Thread() {

            public void run() {

                /**
                 * COntrola barra de progresso e atualizações, primeiro for
                 * barra de calibração
                 */
                for (int i = 0; i < (carrega.calibraThread1.lacoCalibracao); i = (int)carrega.calibraThread4.l1) {

                    try {
                        atualizaLabel();

                        sleep(100);
                        jProgressBarCalib.setValue((int) (carrega.calibraThread4.l1 * 100 / carrega.calibraThread4.lacoCalibracao));
                        if (jProgressBarCalib.getValue() < 100) {
                            jLabelEstadoCalib.setText("Carregando...");
                        } else {
                            if (jProgressBarCalib.getValue() == 100) {
                                jLabelEstadoCalib.setText("Concluido !");
                                carrega.finalizaCalibracao();
                                double temp1 = carrega.retornaCalibracao();
                                carrega.carregaStress(temp1);
                                atualizaLabel();

                                /**
                                 * Controla barra de prograsso Stress
                                 */
                                for (int j = 0; j < carrega.stressThread2.lacoStress; j=(int)carrega.stressThread2.l2) {

                                    if (jProgressBarPrincipal.getValue() <= 5) {
                                         atualizaLabel();
                                    }
                                    try {
                                       
                                        atualizaLabelStress();
                                        sleep(100);

                                        jProgressBarPrincipal.setValue((int) (carrega.stressThread2.l2 * 100 / carrega.stressThread2.lacoStress));
                                        if (jProgressBarPrincipal.getValue() <= 2) {
                                            jLabelEstadoPrincipal.setText("Carregando...");
                                        }
                                        if (jProgressBarPrincipal.getValue() == 100) {
                                            jLabelEstadoPrincipal.setText("Concluido !");
                                            NumberFormat nf = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));
//                                            double valor = 78945;
                                            //System.out.println("" + nf.format(carrega.retornaPontuacao()));
                                            jTextFieldPontuacao.setText("" + nf.format(carrega.retornaPontuacao()));
                                            System.out.println("If 2 stress");
                                           atualizaLabel();
                                      atualizaLabelStress();
                                        }

                                    } catch (Exception e) {
                                        System.out.println(e);
                                    }
                                }                                
                            }
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }

            }
        }.start();


    }//GEN-LAST:event_jBtnEntrarActionPerformed

    private void jBtnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRankingActionPerformed
        String listagem = "";
        try {
            new ManupilaArquivo().ordenar(new File(System.getProperty("user.dir") + "\\ranking.txt"), new File(System.getProperty("user.dir") + "\\ranking.txt"));
        } catch (IOException ex) {
            Logger.getLogger(Painel.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            listagem = ManupilaArquivo.leitor();

            MyJDialog dialog = new MyJDialog(new JFrame(), "RANKING", listagem);
            // set the size of the window
            dialog.setSize(600, 600);

        } catch (IOException ex) {
            Logger.getLogger(Painel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBtnRankingActionPerformed

    private void jTextFieldPontuacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPontuacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPontuacaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Painel().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jBtnEntrar;
    private javax.swing.JButton jBtnRanking;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLEstadoThread1;
    private javax.swing.JLabel jLEstadoThread2;
    private javax.swing.JLabel jLEstadoThread3;
    private javax.swing.JLabel jLEstadoThread4;
    private javax.swing.JLabel jLEstadoThread5;
    private javax.swing.JLabel jLEstadoThread6;
    private javax.swing.JLabel jLEstadoThread7;
    private javax.swing.JLabel jLEstadoThread8;
    private javax.swing.JLabel jLEstadoThreadStress1;
    private javax.swing.JLabel jLEstadoThreadStress2;
    private javax.swing.JLabel jLEstadoThreadStress3;
    private javax.swing.JLabel jLEstadoThreadStress4;
    private javax.swing.JLabel jLEstadoThreadStress5;
    private javax.swing.JLabel jLEstadoThreadStress6;
    private javax.swing.JLabel jLEstadoThreadStress7;
    private javax.swing.JLabel jLEstadoThreadStress8;
    private javax.swing.JLabel jLThread1;
    private javax.swing.JLabel jLThread2;
    private javax.swing.JLabel jLThread3;
    private javax.swing.JLabel jLThread4;
    private javax.swing.JLabel jLThread5;
    private javax.swing.JLabel jLThread6;
    private javax.swing.JLabel jLThread7;
    private javax.swing.JLabel jLThread8;
    private javax.swing.JLabel jLThreadStress1;
    private javax.swing.JLabel jLThreadStress2;
    private javax.swing.JLabel jLThreadStress3;
    private javax.swing.JLabel jLThreadStress4;
    private javax.swing.JLabel jLThreadStress5;
    private javax.swing.JLabel jLThreadStress6;
    private javax.swing.JLabel jLThreadStress7;
    private javax.swing.JLabel jLThreadStress8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEstadoCalib;
    private javax.swing.JLabel jLabelEstadoPrincipal;
    private javax.swing.JLabel jLabelLegendaPontuacao;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloCalibracao;
    private javax.swing.JLabel jLabelTituloStress;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBarCalib;
    private javax.swing.JProgressBar jProgressBarPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldPontuacao;
    // End of variables declaration//GEN-END:variables

}
