package br.com.justrabalhista.Projeto.para.Calculo.Traballhista.views;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaResultado extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();

        // Criar os componentes da tela
        Button btnCalcular = new Button("Calcular");
        Button btnSair = new Button("Sair");

        // Adicionar os componentes ao layout
        root.getChildren().addAll(btnCalcular, btnSair);

        // Definir a ação do botão "Calcular"
        btnCalcular.setOnAction(event -> {
            // Lógica para realizar os cálculos
            // Navegar para a próxima tela de resultados
        });

        // Definir a ação do botão "Sair"
        btnSair.setOnAction(event -> primaryStage.close());

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("JusTrabalhista - Tela Inicial");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
