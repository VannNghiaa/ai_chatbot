import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class HomeForm extends JFrame {
    private JTextField text_input;
    private JButton btnSend;
    private JButton btnWeather;
    private JButton btnLocateIP;
    private JButton btnScan;
    private JButton btnIdea;
    private JLabel label_Title;
    private JLabel label_text;
    private JPanel homePanel;
    private JTextArea text_Area;
    private JPanel panel_2;


    public static void main(String[] args){
        // Khởi tạo và hiển thị cửa sổ
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HomeForm();
            }
        });
    }


    public HomeForm() {

        this.setSize(480, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("Home Page");
        this.setContentPane(homePanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnSend) {
                    String text = text_input.getText().toLowerCase();
                    text_Area.setForeground(Color.BLACK);
                    text_Area.append("You: " + text + "\n");
                    text_input.setText("");
                    if (text.contains("hi")) {
                        Reply("Hi there!");
                    } else if (text.contains("hôm nay bạn thế nào?")) {
                        Reply("Tôi ổn, cảm ơn lời hỏi thăm của bạn. Còn bạn thì sao?");
                    } else if (text.contains("tên bạn là gì?")) {
                        Reply("Tôi là Chatbot, tên bạn là gì?");
                    } else if (text.contains("i love u")) {
                        Reply("Đẹp trai không? Kinh tế bạn như nào mà đòi yêu?");
                    } else if (text.contains("bye")) {
                        Reply("Trở lại sớm nhé, tôi luôn chờ bạn!");
                    } else {
                        Reply("Tôi không hiểu bạn đang muốn nói điều gì");
                    }
                }
            }

            public void Reply(String s) {
                text_Area.append("Chatbot: " + s + "\n");
            }
        });
    }
}

