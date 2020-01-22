package aplicacao_swing;
/**********************************
 * Alamo Nunes
 * Dynnah Hanna
 **********************************/

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import model.*;
import repositorio.*;
import view.*;

public class TelaPrincipal {

	private JFrame frame;
	private JMenuItem mntmCadastrar;
	private JMenuItem mntmAtivar;
	private JMenuItem mntmListar;
	private JMenu mnComponente;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
					Fachada.criarComodos();
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
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("SmartHouse");

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				try {

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		});

		frame.setBounds(100, 100, 384, 271);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		label = new JLabel("");
		label.setBounds(0, 0, 378, 221);


		frame.getContentPane().add(label);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		mnComponente = new JMenu("Cenario");
		menuBar.add(mnComponente);

		mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCadastroCenario j = new TelaCadastroCenario();
				j.setVisible(true);
			}
		});
		mnComponente.add(mntmCadastrar);
		
		mntmAtivar = new JMenuItem("Ativar");
		mntmAtivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaAtivarCenario j = new TelaAtivarCenario();
				j.setVisible(true);
			}
		});
		mnComponente.add(mntmAtivar);
		
		
		mntmListar = new JMenuItem("Listar");
		mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaListagemCenario j = new TelaListagemCenario();
				j.setVisible(true);
			}
		});

		JMenuItem mntmApagar = new JMenuItem("Apagar");
		mntmApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaApagarCenario j = new TelaApagarCenario();
				j.setVisible(true);
			}
		});
		
		mnComponente.add(mntmApagar);
		mnComponente.add(mntmListar);
		
		mnComponente = new JMenu("Comodos");
		menuBar.add(mnComponente);

//		mntmCadastrar = new JMenuItem("Cadastrar");
//		mntmCadastrar.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				TelaCadastroComodo j = new TelaCadastroComodo();
//				j.setVisible(true);
//			}
//		});
//		mnComponente.add(mntmCadastrar);

		mntmListar = new JMenuItem("Listar");
		mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaListagemComodo j = new TelaListagemComodo();
				j.setVisible(true);
			}
		});
		
		mntmAtivar = new JMenuItem("Ativar");
		mntmAtivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaAtivarComodo j = new TelaAtivarComodo();
				j.setVisible(true);
			}
		});
		mnComponente.add(mntmAtivar);

		JMenuItem mntmApagarComodo = new JMenuItem("Apagar");
		mntmApagarComodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaApagarComodo j = new TelaApagarComodo();
				j.setVisible(true);
			}
		});
		
		mnComponente.add(mntmApagarComodo);
		mnComponente.add(mntmListar);

		JMenu mnLampada = new JMenu("Lampadas");
		menuBar.add(mnLampada);

		JMenuItem mntmListar_1 = new JMenuItem("Informações");
		mntmListar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaListagemComodo j = new TelaListagemComodo();
				j.setVisible(true);
			}
		});
		mnLampada.add(mntmListar_1);

	}
}
