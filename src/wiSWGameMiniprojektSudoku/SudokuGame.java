package wiSWGameMiniprojektSudoku;

import javafx.application.Application;
import javafx.stage.Stage;
import wiSWGameMiniprojektSudoku.SudokuController.SudokuController;
import wiSWGameMiniprojektSudoku.SudokuModel.SudokuModel;
import wiSWGameMiniprojektSudoku.SudokuView.SudokuView;

public class SudokuGame extends Application{
	SudokuView view;
	SudokuController controller;
	SudokuModel model;

	public static void main (String[] args) {
		launch();
		
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		model = new SudokuModel();
		view = new SudokuView(primaryStage,model);
		controller = new SudokuController (model, view);
		view.start();
		System.out.println(model.getFile());
		
	}

	public void stop() {
		if (view != null)
			view.stop();
	}
}
