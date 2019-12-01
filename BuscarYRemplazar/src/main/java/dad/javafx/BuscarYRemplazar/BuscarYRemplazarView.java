package dad.javafx.BuscarYRemplazar;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYRemplazarView extends Application{

	private Label buscarLabel, remplazarLabel;
	private TextField buscarText,remplazarText;
	private CheckBox mayusculasCheckBox,buscarHaciaAtrasCheckBox,expresionRegularCheckBox,resaltarResultadosCheckBox; 
	private Button buscarButton, remplazarButton,remplazarTodoButton, cerrarButton,ayudaButton;
	
	
	public void start(Stage primaryStage) throws Exception {
		
		
		//Label
		buscarLabel=new Label("Buscar:");
		remplazarLabel= new Label("Remplazar con:");
		
		//TextField
		buscarText= new TextField();
		buscarText.setAlignment(Pos.BASELINE_LEFT);
		buscarText.setMinWidth(269);
		
		remplazarText= new TextField();
		buscarText.setAlignment(Pos.BASELINE_LEFT);
		
		//CheckBox
		mayusculasCheckBox= new CheckBox("Mayúsculas y minúsculas");
		buscarHaciaAtrasCheckBox= new CheckBox("Buscar hacie atrás");
		expresionRegularCheckBox= new CheckBox("Expresión regular");
		resaltarResultadosCheckBox= new CheckBox("Resaltar resultados");
		
		//Button
		buscarButton= new Button("Buscar");
		remplazarButton= new Button("Remplazar");
		remplazarTodoButton= new Button("Remplazar todo");
		cerrarButton= new Button("Cerrar");
		ayudaButton= new Button("Ayuda");
		
		
		HBox buscar = new HBox(buscarLabel , buscarText);
		buscar.setSpacing(48);
		
		HBox primerCheck = new HBox(mayusculasCheckBox, buscarHaciaAtrasCheckBox);
		HBox segundoCheck = new HBox(expresionRegularCheckBox,resaltarResultadosCheckBox);
		
		VBox cuadrar = new VBox(remplazarText,primerCheck,segundoCheck);
		cuadrar.setSpacing(5);
		cuadrar.setAlignment(Pos.CENTER);
		HBox remplazar= new HBox(remplazarLabel, cuadrar);
		remplazar.setSpacing(5);
		
		VBox botones = new VBox(buscarButton,remplazarButton,remplazarTodoButton,cerrarButton,ayudaButton);
		botones.setAlignment(Pos.BASELINE_CENTER);
		botones.setSpacing(5);
		botones.setPrefSize(100, 100);;
		
		VBox primerPanel = new VBox(buscar,remplazar);
		primerPanel.setAlignment(Pos.BASELINE_CENTER);
		primerPanel.setSpacing(5);
		
		HBox root = new HBox(primerPanel,botones);
		root.setSpacing(10);
		
		
		
		Scene scene = new Scene(root,470,250);
		
		primaryStage.setTitle("Buscar y remplazar ");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	public static void main(String[] args) {

		launch(args);
	}
	
	
	
}
