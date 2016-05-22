/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientInterfaces;
import MainInterfaces.DBAccess;
import Mundo.Event;
import java.sql.JDBCType;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import javax.swing.JComboBox;
/**
 *
 * @author Nicolas
 */
public class EventSearch extends javax.swing.JFrame {
    DBAccess dba;
    String categoriaEvento, ciudad, nombreEvento, direccionLugar;
    
    /**
     * Creates new form EventSearch
     */
    public EventSearch(DBAccess db) {
        initComponents();
        dba=db;
        buscarCategoriasEvento();
    }

   public void buscarCategoriasEvento(){
        try {
            categoriaEventoCB = new JComboBox(dba.rsToArray(dba.consultar(Event.consultarEventCategoryNext())));           
        } catch (SQLException ex) {
            System.out.println("ERROR: No se pudo cargar las categorias en la busqueda de los eventos");
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
        fechaEventoCB = new javax.swing.JTextField();
        horaEventoCB = new javax.swing.JTextField();
        salirB = new javax.swing.JButton();
        buscarTicketsB = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        direccionLugarCB = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        categoriaEventoCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ciudadCB.setEditable(true);
        ciudadCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadCBActionPerformed(evt);
            }
        });

        nombreEventoCB.setEditable(true);
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

        fechaEventoCB.setEditable(false);
        fechaEventoCB.setToolTipText("");

        horaEventoCB.setEditable(false);

        salirB.setText("Salir");
        salirB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBActionPerformed(evt);
            }
        });

        buscarTicketsB.setText("Buscar Tickets");

        jLabel7.setText("Direccion del Lugar");

        direccionLugarCB.setEditable(true);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(salirB)
                        .addGap(38, 38, 38)
                        .addComponent(buscarTicketsB)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
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
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fechaEventoCB, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(horaEventoCB, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(16, 16, 16))))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
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
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salirB)
                    .addComponent(buscarTicketsB))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salirBActionPerformed

    private void direccionLugarCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionLugarCBActionPerformed
        direccionLugar = (String)direccionLugarCB.getSelectedItem();  
        ArrayList parametros = new ArrayList();
        parametros.add(categoriaEvento);
        parametros.add(ciudad);
        parametros.add(nombreEvento);
        parametros.add(direccionLugar);
        parametros.add(Types.NUMERIC);
        parametros.add(Types.TIMESTAMP);
        try {         
            ArrayList datosEvento = dba.procedureSearch("EVENT_SEARCH(?,?,?,?,?,?)", parametros);   
            String fecha = (String)datosEvento.get(1);
            System.out.println(fecha);
           
        } catch (SQLException ex) {
            System.out.println("ERROR: No se pudo cargar los nombres del los eventos en la busqueda de los eventos");
        }
    }//GEN-LAST:event_direccionLugarCBActionPerformed

    private void ciudadCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadCBActionPerformed
        try {
            ciudad = (String)ciudadCB.getSelectedItem();
            nombreEventoCB = new JComboBox(dba.rsToArray(dba.consultar(Event.consultarNombreEventoNext(ciudad,categoriaEvento))));    
            nombreEventoCB.setEnabled(true);
        } catch (SQLException ex) {
            System.out.println("ERROR: No se pudo cargar los nombres del los eventos en la busqueda de los eventos");
        }
    }//GEN-LAST:event_ciudadCBActionPerformed

    private void categoriaEventoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaEventoCBActionPerformed
        try {
            categoriaEvento = (String)categoriaEventoCB.getSelectedItem();
            ciudadCB = new JComboBox(dba.rsToArray(dba.consultar(Event.consultarCiudadNext(categoriaEvento))));    
            ciudadCB.setEnabled(true);
        } catch (SQLException ex) {
            System.out.println("ERROR: No se pudo cargar las cuidades en la busqueda de los eventos");
        }
    }//GEN-LAST:event_categoriaEventoCBActionPerformed

    private void nombreEventoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEventoCBActionPerformed
        try {
            nombreEvento = (String)nombreEventoCB.getSelectedItem();
            nombreEventoCB = new JComboBox(dba.rsToArray(dba.consultar(Event.consultarDireccionLugarNext(nombreEvento, ciudad, categoriaEvento))));    
            nombreEventoCB.setEnabled(true);
        } catch (SQLException ex) {
            System.out.println("ERROR: No se pudo cargar las direcciones de los lugares en la busqueda de los eventos");
        }
    }//GEN-LAST:event_nombreEventoCBActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarTicketsB;
    private javax.swing.JComboBox<String> categoriaEventoCB;
    private javax.swing.JComboBox<String> ciudadCB;
    private javax.swing.JComboBox<String> direccionLugarCB;
    private javax.swing.JTextField fechaEventoCB;
    private javax.swing.JTextField horaEventoCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> nombreEventoCB;
    private javax.swing.JButton salirB;
    // End of variables declaration//GEN-END:variables
}
