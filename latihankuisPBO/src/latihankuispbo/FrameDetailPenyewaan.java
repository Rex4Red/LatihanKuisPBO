/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihankuispbo;

import javax.swing.*;
import java.awt.*;

public class FrameDetailPenyewaan extends JFrame {
    private JTextField txtNama, txtTelepon, txtHari;
    private JRadioButton rb1, rb2, rb3;
    private String jenisKendaraan;
    private int harga;

    public FrameDetailPenyewaan(String jenis) {
        this.jenisKendaraan = jenis;
        setTitle("Detail Penyewaan");
        setSize(400, 350);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        txtNama = new JTextField(15);
        txtTelepon = new JTextField(15);
        txtHari = new JTextField(5);

        rb1 = new JRadioButton(jenis + " 1 - Rp 50.000");
        rb2 = new JRadioButton(jenis + " 2 - Rp 75.000");
        rb3 = new JRadioButton(jenis + " 3 - Rp 100.000");

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        JButton btnSimpan = new JButton("Simpan");
        btnSimpan.addActionListener(e -> simpanData());

        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("Nama: "), gbc);
        gbc.gridx = 1;
        panel.add(txtNama, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(new JLabel("Telepon: "), gbc);
        gbc.gridx = 1;
        panel.add(txtTelepon, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(new JLabel("Pilih kendaraan:"), gbc);
        gbc.gridx = 1;
        panel.add(rb1, gbc);
        gbc.gridy = 3;
        panel.add(rb2, gbc);
        gbc.gridy = 4;
        panel.add(rb3, gbc);

        gbc.gridx = 0; gbc.gridy = 5;
        panel.add(new JLabel("Jumlah hari: "), gbc);
        gbc.gridx = 1;
        panel.add(txtHari, gbc);

        gbc.gridx = 1; gbc.gridy = 6;
        panel.add(btnSimpan, gbc);

        add(panel);
        setVisible(true);
    }

    private void simpanData() {
        try {
            String nama = txtNama.getText();
            String telepon = txtTelepon.getText();
            int hari = Integer.parseInt(txtHari.getText());

            if (rb1.isSelected()) harga = 50000;
            else if (rb2.isSelected()) harga = 75000;
            else if (rb3.isSelected()) harga = 100000;
            else throw new Exception("Pilih kendaraan terlebih dahulu!");

            new FrameTotalHarga(nama, telepon, jenisKendaraan, harga, hari);
            dispose();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan jumlah hari dengan angka!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}


