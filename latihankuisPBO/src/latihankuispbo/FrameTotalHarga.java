/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihankuispbo;

/**
 *
 * @author putra
 */




import javax.swing.*;
import java.awt.*;

public class FrameTotalHarga extends JFrame {
    public FrameTotalHarga(String nama, String telepon, String kendaraan, int harga, int hari) {
        setTitle("Total Harga");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 1, 10, 10));

        int totalHarga = harga * hari;

        add(new JLabel("Nama: " + nama, SwingConstants.CENTER));
        add(new JLabel("Telepon: " + telepon, SwingConstants.CENTER));
        add(new JLabel("Kendaraan: " + kendaraan, SwingConstants.CENTER));
        add(new JLabel("Total Harga: Rp " + totalHarga, SwingConstants.CENTER));

        JButton btnSelesai = new JButton("Selesai");
        btnSelesai.addActionListener(e -> System.exit(0));
        add(btnSelesai);

        setVisible(true);
    }
}

