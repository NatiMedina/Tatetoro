package tablero;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import tablero.Juego;

import javax.swing.ImageIcon;
import java.awt.CardLayout;
import javax.swing.JTextField;

public class Tablero {
	
	
	private Juego juego = new Juego();
	
	private JLabel casilleros[] = new JLabel[9];
	private JLabel estadoActual = new JLabel("");
	private JLabel nombreJugador = null;
	private JLabel labelImagenJugador = null;
	private JLabel labelModificarImagen = null;
	private JLabel labelTurno = null; 
	private JLabel labelSimboloJugador = null;
	private ImageIcon imagenDefault = new ImageIcon(new ImageIcon("src/tablero/anon-user.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
	
	private JFrame frame;
	private JPanel panel;
	private JPanel panelModificarUsuario;
	
	private String path;
	
	private JTextField txtNombreJugador;

	
	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablero window = new Tablero();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tablero() {

		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		//PANEL PRINCIPAL
		panel = new JPanel();
		panel.setForeground(Color.WHITE);
		frame.getContentPane().add(panel, "name_251947699592664");
		panel.setVisible(true);
		panel.setLayout(null);
		
		//PANEL SECUNDARIO
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.darkGray);
		panel_1.setBounds(40, 55, 253, 154);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		//CASILLEROS
		
		JLabel casilla1 = new JLabel("");
		casilla1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				presionar(1);	
			}
		});
		casilla1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		casilla1.setHorizontalAlignment(SwingConstants.CENTER);
		casilla1.setOpaque(true);
		casilla1.setBackground(Color.WHITE);
		casilla1.setBounds(0, 0, 77, 43);
		panel_1.add(casilla1);
		
		JLabel casilla2 = new JLabel("");
		casilla2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				presionar(2);
			
			}
		});
		casilla2.setOpaque(true);
		casilla2.setHorizontalAlignment(SwingConstants.CENTER);
		casilla2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		casilla2.setBackground(Color.WHITE);
		casilla2.setBounds(0, 56, 77, 43);
		panel_1.add(casilla2);
		
		JLabel casilla3 = new JLabel("");
		casilla3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				presionar(3);
				
			}
		});
		casilla3.setOpaque(true);
		casilla3.setHorizontalAlignment(SwingConstants.CENTER);
		casilla3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		casilla3.setBackground(Color.WHITE);
		casilla3.setBounds(0, 111, 77, 43);
		panel_1.add(casilla3);
		
		JLabel casilla4 = new JLabel("");
		casilla4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				presionar(4);
				
			}
		});
		casilla4.setOpaque(true);
		casilla4.setHorizontalAlignment(SwingConstants.CENTER);
		casilla4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		casilla4.setBackground(Color.WHITE);
		casilla4.setBounds(87, 0, 77, 43);
		panel_1.add(casilla4);
		
		JLabel casilla5 = new JLabel("");
		casilla5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				presionar(5);
			}
		});
		casilla5.setOpaque(true);
		casilla5.setHorizontalAlignment(SwingConstants.CENTER);
		casilla5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		casilla5.setBackground(Color.WHITE);
		casilla5.setBounds(87, 56, 77, 43);
		panel_1.add(casilla5);
		
		JLabel casilla8 = new JLabel("");
		casilla8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				presionar(8);
				
			}
		});
		casilla8.setOpaque(true);
		casilla8.setHorizontalAlignment(SwingConstants.CENTER);
		casilla8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		casilla8.setBackground(Color.WHITE);
		casilla8.setBounds(176, 56, 77, 43);
		panel_1.add(casilla8);
		
		
		
		JLabel casilla9 = new JLabel("");
		casilla9.setBounds(176, 111, 77, 43);
		panel_1.add(casilla9);
		casilla9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				presionar(9);
			}
		});
		casilla9.setOpaque(true);
		casilla9.setHorizontalAlignment(SwingConstants.CENTER);
		casilla9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		casilla9.setBackground(Color.WHITE);
		
		
		JLabel casilla6 = new JLabel("");
		casilla6.setBounds(87, 111, 77, 43);
		panel_1.add(casilla6);
		casilla6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				presionar(6);
				
			}
		});
		casilla6.setOpaque(true);
		casilla6.setHorizontalAlignment(SwingConstants.CENTER);
		casilla6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		casilla6.setBackground(Color.WHITE);
		
		
		JLabel casilla7 = new JLabel("");
		casilla7.setBounds(176, 0, 77, 43);
		panel_1.add(casilla7);
		casilla7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				presionar(7);
				
			}
		});
		casilla7.setOpaque(true);
		casilla7.setHorizontalAlignment(SwingConstants.CENTER);
		casilla7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		casilla7.setBackground(Color.WHITE);
		
		casilleros[0] = casilla1;
		casilleros[1] = casilla2;
		casilleros[2] = casilla3;
		casilleros[3] = casilla4;
		casilleros[4] = casilla5;
		casilleros[5] = casilla6;
		casilleros[6] = casilla7;
		casilleros[7] = casilla8;
		casilleros[8] = casilla9;
		
		JButton reiniciar = new JButton("Reiniciar");
		reiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < casilleros.length; i++) {
					casilleros[i].setText("");
					casilleros[i].setBackground(Color.white);
				}
				juego.reiniciarJuego();
				estadoActual.setText("");
				labelTurno.setText(juego.getTurno());
				nombreJugador.setText(juego.getNombreJugador());
				labelImagenJugador.setIcon(obtenerImagenJugador(juego.getPathImagen()));
				labelSimboloJugador.setText(juego.getSimbolo());
			}
		});
		reiniciar.setBounds(549, 255, 100, 23);
		panel.add(reiniciar);
		
		estadoActual.setBounds(15, 230, 450, 30);
		panel.add(estadoActual);		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(330, 55, 320, 120);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblImagenUsuario = new JLabel("");
		lblImagenUsuario.setBounds(10, 5, 100, 100);
		lblImagenUsuario.setIcon(imagenDefault);
		labelImagenJugador = lblImagenUsuario;
		panel_2.add(lblImagenUsuario);
		
		
		JButton btnModificar = new JButton("Modificar");
		
		btnModificar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				txtNombreJugador.setText(juego.getNombreJugador());
				labelImagenJugador.setIcon(obtenerImagenJugador(juego.getPathImagen()));
				
				panel.setVisible(false);
				panelModificarUsuario.setVisible(true);
				labelModificarImagen.setIcon(obtenerImagenJugador(juego.getPathImagen()));
			}
		});
		btnModificar.setBounds(192, 83, 117, 25);
		panel_2.add(btnModificar);
		
		JLabel lblNombreJugador = new JLabel("Nombre Jugador");
		lblNombreJugador.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNombreJugador.setText(juego.getNombreJugador());
		nombreJugador = lblNombreJugador;
		lblNombreJugador.setBounds(118, 5, 190, 30);
		panel_2.add(lblNombreJugador);
		
		JLabel lblCon = new JLabel("Con :");
		lblCon.setBounds(122, 50, 70, 15);
		panel_2.add(lblCon);
		
		labelSimboloJugador = new JLabel("?");
		labelSimboloJugador.setBounds(182, 50, 70, 15);
		panel_2.add(labelSimboloJugador);
		labelSimboloJugador.setText(juego.getSimbolo());
		labelSimboloJugador.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JLabel textoTurno = new JLabel("Turno:");
		textoTurno.setBounds(41, 15, 70, 15);
		panel.add(textoTurno);
		
		JLabel lblTurno = new JLabel("999");
		lblTurno.setText(juego.getTurno());
		lblTurno.setFont(new Font("Dialog", Font.BOLD, 16));
		lblTurno.setBounds(100, 15, 70, 15);
		labelTurno = lblTurno;
		panel.add(lblTurno);
		
		JLabel lblJuega = new JLabel("Juega:");
		lblJuega.setBounds(330, 15, 70, 15);
		panel.add(lblJuega);
		
		panelModificarUsuario = new JPanel();
		frame.getContentPane().add(panelModificarUsuario, "name_252218383339832");
		panelModificarUsuario.setVisible(false);
		panelModificarUsuario.setLayout(null);
		
		JLabel lblModificarJugador = new JLabel("Modificar Jugador");
		lblModificarJugador.setHorizontalAlignment(SwingConstants.CENTER);
		lblModificarJugador.setBounds(5, 5, 685, 15);
		panelModificarUsuario.add(lblModificarJugador);
		
		labelModificarImagen = new JLabel("");
		labelModificarImagen.setBounds(36, 80, 100, 100);
		panelModificarUsuario.add(labelModificarImagen);
		
		JButton btnNewButton = new JButton("Cambiar Imagen");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				int option = fileChooser.showOpenDialog(frame);
	            if(option == JFileChooser.APPROVE_OPTION){
	               File file = fileChooser.getSelectedFile();
	               String direccion = file.getAbsolutePath();
	               
	               String extencion = "";
	               if(direccion.lastIndexOf(".")>=0) {
	            		extencion = direccion.substring(direccion.lastIndexOf("."));
	               }
	               
	               if(".jpg".equalsIgnoreCase(extencion) || ".png".equalsIgnoreCase(extencion)) {
	            	   path = direccion;
	            	   labelModificarImagen.setIcon(obtenerImagenJugador(direccion));
	               }
	               
	            }
			}
		});
		btnNewButton.setBounds(190, 80, 150, 25);
		panelModificarUsuario.add(btnNewButton);
		
		txtNombreJugador = new JTextField();
		txtNombreJugador.setText("Nombre Jugador");
		txtNombreJugador.setBounds(36, 40, 260, 20);
		panelModificarUsuario.add(txtNombreJugador);
		txtNombreJugador.setColumns(100);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String nombre = txtNombreJugador.getText();
				
				if(nombre != null && !nombre.isEmpty()) {
					juego.setNombreJugador(nombre);
					nombreJugador.setText(nombre);
				}
				
				if(path != null && !path.isEmpty()) {
					juego.setDireccionImagen(path);
					labelImagenJugador.setIcon(obtenerImagenJugador(path));
				}
				
				path = "";
				panelModificarUsuario.setVisible(false);
				panel.setVisible(true);
			}
		});
		btnGuardar.setBounds(356, 252, 117, 25);
		panelModificarUsuario.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelModificarUsuario.setVisible(false);
				panel.setVisible(true);
				path = "";
			}
		});
		btnCancelar.setBounds(509, 252, 117, 25);
		panelModificarUsuario.add(btnCancelar);
	}
	
	public void presionar(int casilla) {
		String valor = casilleros[casilla-1].getText();
		if(valor.equals("") && !juego.hayGanador()) {
			casilleros[casilla-1].setText(juego.getSimbolo());
			juego.jugada(casilla);
			
			if(juego.hayGanador()) {
				pintarGanador();
				estadoActual.setText(juego.getTextoGanador());
			}else {
				labelTurno.setText(juego.getTurno());
				nombreJugador.setText(juego.getNombreJugador());
				labelImagenJugador.setIcon(obtenerImagenJugador(juego.getPathImagen()));
				labelSimboloJugador.setText(juego.getSimbolo());
			}
		}
	}
	
	private ImageIcon obtenerImagenJugador(String pathImagen) {
		if(pathImagen == null || pathImagen.trim().isEmpty()) {
			return imagenDefault;
		}
		
		return new ImageIcon(new ImageIcon(pathImagen).getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
	}

	public void pintarGanador() {
		
		List<Integer> tatetiganador = juego.posicionTatetiGanador();
		if(!tatetiganador.isEmpty()) {
			Color color;

			if(juego.getSimbolo() == "X") {
				color = Color.green;
			}else {
				color = Color.red;  
			}
			
			for(Integer index: tatetiganador) {
				casilleros[index-1].setBackground(color);
			}
		}
	}
}

