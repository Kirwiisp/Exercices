import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame implements MouseListener{
    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }

    public Window(String title,int width, int heigh){
        this.setTitle(title);
        this.setSize(width,heigh);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton bouton = new JButton("Clic ici");
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        this.setContentPane(panel);
        getContentPane().add(bouton);
        this.setVisible(true);
    }

    public static void main(String agrs[]){
        Window fenetre = new Window("Test bouton",400,600);
    }
}