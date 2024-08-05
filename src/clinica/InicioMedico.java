/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clinica;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author User
 */
public class InicioMedico extends javax.swing.JFrame {

    /**
     * Creates new form InicioSecretaria
     */
    public InicioMedico() {
        initComponents();
        centralizeWindow();
    }

    private void centralizeWindow() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - this.getWidth()) / 2;
        int y = (screenSize.height - this.getHeight()) / 2;
        this.setLocation(x, y);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        butaoAlteraDados = new javax.swing.JButton();
        butaoRealizaProntuario = new javax.swing.JButton();
        butaoRequisitaExames = new javax.swing.JButton();
        butaoExibiExame = new javax.swing.JButton();
        butaoExibiProntuario = new javax.swing.JButton();
        butaoRealizaPresicao = new javax.swing.JButton();
        butaoAlteraPrescricao = new javax.swing.JButton();
        butaoSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela médico");
        setResizable(false);

        jLabel1.setText("Olá Médico 1, o que deseja fazer?");

        butaoAlteraDados.setText("Alterar dados");
        butaoAlteraDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoAlteraDadosActionPerformed(evt);
            }
        });

        butaoRealizaProntuario.setText("Realizar prontuário");
        butaoRealizaProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoRealizaProntuarioActionPerformed(evt);
            }
        });

        butaoRequisitaExames.setText("Requisitar exames");
        butaoRequisitaExames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoRequisitaExamesActionPerformed(evt);
            }
        });

        butaoExibiExame.setText("Exibir exames");
        butaoExibiExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoExibiExameActionPerformed(evt);
            }
        });

        butaoExibiProntuario.setText("Exibir prontuário");
        butaoExibiProntuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoExibiProntuarioActionPerformed(evt);
            }
        });

        butaoRealizaPresicao.setText("Realizar prescrição");
        butaoRealizaPresicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoRealizaPresicaoActionPerformed(evt);
            }
        });

        butaoAlteraPrescricao.setText("Alterar prescrição");
        butaoAlteraPrescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoAlteraPrescricaoActionPerformed(evt);
            }
        });

        butaoSair.setText("Sair");
        butaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(butaoAlteraDados)
                    .addComponent(butaoRealizaProntuario)
                    .addComponent(butaoExibiProntuario)
                    .addComponent(butaoExibiExame)
                    .addComponent(butaoRequisitaExames)
                    .addComponent(butaoRealizaPresicao)
                    .addComponent(butaoAlteraPrescricao)
                    .addComponent(butaoSair))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(butaoAlteraDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butaoRealizaProntuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butaoExibiProntuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butaoRequisitaExames)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butaoExibiExame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butaoRealizaPresicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butaoAlteraPrescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butaoSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void butaoExibiProntuarioActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        ExibirProntuario frame = new ExibirProntuario();
        frame.setVisible(true);

        // Ocultando a janela inicial
        this.setVisible(false);
    }                                                    

    private void butaoAlteraDadosActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        AlteraMedico frame = new AlteraMedico();
        frame.setVisible(true);

        // Ocultando a janela inicial
        this.setVisible(false);
    }                                                

    private void butaoRealizaProntuarioActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        CriarProntuario frame = new CriarProntuario();
        frame.setVisible(true);

        // Ocultando a janela inicial
        this.setVisible(false);
    }                                                      

    private void butaoRequisitaExamesActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        RequisitarExames frame = new RequisitarExames();
        frame.setVisible(true);

        // Ocultando a janela inicial
        this.setVisible(false);
    }                                                    

    private void butaoExibiExameActionPerformed(java.awt.event.ActionEvent evt) {                                                
        ExibirExame frame = new ExibirExame();
        frame.setVisible(true);

        // Ocultando a janela inicial
        this.setVisible(false);
    }                                               

    private void butaoRealizaPresicaoActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        PrescreverRemedio frame = new PrescreverRemedio();
        frame.setVisible(true);

        // Ocultando a janela inicial
        this.setVisible(false);
    }                                                    

    private void butaoAlteraPrescricaoActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        ExibirPrescricao frame = new ExibirPrescricao();
        frame.setVisible(true);

        // Ocultando a janela inicial
        this.setVisible(false);
    }                                                     

    private void butaoSairActionPerformed(java.awt.event.ActionEvent evt) {                                          
        InicialTela frame = new InicialTela();
        frame.setVisible(true);

        // Ocultando a janela inicial
        this.setVisible(false);
    }                                         

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
            java.util.logging.Logger.getLogger(InicioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    public javax.swing.JButton butaoAlteraDados;
    public javax.swing.JButton butaoAlteraPrescricao;
    public javax.swing.JButton butaoExibiExame;
    public javax.swing.JButton butaoExibiProntuario;
    public javax.swing.JButton butaoRealizaPresicao;
    public javax.swing.JButton butaoRealizaProntuario;
    public javax.swing.JButton butaoRequisitaExames;
    public javax.swing.JButton butaoSair;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
