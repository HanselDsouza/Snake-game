import javax.swing.JFrame;

public class GameFrame extends JFrame{
	GameFrame(){
		this.add(new GamePanel());
//		this creates an instance 
//		of a class without assigning a variable. 
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}