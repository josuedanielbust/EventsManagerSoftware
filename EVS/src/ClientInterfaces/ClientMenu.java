/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientInterfaces;

import MainInterfaces.DBAccess;
import MainInterfaces.Login;
import Mundo.Person;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nicolas
 */
public class ClientMenu extends javax.swing.JFrame {
    

    /**
     * Creates new form ClientMenu
     */
    public ClientMenu() {
        initComponents();
        mostrarNombre();
        setVisible(true);
    }

    public void mostrarNombre(){
        try {
            ResultSet nombre = DBAccess.consultar(Person.consultarNombre());
            nombre.next();
            userNameTF.setText(nombre.getNString("PERSON_NAME"));
        } catch (SQLException ex) {
            System.out.println("ERROR: No se pudo Cargar el Nombre del Usuario");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BuscarEventoB = new javax.swing.JButton();
        Tickets_Comprados = new javax.swing.JButton();
        userNameTF = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        configuracionMB = new javax.swing.JMenu();
        configuracionMI = new javax.swing.JMenuItem();
        cerrarSesionMI = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        BuscarEventoB.setText("Buscar Eventos");
        BuscarEventoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarEventoBActionPerformed(evt);
            }
        });

        Tickets_Comprados.setText("Tiquetes Comprados");
        Tickets_Comprados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tickets_CompradosActionPerformed(evt);
            }
        });

        userNameTF.setEditable(false);

        jMenu3.setText("                                                                                        ");
        jMenu3.setEnabled(false);
        jMenu3.setHideActionText(true);
        jMenuBar1.add(jMenu3);

        configuracionMB.setText("Cuenta Online");

        configuracionMI.setText("Configuracion");
        configuracionMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configuracionMIActionPerformed(evt);
            }
        });
        configuracionMB.add(configuracionMI);

        cerrarSesionMI.setText("Cerrar Sesion");
        cerrarSesionMI.setToolTipText("");
        cerrarSesionMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionMIActionPerformed(evt);
            }
        });
        configuracionMB.add(cerrarSesionMI);

        jMenuBar1.add(configuracionMB);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BuscarEventoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Tickets_Comprados, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BuscarEventoB)
                .addGap(18, 18, 18)
                .addComponent(Tickets_Comprados)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarEventoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarEventoBActionPerformed
        dispose();
        new EventSearch();
    }//GEN-LAST:event_BuscarEventoBActionPerformed

    private void Tickets_CompradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tickets_CompradosActionPerformed
        dispose();
        new BoughtTickets();
    }//GEN-LAST:event_Tickets_CompradosActionPerformed

    private void configuracionMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configuracionMIActionPerformed
        dispose();
        new ClientConfiguration();
    }//GEN-LAST:event_configuracionMIActionPerformed

    private void cerrarSesionMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionMIActionPerformed
        dispose();
        new Login();
    }//GEN-LAST:event_cerrarSesionMIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarEventoB;
    private javax.swing.JButton Tickets_Comprados;
    private javax.swing.JMenuItem cerrarSesionMI;
    private javax.swing.JMenu configuracionMB;
    private javax.swing.JMenuItem configuracionMI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField userNameTF;
    // End of variables declaration//GEN-END:variables
}
