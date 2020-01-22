package aplicacao_swing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Cenario;
import model.Fachada;

public class TelaCadastroCenario extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNome;
	private JButton btnCriar;
	private JLabel lblmsg;
	private JLabel lblComodos;
	private JCheckBox quarto;
	private JCheckBox terraco;
	private JCheckBox banheiro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroCenario frame = new TelaCadastroCenario();
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
	public TelaCadastroCenario() {
		setTitle("Cadastrar Cenario");
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
		

		btnCriar = new JButton("Cadastrar");
		btnCriar.setBounds(88, 205, 115, 23);
		contentPane.add(btnCriar);

		lblmsg = new JLabel("");
		lblmsg.setBounds(12, 240, 273, 14);
		contentPane.add(lblmsg);
		
		lblComodos = new JLabel("Comodos:");
		lblComodos.setBounds(10, 40, 115, 14);
		contentPane.add(lblComodos);
		
		JCheckBox sala = new JCheckBox("Sala");
		sala.setBounds(20, 62, 126, 23);
		contentPane.add(sala);
		
		JCheckBox cozinha = new JCheckBox("Cozinha");
		cozinha.setBounds(20, 116, 126, 23);
		contentPane.add(cozinha);
		
		JCheckBox quarto = new JCheckBox("Quarto");
		quarto.setBounds(20, 89, 126, 23);
		contentPane.add(quarto);
		
		JCheckBox terraco = new JCheckBox("Terraco");
		terraco.setBounds(20, 143, 126, 23);
		contentPane.add(terraco);
		
		JCheckBox banheiro = new JCheckBox("Banheiro");
		banheiro.setBounds(20, 170, 126, 23);
		contentPane.add(banheiro);
		
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if(textField.getText().isEmpty())
						lblmsg.setText("campo vazio");
					else {
						String nome = textField.getText();
						Cenario c = Fachada.criarCenario(nome);
						lblmsg.setText("cenário cadastrado - nome=" + c.getNome());
						
						if(sala.isSelected())
							Fachada.inserirComodosCenario(sala.getText(), c.getNome());

						if(cozinha.isSelected())
							Fachada.inserirComodosCenario(cozinha.getText(), c.getNome());

						if(quarto.isSelected())
							Fachada.inserirComodosCenario(quarto.getText(), c.getNome());

						if(terraco.isSelected())
							Fachada.inserirComodosCenario(terraco.getText(), c.getNome());

						if(banheiro.isSelected())
							Fachada.inserirComodosCenario(banheiro.getText(), c.getNome());

						textField.setText("");
						textField.requestFocus();
					}
				}
				catch(Exception erro){
					lblmsg.setText(erro.getMessage());
				}
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}