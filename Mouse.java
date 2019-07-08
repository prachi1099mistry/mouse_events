import java.awt.*;  
import java.awt.event.*;  
public class Mouse extends Frame implements MouseListener, MouseMotionListener{  
    Label l1,l2,l3;
	int mouseDraggedCount, mouseMovedCount;
    Mouse(){  
        l1 = new Label();  
        l1.setBounds(50,50,150,20); 
		l1.addMouseListener(this);  		
        add(l1);
		l2 = new Label();  
        l2.setBounds(50,100,150,20); 
		l2.addMouseMotionListener(this);  		
        add(l2);
		l3 = new Label();  
        l3.setBounds(250,100,150,20); 
		l3.addMouseMotionListener(this);  		
        add(l3);		
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){		
				dispose();
			}
		});
    }  
    public void mouseClicked(MouseEvent e) {  
        l1.setText("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent e) {  
        l1.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        l1.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        l1.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        l1.setText("Mouse Released");  
    }
	public void mouseDragged(MouseEvent e) {  
		mouseDraggedCount++;
		l2.setText(Integer.toString(mouseDraggedCount));
	}  
	public void mouseMoved(MouseEvent e) {
		mouseMovedCount++;
		l3.setText(Integer.toString(mouseMovedCount));
	}  
	public static void main(String[] args) {  
		new Mouse();  
	}  
}
