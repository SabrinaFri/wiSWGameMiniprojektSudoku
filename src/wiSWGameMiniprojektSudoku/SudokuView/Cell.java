package wiSWGameMiniprojektSudoku.SudokuView;

import javafx.scene.control.TextField;

public class Cell extends TextField{
	public Cell() {
		super();
		
		setTypeNormal();
	}

	private void setTypeNormal() {
		setEditable(false);
		getStyleClass().add("normalCell");
	}
	
	public void setEditable() {
		setEditable(true);
		getStyleClass().add("editCell");

	}
	
	public void setEditableCorrect() {
		setEditable(true);
		getStyleClass().add("correctCell");

	}
	
	public void setEditableInorrect() {
		setEditable(true);
		getStyleClass().add("incorrectCell");
	}
	

}
