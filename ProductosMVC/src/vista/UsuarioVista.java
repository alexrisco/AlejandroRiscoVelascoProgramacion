/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import controlador.UsuarioControlador;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import modelo.Usuario;
/**
 *
 * @author alejandro.risco
 */

public class UsuarioVista extends JFrame {
    private JTextField txtId, txtNombre, txtEmail;
    private JLabel lblId, lblNombre, lblEmail;
    private JButton btnAgregar, btnEditar, btnEliminar;
    private JTable tablaUsuarios;
    private DefaultTableModel modeloTabla;

    public UsuarioVista() {
        setTitle("Gestión de Usuarios");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 2));

        lblId = new JLabel("ID:");
        txtId = new JTextField();
        txtId.setEnabled(false);
        panel.add(lblId);
        panel.add(txtId);

        lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField();
        panel.add(lblNombre);
        panel.add(txtNombre);

        lblEmail = new JLabel("Email:");
        txtEmail = new JTextField();
        panel.add(lblEmail);
        panel.add(txtEmail);

        btnAgregar = new JButton("Agregar");
        btnEditar = new JButton("Editar");
        btnEliminar = new JButton("Eliminar");

        panel.add(new JLabel()); // Empty label for spacing
        panel.add(btnAgregar);
        panel.add(new JLabel()); // Empty label for spacing
        panel.add(btnEditar);
        panel.add(new JLabel()); // Empty label for spacing
        panel.add(btnEliminar);

        add(panel, BorderLayout.NORTH);
        modeloTabla = new DefaultTableModel(new String[]{"ID", "Nombre", "Email"}, 0);
        tablaUsuarios = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaUsuarios);
        add(scrollPane, BorderLayout.CENTER);
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void mostrarUsuarios(List<Usuario> lista) {
        modeloTabla.setRowCount(0);
        for (Usuario u : lista) {
            modeloTabla.addRow(new Object[]{u.getId(), u.getNombre(), u.getEmail()});
        }
    }


}
    



