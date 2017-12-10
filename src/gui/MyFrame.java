package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;
import org.opencv.highgui.VideoCapture;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		int c=0;
		System.load("C:\\opencv\\build\\java\\x64\\opencv_java2410.dll");

		VideoCapture cap= new VideoCapture(0);
		if(!cap.isOpened()){
			System.out.println("cam not found");
			
		}

		else{
			System.out.println("cam found");
			
		}
		public void showme(){
		for(c=0;c<15;c++)
		{
		Mat  frame = new Mat();
		cap.retrieve(frame);
		
		Highgui.imwrite("me"+c+".jpg", frame);
		Mat frameblur= new Mat();
		/*Imgproc.blur(frame, frameblur, new Size(5,5));
		Highgui.imwrite("me2.jpg", frameblur);*/
		}
		}
		cap.release();
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
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
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btnStart, BorderLayout.WEST);
		
		JButton btnPause = new JButton("Pause");
		contentPane.add(btnPause, BorderLayout.EAST);
	}

}
