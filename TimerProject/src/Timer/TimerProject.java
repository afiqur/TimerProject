package Timer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerProject extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTimer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimerProject frame = new TimerProject();
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
	public TimerProject() {
		initialize();
		tm.start();
		// repaint();
	}

	public void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 328, 312);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblTimer = new JLabel("");
		lblTimer.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTimer.setBounds(40, 49, 225, 159);
		contentPane.add(lblTimer);
	}

	Timer tm = new Timer(100, this);
	int time = 0;

	public void logic() {
		time++;
		lblTimer.setText("Seconds: " + time);
		System.out.println("Hello World");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (time != 10) {
			logic();
		} else {
			JOptionPane.showMessageDialog(null, "Time UP");
			tm.stop();
		}

		repaint();
	}

}
