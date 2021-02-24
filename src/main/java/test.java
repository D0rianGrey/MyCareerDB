import org.apache.commons.lang3.ObjectUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;


public class test extends JFrame {

    public static void main(String[] args) {
        int[] message = new int[]{114, 101, 97, 100, 32, 97, 98, 111, 117, 116, 32, 65, 83, 67, 73, 73};

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        for (int code : message) {
            outputStream.write(code);
        }

        System.out.println(outputStream.toString());
    }

}

//        //1
//        super("Hello App");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(300, 300);
//        setLocationRelativeTo(null);
//        setVisible(true);
//
//        //2
//        JLabel nameLabel = new JLabel();
//        nameLabel.setText("Eugene");
//        nameLabel.setBounds(40, 20, 100, 30);
//        add(nameLabel);
//
//        //3
//        JTextField nameTextField = new JTextField();
//        nameTextField.setBounds(160, 20, 100, 30);
//        add(nameTextField);
//
//        //4
//        JButton acceptButton = new JButton("Accept");
//        acceptButton.setBounds(100, 70, 100, 30);
//        add(acceptButton);
//
//        //5
//        acceptButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String helloText = "Hello";
//                String name = nameTextField.getText();
//                if (name != null && name.trim().length() > 0) {
//                    helloText += String.format(", %s", name);
//                }
//                nameLabel.setText(helloText);
//            }
//        });
//
//        //6
//        JPanel greenPanel = new JPanel();
//        greenPanel.setBounds(40,150,220,70);
//        greenPanel.setLayout(new BorderLayout());
//        greenPanel.setBackground(Color.GREEN);
//        add(greenPanel);
//
//        //7
//        JLabel helloLabel = new JLabel("Hello");
//        helloLabel.setBounds(50,20, 100,30);
//        helloLabel.setHorizontalAlignment(SwingConstants.CENTER);
//        helloLabel.setVerticalAlignment(SwingConstants.CENTER);
//
//        Font font = new Font("Courier", Font.BOLD,12);
//        helloLabel.setFont(font);
//        helloLabel.setFont(helloLabel.getFont().deriveFont(16f));
//
//        greenPanel.add(helloLabel); // adding label to the panel
//
//        //8
//
//    }
//
//    public static void main(String[] args) {
//        //new test();
//        File img = new ImageFile();
//
//        File txt = new TextFile();
//
//        boolean x = txt.getClass() == TextFile.class;
//        System.out.println(txt.getClass().getName());
//
//        boolean y = txt.getClass() == File.class;
//
//        boolean w = img instanceof File;
//
//        boolean u = img instanceof ImageFile;
//
//        boolean p = txt instanceof ImageFile;
//
//    }
//
//}
//
//class File { /* fields and methods */
//}
//
//class ImageFile extends File { /* fields and methods */
//}
//
//class TextFile extends File { /* fields and methods */
//}


