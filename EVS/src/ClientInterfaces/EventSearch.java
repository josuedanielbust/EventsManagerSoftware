/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientInterfaces;

import MainInterfaces.DBAccess;
import Mundo.Event;
import Mundo.Ticket;

import java.sql.SQLException;

import javax.swing.DefaultComboBoxModel;

import javax.swing.JOptionPane;
/**
 *
 * @author Nicolas
 */
public class EventSearch extends javax.swing.JFrame {
    String categoriaEvento, ciudad, nombreEvento, direccionLugar,hora;
    
    /**
     * Creates new form EventSearch
     */
    public EventSearch() {
        initComponents();
        buscarCategoriasEvento();    
        setVisible(true);
    }

   public void buscarCategoriasEvento(){
        try {
            String sqlc=Event.consultarEventCategoryNext();
            String [] array = DBAccess.rsToArray(DBAccess.consultar(sqlc));
            categoriaEventoCB.setModel(new DefaultComboBoxModel(array));           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Mensaje de Error",JOptionPane.ERROR_MESSAGE);
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

        ciudadCB = new javax.swing.JComboBox<>();
        nombreEventoCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        horaEventoCB = new javax.swing.JTextField();
        salirB = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        direccionLugarCB = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        categoriaEventoCB = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        fechaEventoCB = new javax.swing.JComboBox<>();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ciudadCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadCBActionPerformed(evt);
            }
        });

        nombreEventoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEventoCBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Busqueda de Eventos");

        jLabel2.setText("Cuidad");

        jLabel3.setText("Nombre del Evento");

        jLabel5.setText("Fecha del Evento");

        jLabel6.setText("Hora");

        horaEventoCB.setEditable(false);

        salirB.setText("Atrás");
        salirB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBActionPerformed(evt);
            }
        });

        jLabel7.setText("Direccion del Lugar");

        direccionLugarCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionLugarCBActionPerformed(evt);
            }
        });

        jLabel9.setText("Categoria del Evento");

        categoriaEventoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaEventoCBActionPerformed(evt);
            }
        });

        jButton3.setText("Comprar Tickets");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        fechaEventoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaEventoCBActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Más información");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ciudadCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombreEventoCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(direccionLugarCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(categoriaEventoCB, 0, 161, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(68, 68, 68))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaEventoCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(horaEventoCB, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(salirB, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(categoriaEventoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ciudadCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombreEventoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionLugarCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fechaEventoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(horaEventoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(salirB)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBActionPerformed
        dispose();
        new ClientMenu();
    }//GEN-LAST:event_salirBActionPerformed

    private void direccionLugarCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionLugarCBActionPerformed
        direccionLugar = (String)direccionLugarCB.getSelectedItem();  
        try {         
            //ArrayList datosEvento = dba.procedureSearch("EVENT_SEARCH(?,?,?,?,?,?)", parametros);   
            //String fecha = (String)datosEvento.get(1);
            
            String sqlc=Event.consultarFechas(categoriaEvento,ciudad,nombreEvento,direccionLugar);
            String [] array = DBAccess.rsToArray(DBAccess.consultar(sqlc));         
            horaEventoCB.setText(array[0].substring(11)); 
            
            for(int i = 0;i<array.length;i++){
                array[i]=array[i].substring(0,10);                 
            }
            
            fechaEventoCB.setModel(new DefaultComboBoxModel(array));   
            
           
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,ex.getMessage(),"Mensaje de Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_direccionLugarCBActionPerformed

    private void ciudadCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadCBActionPerformed
        try {
            ciudad = (String)ciudadCB.getSelectedItem();
            String []array = DBAccess.rsToArray(DBAccess.consultar(Event.consultarNombreEventoNext(ciudad,categoriaEvento)));    
            nombreEventoCB.setModel(new DefaultComboBoxModel(array));
            
            nombreEventoCB.setEnabled(true);
            direccionLugarCB.setEnabled(false);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,ex.getMessage(),"Mensaje de Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ciudadCBActionPerformed

    private void categoriaEventoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaEventoCBActionPerformed
        try {
            categoriaEvento = (String)categoriaEventoCB.getSelectedItem();
            String sqlc=Event.consultarCiudadNext(categoriaEvento);
            String [] array = DBAccess.rsToArray(DBAccess.consultar(sqlc));    
            ciudadCB.setModel(new DefaultComboBoxModel(array));
            
            ciudadCB.setEnabled(true);
            nombreEventoCB.setEnabled(false);
            direccionLugarCB.setEnabled(false);
                
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,ex.getMessage(),"Mensaje de Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_categoriaEventoCBActionPerformed

    private void nombreEventoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEventoCBActionPerformed
        try {
            nombreEvento = (String)nombreEventoCB.getSelectedItem();
            String sqlc= Event.consultarDireccionLugarNext(nombreEvento, ciudad, categoriaEvento);
            direccionLugarCB.setModel(new DefaultComboBoxModel((DBAccess.rsToArray(DBAccess.consultar(sqlc)))));    
            direccionLugarCB.setEnabled(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Mensaje de Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_nombreEventoCBActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       dispose();
       
       new BuyTicket();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void fechaEventoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaEventoCBActionPerformed
       Event.setFecha(hora);
        Event.setEvent_id(Ticket.buscarIdEvent());
    }//GEN-LAST:event_fechaEventoCBActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        dispose();
        new EventsMoreInfo();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> categoriaEventoCB;
    private javax.swing.JComboBox<String> ciudadCB;
    private javax.swing.JComboBox<String> direccionLugarCB;
    private javax.swing.JComboBox<String> fechaEventoCB;
    private javax.swing.JTextField horaEventoCB;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox<String> nombreEventoCB;
    private javax.swing.JButton salirB;
    // End of variables declaration//GEN-END:variables
}
