import java.awt.*;
import java.awt.event.*;

public class Contador extends Frame {
    private int cont = 0;

    public Contador() {
        setTitle("Contador");
        setSize(300, 100);
        setLayout(new FlowLayout());

        Button btn = new Button("Sumar");
        TextField txt = new TextField("0", 10);
        add(btn);
        add(txt);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cont++;
                txt.setText(String.valueOf(cont));
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });
    }

    public static void main(String[] args) {
        new Contador().setVisible(true);
    }
}
