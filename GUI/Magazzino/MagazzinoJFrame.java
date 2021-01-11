package GUI.Magazzino;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controller.ControllerMagazzino;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class MagazzinoJFrame extends JFrame {

	private JPanel MagazzinoPanel;
	private ControllerMagazzino Controller;
	private JButton MagazzinoButton;

	/**
	 * Create the frame.
	 */
	public  MagazzinoJFrame(ControllerMagazzino c) {
		Controller = c;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		setResizable(false);
		MagazzinoPanel = new JPanel();
		MagazzinoPanel.setBackground(new Color(255, 222, 173));
		MagazzinoPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		MagazzinoPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(MagazzinoPanel);
		
		JPanel ContainerPanel = new JPanel();
		ContainerPanel.setBackground(new Color(255, 228, 181));
		ContainerPanel.setMinimumSize(new Dimension(310, 189));
		ContainerPanel.setBounds(290, 219, 490, 108);
		MagazzinoPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 153));
		MagazzinoPanel.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		panel.add(ContainerPanel, BorderLayout.CENTER);
		ContainerPanel.setLayout(new BorderLayout(0, 0));
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setPreferredSize(new Dimension(200, 0));
		horizontalStrut.setMinimumSize(new Dimension(150, 0));
		horizontalStrut.setMaximumSize(new Dimension(300, 32767));
		ContainerPanel.add(horizontalStrut, BorderLayout.WEST);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalStrut_1.setPreferredSize(new Dimension(0, 200));
		ContainerPanel.add(verticalStrut_1, BorderLayout.NORTH);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setPreferredSize(new Dimension(200, 0));
		ContainerPanel.add(horizontalStrut_1, BorderLayout.EAST);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalStrut_2.setPreferredSize(new Dimension(0, 200));
		ContainerPanel.add(verticalStrut_2, BorderLayout.SOUTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(255, 228, 181));
		ContainerPanel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton AggiungiProdottoButton = new JButton("Aggiungi Nuovo Prodotto");
		AggiungiProdottoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.MostraFinestraAggiungiProdotto();
			}
		});
		AggiungiProdottoButton.setFont(new Font("Arial", Font.PLAIN, 12));
		AggiungiProdottoButton.setBackground(new Color(255, 204, 153));
		AggiungiProdottoButton.setMaximumSize(new Dimension(186, 102));
		AggiungiProdottoButton.setPreferredSize(new Dimension(186, 102));
		panel_1.add(AggiungiProdottoButton, BorderLayout.WEST);
		
		JButton VisualizzaProdottoButton = new JButton("Visualizza Prodotti");
		VisualizzaProdottoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.MostraFinestraVisualizzaProdotto();
			}
		});
		VisualizzaProdottoButton.setFont(new Font("Arial", Font.PLAIN, 12));
		VisualizzaProdottoButton.setBackground(new Color(255, 204, 153));
		VisualizzaProdottoButton.setMaximumSize(new Dimension(186, 102));
		VisualizzaProdottoButton.setPreferredSize(new Dimension(186, 23));
		panel_1.add(VisualizzaProdottoButton, BorderLayout.EAST);
		
		JLabel lblNewLabel = new JLabel("Sezione Magazzino");
		lblNewLabel.setPreferredSize(new Dimension(90, 50));
		lblNewLabel.setMinimumSize(new Dimension(90, 50));
		lblNewLabel.setMaximumSize(new Dimension(90, 50));
		lblNewLabel.setBackground(new Color(255, 204, 153));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.NORTH);
		
		JToolBar Men�LateraleTB = new JToolBar();
		MagazzinoPanel.add(Men�LateraleTB, BorderLayout.WEST);
		Men�LateraleTB.setBorder(null);
		Men�LateraleTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		Men�LateraleTB.setBorderPainted(false);
		Men�LateraleTB.setFloatable(false);
		Men�LateraleTB.setBackground(new Color(255, 153, 51));
		Men�LateraleTB.setMaximumSize(new Dimension(100, 100));
		Men�LateraleTB.setOrientation(SwingConstants.VERTICAL);
		
		
		JButton ClientiButton = new JButton("");
		ClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.MostraFinestraClientidaMagazzino();
			}
		});
		ClientiButton.setBackground(new Color(255, 153, 51));
		ClientiButton.setBorderPainted(false);
		ClientiButton.setBorder(null);
		Men�LateraleTB.add(ClientiButton);
		ClientiButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\clientiii.png"));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		
		JButton VenditeButton = new JButton("");
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorder(null);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\cassaaaa.png"));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		Men�LateraleTB.add(VenditeButton);
		
		MagazzinoButton = new JButton("");
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MagazzinoButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\scatolaaaa.png"));
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		Men�LateraleTB.add(MagazzinoButton);
		
		Component verticalStrut = Box.createVerticalStrut(200);
		verticalStrut.setMaximumSize(new Dimension(32767, 300));
		Men�LateraleTB.add(verticalStrut);
		
		JButton InfoButton = new JButton("");
		InfoButton.setBackground(new Color(255, 153, 51));
		InfoButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\infoo.png"));
		InfoButton.setBorder(null);
		InfoButton.setBorderPainted(false);
		InfoButton.setMaximumSize(new Dimension(65, 70));
		Men�LateraleTB.add(InfoButton);
	}
}
