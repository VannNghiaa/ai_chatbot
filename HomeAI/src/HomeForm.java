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

        text_Area = new JTextArea();
        //homePanel = new JPanel();
        btnSend = new JButton();
        text_input = new JTextField();
        label_text = new JLabel();

        JFrame f = new JFrame();
        f.setSize(480, 500);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setResizable(false);
        f.setTitle("Home Page");
        f.setLayout(null);
        f.setContentPane(homePanel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // f.add(text_Area); //ca
       // f.add(text_input); //cf
        //f.add(btnSend); //b
        //f.add(label_text); //l
       //btnSend.add(label_text);


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
                    } else if (text.contains("Tôi yêu bạn")) {
                        Reply("Đẹp trai không? Kinh tế bạn như nào mà đòi yêu?");
                    } else if (text.contains("Bye")) {
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


//        text_input.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Input sent");
//            }
//        });
//    }
    }
}

