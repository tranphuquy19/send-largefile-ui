package app;


import services.Client;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

/*
 * @author tranphuquy19@gmail.com
 * @since 12/21/2019
 */
public class App {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    gui.Client clientGui = new gui.Client();
                    clientGui.getBtnChooseFile().addMouseListener(new MouseAdapter(){
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            Thread thread = new Thread(){
                                @Override
                                public void run() {
                                    String serverAddress = clientGui.getTxtServerAddress().getText();
                                    String serverPort = clientGui.getTxtServerPort().getText();
                                    try {
                                        Client client = new Client(serverAddress, Integer.parseInt(serverPort), clientGui);
                                        JFileChooser jFileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
                                        int returnValue = jFileChooser.showOpenDialog(null);
                                        if (returnValue == JFileChooser.APPROVE_OPTION) {
                                            File selectedFile = jFileChooser.getSelectedFile();
                                            client.sendFile(selectedFile.getAbsolutePath());
                                        }
                                    } catch (IOException ex) {
                                        ex.printStackTrace();
                                    }
                                }
                            };
                            thread.start();
                        }
                    });
                    clientGui.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
