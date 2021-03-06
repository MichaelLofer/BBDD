/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador_de_consultas.screens;

import simulador_de_consultas.classes.Query;

/**
 *
 * @author mr.blissfulgrin
 */
public class Asker extends javax.swing.JFrame
{
    private final Query question;
    
    public Asker(int permission)
    {
        initComponents();
        question = new Query(permission);
    }
    
    public void ask (int code)
    {
        display.setText(question.getQuery(code));
    }
    public void ask (String consulta)
    {
        display.setText(question.getQuery(consulta));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        c1 = new javax.swing.JButton();
        c2 = new javax.swing.JButton();
        c3 = new javax.swing.JButton();
        c4 = new javax.swing.JButton();
        c5 = new javax.swing.JButton();
        c6 = new javax.swing.JButton();
        txt = new javax.swing.JLabel();
        c7 = new javax.swing.JButton();
        c8 = new javax.swing.JButton();
        c9 = new javax.swing.JButton();
        c10 = new javax.swing.JButton();
        c11 = new javax.swing.JButton();
        c12 = new javax.swing.JButton();
        c13 = new javax.swing.JButton();
        c14 = new javax.swing.JButton();
        c15 = new javax.swing.JButton();
        c16 = new javax.swing.JButton();
        c17 = new javax.swing.JButton();
        c18 = new javax.swing.JButton();
        c19 = new javax.swing.JButton();
        c20 = new javax.swing.JButton();
        c21 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        consulta = new javax.swing.JTextArea();
        c0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(900, 80));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(900, 80));
        jScrollPane1.setSize(new java.awt.Dimension(900, 80));

        display.setEditable(false);
        display.setColumns(20);
        display.setRows(5);
        display.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        display.setEnabled(false);
        display.setFocusable(false);
        display.setMinimumSize(new java.awt.Dimension(900, 80));
        display.setPreferredSize(new java.awt.Dimension(900, 80));
        display.setSize(new java.awt.Dimension(900, 80));
        jScrollPane1.setViewportView(display);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 223;
        gridBagConstraints.ipady = 63;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(14, 38, 29, 33);
        jPanel2.add(jScrollPane1, gridBagConstraints);

        c1.setText("Consulta 1");
        c1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                c1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jPanel2.add(c1, gridBagConstraints);

        c2.setText("Consulta 2");
        c2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                c2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jPanel2.add(c2, gridBagConstraints);

        c3.setText("Consulta 3");
        c3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                c3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jPanel2.add(c3, gridBagConstraints);

        c4.setText("Consulta 4");
        c4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                c4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jPanel2.add(c4, gridBagConstraints);

        c5.setText("Consulta 5");
        c5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                c5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jPanel2.add(c5, gridBagConstraints);

        c6.setText("Consulta 6");
        c6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                c6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jPanel2.add(c6, gridBagConstraints);

        txt.setFont(new java.awt.Font("Luminari", 1, 36)); // NOI18N
        txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt.setText("QUeRys");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 32, 32, 32);
        jPanel2.add(txt, gridBagConstraints);

        c7.setText("Consulta 7");
        c7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                c7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jPanel2.add(c7, gridBagConstraints);

        c8.setText("Consulta 8");
        c8.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                c8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jPanel2.add(c8, gridBagConstraints);

        c9.setText("Consulta 9");
        c9.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                c9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jPanel2.add(c9, gridBagConstraints);

        c10.setText("Consulta 10");
        c10.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                c10ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jPanel2.add(c10, gridBagConstraints);

        c11.setText("Consulta 11");
        c11.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                c11ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 15, 0);
        jPanel2.add(c11, gridBagConstraints);

        c12.setText("Consulta 12");
        c12.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                c12ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(c12, gridBagConstraints);

        c13.setText("Consulta 13");
        c13.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                c13ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(c13, gridBagConstraints);

        c14.setText("Consulta 14");
        c14.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                c14ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(c14, gridBagConstraints);

        c15.setText("Consulta 15");
        c15.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                c15ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(c15, gridBagConstraints);

        c16.setText("Consulta 16");
        c16.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                c16ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(c16, gridBagConstraints);

        c17.setText("Consulta 17");
        c17.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                c17ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(c17, gridBagConstraints);

        c18.setText("Consulta 18");
        c18.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                c18ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(c18, gridBagConstraints);

        c19.setText("Consulta 19");
        c19.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                c19ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(c19, gridBagConstraints);

        c20.setText("Consulta 20");
        c20.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                c20ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(c20, gridBagConstraints);

        c21.setText("Consulta 21");
        c21.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                c21ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel2.add(c21, gridBagConstraints);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setMinimumSize(new java.awt.Dimension(600, 21));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(600, 97));
        jScrollPane2.setSize(new java.awt.Dimension(600, 21));

        consulta.setColumns(20);
        consulta.setRows(5);
        jScrollPane2.setViewportView(consulta);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 200;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(24, 24, 24, 24);
        jPanel2.add(jScrollPane2, gridBagConstraints);

        c0.setText("CUSTOM");
        c0.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                c0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 0);
        jPanel2.add(c0, gridBagConstraints);

        jPanel1.add(jPanel2, "card2");

        getContentPane().add(jPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void c1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_c1ActionPerformed
    {//GEN-HEADEREND:event_c1ActionPerformed
        ask(1);
    }//GEN-LAST:event_c1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_c2ActionPerformed
    {//GEN-HEADEREND:event_c2ActionPerformed
        ask(2);
    }//GEN-LAST:event_c2ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_c3ActionPerformed
    {//GEN-HEADEREND:event_c3ActionPerformed
        ask(3);
    }//GEN-LAST:event_c3ActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_c4ActionPerformed
    {//GEN-HEADEREND:event_c4ActionPerformed
        ask(4);
    }//GEN-LAST:event_c4ActionPerformed

    private void c5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_c5ActionPerformed
    {//GEN-HEADEREND:event_c5ActionPerformed
        ask(5);
    }//GEN-LAST:event_c5ActionPerformed

    private void c6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_c6ActionPerformed
    {//GEN-HEADEREND:event_c6ActionPerformed
        ask(6);
    }//GEN-LAST:event_c6ActionPerformed

    private void c7ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_c7ActionPerformed
    {//GEN-HEADEREND:event_c7ActionPerformed
        ask(7);
    }//GEN-LAST:event_c7ActionPerformed

    private void c8ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_c8ActionPerformed
    {//GEN-HEADEREND:event_c8ActionPerformed
        ask(8);
    }//GEN-LAST:event_c8ActionPerformed

    private void c9ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_c9ActionPerformed
    {//GEN-HEADEREND:event_c9ActionPerformed
        ask(9);
    }//GEN-LAST:event_c9ActionPerformed

    private void c10ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_c10ActionPerformed
    {//GEN-HEADEREND:event_c10ActionPerformed
        ask(10);
    }//GEN-LAST:event_c10ActionPerformed

    private void c11ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_c11ActionPerformed
    {//GEN-HEADEREND:event_c11ActionPerformed
        ask(11);
    }//GEN-LAST:event_c11ActionPerformed

    private void c12ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_c12ActionPerformed
    {//GEN-HEADEREND:event_c12ActionPerformed
        ask(12);
    }//GEN-LAST:event_c12ActionPerformed

    private void c13ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_c13ActionPerformed
    {//GEN-HEADEREND:event_c13ActionPerformed
        ask(13);
    }//GEN-LAST:event_c13ActionPerformed

    private void c14ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_c14ActionPerformed
    {//GEN-HEADEREND:event_c14ActionPerformed
       ask(14);
    }//GEN-LAST:event_c14ActionPerformed

    private void c15ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_c15ActionPerformed
    {//GEN-HEADEREND:event_c15ActionPerformed
        ask(15);
    }//GEN-LAST:event_c15ActionPerformed

    private void c16ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_c16ActionPerformed
    {//GEN-HEADEREND:event_c16ActionPerformed
        ask(16);
    }//GEN-LAST:event_c16ActionPerformed

    private void c17ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_c17ActionPerformed
    {//GEN-HEADEREND:event_c17ActionPerformed
        ask(17);
    }//GEN-LAST:event_c17ActionPerformed

    private void c18ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_c18ActionPerformed
    {//GEN-HEADEREND:event_c18ActionPerformed
        ask(18);
    }//GEN-LAST:event_c18ActionPerformed

    private void c19ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_c19ActionPerformed
    {//GEN-HEADEREND:event_c19ActionPerformed
        ask(19);
    }//GEN-LAST:event_c19ActionPerformed

    private void c20ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_c20ActionPerformed
    {//GEN-HEADEREND:event_c20ActionPerformed
        ask(20);
    }//GEN-LAST:event_c20ActionPerformed

    private void c21ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_c21ActionPerformed
    {//GEN-HEADEREND:event_c21ActionPerformed
        ask(21);
    }//GEN-LAST:event_c21ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        new Logger().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void c0ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_c0ActionPerformed
    {//GEN-HEADEREND:event_c0ActionPerformed
        ask(consulta.getText());
    }//GEN-LAST:event_c0ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton c0;
    private javax.swing.JButton c1;
    private javax.swing.JButton c10;
    private javax.swing.JButton c11;
    private javax.swing.JButton c12;
    private javax.swing.JButton c13;
    private javax.swing.JButton c14;
    private javax.swing.JButton c15;
    private javax.swing.JButton c16;
    private javax.swing.JButton c17;
    private javax.swing.JButton c18;
    private javax.swing.JButton c19;
    private javax.swing.JButton c2;
    private javax.swing.JButton c20;
    private javax.swing.JButton c21;
    private javax.swing.JButton c3;
    private javax.swing.JButton c4;
    private javax.swing.JButton c5;
    private javax.swing.JButton c6;
    private javax.swing.JButton c7;
    private javax.swing.JButton c8;
    private javax.swing.JButton c9;
    private javax.swing.JTextArea consulta;
    private javax.swing.JTextArea display;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel txt;
    // End of variables declaration//GEN-END:variables
}
