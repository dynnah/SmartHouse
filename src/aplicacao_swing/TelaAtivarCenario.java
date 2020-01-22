package aplicacao_swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Cenario;
import model.Comodo;
import model.Fachada;

public class TelaAtivarCenario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton button1;
	private JLabel lblNome;
	private JLabel lblmsg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAtivarCenario frame = new TelaAtivarCenario();
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
	public TelaAtivarCenario() {

		setTitle("Ativar Cenario");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 301, 296);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(72, 11, 202, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 14, 46, 14);
		contentPane.add(lblNome);
		
		lblmsg = new JLabel("");
		lblmsg.setBounds(12, 240, 273, 14);
		contentPane.add(lblmsg);

		button1 = new JButton("Ativar");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if(textField.getText().isEmpty())
						lblmsg.setText("campo vazio");
					else {
						String nome = textField.getText();
						Cenario c = Fachada.localizarCenario(nome);
						Fachada.ativarCenario(c.getNome());
						lblmsg.setText("Cenario " + nome + " ativado.");
						
					}
						
				}
				catch(Exception erro){
					JOptionPane.showMessageDialog(null,erro.getMessage());
				}
			}
		});
		button1.setBounds(80, 177, 173, 23);
		contentPane.add(button1);
		
	}
}
