/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientInterfaces;
import MainInterfaces.DBAccess;
import Mundo.Person;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Nicolas
 */
public final class ClientMenu extends javax.swing.JFrame {
    private String id_person;
    private DBAccess dba;
    /**
     * Creates new form ClientMenu
     */
    public ClientMenu(DBAccess db,String id) {
        this.id_person=id;
        dba=db;
        initComponents();
        mostrarNombre();
        setVisible(true);
    }

    public void mostrarNombre(){
        try {
            ResultSet nombre = dba.consultar(Person.consultarNombre(id_person));
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
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        BuscarEventoB.setText("Buscar Eventos");
        BuscarEventoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarEventoBActionPerformed(evt);
            }
        });

        Tickets_Comprados.setText("Ticketes Comprados");
        Tickets_Comprados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tickets_CompradosActionPerformed(evt);
            }
        });

        userNameTF.setEditable(false);

        jMenu1.setText("Configuracion");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cerrar Sesion");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BuscarEventoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tickets_Comprados, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BuscarEventoB)
                .addGap(18, 18, 18)
                .addComponent(Tickets_Comprados)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarEventoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarEventoBActionPerformed
        dispose();
        new EventSearch(dba);
    }//GEN-LAST:event_BuscarEventoBActionPerformed

    private void Tickets_CompradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tickets_CompradosActionPerformed
        dispose();
        new BoughtTickets(dba,id_person);     
    }//GEN-LAST:event_Tickets_CompradosActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarEventoB;
    private javax.swing.JButton Tickets_Comprados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField userNameTF;
    // End of variables declaration//GEN-END:variables
}
