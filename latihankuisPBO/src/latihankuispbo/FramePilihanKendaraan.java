/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihankuispbo;

import javax.swing.*;
import java.awt.*;

public class FramePilihanKendaraan extends JFrame {
    public FramePilihanKendaraan() {
        setTitle("Pilihan Kendaraan");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel label = new JLabel("Pilih jenis kendaraan: ");
        JButton btnMotor = new JButton("Motor");
        JButton btnMobil = new JButton("Mobil");

        btnMotor.addActionListener(e -> new FrameDetailPenyewaan("Motor"));
        btnMobil.addActionListener(e -> new FrameDetailPenyewaan("Mobil"));

        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(label, gbc);
        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(btnMotor, gbc);
        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(btnMobil, gbc);

        add(panel);
        setVisible(true);
    }
}


