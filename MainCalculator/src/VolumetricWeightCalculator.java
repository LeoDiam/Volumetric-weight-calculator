import javax.swing.*;
import java.awt.*;

public class VolumetricWeightCalculator {
    public static void main(String[] args) {
        double height, length, width, volume,
                volumetric_weight, volumetric_weight_hk;

        JPanel panel = new JPanel(new GridLayout(4, 1));
        JLabel heightj = new JLabel("Height");
        heightj.setFont(new Font("Arial", Font.BOLD, 18));
        JLabel widthj = new JLabel("Width");
        widthj.setFont(new Font("Arial", Font.BOLD, 18));

        JLabel lengthj = new JLabel("Length");
        lengthj.setFont(new Font("Arial", Font.BOLD, 18));

        JTextField theight = new JTextField();

        JTextField twidth = new JTextField();
        JTextField tlength = new JTextField();


        theight.setSize(0, 0);
        twidth.setSize(0, 0);
        tlength.setSize(0, 0);
        panel.add(heightj);
        panel.add(theight);
        panel.add(widthj);
        panel.add(twidth);
        panel.add(lengthj);


        panel.add(tlength);
        JOptionPane.showMessageDialog(null, panel, "Volumetric Weight Calculator", JOptionPane.PLAIN_MESSAGE);

        if (theight.getText().equals("") || twidth.getText().equals("") || tlength.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "All the fields should contain numbers!", "Error", JOptionPane.WARNING_MESSAGE);

        } else {
            height = Double.parseDouble(theight.getText());
            width = Double.parseDouble(twidth.getText());
            length = Double.parseDouble(tlength.getText());

            volume = height * length * width;
            volumetric_weight_hk = (volume + 2499) / 2500;
            volumetric_weight = volumetric_weight_hk / 2;
            JOptionPane.showMessageDialog(null, "Dimensions: " + length + " X " + width + " X " + height + " \n" + "Volume (cubic centimetres): " + volume + ". \n" + "Dimensional weight (kgs): " + volumetric_weight, "Result", JOptionPane.PLAIN_MESSAGE);
        }
    }

}
