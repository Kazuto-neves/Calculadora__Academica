/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculodoraacademico;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Calculadora extends javax.swing.JFrame {
    private Operador operador;
    double valor1=0, valor2=0;
    String sinal;
    

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        operador = new Operador();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        Resultado = new javax.swing.JTextField();
        CE = new javax.swing.JButton();
        DIV = new javax.swing.JButton();
        MUT = new javax.swing.JButton();
        SUB = new javax.swing.JButton();
        BTN7 = new javax.swing.JButton();
        BTN8 = new javax.swing.JButton();
        BTN9 = new javax.swing.JButton();
        ADD = new javax.swing.JButton();
        BTN4 = new javax.swing.JButton();
        BTN5 = new javax.swing.JButton();
        BTN6 = new javax.swing.JButton();
        BTN1 = new javax.swing.JButton();
        BTN2 = new javax.swing.JButton();
        BTN3 = new javax.swing.JButton();
        BTNptn = new javax.swing.JButton();
        BTN0 = new javax.swing.JButton();
        IGUAL = new javax.swing.JButton();
        RST = new javax.swing.JButton();
        POR = new javax.swing.JButton();
        EL2 = new javax.swing.JButton();
        RAIZ = new javax.swing.JButton();
        ELN = new javax.swing.JButton();
        INV = new javax.swing.JButton();
        Placa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        OFF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 444, 444));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setResizable(false);

        Titulo.setFont(new java.awt.Font("Power Red and Green", 0, 18)); // NOI18N
        Titulo.setText("Calculadora");

        Resultado.setBackground(new java.awt.Color(0, 51, 102));
        Resultado.setFont(new java.awt.Font("Power Red and Green", 0, 18)); // NOI18N
        Resultado.setForeground(new java.awt.Color(0, 255, 51));
        Resultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoActionPerformed(evt);
            }
        });

        CE.setBackground(new java.awt.Color(0, 204, 102));
        CE.setFont(new java.awt.Font("Power Red and Green", 0, 18)); // NOI18N
        CE.setForeground(new java.awt.Color(255, 255, 255));
        CE.setText("CE");
        CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEActionPerformed(evt);
            }
        });

        DIV.setFont(new java.awt.Font("Power Red and Green", 0, 18)); // NOI18N
        DIV.setForeground(new java.awt.Color(0, 0, 153));
        DIV.setText("/");
        DIV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIVActionPerformed(evt);
            }
        });

        MUT.setFont(new java.awt.Font("Power Red and Green", 0, 18)); // NOI18N
        MUT.setForeground(new java.awt.Color(0, 0, 153));
        MUT.setText("*");
        MUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MUTActionPerformed(evt);
            }
        });

        SUB.setFont(new java.awt.Font("Power Red and Green", 0, 18)); // NOI18N
        SUB.setForeground(new java.awt.Color(0, 0, 153));
        SUB.setText("-");
        SUB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBActionPerformed(evt);
            }
        });

        BTN7.setFont(new java.awt.Font("Power Red and Green", 0, 18)); // NOI18N
        BTN7.setText("7");
        BTN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN7ActionPerformed(evt);
            }
        });

        BTN8.setFont(new java.awt.Font("Power Red and Green", 0, 18)); // NOI18N
        BTN8.setText("8");
        BTN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN8ActionPerformed(evt);
            }
        });

        BTN9.setFont(new java.awt.Font("Power Red and Green", 0, 18)); // NOI18N
        BTN9.setText("9");
        BTN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN9ActionPerformed(evt);
            }
        });

        ADD.setFont(new java.awt.Font("Power Red and Green", 0, 18)); // NOI18N
        ADD.setForeground(new java.awt.Color(0, 0, 153));
        ADD.setText("+");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        BTN4.setFont(new java.awt.Font("Power Red and Green", 0, 18)); // NOI18N
        BTN4.setText("4");
        BTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN4ActionPerformed(evt);
            }
        });

        BTN5.setFont(new java.awt.Font("Power Red and Green", 0, 18)); // NOI18N
        BTN5.setText("5");
        BTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN5ActionPerformed(evt);
            }
        });

        BTN6.setFont(new java.awt.Font("Power Red and Green", 0, 18)); // NOI18N
        BTN6.setText("6");
        BTN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN6ActionPerformed(evt);
            }
        });

        BTN1.setFont(new java.awt.Font("Power Red and Green", 0, 18)); // NOI18N
        BTN1.setText("1");
        BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN1ActionPerformed(evt);
            }
        });

        BTN2.setFont(new java.awt.Font("Power Red and Green", 0, 18)); // NOI18N
        BTN2.setText("2");
        BTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN2ActionPerformed(evt);
            }
        });

        BTN3.setFont(new java.awt.Font("Power Red and Green", 0, 18)); // NOI18N
        BTN3.setText("3");
        BTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN3ActionPerformed(evt);
            }
        });

        BTNptn.setFont(new java.awt.Font("Power Red and Green", 0, 18)); // NOI18N
        BTNptn.setText(",");
        BTNptn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNptnActionPerformed(evt);
            }
        });

        BTN0.setFont(new java.awt.Font("Power Red and Green", 0, 18)); // NOI18N
        BTN0.setText("0");
        BTN0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN0ActionPerformed(evt);
            }
        });

        IGUAL.setBackground(new java.awt.Color(255, 0, 0));
        IGUAL.setFont(new java.awt.Font("Power Red and Green", 0, 18)); // NOI18N
        IGUAL.setForeground(new java.awt.Color(255, 255, 255));
        IGUAL.setText("=");
        IGUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IGUALActionPerformed(evt);
            }
        });

        RST.setFont(new java.awt.Font("Power Red and Green", 0, 18)); // NOI18N
        RST.setForeground(new java.awt.Color(0, 0, 153));
        RST.setText("L_");
        RST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RSTActionPerformed(evt);
            }
        });

        POR.setFont(new java.awt.Font("Power Red and Green", 0, 18)); // NOI18N
        POR.setForeground(new java.awt.Color(0, 0, 153));
        POR.setText("%");
        POR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PORActionPerformed(evt);
            }
        });

        EL2.setFont(new java.awt.Font("Power Red and Green", 0, 18)); // NOI18N
        EL2.setForeground(new java.awt.Color(0, 0, 153));
        EL2.setText("x²");
        EL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EL2ActionPerformed(evt);
            }
        });

        RAIZ.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RAIZ.setForeground(new java.awt.Color(0, 0, 153));
        RAIZ.setText("√");
        RAIZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAIZActionPerformed(evt);
            }
        });

        ELN.setFont(new java.awt.Font("Power Red and Green", 0, 16)); // NOI18N
        ELN.setForeground(new java.awt.Color(0, 0, 153));
        ELN.setText("x^y");
        ELN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELNActionPerformed(evt);
            }
        });

        INV.setFont(new java.awt.Font("Power Red and Green", 0, 18)); // NOI18N
        INV.setForeground(new java.awt.Color(0, 0, 153));
        INV.setText("+-");
        INV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INVActionPerformed(evt);
            }
        });

        Placa.setBackground(new java.awt.Color(153, 153, 0));

        jLabel1.setForeground(new java.awt.Color(102, 102, 0));
        jLabel1.setText("|      |      |      |");

        javax.swing.GroupLayout PlacaLayout = new javax.swing.GroupLayout(Placa);
        Placa.setLayout(PlacaLayout);
        PlacaLayout.setHorizontalGroup(
            PlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlacaLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PlacaLayout.setVerticalGroup(
            PlacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        OFF.setBackground(new java.awt.Color(255, 0, 0));
        OFF.setFont(new java.awt.Font("Power Red and Green", 0, 16)); // NOI18N
        OFF.setForeground(new java.awt.Color(255, 255, 255));
        OFF.setText("OFF");
        OFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OFFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Resultado)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(BTN0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BTNptn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(BTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(BTN5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(BTN6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(BTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(BTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(BTN3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(RAIZ, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(EL2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(INV, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ELN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(IGUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BTN7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RST, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(POR, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CE, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MUT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DIV, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SUB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Titulo)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(OFF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OFF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MUT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DIV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SUB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RST, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(POR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EL2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ELN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RAIZ, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN0, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNptn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(INV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(IGUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CE.getAccessibleContext().setAccessibleDescription("Limpar calculo");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MUTActionPerformed
        valor1 = Double.parseDouble(Resultado.getText());   sinal="Mut";    Resultado.setText("");
    }//GEN-LAST:event_MUTActionPerformed

    private void SUBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBActionPerformed
        valor1 = Double.parseDouble(Resultado.getText());   sinal="Sub";    Resultado.setText("");
    }//GEN-LAST:event_SUBActionPerformed

    private void BTN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN7ActionPerformed
        Resultado.setText(Resultado.getText() + "7");
    }//GEN-LAST:event_BTN7ActionPerformed

    private void BTN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN8ActionPerformed
        Resultado.setText(Resultado.getText() + "8");
    }//GEN-LAST:event_BTN8ActionPerformed

    private void BTN9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN9ActionPerformed
        Resultado.setText(Resultado.getText() + "9");
    }//GEN-LAST:event_BTN9ActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        valor1 = Double.parseDouble(Resultado.getText());   sinal="Soma";   Resultado.setText("");
    }//GEN-LAST:event_ADDActionPerformed

    private void BTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN4ActionPerformed
        Resultado.setText(Resultado.getText() + "4");
    }//GEN-LAST:event_BTN4ActionPerformed

    private void BTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN5ActionPerformed
        Resultado.setText(Resultado.getText() + "5");
    }//GEN-LAST:event_BTN5ActionPerformed

    private void BTN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN6ActionPerformed
        Resultado.setText(Resultado.getText() + "6");
    }//GEN-LAST:event_BTN6ActionPerformed

    private void BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN1ActionPerformed
        Resultado.setText(Resultado.getText() + "1");
    }//GEN-LAST:event_BTN1ActionPerformed

    private void BTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN2ActionPerformed
        Resultado.setText(Resultado.getText() + "2");
    }//GEN-LAST:event_BTN2ActionPerformed

    private void BTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN3ActionPerformed
        Resultado.setText(Resultado.getText() + "3");
    }//GEN-LAST:event_BTN3ActionPerformed

    private void BTNptnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNptnActionPerformed
        Resultado.setText(Resultado.getText() + ".");
    }//GEN-LAST:event_BTNptnActionPerformed

    private void BTN0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN0ActionPerformed
        Resultado.setText(Resultado.getText() + "0");
    }//GEN-LAST:event_BTN0ActionPerformed

    private void IGUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IGUALActionPerformed
        switch (sinal) {
            case "Soma" -> {
                valor2 = Double.parseDouble(Resultado.getText());
                Resultado.setText(String.valueOf(operador.Somar(valor1, valor2)));
            }
            case "Sub" -> {
                valor2 = Double.parseDouble(Resultado.getText());
                Resultado.setText(String.valueOf(operador.Subitrair(valor1, valor2)));
            }
            case "Mut" -> {
                valor2 = Double.parseDouble(Resultado.getText());
                Resultado.setText(String.valueOf(operador.Multiplicar(valor1, valor2)));
            }
            case "Div" -> {
                valor2 = Double.parseDouble(Resultado.getText());
                Resultado.setText(String.valueOf(operador.Dividir(valor1, valor2)));
            }
            case "Resto" -> {
                valor2 = Double.parseDouble(Resultado.getText());
                Resultado.setText(String.valueOf(operador.Resto(valor1, valor2)));
            }
            case "Por" -> {
                valor2 = Double.parseDouble(Resultado.getText());
                Resultado.setText(String.valueOf(operador.Porcentagem(valor1, valor2)));
            }
            case "Raiz" -> Resultado.setText(String.valueOf(operador.Raiz(valor1)));
            case "EL2" -> Resultado.setText(String.valueOf(operador.Potencia_2(valor1)));
            case "ELN" -> {
                valor2 = Double.parseDouble(Resultado.getText());
                Resultado.setText(String.valueOf(operador.Potencia_N(valor1,valor2)));
            }
            case "INV" -> Resultado.setText(String.valueOf(operador.Inverter(valor1)));
            //default -> JOptionPane.showMessageDialog(this,"Atribua uma operação");
         }
        
    }//GEN-LAST:event_IGUALActionPerformed

    private void CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEActionPerformed
        Resultado.setText("");
        valor1=0;   valor2=0;
    }//GEN-LAST:event_CEActionPerformed

    private void DIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIVActionPerformed
       valor1 = Double.parseDouble(Resultado.getText());    sinal="Div"; Resultado.setText("");
    }//GEN-LAST:event_DIVActionPerformed

    private void ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoActionPerformed

    }//GEN-LAST:event_ResultadoActionPerformed

    private void RSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RSTActionPerformed
        valor1 = Double.parseDouble(Resultado.getText());   sinal="Resto";   Resultado.setText("");
    }//GEN-LAST:event_RSTActionPerformed

    private void PORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PORActionPerformed
         valor1 = Double.parseDouble(Resultado.getText());   sinal="Por";   Resultado.setText("");
    }//GEN-LAST:event_PORActionPerformed

    private void RAIZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAIZActionPerformed
        valor1 = Double.parseDouble(Resultado.getText());   sinal="Raiz";   Resultado.setText("");
    }//GEN-LAST:event_RAIZActionPerformed

    private void EL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EL2ActionPerformed
        valor1 = Double.parseDouble(Resultado.getText());   sinal="EL2";   Resultado.setText("");
    }//GEN-LAST:event_EL2ActionPerformed

    private void ELNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELNActionPerformed
        valor1 = Double.parseDouble(Resultado.getText());   sinal="ELN";   Resultado.setText("");
    }//GEN-LAST:event_ELNActionPerformed

    private void INVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INVActionPerformed
        valor1 = Double.parseDouble(Resultado.getText());   sinal="INV";   Resultado.setText("");
    }//GEN-LAST:event_INVActionPerformed

    private void OFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OFFActionPerformed
        dispose();
    }//GEN-LAST:event_OFFActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton BTN0;
    private javax.swing.JButton BTN1;
    private javax.swing.JButton BTN2;
    private javax.swing.JButton BTN3;
    private javax.swing.JButton BTN4;
    private javax.swing.JButton BTN5;
    private javax.swing.JButton BTN6;
    private javax.swing.JButton BTN7;
    private javax.swing.JButton BTN8;
    private javax.swing.JButton BTN9;
    private javax.swing.JButton BTNptn;
    private javax.swing.JButton CE;
    private javax.swing.JButton DIV;
    private javax.swing.JButton EL2;
    private javax.swing.JButton ELN;
    private javax.swing.JButton IGUAL;
    private javax.swing.JButton INV;
    private javax.swing.JButton MUT;
    private javax.swing.JButton OFF;
    private javax.swing.JButton POR;
    private javax.swing.JPanel Placa;
    private javax.swing.JButton RAIZ;
    private javax.swing.JButton RST;
    private javax.swing.JTextField Resultado;
    private javax.swing.JButton SUB;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
