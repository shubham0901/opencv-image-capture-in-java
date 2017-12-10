import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.highgui.Highgui;
import org.opencv.highgui.VideoCapture;
import org.opencv.imgproc.Imgproc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		System.load("C:\\opencv\\build\\java\\x64\\opencv_java2410.dll");

		VideoCapture cap= new VideoCapture(0);
		if(!cap.isOpened()){
			System.out.println("cam not found");
			
		}

		else{
			System.out.println("cam found");
			
		}
		for(c=0;c<10;c++)
		{
		Mat  frame = new Mat();
		cap.retrieve(frame);
		
		Highgui.imwrite("me"+c+".jpg", frame);
		Mat frameblur= new Mat();
		/*Imgproc.blur(frame, frameblur, new Size(5,5));
		Highgui.imwrite("me2.jpg", frameblur);*/
		}
		cap.release();
			
	}

}
