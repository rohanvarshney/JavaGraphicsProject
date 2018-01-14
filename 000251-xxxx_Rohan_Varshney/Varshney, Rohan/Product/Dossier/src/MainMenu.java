import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainMenu() {
		setTitle("Graphics Randomizer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 386, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSquares = new JButton("Squares");
		btnSquares.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame();
			    frame.getContentPane().add(new Squares());
			    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    frame.setSize(1300,800);
			    frame.setVisible(true);
			    dispose();
			    MainMenu a = new MainMenu();
			    a.setVisible(true);
			    
				
			}
		});
		btnSquares.setBounds(248, 43, 112, 23);
		contentPane.add(btnSquares);
		
		JButton btnGradientShift = new JButton("Gradient Shift");
		btnGradientShift.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
			    frame.getContentPane().add(new GradientShift());
			    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    frame.setSize(1300,800);
			    frame.setVisible(true);
			    dispose();
			    MainMenu b = new MainMenu();
			    b.setVisible(true);
			    
			}
		});
		btnGradientShift.setBounds(10, 43, 112, 23);
		contentPane.add(btnGradientShift);
		
		JButton btnCircles = new JButton("Circles");
		btnCircles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame();
			    frame.getContentPane().add(new Circles());
			    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    frame.setSize(1300,800);
			    frame.setVisible(true);
			    dispose();
			    MainMenu c = new MainMenu();
			    c.setVisible(true);
			}
		});
		btnCircles.setBounds(248, 74, 112, 23);
		contentPane.add(btnCircles);
		
		JButton btnStrings = new JButton("Strings");
		btnStrings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame();
			    frame.getContentPane().add(new Texts());
			    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    frame.setSize(1300,800);
			    frame.setVisible(true);
			    dispose();
			    MainMenu e = new MainMenu();
			    e.setVisible(true);
			}
		});
		btnStrings.setBounds(248, 108, 112, 23);
		contentPane.add(btnStrings);
		
		JButton btnSpirals = new JButton("Spirals");
		btnSpirals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame();
			    frame.getContentPane().add(new Spiral());
			    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    frame.setSize(1300,800);
			    frame.setVisible(true);
			    dispose();
			    MainMenu h = new MainMenu();
			    h.setVisible(true);
			}
		});
		btnSpirals.setBounds(248, 142, 112, 23);
		contentPane.add(btnSpirals);
		
		JButton btnCircle = new JButton("Circles 2");
		btnCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
			    frame.getContentPane().add(new CirclePattern());
			    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    frame.setSize(1300,800);
			    frame.setVisible(true);
			    dispose();
			    MainMenu i = new MainMenu();
			    i.setVisible(true);
			}
		});
		btnCircle.setBounds(248, 176, 112, 23);
		contentPane.add(btnCircle);
		
		JButton btnPolygons = new JButton("Polygons");
		btnPolygons.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
			    frame.getContentPane().add(new Polygony());
			    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    frame.setSize(1300,800);
			    frame.setVisible(true);
			    dispose();
			    MainMenu j = new MainMenu();
			    j.setVisible(true);
			}
		});
		btnPolygons.setBounds(10, 77, 112, 23);
		contentPane.add(btnPolygons);
		
		JButton btnOverlap = new JButton("Overlap");
		btnOverlap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame();
			    frame.getContentPane().add(new Overlap());
			    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    frame.setSize(1300,800);
			    frame.setVisible(true);
			    dispose();
			    MainMenu k = new MainMenu();
			    k.setVisible(true);
			}
		});
		btnOverlap.setBounds(248, 210, 112, 23);
		contentPane.add(btnOverlap);
		
		JButton btnCubical = new JButton("Cubical");
		btnCubical.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame();
			    frame.getContentPane().add(new Cubical());
			    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    frame.setSize(1300,800);
			    frame.setVisible(true);
			    dispose();
			    MainMenu l = new MainMenu();
			    l.setVisible(true);
			}
		});
		btnCubical.setBounds(10, 108, 112, 23);
		contentPane.add(btnCubical);
		
		JButton btnRubix = new JButton("Rubix");
		btnRubix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
			    frame.getContentPane().add(new RubixCube());
			    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    frame.setSize(1300,800);
			    frame.setVisible(true);
			    dispose();
			    MainMenu m = new MainMenu();
			    m.setVisible(true);
			}
		});
		btnRubix.setBounds(10, 142, 112, 23);
		contentPane.add(btnRubix);
		
		JButton btnBinary = new JButton("Morse");
		btnBinary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
			    frame.getContentPane().add(new Binary());
			    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    frame.setSize(1300,800);
			    frame.setVisible(true);
			    dispose();
			    MainMenu n = new MainMenu();
			    n.setVisible(true);
			}
		});
		btnBinary.setBounds(10, 176, 112, 23);
		contentPane.add(btnBinary);
		
		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "This Docier program is created with the purpose of generating random computer-generated images, inspired by the random and spontaneous album artworks that exist out there. \nEach of these buttons above feature a theme that follows a specific pattern but may be randomized in colors, hues, placements, and other nuances that make the overall image \none out of the potential millions that could happen within that button.\n\nOne potential error that exists within this program si that clicking each button produces a window for the image and brings another Main Menu up, but the image can't be closed\n without closing all the other images that may be made and also the Main Menu. Having too many images up severely slows down the speed of the computer and the program must regularly \nbe closed after a few images are produced (~5-10).\n\nResizing the image window or covering it with another window can affect results and change the image.", "About",JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		btnAbout.setBounds(10, 303, 89, 23);
		contentPane.add(btnAbout);
		
		JLabel lblComplex = new JLabel("Complex");
		lblComplex.setBounds(10, 18, 46, 14);
		contentPane.add(lblComplex);
		
		JLabel lblSimple = new JLabel("Simple");
		lblSimple.setBounds(248, 18, 46, 14);
		contentPane.add(lblSimple);
		
			
		
		
		
	}		
}

