/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Frist extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    // Understand the concept of component
    // How to use the StackPane

    @Override
    public void start(Stage primaryStage) {
        
//       primaryStage.setTitle("Customer End!");
//       Button btn = new Button();
//       Button btn2 = new Button();
//        
//        btn.setText("Say 'Hello World'");
//        btn2.setText("CUI");
//
//       
//
//        StackPane stackPane = new StackPane();
//        stackPane.getChildren().addAll(btn, btn2);
//
//        Scene scene = new Scene(stackPane, 500, 250);
//        primaryStage.setScene(scene);
//
//        primaryStage.show();




      GridPane grid = new GridPane();

        grid.setAlignment(Pos.CENTER);  // from container
        grid.setHgap(10);
        grid.setVgap(20);

        Label userNameLabel = new Label("User Name:");
        grid.add(userNameLabel, 0, 0);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 0);

        grid.setGridLinesVisible(false);
        
        // We can add by row and column too
        // grid.addRow(0, userNameLabel, userTextField);
        // grid.addColumn(0, userNameLabel, userTextField);

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }}



//primaryStage.setTitle("Login Form");
//
//        GridPane grid = new GridPane();
//
//        grid.setAlignment(Pos.CENTER);  // from container
//        grid.setHgap(10);
//        grid.setVgap(20);
//
//        Label userNameLabel = new Label("User Name:");
//        grid.add(userNameLabel, 0, 0);
//
//        TextField userTextField = new TextField();
//        grid.add(userTextField, 1, 0);
//
//        grid.setGridLinesVisible(false);
//        
//        // We can add by row and column too
//        // grid.addRow(0, userNameLabel, userTextField);
//        // grid.addColumn(0, userNameLabel, userTextField);
//
//        Scene scene = new Scene(grid, 300, 275);
//        primaryStage.setScene(scene);
//        primaryStage.show();