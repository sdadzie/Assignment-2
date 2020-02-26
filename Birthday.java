import javax.swing.JOptionPane;

public class Birthday {

	public static void main(String[] args) {
		String name,ageStr,toyname,card,baloon;
		int age, totcost;
		
		name = JOptionPane.showInputDialog("Enter the name of the child:");
		ageStr = JOptionPane.showInputDialog("How old is the child?");
		
		age = Integer.parseInt(ageStr);
		
		toyname = JOptionPane.showInputDialog("Enter toy name: plushie,book, blocks");
		
		JOptionPane.showMessageDialog(null, "Good Choice!");
		
		card = JOptionPane.showInputDialog("Do you want a card with the gift?Yes/No");
		baloon = JOptionPane.showInputDialog("Do you want a baloon with the gift?Yes/No");


		
		Toy obj =  new Toy(toyname,age);
		boolean flag = obj.ageOK();
		obj.addCard(card);
		obj.addBalloon(baloon);
		
		
		//System.out.println(obj);
		JOptionPane.showMessageDialog(null,"The gift for "+ name +" at "+obj);
		
		
		while (!toyname.equals(null)){
			name = JOptionPane.showInputDialog("Enter the name of the child:");
			ageStr = JOptionPane.showInputDialog("How old is the child?");
			
			age = Integer.parseInt(ageStr);
			
			toyname = JOptionPane.showInputDialog("Enter toy name: plushie,book, blocks");
	
			JOptionPane.showMessageDialog(null, "Good Choice!");
			
			card = JOptionPane.showInputDialog("Do you want a card with the gift?Yes/No");
			baloon = JOptionPane.showInputDialog("Do you want a baloon with the gift?Yes/No");
			
			
			
		}
		
		
		JOptionPane.showMessageDialog(null,"The total cost of your order is "  );
		

	}

}

	