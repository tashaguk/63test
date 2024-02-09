import javax.swing.*;

public class HelloJava {

    public static void main( String[] args ) {

    JFrame frame = new JFrame( "Hello, Java!" );
    JLabel label = new JLabel( "Hello, Java!", JLabel.CENTER );
    JFrame frame1 = new JFrame( "Hi" );
    JLabel label1 = new JLabel( "12345", JLabel.CENTER );
    frame.add( label );
    frame1.add(label1);
    frame.setSize( 400, 400 );
    frame1.setSize(600, 600);
    frame.setVisible( true );
    frame1.setVisible(true);
    }
}