package io.github.shuoros.jinstaller;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class JInstaller {
	
	private final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JInstaller window = new JInstaller();
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
	public JInstaller() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("JInstaller");
		frame.setBounds((int) screenSize.getWidth() / 2 - (int) 520 / 2,
				(int) screenSize.getHeight() / 2 - (int) 330 / 2, 520, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
