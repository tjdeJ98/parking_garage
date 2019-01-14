package nl.hanze.t12.mvc;

import java.awt.*;

@SuppressWarnings("serial")
public class CountView extends View {

	public CountView(Model model) {
		super(model);
	}
	
	public void paintComponent(Graphics g) {
		int aantal=getModel().getAantal();
		boolean ready=false;
		int counter=1;
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 200, 200);
		g.setColor(Color.RED);
		
		for(int y=70;y<=180 && !ready; y+=5) {
			for(int x=20;x<=180 && !ready; x+=5) {
				ready=counter>aantal;
				if (!ready) g.fillRect(x, y, 3, 3);
				counter++;
			}
		}
	}
}
