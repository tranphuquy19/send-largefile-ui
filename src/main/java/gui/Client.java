package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

/*
 * @author tranphuquy19@gmail.com
 * @since 12/21/2019
 */
public class Client extends JFrame {
    private JPanel contentPane;
    private JTextField txtServerAddress;
    private JTextField txtServerPort;
    private JButton btnChooseFile;
    private JTextArea txtStatus;
    private JProgressBar progressBar;
    private JScrollPane scrollPane;

    //    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    Client frame = new Client();
//                    frame.setVisible(true);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//    }
    public Client() {
        InitComponents();
    }

    /**
     * Create the frame.
     */
    public void InitComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 596, 358);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Server Address");
        lblNewLabel.setBounds(10, 51, 104, 14);
        contentPane.add(lblNewLabel);

        txtServerAddress = new JTextField();
        txtServerAddress.setBounds(137, 48, 216, 20);
        contentPane.add(txtServerAddress);
        txtServerAddress.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Server Port");
        lblNewLabel_1.setBounds(10, 91, 74, 14);
        contentPane.add(lblNewLabel_1);

        txtServerPort = new JTextField();
        txtServerPort.setBounds(137, 88, 216, 20);
        contentPane.add(txtServerPort);
        txtServerPort.setColumns(10);

        txtStatus = new JTextArea();
        txtStatus.setBounds(10, 126, 478, 122);
//        contentPane.add(txtStatus);

        scrollPane = new JScrollPane(txtStatus);
        scrollPane.setBounds(10, 126, 478, 122);
        contentPane.add(scrollPane);

        btnChooseFile = new JButton("Choose File");
        btnChooseFile.setBounds(10, 259, 200, 23);
        contentPane.add(btnChooseFile);

        progressBar = new JProgressBar(0, 100);
        progressBar.setBounds(235, 259, 146, 14);
        contentPane.add(progressBar);
    }

    public JTextField getTxtServerAddress() {
        return txtServerAddress;
    }

    public void setTxtServerAddress(JTextField txtServerAddress) {
        this.txtServerAddress = txtServerAddress;
    }

    public JTextField getTxtServerPort() {
        return txtServerPort;
    }

    public void setTxtServerPort(JTextField txtServerPort) {
        this.txtServerPort = txtServerPort;
    }

    public JButton getBtnChooseFile() {
        return btnChooseFile;
    }

    public void setBtnChooseFile(JButton btnChooseFile) {
        this.btnChooseFile = btnChooseFile;
    }

    public JTextArea getTxtStatus() {
        return txtStatus;
    }

    public void setTxtStatus(JTextArea txtStatus) {
        this.txtStatus = txtStatus;
    }

    public JProgressBar getProgressBar() {
        return progressBar;
    }

    public void setProgressBar(JProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }
}
