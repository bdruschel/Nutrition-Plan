import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
//test
/**
 * Creates a meal selection panel to choose a meal from. Also allows the Swing Gui
 * to return to profile selection.
 * @author DZB
 * 
 */
public class MealSelectPanel {
	private SwingGui parent;
	private JPanel mealSelectPanel;
	private JButton selectBreakfast;
	private JButton selectLunch;
	private JButton selectDinner;
	private JButton selectOther;
	private JButton backToProfile;
	private JButton addFood;
	private JTextField mealMessage;
	private JPanel buttonsPanel;
	private JPanel controlButtonsPanel;
	
	/**
	 * Creates a MealSelectPanel with the input Swing Gui as the parent.
	 * @param SwingGui The parent frame of this panel.
	 */
	public MealSelectPanel(SwingGui theParent){
		parent = theParent;
		createPanel(parent);
	}
	
	/**
	 * Instantiates and then assigns the buttons, text fields, and action listeners for
	 * the panel.
	 * @param SwingGui The parent of this panel.
	 */
	private void createPanel(SwingGui p){
		mealSelectPanel = new JPanel();
		mealSelectPanel.setLayout(new BorderLayout());
		buttonsPanel = new JPanel(new FlowLayout());
		controlButtonsPanel = new JPanel(new FlowLayout());
		selectBreakfast = new JButton("Breakfast");
		selectLunch = new JButton("Lunch.");
		selectDinner = new JButton("Dinner.");
		selectOther = new JButton("Other.");
		backToProfile = new JButton("Back.");
		addFood = new JButton("Add food to database");
		mealMessage = new JTextField("Select a meal to view, or return to profile select.");
		
		buttonsPanel.add(selectBreakfast);
		buttonsPanel.add(selectLunch);
		buttonsPanel.add(selectDinner);
		buttonsPanel.add(selectOther);
		controlButtonsPanel.add(backToProfile);
		controlButtonsPanel.add(addFood);
		mealSelectPanel.add(mealMessage, BorderLayout.NORTH);
		mealSelectPanel.add(controlButtonsPanel, BorderLayout.SOUTH);
		mealSelectPanel.add(buttonsPanel, BorderLayout.CENTER);
		
		selectBreakfast.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				parent.selectMeal(1);
			}
		});
		selectLunch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				parent.selectMeal(2);
			}
		});
		selectDinner.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				parent.selectMeal(3);
			}
		});
		selectOther.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				parent.selectMeal(4);
			}
		});
		backToProfile.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				parent.displayProfileSelect();
			}
		});
		addFood.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				parent.selectFoodPanel(2);
			}
		});
	}
	
	/**
	 * Returns the panel created by this class.
	 * @return JPanel
	 */
	public JPanel getPanel(){
		return mealSelectPanel;
	}
}
