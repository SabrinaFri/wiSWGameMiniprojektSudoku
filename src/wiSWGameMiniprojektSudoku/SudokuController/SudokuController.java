package wiSWGameMiniprojektSudoku.SudokuController;

import javafx.application.Platform;
import javafx.scene.control.Alert;
import wiSWGameMiniprojektSudoku.SudokuModel.SudokuModel;
import wiSWGameMiniprojektSudoku.SudokuView.SudokuView;

public class SudokuController {
	private SudokuModel model;
	private SudokuView view;
	
	
	public SudokuController(SudokuModel model, SudokuView view) {
		this.model = model;
		this.view = view;
		
		
		view.getCheckButton().setOnAction((event) -> {
			try {
				CheckGame();
			}catch(NumberFormatException e){
				Alert alert = new Alert(Alert.AlertType.INFORMATION, "Bitte füllen Sie zuerst alle Sudoku Felder aus");
				alert.showAndWait();
			}
	
	  	});
		
		view.getStage().setOnCloseRequest((event) -> {
			view.stop();
			Platform.exit();
		});
	}
	
	private void CheckGame() {
		int falseC = 0;
		for(int i = 0; i < 9; i++) {
			for(int y = 0; y < 9; y++) {
				if(view.getBoardNumbers(i, y) == 0) {
					view.setEditableFormat(i, y);
					if(Integer.parseInt(view.getNumberCell(i, y).getText()) == model.getNumberBoard(i, y)) {
						view.setCorrectFormat(i, y);
					}else {
						view.setInorrectFormat(i, y);
						falseC++;
					}
				}			
		}}
		if(falseC == 0) {
			Alert alert = new Alert(Alert.AlertType.INFORMATION, "Herzlichen Glückwunsch, Sie haben alles korrekt ausgefüllt");
			alert.showAndWait();
		}else {
			Alert alert = new Alert(Alert.AlertType.INFORMATION, "Leider haben Sie nicht alles richtig!");
			alert.showAndWait();
		}
		
		
		
	
	}

}
