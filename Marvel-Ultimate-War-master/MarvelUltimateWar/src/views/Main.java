package views;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import engine.PriorityQueue;
import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import model.abilities.AreaOfEffect;
import model.world.Champion;
import model.world.Cover;
import model.world.Direction;

public class Main extends Application {

	private Controller control;
	private static int j = 0;
	private static int k = 0;

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage window) throws Exception {
		window.setTitle("Marvel Ultimate War");

		control = new Controller();

		Dimension resolution = Toolkit.getDefaultToolkit().getScreenSize();
		double width = resolution.getWidth();
		double height = resolution.getHeight();

		Image menuImage = new Image("Names Image.png");
		ImageView menuImageView = new ImageView(menuImage);
		menuImageView.setFitHeight(height);
		menuImageView.setFitWidth(width);

		Image knowhereImage = new Image("Knowhere.jpg");
		ImageView knowhereImageView = new ImageView(knowhereImage);
		knowhereImageView.setFitHeight(height);
		knowhereImageView.setFitWidth(width);

		// Captain America Image
		Image captanAmericaImage = new Image("Captain America.jpg");
		ImageView captanAmericaImageView = new ImageView(captanAmericaImage);
		captanAmericaImageView.setFitHeight(150);
		captanAmericaImageView.setFitWidth(150);

		// Dr Strange Image
		Image drStrangeImage = new Image("Dr Strange.jpg");
		ImageView drStrangeImageView = new ImageView(drStrangeImage);
		drStrangeImageView.setFitHeight(150);
		drStrangeImageView.setFitWidth(150);

		// Hulk Image
		Image hulkImage = new Image("Hulk.jpg");
		ImageView hulkImageView = new ImageView(hulkImage);
		hulkImageView.setFitHeight(150);
		hulkImageView.setFitWidth(150);

		// Iceman Image
		Image icemanImage = new Image("Iceman.jpeg");
		ImageView icemanImageView = new ImageView(icemanImage);
		icemanImageView.setFitHeight(150);
		icemanImageView.setFitWidth(150);

		// Iron Man Image
		Image ironmanImage = new Image("Iron Man.jfif");
		ImageView ironmanImageView = new ImageView(ironmanImage);
		ironmanImageView.setFitHeight(150);
		ironmanImageView.setFitWidth(150);

		// Spiderman Image
		Image spidermanImage = new Image("Spiderman.jpg");
		ImageView spidermanImageView = new ImageView(spidermanImage);
		spidermanImageView.setFitHeight(150);
		spidermanImageView.setFitWidth(150);

		// Thor Image
		Image thorImage = new Image("Thor.jpg");
		ImageView thorImageView = new ImageView(thorImage);
		thorImageView.setFitHeight(150);
		thorImageView.setFitWidth(150);

		// Loki Image
		Image lokiImage = new Image("Loki.jpg");
		ImageView lokiImageView = new ImageView(lokiImage);
		lokiImageView.setFitHeight(150);
		lokiImageView.setFitWidth(150);

		// Yellow Jacket Image
		Image yellowJacketImage = new Image("Yellow Jacket.jpg");
		ImageView yellowJacketImageView = new ImageView(yellowJacketImage);
		yellowJacketImageView.setFitHeight(150);
		yellowJacketImageView.setFitWidth(150);

		// Hela Image
		Image helaImage = new Image("Hela.png");
		ImageView helaImageView = new ImageView(helaImage);
		helaImageView.setFitHeight(150);
		helaImageView.setFitWidth(150);

		// Electro Image
		Image electroImage = new Image("Electro.jpg");
		ImageView electroImageView = new ImageView(electroImage);
		electroImageView.setFitHeight(150);
		electroImageView.setFitWidth(150);

		// Quick Silver Image
		Image quickSilverImage = new Image("Quick Silver.jpg");
		ImageView quickSilverImageView = new ImageView(quickSilverImage);
		quickSilverImageView.setFitHeight(150);
		quickSilverImageView.setFitWidth(150);

		// Venom Image
		Image venomImage = new Image("Venom.jpg");
		ImageView venomImageView = new ImageView(venomImage);
		venomImageView.setFitHeight(150);
		venomImageView.setFitWidth(150);

		// Deadpool Image
		Image deadpoolImage = new Image("Deadpool.jpg");
		ImageView deadpoolImageView = new ImageView(deadpoolImage);
		deadpoolImageView.setFitHeight(150);
		deadpoolImageView.setFitWidth(150);

		// Ghost Rider Image
		Image ghostRiderImage = new Image("Ghost Rider.png");
		ImageView ghostRiderImageView = new ImageView(ghostRiderImage);
		ghostRiderImageView.setFitHeight(150);
		ghostRiderImageView.setFitWidth(150);

		Rectangle rectangle = new Rectangle(200, 160);
		rectangle.setArcWidth(30);
		rectangle.setArcHeight(100);

		// A non-responsive text message that is displayed on the screen
		Text names = new Text("ENTER YOUR NAMES");
		names.setTranslateY(-70);
		names.setFont(Font.font("Impact", 80));
		names.setFill(Color.RED);
		names.setStrokeWidth(6);
		names.setStroke(Color.BLACK);

		StackPane homeLayout = new StackPane();
		Scene homeScene = new Scene(homeLayout, width, height);
		Label homeLabel = new Label();
		Image homeImage = new Image("First Screen.png");
		ImageView homeImageView = new ImageView(homeImage);
		homeImageView.setFitHeight(height);
		homeImageView.setFitWidth(width);
		homeLabel.setGraphic(homeImageView);
		homeLayout.getChildren().add(homeLabel);

		StackPane menuPage = new StackPane();
		Scene menuScene = new Scene(menuPage, width, height);
		VBox options = new VBox(5);
		Label menuLabel = new Label();
		menuLabel.setGraphic(menuImageView);

		StackPane namesLayout = new StackPane();
		Scene namesScene = new Scene(namesLayout, width, height);
		HBox namesField = new HBox(50);
		VBox namesVBox = new VBox();
		Label namesLabel = new Label();
		namesLabel.setGraphic(menuImageView);

		StackPane championsLayout = new StackPane();
		HBox championsHBox1 = new HBox(20);
		HBox championsHBox2 = new HBox(20);
		HBox championsHBox3 = new HBox(20);
		HBox firstPlayerTeam = new HBox(20);
		HBox secondPlayerTeam = new HBox(20);
		Scene championsScene = new Scene(championsLayout, width, height);
		Label championsLayoutBackground = new Label();
		championsLayoutBackground.setGraphic(knowhereImageView);

		StackPane pickLeaderLayout = new StackPane();
		HBox firstPlayerTeam2 = new HBox(20);
		HBox secondPlayerTeam2 = new HBox(20);
		Scene pickLeaderScene = new Scene(pickLeaderLayout, width, height);
		Label pickLeaderLabel = new Label();
		pickLeaderLabel.setGraphic(knowhereImageView);

		StackPane pickLeaderLayout2 = new StackPane();
		Scene pickLeaderScene2 = new Scene(pickLeaderLayout2, width, height);
		Label pickLeaderLabel2 = new Label();
		pickLeaderLabel2.setGraphic(knowhereImageView);

		StackPane stackPane = new StackPane();
		BorderPane borderPane = new BorderPane();
		GridPane gridPane = new GridPane();
		Scene gameScene = new Scene(stackPane, width, height);
		Label gameLabel = new Label();
		gameLabel.setGraphic(knowhereImageView);

		Text playerOneName2 = new Text();
		playerOneName2.setFont(Font.font("Impact", 40));
		playerOneName2.setFill(Color.RED);
		playerOneName2.setStrokeWidth(2);
		playerOneName2.setStroke(Color.BLACK);
		playerOneName2.setTranslateY(-330);

		Text playerTwoName2 = new Text();
		playerTwoName2.setFont(Font.font("Impact", 40));
		playerTwoName2.setFill(Color.RED);
		playerTwoName2.setStrokeWidth(2);
		playerTwoName2.setStroke(Color.BLACK);
		playerTwoName2.setTranslateY(-330);

		Text championOneDetails = new Text();
		championOneDetails.setFont(Font.font("Impact", 10));
		championOneDetails.setFill(Color.WHITE);
		championOneDetails.setStrokeWidth(0.5);
		championOneDetails.setStroke(Color.BLACK);

		Text championTwoDetails = new Text();
		championTwoDetails.setFont(Font.font("Impact", 10));
		championTwoDetails.setFill(Color.WHITE);
		championTwoDetails.setStrokeWidth(0.5);
		championTwoDetails.setStroke(Color.BLACK);

		Text championThreeDetails = new Text();
		championThreeDetails.setFont(Font.font("Impact", 10));
		championThreeDetails.setFill(Color.WHITE);
		championThreeDetails.setStrokeWidth(0.5);
		championThreeDetails.setStroke(Color.BLACK);

		HBox teamOneDetails = new HBox(2);
		teamOneDetails.setAlignment(Pos.CENTER_LEFT);
		teamOneDetails.setTranslateY(-30);
		teamOneDetails.getChildren().addAll(championOneDetails, championTwoDetails, championThreeDetails);

		StackPane left = new StackPane();
		left.getChildren().addAll(playerOneName2, teamOneDetails);
		borderPane.setLeft(left);

		Text championFourDetails = new Text();
		championFourDetails.setFont(Font.font("Impact", 10));
		championFourDetails.setFill(Color.WHITE);
		championFourDetails.setStrokeWidth(0.5);
		championFourDetails.setStroke(Color.BLACK);

		Text championFiveDetails = new Text();
		championFiveDetails.setFont(Font.font("Impact", 10));
		championFiveDetails.setFill(Color.WHITE);
		championFiveDetails.setStrokeWidth(0.5);
		championFiveDetails.setStroke(Color.BLACK);

		Text championSixDetails = new Text();
		championSixDetails.setFont(Font.font("Impact", 10));
		championSixDetails.setFill(Color.WHITE);
		championSixDetails.setStrokeWidth(0.5);
		championSixDetails.setStroke(Color.BLACK);

		HBox teamTwoDetails = new HBox(2);
		teamTwoDetails.setAlignment(Pos.CENTER_RIGHT);
		teamTwoDetails.setTranslateY(-30);
		teamTwoDetails.getChildren().addAll(championFourDetails, championFiveDetails, championSixDetails);

		StackPane right = new StackPane();
		right.getChildren().addAll(playerTwoName2, teamTwoDetails);
		borderPane.setRight(right);

//		gridPane.setPadding(new Insets(200, 400, 400, 450));
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setVgap(10);
		gridPane.setHgap(10);

		VBox vbox = new VBox(3);

		Button toTheBoard = new Button("CONFIRM");
		toTheBoard.setPrefWidth(200);
		toTheBoard.setPrefHeight(30);
		toTheBoard.setShape(rectangle);
		toTheBoard.setStyle("-fx-background-color: #A2A2A2; -fx-font-size: 20");
		toTheBoard.setOnMouseEntered(e -> toTheBoard.setStyle("-fx-background-color: #828282; -fx-font-size: 20"));
		toTheBoard.setOnMouseExited(e -> toTheBoard.setStyle("-fx-background-color: #A2A2A2; -fx-font-size: 20"));
		toTheBoard.setDisable(true);
		toTheBoard.setOnMouseClicked(e -> {
			championOneDetails.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
			championTwoDetails.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
			championThreeDetails.setText(control.getChampionDetails2(control.playerOne.getTeam().get(2).getName()));
			championFourDetails.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
			championFiveDetails.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
			championSixDetails.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(2).getName()));

			window.setScene(gameScene);
			Object[][] board = control.getBoard();
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					Button button = new Button();
					button.setPrefWidth(100);
					button.setPrefHeight(100);

					if (board[i][j] instanceof Champion) {
						Champion champion = (Champion) board[i][j];
						button.setText(((Champion) board[i][j]).getName() + '\n' + champion.getCurrentHP());
					}
					if (board[i][j] instanceof Cover) {
						Cover cover = (Cover) board[i][j];
						button.setText("Cover" + '\n' + cover.getCurrentHP());
					}

					gridPane.setConstraints(button, j, Math.abs(i - 4));
					gridPane.getChildren().add(button);
				}
			}

			PriorityQueue turnOrder = new PriorityQueue(6);
			ArrayList<Champion> a = new ArrayList<Champion>();

			while (!control.getTurnOrder().isEmpty()) {
				a.add((Champion) control.getTurnOrder().peekMin());
				turnOrder.insert(control.getTurnOrder().remove());
			}

			for (int i = 0; i < a.size(); i++) {
				Button button = new Button(((Champion) a.get(i)).getName());
				button.setPrefWidth(100);
				button.setPrefHeight(20);
				if (i == j)
					button.setStyle("-fx-background-color: #3AFF00;");
				if (i - 1 == j)
					button.setStyle("-fx-background-color: #F9F501;");
				vbox.getChildren().add(button);
			}

			while (!turnOrder.isEmpty()) {
				control.getTurnOrder().insert(turnOrder.remove());
			}

			stackPane.setOnKeyPressed(e1 -> {
				KeyCode c = e1.getCode();

				if (c == KeyCode.K) {
					GridPane g = this.updateMove();

					int size = control.playerOne.getTeam().size();
					if (size == 0) {
						championOneDetails.setText("");
						championTwoDetails.setText("");
						championThreeDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerTwo.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size == 1) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails.setText("");
						championThreeDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SINGLETARGET) {
									TextField x = new TextField();
									TextField y = new TextField();
									x.setPromptText("X-Coordinate");
									y.setPromptText("Y-Coordinate");
									Button ok = new Button("OK");

									x.setMaxWidth(100);
									x.setMaxHeight(100);
									y.setMaxWidth(100);
									y.setMaxHeight(100);
									ok.setMaxWidth(100);
									ok.setMaxHeight(100);

									g.setConstraints(x, 0, 5);
									g.setConstraints(y, 1, 5);
									g.setConstraints(ok, 2, 5);

									final int ii = i;

									ok.setOnMouseClicked(e2 -> {
										if (x.getText().isEmpty() || y.getText().isEmpty()) {
											Alert alert = new Alert(AlertType.ERROR);
											alert.setHeaderText("Input information");
											alert.setContentText("Please enter a number for both coordinates");
											alert.show();
										} else {
											g.getChildren().removeAll(x, y, ok);
											control.castAbility(
													control.playerOne.getTeam().get(0).getAbilities().get(ii),
													Integer.parseInt(x.getText()), Integer.parseInt(y.getText()));
										}
									});
									g.getChildren().addAll(x, y, ok);
									break;
								}
							}
						}
					}
					if (size == 2) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SINGLETARGET) {
									TextField x = new TextField();
									TextField y = new TextField();
									x.setPromptText("X-Coordinate");
									y.setPromptText("Y-Coordinate");
									Button ok = new Button("OK");

									x.setMaxWidth(100);
									x.setMaxHeight(100);
									y.setMaxWidth(100);
									y.setMaxHeight(100);
									ok.setMaxWidth(100);
									ok.setMaxHeight(100);

									g.setConstraints(x, 0, 5);
									g.setConstraints(y, 1, 5);
									g.setConstraints(ok, 2, 5);

									final int ii = i;

									ok.setOnMouseClicked(e2 -> {
										if (x.getText().isEmpty() || y.getText().isEmpty()) {
											Alert alert = new Alert(AlertType.ERROR);
											alert.setHeaderText("Input information");
											alert.setContentText("Please enter a number for both coordinates");
											alert.show();
										} else {
											g.getChildren().removeAll(x, y, ok);
											control.castAbility(
													control.playerOne.getTeam().get(0).getAbilities().get(ii),
													Integer.parseInt(x.getText()), Integer.parseInt(y.getText()));
										}
									});
									g.getChildren().addAll(x, y, ok);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerOne.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerOne.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SINGLETARGET) {
									TextField x = new TextField();
									TextField y = new TextField();
									x.setPromptText("X-Coordinate");
									y.setPromptText("Y-Coordinate");
									Button ok = new Button("OK");

									x.setMaxWidth(100);
									x.setMaxHeight(100);
									y.setMaxWidth(100);
									y.setMaxHeight(100);
									ok.setMaxWidth(100);
									ok.setMaxHeight(100);

									g.setConstraints(x, 0, 5);
									g.setConstraints(y, 1, 5);
									g.setConstraints(ok, 2, 5);

									final int ii = i;

									ok.setOnMouseClicked(e2 -> {
										if (x.getText().isEmpty() || y.getText().isEmpty()) {
											Alert alert = new Alert(AlertType.ERROR);
											alert.setHeaderText("Input information");
											alert.setContentText("Please enter a number for both coordinates");
											alert.show();
										} else {
											g.getChildren().removeAll(x, y, ok);
											control.castAbility(
													control.playerOne.getTeam().get(1).getAbilities().get(ii),
													Integer.parseInt(x.getText()), Integer.parseInt(y.getText()));
										}
									});
									g.getChildren().addAll(x, y, ok);
									break;
								}
							}
						}
					}
					if (size == 3) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(2).getName()));

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SINGLETARGET) {
									TextField x = new TextField();
									TextField y = new TextField();
									x.setPromptText("X-Coordinate");
									y.setPromptText("Y-Coordinate");
									Button ok = new Button("OK");

									x.setMaxWidth(100);
									x.setMaxHeight(100);
									y.setMaxWidth(100);
									y.setMaxHeight(100);
									ok.setMaxWidth(100);
									ok.setMaxHeight(100);

									g.setConstraints(x, 0, 5);
									g.setConstraints(y, 1, 5);
									g.setConstraints(ok, 2, 5);

									final int ii = i;

									ok.setOnMouseClicked(e2 -> {
										if (x.getText().isEmpty() || y.getText().isEmpty()) {
											Alert alert = new Alert(AlertType.ERROR);
											alert.setHeaderText("Input information");
											alert.setContentText("Please enter a number for both coordinates");
											alert.show();
										} else {
											g.getChildren().removeAll(x, y, ok);
											control.castAbility(
													control.playerOne.getTeam().get(0).getAbilities().get(ii),
													Integer.parseInt(x.getText()), Integer.parseInt(y.getText()));
										}
									});
									g.getChildren().addAll(x, y, ok);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerOne.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerOne.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SINGLETARGET) {
									TextField x = new TextField();
									TextField y = new TextField();
									x.setPromptText("X-Coordinate");
									y.setPromptText("Y-Coordinate");
									Button ok = new Button("OK");

									x.setMaxWidth(100);
									x.setMaxHeight(100);
									y.setMaxWidth(100);
									y.setMaxHeight(100);
									ok.setMaxWidth(100);
									ok.setMaxHeight(100);

									g.setConstraints(x, 0, 5);
									g.setConstraints(y, 1, 5);
									g.setConstraints(ok, 2, 5);

									final int ii = i;

									ok.setOnMouseClicked(e2 -> {
										if (x.getText().isEmpty() || y.getText().isEmpty()) {
											Alert alert = new Alert(AlertType.ERROR);
											alert.setHeaderText("Input information");
											alert.setContentText("Please enter a number for both coordinates");
											alert.show();
										} else {
											g.getChildren().removeAll(x, y, ok);
											control.castAbility(
													control.playerOne.getTeam().get(1).getAbilities().get(ii),
													Integer.parseInt(x.getText()), Integer.parseInt(y.getText()));
										}
									});
									g.getChildren().addAll(x, y, ok);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(2).getName())) {
							int sizeAbilities3 = control.playerOne.getTeam().get(2).getAbilities().size();
							for (int i = 0; i < sizeAbilities3; i++) {
								if (control.playerOne.getTeam().get(2).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SINGLETARGET) {
									TextField x = new TextField();
									TextField y = new TextField();
									x.setPromptText("X-Coordinate");
									y.setPromptText("Y-Coordinate");
									Button ok = new Button("OK");

									x.setMaxWidth(100);
									x.setMaxHeight(100);
									y.setMaxWidth(100);
									y.setMaxHeight(100);
									ok.setMaxWidth(100);
									ok.setMaxHeight(100);

									g.setConstraints(x, 0, 5);
									g.setConstraints(y, 1, 5);
									g.setConstraints(ok, 2, 5);

									final int ii = i;

									ok.setOnMouseClicked(e2 -> {
										if (x.getText().isEmpty() || y.getText().isEmpty()) {
											Alert alert = new Alert(AlertType.ERROR);
											alert.setHeaderText("Input information");
											alert.setContentText("Please enter a number for both coordinates");
											alert.show();
										} else {
											g.getChildren().removeAll(x, y, ok);
											control.castAbility(
													control.playerOne.getTeam().get(2).getAbilities().get(ii),
													Integer.parseInt(x.getText()), Integer.parseInt(y.getText()));
										}
									});
									g.getChildren().addAll(x, y, ok);
									break;
								}
							}
						}
					}
					HBox teamOneDetails2 = new HBox(2);
					teamOneDetails2.setAlignment(Pos.CENTER_LEFT);
					teamOneDetails2.setTranslateY(-30);
					teamOneDetails2.getChildren().addAll(championOneDetails, championTwoDetails, championThreeDetails);

					StackPane left2 = new StackPane();
					left2.getChildren().addAll(playerOneName2, teamOneDetails2);
					borderPane.setLeft(left2);

					int size2 = control.playerTwo.getTeam().size();
					if (size2 == 0) {
						championFourDetails.setText("");
						championFiveDetails.setText("");
						championSixDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerOne.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size2 == 1) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails.setText("");
						championSixDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SINGLETARGET) {
									TextField x = new TextField();
									TextField y = new TextField();
									x.setPromptText("X-Coordinate");
									y.setPromptText("Y-Coordinate");
									Button ok = new Button("OK");

									x.setMaxWidth(100);
									x.setMaxHeight(100);
									y.setMaxWidth(100);
									y.setMaxHeight(100);
									ok.setMaxWidth(100);
									ok.setMaxHeight(100);

									g.setConstraints(x, 0, 5);
									g.setConstraints(y, 1, 5);
									g.setConstraints(ok, 2, 5);

									final int ii = i;

									ok.setOnMouseClicked(e2 -> {
										if (x.getText().isEmpty() || y.getText().isEmpty()) {
											Alert alert = new Alert(AlertType.ERROR);
											alert.setHeaderText("Input information");
											alert.setContentText("Please enter a number for both coordinates");
											alert.show();
										} else {
											g.getChildren().removeAll(x, y, ok);
											control.castAbility(
													control.playerTwo.getTeam().get(0).getAbilities().get(ii),
													Integer.parseInt(x.getText()), Integer.parseInt(y.getText()));
										}
									});
									g.getChildren().addAll(x, y, ok);
									break;
								}
							}
						}
					}
					if (size2 == 2) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SINGLETARGET) {
									TextField x = new TextField();
									TextField y = new TextField();
									x.setPromptText("X-Coordinate");
									y.setPromptText("Y-Coordinate");
									Button ok = new Button("OK");

									x.setMaxWidth(100);
									x.setMaxHeight(100);
									y.setMaxWidth(100);
									y.setMaxHeight(100);
									ok.setMaxWidth(100);
									ok.setMaxHeight(100);

									g.setConstraints(x, 0, 5);
									g.setConstraints(y, 1, 5);
									g.setConstraints(ok, 2, 5);

									final int ii = i;

									ok.setOnMouseClicked(e2 -> {
										if (x.getText().isEmpty() || y.getText().isEmpty()) {
											Alert alert = new Alert(AlertType.ERROR);
											alert.setHeaderText("Input information");
											alert.setContentText("Please enter a number for both coordinates");
											alert.show();
										} else {
											g.getChildren().removeAll(x, y, ok);
											control.castAbility(
													control.playerTwo.getTeam().get(0).getAbilities().get(ii),
													Integer.parseInt(x.getText()), Integer.parseInt(y.getText()));
										}
									});
									g.getChildren().addAll(x, y, ok);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerTwo.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerTwo.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SINGLETARGET) {
									TextField x = new TextField();
									TextField y = new TextField();
									x.setPromptText("X-Coordinate");
									y.setPromptText("Y-Coordinate");
									Button ok = new Button("OK");

									x.setMaxWidth(100);
									x.setMaxHeight(100);
									y.setMaxWidth(100);
									y.setMaxHeight(100);
									ok.setMaxWidth(100);
									ok.setMaxHeight(100);

									g.setConstraints(x, 0, 5);
									g.setConstraints(y, 1, 5);
									g.setConstraints(ok, 2, 5);

									final int ii = i;

									ok.setOnMouseClicked(e2 -> {
										if (x.getText().isEmpty() || y.getText().isEmpty()) {
											Alert alert = new Alert(AlertType.ERROR);
											alert.setHeaderText("Input information");
											alert.setContentText("Please enter a number for both coordinates");
											alert.show();
										} else {
											g.getChildren().removeAll(x, y, ok);
											control.castAbility(
													control.playerTwo.getTeam().get(1).getAbilities().get(ii),
													Integer.parseInt(x.getText()), Integer.parseInt(y.getText()));
										}
									});
									g.getChildren().addAll(x, y, ok);
									break;
								}
							}
						}
					}
					if (size2 == 3) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(2).getName()));

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SINGLETARGET) {
									TextField x = new TextField();
									TextField y = new TextField();
									x.setPromptText("X-Coordinate");
									y.setPromptText("Y-Coordinate");
									Button ok = new Button("OK");

									x.setMaxWidth(100);
									x.setMaxHeight(100);
									y.setMaxWidth(100);
									y.setMaxHeight(100);
									ok.setMaxWidth(100);
									ok.setMaxHeight(100);

									g.setConstraints(x, 0, 5);
									g.setConstraints(y, 1, 5);
									g.setConstraints(ok, 2, 5);

									final int ii = i;

									ok.setOnMouseClicked(e2 -> {
										if (x.getText().isEmpty() || y.getText().isEmpty()) {
											Alert alert = new Alert(AlertType.ERROR);
											alert.setHeaderText("Input information");
											alert.setContentText("Please enter a number for both coordinates");
											alert.show();
										} else {
											g.getChildren().removeAll(x, y, ok);
											control.castAbility(
													control.playerTwo.getTeam().get(0).getAbilities().get(ii),
													Integer.parseInt(x.getText()), Integer.parseInt(y.getText()));
										}
									});
									g.getChildren().addAll(x, y, ok);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerTwo.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerTwo.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SINGLETARGET) {
									TextField x = new TextField();
									TextField y = new TextField();
									x.setPromptText("X-Coordinate");
									y.setPromptText("Y-Coordinate");
									Button ok = new Button("OK");

									x.setMaxWidth(100);
									x.setMaxHeight(100);
									y.setMaxWidth(100);
									y.setMaxHeight(100);
									ok.setMaxWidth(100);
									ok.setMaxHeight(100);

									g.setConstraints(x, 0, 5);
									g.setConstraints(y, 1, 5);
									g.setConstraints(ok, 2, 5);

									final int ii = i;

									ok.setOnMouseClicked(e2 -> {
										if (x.getText().isEmpty() || y.getText().isEmpty()) {
											Alert alert = new Alert(AlertType.ERROR);
											alert.setHeaderText("Input information");
											alert.setContentText("Please enter a number for both coordinates");
											alert.show();
										} else {
											g.getChildren().removeAll(x, y, ok);
											control.castAbility(
													control.playerTwo.getTeam().get(1).getAbilities().get(ii),
													Integer.parseInt(x.getText()), Integer.parseInt(y.getText()));
										}
									});
									g.getChildren().addAll(x, y, ok);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(2).getName())) {
							int sizeAbilities3 = control.playerTwo.getTeam().get(2).getAbilities().size();
							for (int i = 0; i < sizeAbilities3; i++) {
								if (control.playerOne.getTeam().get(2).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SINGLETARGET) {
									TextField x = new TextField();
									TextField y = new TextField();
									x.setPromptText("X-Coordinate");
									y.setPromptText("Y-Coordinate");
									Button ok = new Button("OK");

									x.setMaxWidth(100);
									x.setMaxHeight(100);
									y.setMaxWidth(100);
									y.setMaxHeight(100);
									ok.setMaxWidth(100);
									ok.setMaxHeight(100);

									g.setConstraints(x, 0, 5);
									g.setConstraints(y, 1, 5);
									g.setConstraints(ok, 2, 5);

									final int ii = i;

									ok.setOnMouseClicked(e2 -> {
										if (x.getText().isEmpty() || y.getText().isEmpty()) {
											Alert alert = new Alert(AlertType.ERROR);
											alert.setHeaderText("Input information");
											alert.setContentText("Please enter a number for both coordinates");
											alert.show();
										} else {
											g.getChildren().removeAll(x, y, ok);
											control.castAbility(
													control.playerTwo.getTeam().get(2).getAbilities().get(ii),
													Integer.parseInt(x.getText()), Integer.parseInt(y.getText()));
										}
									});
									g.getChildren().addAll(x, y, ok);
									break;
								}
							}
						}
					}

					HBox teamTwoDetails2 = new HBox(2);
					teamTwoDetails2.setAlignment(Pos.CENTER_RIGHT);
					teamTwoDetails2.setTranslateY(-30);
					teamTwoDetails2.getChildren().addAll(championFourDetails, championFiveDetails, championSixDetails);

					StackPane right2 = new StackPane();
					right2.getChildren().addAll(playerTwoName2, teamTwoDetails2);
					borderPane.setRight(right2);

					if (k == 0)
						stackPane.getChildren().remove(gridPane);
					if (k == 1)
						stackPane.getChildren().remove(g);
					k = 1;

					g.setAlignment(Pos.CENTER);
					stackPane.getChildren().add(g);
				}

				if (c == KeyCode.V) {
					int size = control.playerOne.getTeam().size();
					if (size == 0) {
						championOneDetails.setText("");
						championTwoDetails.setText("");
						championThreeDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerTwo.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size == 1) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails.setText("");
						championThreeDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(0).getAbilities().get(i),
											Direction.UP);
									break;
								}
							}
						}
					}
					if (size == 2) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(0).getAbilities().get(i),
											Direction.UP);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerOne.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerOne.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(1).getAbilities().get(i),
											Direction.UP);
									break;
								}
							}
						}
					}
					if (size == 3) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(2).getName()));

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(0).getAbilities().get(i),
											Direction.UP);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerOne.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerOne.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(1).getAbilities().get(i),
											Direction.UP);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(2).getName())) {
							int sizeAbilities3 = control.playerOne.getTeam().get(2).getAbilities().size();
							for (int i = 0; i < sizeAbilities3; i++) {
								if (control.playerOne.getTeam().get(2).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(2).getAbilities().get(i),
											Direction.UP);
									break;
								}
							}
						}
					}
					HBox teamOneDetails2 = new HBox(2);
					teamOneDetails2.setAlignment(Pos.CENTER_LEFT);
					teamOneDetails2.setTranslateY(-30);
					teamOneDetails2.getChildren().addAll(championOneDetails, championTwoDetails, championThreeDetails);

					StackPane left2 = new StackPane();
					left2.getChildren().addAll(playerOneName2, teamOneDetails2);
					borderPane.setLeft(left2);

					int size2 = control.playerTwo.getTeam().size();
					if (size2 == 0) {
						championFourDetails.setText("");
						championFiveDetails.setText("");
						championSixDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerOne.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size2 == 1) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails.setText("");
						championSixDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(0).getAbilities().get(i),
											Direction.UP);
									break;
								}
							}
						}
					}
					if (size2 == 2) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(0).getAbilities().get(i),
											Direction.UP);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerTwo.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerTwo.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(1).getAbilities().get(i),
											Direction.UP);
									break;
								}
							}
						}
					}
					if (size2 == 3) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(2).getName()));

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(0).getAbilities().get(i),
											Direction.UP);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerTwo.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerTwo.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(1).getAbilities().get(i),
											Direction.UP);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(2).getName())) {
							int sizeAbilities3 = control.playerTwo.getTeam().get(2).getAbilities().size();
							for (int i = 0; i < sizeAbilities3; i++) {
								if (control.playerOne.getTeam().get(2).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(2).getAbilities().get(i),
											Direction.UP);
									break;
								}
							}
						}
					}

					HBox teamTwoDetails2 = new HBox(2);
					teamTwoDetails2.setAlignment(Pos.CENTER_RIGHT);
					teamTwoDetails2.setTranslateY(-30);
					teamTwoDetails2.getChildren().addAll(championFourDetails, championFiveDetails, championSixDetails);

					StackPane right2 = new StackPane();
					right2.getChildren().addAll(playerTwoName2, teamTwoDetails2);
					borderPane.setRight(right2);

					GridPane g = this.updateMove();
					if (k == 0)
						stackPane.getChildren().remove(gridPane);
					if (k == 1)
						stackPane.getChildren().remove(g);
					k = 1;

					g.setAlignment(Pos.CENTER);
					stackPane.getChildren().add(g);
				}

				if (c == KeyCode.B) {
					int size = control.playerOne.getTeam().size();
					if (size == 0) {
						championOneDetails.setText("");
						championTwoDetails.setText("");
						championThreeDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerTwo.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size == 1) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails.setText("");
						championThreeDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(0).getAbilities().get(i),
											Direction.DOWN);
									break;
								}
							}
						}
					}
					if (size == 2) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(0).getAbilities().get(i),
											Direction.DOWN);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerOne.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerOne.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(1).getAbilities().get(i),
											Direction.DOWN);
									break;
								}
							}
						}
					}
					if (size == 3) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(2).getName()));

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(0).getAbilities().get(i),
											Direction.DOWN);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerOne.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerOne.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(1).getAbilities().get(i),
											Direction.DOWN);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(2).getName())) {
							int sizeAbilities3 = control.playerOne.getTeam().get(2).getAbilities().size();
							for (int i = 0; i < sizeAbilities3; i++) {
								if (control.playerOne.getTeam().get(2).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(2).getAbilities().get(i),
											Direction.DOWN);
									break;
								}
							}
						}
					}
					HBox teamOneDetails2 = new HBox(2);
					teamOneDetails2.setAlignment(Pos.CENTER_LEFT);
					teamOneDetails2.setTranslateY(-30);
					teamOneDetails2.getChildren().addAll(championOneDetails, championTwoDetails, championThreeDetails);

					StackPane left2 = new StackPane();
					left2.getChildren().addAll(playerOneName2, teamOneDetails2);
					borderPane.setLeft(left2);

					int size2 = control.playerTwo.getTeam().size();
					if (size2 == 0) {
						championFourDetails.setText("");
						championFiveDetails.setText("");
						championSixDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerOne.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size2 == 1) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails.setText("");
						championSixDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(0).getAbilities().get(i),
											Direction.DOWN);
									break;
								}
							}
						}
					}
					if (size2 == 2) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(0).getAbilities().get(i),
											Direction.DOWN);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerTwo.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerTwo.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(1).getAbilities().get(i),
											Direction.DOWN);
									break;
								}
							}
						}
					}
					if (size2 == 3) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(2).getName()));

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(0).getAbilities().get(i),
											Direction.DOWN);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerTwo.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerTwo.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(1).getAbilities().get(i),
											Direction.DOWN);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(2).getName())) {
							int sizeAbilities3 = control.playerTwo.getTeam().get(2).getAbilities().size();
							for (int i = 0; i < sizeAbilities3; i++) {
								if (control.playerOne.getTeam().get(2).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(2).getAbilities().get(i),
											Direction.DOWN);
									break;
								}
							}
						}
					}

					HBox teamTwoDetails2 = new HBox(2);
					teamTwoDetails2.setAlignment(Pos.CENTER_RIGHT);
					teamTwoDetails2.setTranslateY(-30);
					teamTwoDetails2.getChildren().addAll(championFourDetails, championFiveDetails, championSixDetails);

					StackPane right2 = new StackPane();
					right2.getChildren().addAll(playerTwoName2, teamTwoDetails2);
					borderPane.setRight(right2);

					GridPane g = this.updateMove();
					if (k == 0)
						stackPane.getChildren().remove(gridPane);
					if (k == 1)
						stackPane.getChildren().remove(g);
					k = 1;

					g.setAlignment(Pos.CENTER);
					stackPane.getChildren().add(g);
				}

				if (c == KeyCode.N) {
					int size = control.playerOne.getTeam().size();
					if (size == 0) {
						championOneDetails.setText("");
						championTwoDetails.setText("");
						championThreeDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerTwo.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size == 1) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails.setText("");
						championThreeDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(0).getAbilities().get(i),
											Direction.LEFT);
									break;
								}
							}
						}
					}
					if (size == 2) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(0).getAbilities().get(i),
											Direction.LEFT);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerOne.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerOne.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(1).getAbilities().get(i),
											Direction.LEFT);
									break;
								}
							}
						}
					}
					if (size == 3) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(2).getName()));

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(0).getAbilities().get(i),
											Direction.LEFT);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerOne.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerOne.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(1).getAbilities().get(i),
											Direction.LEFT);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(2).getName())) {
							int sizeAbilities3 = control.playerOne.getTeam().get(2).getAbilities().size();
							for (int i = 0; i < sizeAbilities3; i++) {
								if (control.playerOne.getTeam().get(2).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(2).getAbilities().get(i),
											Direction.LEFT);
									break;
								}
							}
						}
					}
					HBox teamOneDetails2 = new HBox(2);
					teamOneDetails2.setAlignment(Pos.CENTER_LEFT);
					teamOneDetails2.setTranslateY(-30);
					teamOneDetails2.getChildren().addAll(championOneDetails, championTwoDetails, championThreeDetails);

					StackPane left2 = new StackPane();
					left2.getChildren().addAll(playerOneName2, teamOneDetails2);
					borderPane.setLeft(left2);

					int size2 = control.playerTwo.getTeam().size();
					if (size2 == 0) {
						championFourDetails.setText("");
						championFiveDetails.setText("");
						championSixDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerOne.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size2 == 1) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails.setText("");
						championSixDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(0).getAbilities().get(i),
											Direction.LEFT);
									break;
								}
							}
						}
					}
					if (size2 == 2) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(0).getAbilities().get(i),
											Direction.LEFT);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerTwo.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerTwo.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(1).getAbilities().get(i),
											Direction.LEFT);
									break;
								}
							}
						}
					}
					if (size2 == 3) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(2).getName()));

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(0).getAbilities().get(i),
											Direction.LEFT);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerTwo.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerTwo.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(1).getAbilities().get(i),
											Direction.LEFT);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(2).getName())) {
							int sizeAbilities3 = control.playerTwo.getTeam().get(2).getAbilities().size();
							for (int i = 0; i < sizeAbilities3; i++) {
								if (control.playerOne.getTeam().get(2).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(2).getAbilities().get(i),
											Direction.LEFT);
									break;
								}
							}
						}
					}

					HBox teamTwoDetails2 = new HBox(2);
					teamTwoDetails2.setAlignment(Pos.CENTER_RIGHT);
					teamTwoDetails2.setTranslateY(-30);
					teamTwoDetails2.getChildren().addAll(championFourDetails, championFiveDetails, championSixDetails);

					StackPane right2 = new StackPane();
					right2.getChildren().addAll(playerTwoName2, teamTwoDetails2);
					borderPane.setRight(right2);

					GridPane g = this.updateMove();
					if (k == 0)
						stackPane.getChildren().remove(gridPane);
					if (k == 1)
						stackPane.getChildren().remove(g);
					k = 1;

					g.setAlignment(Pos.CENTER);
					stackPane.getChildren().add(g);
				}

				if (c == KeyCode.M) {
					int size = control.playerOne.getTeam().size();
					if (size == 0) {
						championOneDetails.setText("");
						championTwoDetails.setText("");
						championThreeDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerTwo.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size == 1) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails.setText("");
						championThreeDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(0).getAbilities().get(i),
											Direction.RIGHT);
									break;
								}
							}
						}
					}
					if (size == 2) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(0).getAbilities().get(i),
											Direction.RIGHT);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerOne.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerOne.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(1).getAbilities().get(i),
											Direction.RIGHT);
									break;
								}
							}
						}
					}
					if (size == 3) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(2).getName()));

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(0).getAbilities().get(i),
											Direction.RIGHT);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerOne.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerOne.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(1).getAbilities().get(i),
											Direction.RIGHT);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(2).getName())) {
							int sizeAbilities3 = control.playerOne.getTeam().get(2).getAbilities().size();
							for (int i = 0; i < sizeAbilities3; i++) {
								if (control.playerOne.getTeam().get(2).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerOne.getTeam().get(2).getAbilities().get(i),
											Direction.RIGHT);
									break;
								}
							}
						}
					}
					HBox teamOneDetails2 = new HBox(2);
					teamOneDetails2.setAlignment(Pos.CENTER_LEFT);
					teamOneDetails2.setTranslateY(-30);
					teamOneDetails2.getChildren().addAll(championOneDetails, championTwoDetails, championThreeDetails);

					StackPane left2 = new StackPane();
					left2.getChildren().addAll(playerOneName2, teamOneDetails2);
					borderPane.setLeft(left2);

					int size2 = control.playerTwo.getTeam().size();
					if (size2 == 0) {
						championFourDetails.setText("");
						championFiveDetails.setText("");
						championSixDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerOne.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size2 == 1) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails.setText("");
						championSixDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(0).getAbilities().get(i),
											Direction.RIGHT);
									break;
								}
							}
						}
					}
					if (size2 == 2) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(0).getAbilities().get(i),
											Direction.RIGHT);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerTwo.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerTwo.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(1).getAbilities().get(i),
											Direction.RIGHT);
									break;
								}
							}
						}
					}
					if (size2 == 3) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(2).getName()));

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(0).getAbilities().get(i),
											Direction.RIGHT);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerTwo.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerTwo.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(1).getAbilities().get(i),
											Direction.RIGHT);
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(2).getName())) {
							int sizeAbilities3 = control.playerTwo.getTeam().get(2).getAbilities().size();
							for (int i = 0; i < sizeAbilities3; i++) {
								if (control.playerOne.getTeam().get(2).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.DIRECTIONAL) {
									control.castAbility(control.playerTwo.getTeam().get(2).getAbilities().get(i),
											Direction.RIGHT);
									break;
								}
							}
						}
					}

					HBox teamTwoDetails2 = new HBox(2);
					teamTwoDetails2.setAlignment(Pos.CENTER_RIGHT);
					teamTwoDetails2.setTranslateY(-30);
					teamTwoDetails2.getChildren().addAll(championFourDetails, championFiveDetails, championSixDetails);

					StackPane right2 = new StackPane();
					right2.getChildren().addAll(playerTwoName2, teamTwoDetails2);
					borderPane.setRight(right2);

					GridPane g = this.updateMove();
					if (k == 0)
						stackPane.getChildren().remove(gridPane);
					if (k == 1)
						stackPane.getChildren().remove(g);
					k = 1;

					g.setAlignment(Pos.CENTER);
					stackPane.getChildren().add(g);
				}

				if (c == KeyCode.C) {
					int size = control.playerOne.getTeam().size();
					if (size == 0) {
						championOneDetails.setText("");
						championTwoDetails.setText("");
						championThreeDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerTwo.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size == 1) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails.setText("");
						championThreeDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.TEAMTARGET) {
									control.castAbility(control.playerOne.getTeam().get(0).getAbilities().get(i));
									break;
								}
							}
						}
					}
					if (size == 2) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.TEAMTARGET) {
									control.castAbility(control.playerOne.getTeam().get(0).getAbilities().get(i));
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerOne.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerOne.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.TEAMTARGET) {
									control.castAbility(control.playerOne.getTeam().get(1).getAbilities().get(i));
									break;
								}
							}
						}
					}
					if (size == 3) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(2).getName()));

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.TEAMTARGET) {
									control.castAbility(control.playerOne.getTeam().get(0).getAbilities().get(i));
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerOne.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerOne.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.TEAMTARGET) {
									control.castAbility(control.playerOne.getTeam().get(1).getAbilities().get(i));
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(2).getName())) {
							int sizeAbilities3 = control.playerOne.getTeam().get(2).getAbilities().size();
							for (int i = 0; i < sizeAbilities3; i++) {
								if (control.playerOne.getTeam().get(2).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.TEAMTARGET) {
									control.castAbility(control.playerOne.getTeam().get(2).getAbilities().get(i));
									break;
								}
							}
						}
					}
					HBox teamOneDetails2 = new HBox(2);
					teamOneDetails2.setAlignment(Pos.CENTER_LEFT);
					teamOneDetails2.setTranslateY(-30);
					teamOneDetails2.getChildren().addAll(championOneDetails, championTwoDetails, championThreeDetails);

					StackPane left2 = new StackPane();
					left2.getChildren().addAll(playerOneName2, teamOneDetails2);
					borderPane.setLeft(left2);

					int size2 = control.playerTwo.getTeam().size();
					if (size2 == 0) {
						championFourDetails.setText("");
						championFiveDetails.setText("");
						championSixDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerOne.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size2 == 1) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails.setText("");
						championSixDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.TEAMTARGET) {
									control.castAbility(control.playerTwo.getTeam().get(0).getAbilities().get(i));
									break;
								}
							}
						}
					}
					if (size2 == 2) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.TEAMTARGET) {
									control.castAbility(control.playerTwo.getTeam().get(0).getAbilities().get(i));
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerTwo.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerTwo.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.TEAMTARGET) {
									control.castAbility(control.playerTwo.getTeam().get(1).getAbilities().get(i));
									break;
								}
							}
						}
					}
					if (size2 == 3) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(2).getName()));

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.TEAMTARGET) {
									control.castAbility(control.playerTwo.getTeam().get(0).getAbilities().get(i));
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerTwo.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerTwo.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.TEAMTARGET) {
									control.castAbility(control.playerTwo.getTeam().get(1).getAbilities().get(i));
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(2).getName())) {
							int sizeAbilities3 = control.playerTwo.getTeam().get(2).getAbilities().size();
							for (int i = 0; i < sizeAbilities3; i++) {
								if (control.playerOne.getTeam().get(2).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.TEAMTARGET) {
									control.castAbility(control.playerTwo.getTeam().get(2).getAbilities().get(i));
									break;
								}
							}
						}
					}

					HBox teamTwoDetails2 = new HBox(2);
					teamTwoDetails2.setAlignment(Pos.CENTER_RIGHT);
					teamTwoDetails2.setTranslateY(-30);
					teamTwoDetails2.getChildren().addAll(championFourDetails, championFiveDetails, championSixDetails);

					StackPane right2 = new StackPane();
					right2.getChildren().addAll(playerTwoName2, teamTwoDetails2);
					borderPane.setRight(right2);

					GridPane g = this.updateMove();
					if (k == 0)
						stackPane.getChildren().remove(gridPane);
					if (k == 1)
						stackPane.getChildren().remove(g);
					k = 1;

					g.setAlignment(Pos.CENTER);
					stackPane.getChildren().add(g);
				}

				if (c == KeyCode.X) {
					int size = control.playerOne.getTeam().size();
					if (size == 0) {
						championOneDetails.setText("");
						championTwoDetails.setText("");
						championThreeDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerTwo.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size == 1) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails.setText("");
						championThreeDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SURROUND) {
									control.castAbility(control.playerOne.getTeam().get(0).getAbilities().get(i));
									break;
								}
							}
						}
					}
					if (size == 2) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SURROUND) {
									control.castAbility(control.playerOne.getTeam().get(0).getAbilities().get(i));
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerOne.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerOne.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SURROUND) {
									control.castAbility(control.playerOne.getTeam().get(1).getAbilities().get(i));
									break;
								}
							}
						}
					}
					if (size == 3) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(2).getName()));

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SURROUND) {
									control.castAbility(control.playerOne.getTeam().get(0).getAbilities().get(i));
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerOne.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerOne.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SURROUND) {
									control.castAbility(control.playerOne.getTeam().get(1).getAbilities().get(i));
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(2).getName())) {
							int sizeAbilities3 = control.playerOne.getTeam().get(2).getAbilities().size();
							for (int i = 0; i < sizeAbilities3; i++) {
								if (control.playerOne.getTeam().get(2).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SURROUND) {
									control.castAbility(control.playerOne.getTeam().get(2).getAbilities().get(i));
									break;
								}
							}
						}
					}
					HBox teamOneDetails2 = new HBox(2);
					teamOneDetails2.setAlignment(Pos.CENTER_LEFT);
					teamOneDetails2.setTranslateY(-30);
					teamOneDetails2.getChildren().addAll(championOneDetails, championTwoDetails, championThreeDetails);

					StackPane left2 = new StackPane();
					left2.getChildren().addAll(playerOneName2, teamOneDetails2);
					borderPane.setLeft(left2);

					int size2 = control.playerTwo.getTeam().size();
					if (size2 == 0) {
						championFourDetails.setText("");
						championFiveDetails.setText("");
						championSixDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerOne.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size2 == 1) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails.setText("");
						championSixDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SURROUND) {
									control.castAbility(control.playerTwo.getTeam().get(0).getAbilities().get(i));
									break;
								}
							}
						}
					}
					if (size2 == 2) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SURROUND) {
									control.castAbility(control.playerTwo.getTeam().get(0).getAbilities().get(i));
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerTwo.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerTwo.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SURROUND) {
									control.castAbility(control.playerTwo.getTeam().get(1).getAbilities().get(i));
									break;
								}
							}
						}
						return;
					}
					if (size2 == 3) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(2).getName()));

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SURROUND) {
									control.castAbility(control.playerTwo.getTeam().get(0).getAbilities().get(i));
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerTwo.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerTwo.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SURROUND) {
									control.castAbility(control.playerTwo.getTeam().get(1).getAbilities().get(i));
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(2).getName())) {
							int sizeAbilities3 = control.playerTwo.getTeam().get(2).getAbilities().size();
							for (int i = 0; i < sizeAbilities3; i++) {
								if (control.playerOne.getTeam().get(2).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SURROUND) {
									control.castAbility(control.playerTwo.getTeam().get(2).getAbilities().get(i));
									break;
								}
							}
						}
						return;
					}

					HBox teamTwoDetails2 = new HBox(2);
					teamTwoDetails2.setAlignment(Pos.CENTER_RIGHT);
					teamTwoDetails2.setTranslateY(-30);
					teamTwoDetails2.getChildren().addAll(championFourDetails, championFiveDetails, championSixDetails);

					StackPane right2 = new StackPane();
					right2.getChildren().addAll(playerTwoName2, teamTwoDetails2);
					borderPane.setRight(right2);

					GridPane g = this.updateMove();
					if (k == 0)
						stackPane.getChildren().remove(gridPane);
					if (k == 1)
						stackPane.getChildren().remove(g);
					k = 1;

					g.setAlignment(Pos.CENTER);
					stackPane.getChildren().add(g);
				}

				if (c == KeyCode.Z) {
					int size = control.playerOne.getTeam().size();
					if (size == 0) {
						championOneDetails.setText("");
						championTwoDetails.setText("");
						championThreeDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerTwo.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size == 1) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails.setText("");
						championThreeDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SELFTARGET) {
									control.castAbility(control.playerOne.getTeam().get(0).getAbilities().get(i));
									break;
								}
							}
						}
					}
					if (size == 2) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SELFTARGET) {
									control.castAbility(control.playerOne.getTeam().get(0).getAbilities().get(i));
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerOne.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerOne.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SELFTARGET) {
									control.castAbility(control.playerOne.getTeam().get(1).getAbilities().get(i));
									break;
								}
							}
						}
					}
					if (size == 3) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(2).getName()));

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerOne.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerOne.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SELFTARGET) {
									control.castAbility(control.playerOne.getTeam().get(0).getAbilities().get(i));
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerOne.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerOne.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SELFTARGET) {
									control.castAbility(control.playerOne.getTeam().get(1).getAbilities().get(i));
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerOne.getTeam().get(2).getName())) {
							int sizeAbilities3 = control.playerOne.getTeam().get(2).getAbilities().size();
							for (int i = 0; i < sizeAbilities3; i++) {
								if (control.playerOne.getTeam().get(2).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SELFTARGET) {
									control.castAbility(control.playerOne.getTeam().get(2).getAbilities().get(i));
									break;
								}
							}
						}
					}
					HBox teamOneDetails2 = new HBox(2);
					teamOneDetails2.setAlignment(Pos.CENTER_LEFT);
					teamOneDetails2.setTranslateY(-30);
					teamOneDetails2.getChildren().addAll(championOneDetails, championTwoDetails, championThreeDetails);

					StackPane left2 = new StackPane();
					left2.getChildren().addAll(playerOneName2, teamOneDetails2);
					borderPane.setLeft(left2);

					int size2 = control.playerTwo.getTeam().size();
					if (size2 == 0) {
						championFourDetails.setText("");
						championFiveDetails.setText("");
						championSixDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerOne.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size2 == 1) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails.setText("");
						championSixDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SELFTARGET) {
									control.castAbility(control.playerTwo.getTeam().get(0).getAbilities().get(i));
									break;
								}
							}
						}
					}
					if (size2 == 2) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails.setText("");

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SELFTARGET) {
									control.castAbility(control.playerTwo.getTeam().get(0).getAbilities().get(i));
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerTwo.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerTwo.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SELFTARGET) {
									control.castAbility(control.playerTwo.getTeam().get(1).getAbilities().get(i));
									break;
								}
							}
						}
					}
					if (size2 == 3) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(2).getName()));

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(0).getName())) {
							int sizeAbilities = control.playerTwo.getTeam().get(0).getAbilities().size();
							for (int i = 0; i < sizeAbilities; i++) {
								if (control.playerTwo.getTeam().get(0).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SELFTARGET) {
									control.castAbility(control.playerTwo.getTeam().get(0).getAbilities().get(i));
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(1).getName())) {
							int sizeAbilities2 = control.playerTwo.getTeam().get(1).getAbilities().size();
							for (int i = 0; i < sizeAbilities2; i++) {
								if (control.playerTwo.getTeam().get(1).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SELFTARGET) {
									control.castAbility(control.playerTwo.getTeam().get(1).getAbilities().get(i));
									break;
								}
							}
						}

						if (control.getCurrentChampion().getName()
								.equals(control.playerTwo.getTeam().get(2).getName())) {
							int sizeAbilities3 = control.playerTwo.getTeam().get(2).getAbilities().size();
							for (int i = 0; i < sizeAbilities3; i++) {
								if (control.playerOne.getTeam().get(2).getAbilities().get(i)
										.getCastArea() == AreaOfEffect.SELFTARGET) {
									control.castAbility(control.playerTwo.getTeam().get(2).getAbilities().get(i));
									break;
								}
							}
						}
					}

					HBox teamTwoDetails2 = new HBox(2);
					teamTwoDetails2.setAlignment(Pos.CENTER_RIGHT);
					teamTwoDetails2.setTranslateY(-30);
					teamTwoDetails2.getChildren().addAll(championFourDetails, championFiveDetails, championSixDetails);

					StackPane right2 = new StackPane();
					right2.getChildren().addAll(playerTwoName2, teamTwoDetails2);
					borderPane.setRight(right2);

					GridPane g = this.updateMove();
					if (k == 0)
						stackPane.getChildren().remove(gridPane);
					if (k == 1)
						stackPane.getChildren().remove(g);
					k = 1;

					g.setAlignment(Pos.CENTER);
					stackPane.getChildren().add(g);
				}

				if (c == KeyCode.U) {
					control.useLeaderAbility();
					this.updateMove();

					int size = control.playerOne.getTeam().size();
					if (size == 0) {
						championOneDetails.setText("");
						championTwoDetails.setText("");
						championThreeDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerTwo.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size == 1) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails.setText("");
						championThreeDetails.setText("");
					}
					if (size == 2) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails.setText("");
					}
					if (size == 3) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(2).getName()));
					}
					HBox teamOneDetails2 = new HBox(2);
					teamOneDetails2.setAlignment(Pos.CENTER_LEFT);
					teamOneDetails2.setTranslateY(-30);
					teamOneDetails2.getChildren().addAll(championOneDetails, championTwoDetails, championThreeDetails);

					StackPane left2 = new StackPane();
					left2.getChildren().addAll(playerOneName2, teamOneDetails2);
					borderPane.setLeft(left2);

					int size2 = control.playerTwo.getTeam().size();
					if (size2 == 0) {
						championFourDetails.setText("");
						championFiveDetails.setText("");
						championSixDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerOne.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size2 == 1) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails.setText("");
						championSixDetails.setText("");
					}
					if (size2 == 2) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails.setText("");
					}
					if (size2 == 3) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(2).getName()));
					}

					HBox teamTwoDetails2 = new HBox(2);
					teamTwoDetails2.setAlignment(Pos.CENTER_RIGHT);
					teamTwoDetails2.setTranslateY(-30);
					teamTwoDetails2.getChildren().addAll(championFourDetails, championFiveDetails, championSixDetails);

					StackPane right2 = new StackPane();
					right2.getChildren().addAll(playerTwoName2, teamTwoDetails2);
					borderPane.setRight(right2);

					GridPane g = this.updateMove();
					if (k == 0)
						stackPane.getChildren().remove(gridPane);
					if (k == 1)
						stackPane.getChildren().remove(g);
					k = 1;

					g.setAlignment(Pos.CENTER);
					stackPane.getChildren().add(g);
				}

				if (c == KeyCode.Y) {
					control.attack(Direction.UP);
					this.updateMove();

					int size = control.playerOne.getTeam().size();
					if (size == 0) {
						championOneDetails.setText("");
						championTwoDetails.setText("");
						championThreeDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerTwo.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size == 1) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails.setText("");
						championThreeDetails.setText("");
					}
					if (size == 2) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails.setText("");
					}
					if (size == 3) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(2).getName()));
					}
					HBox teamOneDetails2 = new HBox(2);
					teamOneDetails2.setAlignment(Pos.CENTER_LEFT);
					teamOneDetails2.setTranslateY(-30);
					teamOneDetails2.getChildren().addAll(championOneDetails, championTwoDetails, championThreeDetails);

					StackPane left2 = new StackPane();
					left2.getChildren().addAll(playerOneName2, teamOneDetails2);
					borderPane.setLeft(left2);

					int size2 = control.playerTwo.getTeam().size();
					if (size2 == 0) {
						championFourDetails.setText("");
						championFiveDetails.setText("");
						championSixDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerOne.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size2 == 1) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails.setText("");
						championSixDetails.setText("");
					}
					if (size2 == 2) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails.setText("");
					}
					if (size2 == 3) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(2).getName()));
					}

					HBox teamTwoDetails2 = new HBox(2);
					teamTwoDetails2.setAlignment(Pos.CENTER_RIGHT);
					teamTwoDetails2.setTranslateY(-30);
					teamTwoDetails2.getChildren().addAll(championFourDetails, championFiveDetails, championSixDetails);

					StackPane right2 = new StackPane();
					right2.getChildren().addAll(playerTwoName2, teamTwoDetails2);
					borderPane.setRight(right2);

					GridPane g = this.updateMove();
					if (k == 0)
						stackPane.getChildren().remove(gridPane);
					if (k == 1)
						stackPane.getChildren().remove(g);
					k = 1;

					g.setAlignment(Pos.CENTER);
					stackPane.getChildren().add(g);
				}

				if (c == KeyCode.G) {
					control.attack(Direction.LEFT);
					this.updateMove();

					int size = control.playerOne.getTeam().size();
					if (size == 0) {
						championOneDetails.setText("");
						championTwoDetails.setText("");
						championThreeDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerTwo.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size == 1) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails.setText("");
						championThreeDetails.setText("");
					}
					if (size == 2) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails.setText("");
					}
					if (size == 3) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(2).getName()));
					}
					HBox teamOneDetails2 = new HBox(2);
					teamOneDetails2.setAlignment(Pos.CENTER_LEFT);
					teamOneDetails2.setTranslateY(-30);
					teamOneDetails2.getChildren().addAll(championOneDetails, championTwoDetails, championThreeDetails);

					StackPane left2 = new StackPane();
					left2.getChildren().addAll(playerOneName2, teamOneDetails2);
					borderPane.setLeft(left2);

					int size2 = control.playerTwo.getTeam().size();
					if (size2 == 0) {
						championFourDetails.setText("");
						championFiveDetails.setText("");
						championSixDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerOne.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size2 == 1) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails.setText("");
						championSixDetails.setText("");
					}
					if (size2 == 2) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails.setText("");
					}
					if (size2 == 3) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(2).getName()));
					}

					HBox teamTwoDetails2 = new HBox(2);
					teamTwoDetails2.setAlignment(Pos.CENTER_RIGHT);
					teamTwoDetails2.setTranslateY(-30);
					teamTwoDetails2.getChildren().addAll(championFourDetails, championFiveDetails, championSixDetails);

					StackPane right2 = new StackPane();
					right2.getChildren().addAll(playerTwoName2, teamTwoDetails2);
					borderPane.setRight(right2);

					GridPane g = this.updateMove();
					if (k == 0)
						stackPane.getChildren().remove(gridPane);
					if (k == 1)
						stackPane.getChildren().remove(g);
					k = 1;

					g.setAlignment(Pos.CENTER);
					stackPane.getChildren().add(g);
				}

				if (c == KeyCode.H) {
					control.attack(Direction.DOWN);
					this.updateMove();

					int size = control.playerOne.getTeam().size();
					if (size == 0) {
						championOneDetails.setText("");
						championTwoDetails.setText("");
						championThreeDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerTwo.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size == 1) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails.setText("");
						championThreeDetails.setText("");
					}
					if (size == 2) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails.setText("");
					}
					if (size == 3) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(2).getName()));
					}
					HBox teamOneDetails2 = new HBox(2);
					teamOneDetails2.setAlignment(Pos.CENTER_LEFT);
					teamOneDetails2.setTranslateY(-30);
					teamOneDetails2.getChildren().addAll(championOneDetails, championTwoDetails, championThreeDetails);

					StackPane left2 = new StackPane();
					left2.getChildren().addAll(playerOneName2, teamOneDetails2);
					borderPane.setLeft(left2);

					int size2 = control.playerTwo.getTeam().size();
					if (size2 == 0) {
						championFourDetails.setText("");
						championFiveDetails.setText("");
						championSixDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerOne.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size2 == 1) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails.setText("");
						championSixDetails.setText("");
					}
					if (size2 == 2) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails.setText("");
					}
					if (size2 == 3) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(2).getName()));
					}

					HBox teamTwoDetails2 = new HBox(2);
					teamTwoDetails2.setAlignment(Pos.CENTER_RIGHT);
					teamTwoDetails2.setTranslateY(-30);
					teamTwoDetails2.getChildren().addAll(championFourDetails, championFiveDetails, championSixDetails);

					StackPane right2 = new StackPane();
					right2.getChildren().addAll(playerTwoName2, teamTwoDetails2);
					borderPane.setRight(right2);

					GridPane g = this.updateMove();
					if (k == 0)
						stackPane.getChildren().remove(gridPane);
					if (k == 1)
						stackPane.getChildren().remove(g);
					k = 1;

					g.setAlignment(Pos.CENTER);
					stackPane.getChildren().add(g);
				}

				if (c == KeyCode.J) {
					control.attack(Direction.RIGHT);
					this.updateMove();

					int size = control.playerOne.getTeam().size();
					if (size == 0) {
						championOneDetails.setText("");
						championTwoDetails.setText("");
						championThreeDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerTwo.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size == 1) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails.setText("");
						championThreeDetails.setText("");
					}
					if (size == 2) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails.setText("");
					}
					if (size == 3) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(2).getName()));
					}
					HBox teamOneDetails2 = new HBox(2);
					teamOneDetails2.setAlignment(Pos.CENTER_LEFT);
					teamOneDetails2.setTranslateY(-30);
					teamOneDetails2.getChildren().addAll(championOneDetails, championTwoDetails, championThreeDetails);

					StackPane left2 = new StackPane();
					left2.getChildren().addAll(playerOneName2, teamOneDetails2);
					borderPane.setLeft(left2);

					int size2 = control.playerTwo.getTeam().size();
					if (size2 == 0) {
						championFourDetails.setText("");
						championFiveDetails.setText("");
						championSixDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerOne.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size2 == 1) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails.setText("");
						championSixDetails.setText("");
					}
					if (size2 == 2) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails.setText("");
					}
					if (size2 == 3) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(2).getName()));
					}

					HBox teamTwoDetails2 = new HBox(2);
					teamTwoDetails2.setAlignment(Pos.CENTER_RIGHT);
					teamTwoDetails2.setTranslateY(-30);
					teamTwoDetails2.getChildren().addAll(championFourDetails, championFiveDetails, championSixDetails);

					StackPane right2 = new StackPane();
					right2.getChildren().addAll(playerTwoName2, teamTwoDetails2);
					borderPane.setRight(right2);

					GridPane g = this.updateMove();
					if (k == 0)
						stackPane.getChildren().remove(gridPane);
					if (k == 1)
						stackPane.getChildren().remove(g);
					k = 1;

					g.setAlignment(Pos.CENTER);
					stackPane.getChildren().add(g);
				}

				if (c == KeyCode.E) {
					control.endTurn();
					vbox.getChildren().clear();
					j++;
					if (j == 6)
						j = 0;

					PriorityQueue turnOrder2 = new PriorityQueue(control.getTurnOrder().size());
					ArrayList<Champion> a2 = new ArrayList<Champion>();

					while (!control.getTurnOrder().isEmpty()) {
						a2.add((Champion) control.getTurnOrder().peekMin());
						turnOrder2.insert(control.getTurnOrder().remove());
					}

					for (int i = 0; i < a2.size(); i++) {
						Button button = new Button(((Champion) a2.get(i)).getName());
						button.setPrefWidth(100);
						button.setPrefHeight(20);
						if (i == 0)
							button.setStyle("-fx-background-color: #3AFF00;");
						if (i == 1)
							button.setStyle("-fx-background-color: #FCF800;");
						vbox.getChildren().add(button);
					}

					while (!turnOrder2.isEmpty()) {
						control.getTurnOrder().insert(turnOrder2.remove());
					}
					vbox.setAlignment(Pos.BOTTOM_RIGHT);
					vbox.setTranslateX(-20);
					vbox.setTranslateY(-20);
					stackPane.getChildren().remove(vbox);
					stackPane.getChildren().add(vbox);

					int size = control.playerOne.getTeam().size();
					if (size == 0) {
						championOneDetails.setText("");
						championTwoDetails.setText("");
						championThreeDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerTwo.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size == 1) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails.setText("");
						championThreeDetails.setText("");
					}
					if (size == 2) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails.setText("");
					}
					if (size == 3) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(2).getName()));
					}
					HBox teamOneDetails2 = new HBox(2);
					teamOneDetails2.setAlignment(Pos.CENTER_LEFT);
					teamOneDetails2.setTranslateY(-30);
					teamOneDetails2.getChildren().addAll(championOneDetails, championTwoDetails, championThreeDetails);

					StackPane left2 = new StackPane();
					left2.getChildren().addAll(playerOneName2, teamOneDetails2);
					borderPane.setLeft(left2);

					int size2 = control.playerTwo.getTeam().size();
					if (size2 == 0) {
						championFourDetails.setText("");
						championFiveDetails.setText("");
						championSixDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerOne.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size2 == 1) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails.setText("");
						championSixDetails.setText("");
					}
					if (size2 == 2) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails.setText("");
					}
					if (size2 == 3) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(2).getName()));
					}

					HBox teamTwoDetails2 = new HBox(2);
					teamTwoDetails2.setAlignment(Pos.CENTER_RIGHT);
					teamTwoDetails2.setTranslateY(-30);
					teamTwoDetails2.getChildren().addAll(championFourDetails, championFiveDetails, championSixDetails);

					StackPane right2 = new StackPane();
					right2.getChildren().addAll(playerTwoName2, teamTwoDetails2);
					borderPane.setRight(right2);
				}

				if (c == KeyCode.W) {
					control.updateMove(Direction.UP);
					int size = control.playerOne.getTeam().size();
					if (size == 0) {
						championOneDetails.setText("");
						championTwoDetails.setText("");
						championThreeDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerTwo.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size == 1) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails.setText("");
						championThreeDetails.setText("");
					}
					if (size == 2) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails.setText("");
					}
					if (size == 3) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(2).getName()));
					}
					HBox teamOneDetails2 = new HBox(2);
					teamOneDetails2.setAlignment(Pos.CENTER_LEFT);
					teamOneDetails2.setTranslateY(-30);
					teamOneDetails2.getChildren().addAll(championOneDetails, championTwoDetails, championThreeDetails);

					StackPane left2 = new StackPane();
					left2.getChildren().addAll(playerOneName2, teamOneDetails2);
					borderPane.setLeft(left2);

					int size2 = control.playerTwo.getTeam().size();
					if (size2 == 0) {
						championFourDetails.setText("");
						championFiveDetails.setText("");
						championSixDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerOne.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size2 == 1) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails.setText("");
						championSixDetails.setText("");
					}
					if (size2 == 2) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails.setText("");
					}
					if (size2 == 3) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(2).getName()));
					}

					HBox teamTwoDetails2 = new HBox(2);
					teamTwoDetails2.setAlignment(Pos.CENTER_RIGHT);
					teamTwoDetails2.setTranslateY(-30);
					teamTwoDetails2.getChildren().addAll(championFourDetails, championFiveDetails, championSixDetails);

					StackPane right2 = new StackPane();
					right2.getChildren().addAll(playerTwoName2, teamTwoDetails2);
					borderPane.setRight(right2);

					GridPane g = this.updateMove();
					if (k == 0)
						stackPane.getChildren().remove(gridPane);
					if (k == 1)
						stackPane.getChildren().remove(g);
					k = 1;

					g = this.updateMove();
					g.setAlignment(Pos.CENTER);
					stackPane.getChildren().add(g);
				}
				if (c == KeyCode.A) {
					control.updateMove(Direction.LEFT);
					int size = control.playerOne.getTeam().size();
					if (size == 0) {
						championOneDetails.setText("");
						championTwoDetails.setText("");
						championThreeDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerTwo.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size == 1) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails.setText("");
						championThreeDetails.setText("");
					}
					if (size == 2) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails.setText("");
					}
					if (size == 3) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(2).getName()));
					}
					HBox teamOneDetails2 = new HBox(2);
					teamOneDetails2.setAlignment(Pos.CENTER_LEFT);
					teamOneDetails2.setTranslateY(-30);
					teamOneDetails2.getChildren().addAll(championOneDetails, championTwoDetails, championThreeDetails);

					StackPane left2 = new StackPane();
					left2.getChildren().addAll(playerOneName2, teamOneDetails2);
					borderPane.setLeft(left2);

					int size2 = control.playerTwo.getTeam().size();
					if (size2 == 0) {
						championFourDetails.setText("");
						championFiveDetails.setText("");
						championSixDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerOne.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size2 == 1) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails.setText("");
						championSixDetails.setText("");
					}
					if (size2 == 2) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails.setText("");
					}
					if (size2 == 3) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(2).getName()));
					}

					HBox teamTwoDetails2 = new HBox(2);
					teamTwoDetails2.setAlignment(Pos.CENTER_RIGHT);
					teamTwoDetails2.setTranslateY(-30);
					teamTwoDetails2.getChildren().addAll(championFourDetails, championFiveDetails, championSixDetails);

					StackPane right2 = new StackPane();
					right2.getChildren().addAll(playerTwoName2, teamTwoDetails2);
					borderPane.setRight(right2);

					GridPane g = this.updateMove();
					if (k == 0)
						stackPane.getChildren().remove(gridPane);
					if (k == 1)
						stackPane.getChildren().remove(g);
					k = 1;

					g = this.updateMove();
					g.setAlignment(Pos.CENTER);
					stackPane.getChildren().add(g);
				}
				if (c == KeyCode.S) {
					control.updateMove(Direction.DOWN);
					int size = control.playerOne.getTeam().size();
					if (size == 0) {
						championOneDetails.setText("");
						championTwoDetails.setText("");
						championThreeDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerTwo.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size == 1) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails.setText("");
						championThreeDetails.setText("");
					}
					if (size == 2) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails.setText("");
					}
					if (size == 3) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(2).getName()));
					}
					HBox teamOneDetails2 = new HBox(2);
					teamOneDetails2.setAlignment(Pos.CENTER_LEFT);
					teamOneDetails2.setTranslateY(-30);
					teamOneDetails2.getChildren().addAll(championOneDetails, championTwoDetails, championThreeDetails);

					StackPane left2 = new StackPane();
					left2.getChildren().addAll(playerOneName2, teamOneDetails2);
					borderPane.setLeft(left2);

					int size2 = control.playerTwo.getTeam().size();
					if (size2 == 0) {
						championFourDetails.setText("");
						championFiveDetails.setText("");
						championSixDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerOne.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size2 == 1) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails.setText("");
						championSixDetails.setText("");
					}
					if (size2 == 2) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails.setText("");
					}
					if (size2 == 3) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(2).getName()));
					}

					HBox teamTwoDetails2 = new HBox(2);
					teamTwoDetails2.setAlignment(Pos.CENTER_RIGHT);
					teamTwoDetails2.setTranslateY(-30);
					teamTwoDetails2.getChildren().addAll(championFourDetails, championFiveDetails, championSixDetails);

					StackPane right2 = new StackPane();
					right2.getChildren().addAll(playerTwoName2, teamTwoDetails2);
					borderPane.setRight(right2);

					GridPane g = this.updateMove();
					if (k == 0)
						stackPane.getChildren().remove(gridPane);
					if (k == 1)
						stackPane.getChildren().remove(g);
					k = 1;

					g = this.updateMove();
					g.setAlignment(Pos.CENTER);
					stackPane.getChildren().add(g);
				}
				if (c == KeyCode.D) {
					control.updateMove(Direction.RIGHT);
					int size = control.playerOne.getTeam().size();
					if (size == 0) {
						championOneDetails.setText("");
						championTwoDetails.setText("");
						championThreeDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerTwo.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size == 1) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails.setText("");
						championThreeDetails.setText("");
					}
					if (size == 2) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails.setText("");
					}
					if (size == 3) {
						championOneDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(0).getName()));
						championTwoDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(1).getName()));
						championThreeDetails
								.setText(control.getChampionDetails2(control.playerOne.getTeam().get(2).getName()));
					}
					HBox teamOneDetails2 = new HBox(2);
					teamOneDetails2.setAlignment(Pos.CENTER_LEFT);
					teamOneDetails2.setTranslateY(-30);
					teamOneDetails2.getChildren().addAll(championOneDetails, championTwoDetails, championThreeDetails);

					StackPane left2 = new StackPane();
					left2.getChildren().addAll(playerOneName2, teamOneDetails2);
					borderPane.setLeft(left2);

					int size2 = control.playerTwo.getTeam().size();
					if (size2 == 0) {
						championFourDetails.setText("");
						championFiveDetails.setText("");
						championSixDetails.setText("");
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setHeaderText("Game Over!");
						alert.setContentText(control.playerOne.getName() + " WINS!");
						alert.setOnCloseRequest(e2 -> {
							alert.close();
							window.close();
						});
						alert.show();
					}
					if (size2 == 1) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails.setText("");
						championSixDetails.setText("");
					}
					if (size2 == 2) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails.setText("");
					}
					if (size2 == 3) {
						championFourDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(0).getName()));
						championFiveDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(1).getName()));
						championSixDetails
								.setText(control.getChampionDetails2(control.playerTwo.getTeam().get(2).getName()));
					}

					HBox teamTwoDetails2 = new HBox(2);
					teamTwoDetails2.setAlignment(Pos.CENTER_RIGHT);
					teamTwoDetails2.setTranslateY(-30);
					teamTwoDetails2.getChildren().addAll(championFourDetails, championFiveDetails, championSixDetails);

					StackPane right2 = new StackPane();
					right2.getChildren().addAll(playerTwoName2, teamTwoDetails2);
					borderPane.setRight(right2);

					GridPane g = this.updateMove();
					if (k == 0)
						stackPane.getChildren().remove(gridPane);
					if (k == 1)
						stackPane.getChildren().remove(g);
					k = 1;

					g = this.updateMove();
					g.setAlignment(Pos.CENTER);
					stackPane.getChildren().add(g);
				}
			});
		});

		vbox.setAlignment(Pos.BOTTOM_RIGHT);
		vbox.setTranslateX(-20);
		vbox.setTranslateY(-20);

		borderPane.setCenter(gridPane);

		stackPane.getChildren().addAll(gameLabel, borderPane, vbox, gridPane);

		Button start = new Button("START");
		start.setPrefWidth(200);
		start.setPrefHeight(30);
		start.setShape(rectangle);
		start.setStyle("-fx-background-color: #A2A2A2; -fx-font-size: 20");
		start.setOnMouseEntered(e -> start.setStyle("-fx-background-color: #828282; -fx-font-size: 20"));
		start.setOnMouseExited(e -> start.setStyle("-fx-background-color: #A2A2A2; -fx-font-size: 20"));
		start.setOnMouseClicked(e -> window.setScene(namesScene));

		Button guide = new Button("GUIDE");
		guide.setPrefWidth(200);
		guide.setPrefHeight(30);
		guide.setShape(rectangle);
		guide.setStyle("-fx-background-color: #A2A2A2; -fx-font-size: 20");
		guide.setOnMouseEntered(e -> guide.setStyle("-fx-background-color: #828282; -fx-font-size: 20"));
		guide.setOnMouseExited(e -> guide.setStyle("-fx-background-color: #A2A2A2; -fx-font-size: 20"));
		
		Button exit = new Button("EXIT");
		exit.setPrefWidth(200);
		exit.setPrefHeight(30);
		exit.setShape(rectangle);
		exit.setStyle("-fx-background-color: #A2A2A2; -fx-font-size: 20");
		exit.setOnMouseEntered(e -> exit.setStyle("-fx-background-color: #828282; -fx-font-size: 20"));
		exit.setOnMouseExited(e -> exit.setStyle("-fx-background-color: #A2A2A2; -fx-font-size: 20"));
		exit.setOnMouseClicked(e -> window.close());

		Text gameName = new Text("MARVEL ULTIMATE WAR");
		gameName.setFont(Font.font("Impact", 80));
		gameName.setFill(Color.RED);
		gameName.setStrokeWidth(6);
		gameName.setStroke(Color.BLACK);

		TextField playerOne = new TextField();
		playerOne.setPromptText("Player 1 Name");
		TextField playerTwo = new TextField();
		playerTwo.setPromptText("Player 2 Name");
		playerOne.setTranslateX(120);
		playerTwo.setTranslateX(120);

		Text playerOneName = new Text();
		playerOneName.setFont(Font.font("Impact", 80));
		playerOneName.setFill(Color.RED);
		playerOneName.setStrokeWidth(6);
		playerOneName.setStroke(Color.BLACK);
		playerOneName.setTranslateY(-150);

		Text playerTwoName = new Text();
		playerTwoName.setFont(Font.font("Impact", 80));
		playerTwoName.setFill(Color.RED);
		playerTwoName.setStrokeWidth(6);
		playerTwoName.setStroke(Color.BLACK);
		playerTwoName.setTranslateY(-150);

		Button confirm = new Button("CONFIRM");
		confirm.setPrefWidth(200);
		confirm.setPrefHeight(30);
		confirm.setShape(rectangle);
		confirm.setStyle("-fx-background-color: #A2A2A2; -fx-font-size: 20");
		confirm.setOnMouseEntered(e -> confirm.setStyle("-fx-background-color: #828282; -fx-font-size: 20"));
		confirm.setOnMouseExited(e -> confirm.setStyle("-fx-background-color: #A2A2A2; -fx-font-size: 20"));
		confirm.setOnMouseClicked(e -> window.setScene(pickLeaderScene2));
		confirm.setDisable(true);

		Button next = new Button("NEXT");
		next.setPrefWidth(100);
		next.setPrefHeight(20);
		next.setTranslateX(540);
		next.setTranslateY(370);
		next.setShape(rectangle);
		next.setStyle("-fx-background-color: #A2A2A2;");
		next.setOnMouseEntered(e -> next.setStyle("-fx-background-color: #828282;"));
		next.setOnMouseExited(e -> next.setStyle("-fx-background-color: #A2A2A2;"));
		next.setOnMouseClicked(e -> {
			if (playerOne.getText().isEmpty() || playerTwo.getText().isEmpty()) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Input Your Names");
				alert.setContentText("Please write down your names to continue!");

				alert.show();
			} else {
				window.setScene(championsScene);
				control.setNames(playerOne, playerTwo);
				playerOneName.setText(control.playerOne.getName() + ", PICK YOUR LEADER");
				playerTwoName.setText(control.playerTwo.getName() + ", PICK YOUR LEADER");
				playerOneName2.setText(control.playerOne.getName() + "'s Team");
				playerTwoName2.setText(control.playerTwo.getName() + "'s Team");
			}
		});

		Button back = new Button("BACK");
		back.setPrefWidth(100);
		back.setPrefHeight(20);
		back.setTranslateX(-940);
		back.setTranslateY(370);
		back.setShape(rectangle);
		back.setStyle("-fx-background-color: #A2A2A2; ");
		back.setOnMouseEntered(e -> back.setStyle("-fx-background-color: #828282;"));
		back.setOnMouseExited(e -> back.setStyle("-fx-background-color: #A2A2A2;"));
		// back.setOnMouseClicked(e -> window.setScene(menuScene));

		Text enterNames = new Text("ENTER YOUR NAMES");
		enterNames.setTranslateY(-70);
		enterNames.setFont(Font.font("Impact", 80));
		enterNames.setFill(Color.RED);
		enterNames.setStrokeWidth(6);
		enterNames.setStroke(Color.BLACK);

		options.setAlignment(Pos.CENTER);
		options.getChildren().addAll(gameName, start, guide, exit);
		menuPage.getChildren().addAll(menuLabel, options);

		namesField.setAlignment(Pos.CENTER);
		namesField.getChildren().addAll(playerOne, playerTwo, next, back);
		namesVBox.setAlignment(Pos.CENTER);
		namesLayout.getChildren().addAll(namesLabel, enterNames, namesField);

		PauseTransition pause = new PauseTransition(Duration.seconds(1));
		pause.setOnFinished(e -> {
			window.setScene(menuScene);
		});
		pause.play();

		Text pickChampion = new Text("PICK YOUR CHAMPIONS");
		pickChampion.setFont(Font.font("Impact", 80));
		pickChampion.setFill(Color.RED);
		pickChampion.setStrokeWidth(6);
		pickChampion.setStroke(Color.BLACK);
		pickChampion.setTranslateY(((height / 2) * -1) + 45);

		Button firstPlayerOne = new Button();
		firstPlayerOne.setPrefWidth(150);
		firstPlayerOne.setPrefHeight(150);
		Button firstPlayerTwo = new Button();
		firstPlayerTwo.setPrefWidth(150);
		firstPlayerTwo.setPrefHeight(150);
		Button firstPlayerThree = new Button();
		firstPlayerThree.setPrefWidth(150);
		firstPlayerThree.setPrefHeight(150);

		Button secondPlayerOne = new Button();
		secondPlayerOne.setPrefWidth(150);
		secondPlayerOne.setPrefHeight(150);
		Button secondPlayerTwo = new Button();
		secondPlayerTwo.setPrefWidth(150);
		secondPlayerTwo.setPrefHeight(150);
		Button secondPlayerThree = new Button();
		secondPlayerThree.setPrefWidth(150);
		secondPlayerThree.setPrefHeight(150);

		Button firstPlayerOne2 = new Button();
		firstPlayerOne.setPrefWidth(150);
		firstPlayerOne.setPrefHeight(150);
		Button firstPlayerTwo2 = new Button();
		firstPlayerTwo.setPrefWidth(150);
		firstPlayerTwo.setPrefHeight(150);
		Button firstPlayerThree2 = new Button();
		firstPlayerThree.setPrefWidth(150);
		firstPlayerThree.setPrefHeight(150);

		Button secondPlayerOne2 = new Button();
		secondPlayerOne.setPrefWidth(150);
		secondPlayerOne.setPrefHeight(150);
		Button secondPlayerTwo2 = new Button();
		secondPlayerTwo.setPrefWidth(150);
		secondPlayerTwo.setPrefHeight(150);
		Button secondPlayerThree2 = new Button();
		secondPlayerThree.setPrefWidth(150);
		secondPlayerThree.setPrefHeight(150);

		Button play = new Button("PLAY");
		play.setDisable(true);
		play.setPrefWidth(200);
		play.setPrefHeight(60);
		play.setTranslateY(300);
		play.setShape(rectangle);
		play.setStyle("-fx-background-color: #0CC600; -fx-font-size: 20");
		play.setOnMouseEntered(e -> play.setStyle("-fx-background-color: #0BAF00; -fx-font-size: 20"));
		play.setOnMouseExited(e -> play.setStyle("-fx-background-color: #0CC600; -fx-font-size: 20"));
		play.setOnMouseClicked(e -> window.setScene(pickLeaderScene));

		Button captainAmericaButton = new Button();

		captainAmericaButton.setGraphic(captanAmericaImageView);
		captainAmericaButton.setOnMouseClicked(e -> {
			if (firstPlayerOne.getGraphic() == null) {
				firstPlayerOne.setGraphic(captanAmericaImageView);
				firstPlayerOne2.setGraphic(captanAmericaImageView);
				firstPlayerOne2.setText("Captain America");
				firstPlayerOne2.setGraphicTextGap(-87);
				captainAmericaButton.setDisable(true);
				control.setTeamOne("Captain America");
			} else if (firstPlayerTwo.getGraphic() == null) {
				firstPlayerTwo.setGraphic(captanAmericaImageView);
				firstPlayerTwo2.setGraphic(captanAmericaImageView);
				firstPlayerTwo2.setText("Captain America");
				firstPlayerTwo2.setGraphicTextGap(-87);
				captainAmericaButton.setDisable(true);
				control.setTeamOne("Captain America");
			} else if (firstPlayerThree.getGraphic() == null) {
				firstPlayerThree.setGraphic(captanAmericaImageView);
				firstPlayerThree2.setGraphic(captanAmericaImageView);
				firstPlayerThree2.setText("Captain America");
				firstPlayerThree2.setGraphicTextGap(-87);
				captainAmericaButton.setDisable(true);
				control.setTeamOne("Captain America");
			} else if (secondPlayerOne.getGraphic() == null) {
				secondPlayerOne.setGraphic(captanAmericaImageView);
				secondPlayerOne2.setGraphic(captanAmericaImageView);
				secondPlayerOne2.setText("Captain America");
				secondPlayerOne2.setGraphicTextGap(-87);
				captainAmericaButton.setDisable(true);
				control.setTeamTwo("Captain America");
			} else if (secondPlayerTwo.getGraphic() == null) {
				secondPlayerTwo.setGraphic(captanAmericaImageView);
				secondPlayerTwo2.setGraphic(captanAmericaImageView);
				secondPlayerTwo2.setText("Captain America");
				secondPlayerTwo2.setGraphicTextGap(-87);
				captainAmericaButton.setDisable(true);
				control.setTeamTwo("Captain America");
			} else if (secondPlayerThree.getGraphic() == null) {
				secondPlayerThree.setGraphic(captanAmericaImageView);
				secondPlayerThree2.setGraphic(captanAmericaImageView);
				secondPlayerThree2.setText("Captain America");
				secondPlayerThree2.setGraphicTextGap(-87);
				captainAmericaButton.setDisable(true);
				play.setDisable(false);
				control.setTeamTwo("Captain America");
			}
		});
		captainAmericaButton.setOnMouseEntered(e -> {
			String details = control.getDetails("Captain America");
			Text text = new Text(details);
			text.setTranslateX(-660);
			text.setTranslateY(-95);
			text.setFont(Font.font(14));
			text.setFill(Color.WHITE);
			championsLayout.getChildren().add(text);
			captainAmericaButton.setOnMouseExited(e1 -> championsLayout.getChildren().remove(text));
		});

		Button drStrangeButton = new Button();
		drStrangeButton.setGraphic(drStrangeImageView);
		drStrangeButton.setOnMouseClicked(e -> {
			if (firstPlayerOne.getGraphic() == null) {
				firstPlayerOne.setGraphic(drStrangeImageView);
				firstPlayerOne2.setGraphic(drStrangeImageView);
				firstPlayerOne2.setText("Dr Strange");
				firstPlayerOne2.setGraphicTextGap(-55);
				drStrangeButton.setDisable(true);
				control.setTeamOne("Dr Strange");
			} else if (firstPlayerTwo.getGraphic() == null) {
				firstPlayerTwo.setGraphic(drStrangeImageView);
				firstPlayerTwo2.setGraphic(drStrangeImageView);
				firstPlayerTwo2.setText("Dr Strange");
				firstPlayerTwo2.setGraphicTextGap(-55);
				drStrangeButton.setDisable(true);
				control.setTeamOne("Dr Strange");
			} else if (firstPlayerThree.getGraphic() == null) {
				firstPlayerThree.setGraphic(drStrangeImageView);
				firstPlayerThree2.setGraphic(drStrangeImageView);
				firstPlayerThree2.setText("Dr Strange");
				firstPlayerThree2.setGraphicTextGap(-55);
				drStrangeButton.setDisable(true);
				control.setTeamOne("Dr Strange");
			} else if (secondPlayerOne.getGraphic() == null) {
				secondPlayerOne.setGraphic(drStrangeImageView);
				secondPlayerOne2.setGraphic(drStrangeImageView);
				secondPlayerOne2.setText("Dr Strange");
				secondPlayerOne2.setGraphicTextGap(-55);
				drStrangeButton.setDisable(true);
				control.setTeamTwo("Dr Strange");
			} else if (secondPlayerTwo.getGraphic() == null) {
				secondPlayerTwo.setGraphic(drStrangeImageView);
				secondPlayerTwo2.setGraphic(drStrangeImageView);
				secondPlayerTwo2.setText("Dr Strange");
				secondPlayerTwo2.setGraphicTextGap(-55);
				drStrangeButton.setDisable(true);
				control.setTeamTwo("Dr Strange");
			} else if (secondPlayerThree.getGraphic() == null) {
				secondPlayerThree.setGraphic(drStrangeImageView);
				secondPlayerThree2.setGraphic(drStrangeImageView);
				secondPlayerThree2.setText("Dr Strange");
				secondPlayerThree2.setGraphicTextGap(-55);
				drStrangeButton.setDisable(true);
				play.setDisable(false);
				control.setTeamTwo("Dr Strange");
			}
		});
		drStrangeButton.setOnMouseEntered(e -> {
			String details = control.getDetails("Dr Strange");
			Text text = new Text(details);
			text.setTranslateX(-660);
			text.setTranslateY(-95);
			text.setFont(Font.font(13));
			text.setFill(Color.WHITE);
			championsLayout.getChildren().add(text);
			drStrangeButton.setOnMouseExited(e1 -> championsLayout.getChildren().remove(text));
		});

		Button hulkButton = new Button();
		hulkButton.setGraphic(hulkImageView);
		hulkButton.setOnMouseClicked(e -> {
			if (firstPlayerOne.getGraphic() == null) {
				firstPlayerOne.setGraphic(hulkImageView);
				firstPlayerOne2.setGraphic(hulkImageView);
				firstPlayerOne2.setText("Hulk");
				firstPlayerOne2.setGraphicTextGap(-26);
				hulkButton.setDisable(true);
				control.setTeamOne("Hulk");
			} else if (firstPlayerTwo.getGraphic() == null) {
				firstPlayerTwo.setGraphic(hulkImageView);
				firstPlayerTwo2.setGraphic(hulkImageView);
				firstPlayerTwo2.setText("Hulk");
				firstPlayerTwo2.setGraphicTextGap(-26);
				hulkButton.setDisable(true);
				control.setTeamOne("Hulk");
			} else if (firstPlayerThree.getGraphic() == null) {
				firstPlayerThree.setGraphic(hulkImageView);
				firstPlayerThree2.setGraphic(hulkImageView);
				firstPlayerThree2.setText("Hulk");
				firstPlayerThree2.setGraphicTextGap(-26);
				hulkButton.setDisable(true);
				control.setTeamOne("Hulk");
			} else if (secondPlayerOne.getGraphic() == null) {
				secondPlayerOne.setGraphic(hulkImageView);
				secondPlayerOne2.setGraphic(hulkImageView);
				secondPlayerOne2.setText("Hulk");
				secondPlayerOne2.setGraphicTextGap(-26);
				hulkButton.setDisable(true);
				control.setTeamTwo("Hulk");
			} else if (secondPlayerTwo.getGraphic() == null) {
				secondPlayerTwo.setGraphic(hulkImageView);
				secondPlayerTwo2.setGraphic(hulkImageView);
				secondPlayerTwo2.setText("Hulk");
				secondPlayerTwo2.setGraphicTextGap(-26);
				hulkButton.setDisable(true);
				control.setTeamTwo("Hulk");
			} else if (secondPlayerThree.getGraphic() == null) {
				secondPlayerThree.setGraphic(hulkImageView);
				secondPlayerThree2.setGraphic(hulkImageView);
				secondPlayerThree2.setText("Hulk");
				secondPlayerThree2.setGraphicTextGap(-26);
				hulkButton.setDisable(true);
				play.setDisable(false);
				control.setTeamTwo("Hulk");
			}
		});
		hulkButton.setOnMouseEntered(e -> {
			String details = control.getDetails("Hulk");
			Text text = new Text(details);
			text.setTranslateX(-650);
			text.setTranslateY(-95);
			text.setFont(Font.font(14));
			text.setFill(Color.WHITE);
			championsLayout.getChildren().add(text);
			hulkButton.setOnMouseExited(e1 -> championsLayout.getChildren().remove(text));
		});

		Button icemanButton = new Button();
		icemanButton.setGraphic(icemanImageView);
		icemanButton.setOnMouseClicked(e -> {
			if (firstPlayerOne.getGraphic() == null) {
				firstPlayerOne.setGraphic(icemanImageView);
				firstPlayerOne2.setGraphic(icemanImageView);
				firstPlayerOne2.setText("Iceman");
				firstPlayerOne2.setGraphicTextGap(-40);
				icemanButton.setDisable(true);
				control.setTeamOne("Iceman");
			} else if (firstPlayerTwo.getGraphic() == null) {
				firstPlayerTwo.setGraphic(icemanImageView);
				firstPlayerTwo2.setGraphic(icemanImageView);
				firstPlayerTwo2.setText("Iceman");
				firstPlayerTwo2.setGraphicTextGap(-40);
				icemanButton.setDisable(true);
				control.setTeamOne("Iceman");
			} else if (firstPlayerThree.getGraphic() == null) {
				firstPlayerThree.setGraphic(icemanImageView);
				firstPlayerThree2.setGraphic(icemanImageView);
				firstPlayerThree2.setText("Iceman");
				firstPlayerThree2.setGraphicTextGap(-40);
				icemanButton.setDisable(true);
				control.setTeamOne("Iceman");
			} else if (secondPlayerOne.getGraphic() == null) {
				secondPlayerOne.setGraphic(icemanImageView);
				secondPlayerOne2.setGraphic(icemanImageView);
				secondPlayerOne2.setText("Iceman");
				secondPlayerOne2.setGraphicTextGap(-40);
				icemanButton.setDisable(true);
				control.setTeamTwo("Iceman");
			} else if (secondPlayerTwo.getGraphic() == null) {
				secondPlayerTwo.setGraphic(icemanImageView);
				secondPlayerTwo2.setGraphic(icemanImageView);
				secondPlayerTwo2.setText("Iceman");
				secondPlayerTwo2.setGraphicTextGap(-40);
				icemanButton.setDisable(true);
				control.setTeamTwo("Iceman");
			} else if (secondPlayerThree.getGraphic() == null) {
				secondPlayerThree.setGraphic(icemanImageView);
				secondPlayerThree2.setGraphic(icemanImageView);
				secondPlayerThree2.setText("Iceman");
				secondPlayerThree2.setGraphicTextGap(-40);
				icemanButton.setDisable(true);
				play.setDisable(false);
				control.setTeamTwo("Iceman");
			}
		});
		icemanButton.setOnMouseEntered(e -> {
			String details = control.getDetails("Iceman");
			Text text = new Text(details);
			text.setTranslateX(-660);
			text.setTranslateY(-95);
			text.setFont(Font.font(14));
			text.setFill(Color.WHITE);
			championsLayout.getChildren().add(text);
			icemanButton.setOnMouseExited(e1 -> championsLayout.getChildren().remove(text));
		});

		Button ironmanButton = new Button();
		ironmanButton.setGraphic(ironmanImageView);
		ironmanButton.setOnMouseClicked(e -> {
			if (firstPlayerOne.getGraphic() == null) {
				firstPlayerOne.setGraphic(ironmanImageView);
				firstPlayerOne2.setGraphic(ironmanImageView);
				firstPlayerOne2.setText("Ironman");
				firstPlayerOne2.setGraphicTextGap(-40);
				ironmanButton.setDisable(true);
				control.setTeamOne("Ironman");
			} else if (firstPlayerTwo.getGraphic() == null) {
				firstPlayerTwo.setGraphic(ironmanImageView);
				firstPlayerTwo2.setGraphic(ironmanImageView);
				firstPlayerTwo2.setText("Ironman");
				firstPlayerTwo2.setGraphicTextGap(-40);
				ironmanButton.setDisable(true);
				control.setTeamOne("Ironman");
			} else if (firstPlayerThree.getGraphic() == null) {
				firstPlayerThree.setGraphic(ironmanImageView);
				firstPlayerThree2.setGraphic(ironmanImageView);
				firstPlayerThree2.setText("Ironman");
				firstPlayerThree2.setGraphicTextGap(-40);
				ironmanButton.setDisable(true);
				control.setTeamOne("Ironman");
			} else if (secondPlayerOne.getGraphic() == null) {
				secondPlayerOne.setGraphic(ironmanImageView);
				secondPlayerOne2.setGraphic(ironmanImageView);
				secondPlayerOne2.setText("Ironman");
				secondPlayerOne2.setGraphicTextGap(-40);
				ironmanButton.setDisable(true);
				control.setTeamTwo("Ironman");
			} else if (secondPlayerTwo.getGraphic() == null) {
				secondPlayerTwo.setGraphic(ironmanImageView);
				secondPlayerTwo2.setGraphic(ironmanImageView);
				secondPlayerTwo2.setText("Ironman");
				secondPlayerTwo2.setGraphicTextGap(-40);
				ironmanButton.setDisable(true);
				control.setTeamTwo("Ironman");
			} else if (secondPlayerThree.getGraphic() == null) {
				secondPlayerThree.setGraphic(ironmanImageView);
				secondPlayerThree2.setGraphic(ironmanImageView);
				secondPlayerThree2.setText("Ironman");
				secondPlayerThree2.setGraphicTextGap(-40);
				ironmanButton.setDisable(true);
				play.setDisable(false);
				control.setTeamTwo("Ironman");
			}
		});
		ironmanButton.setOnMouseEntered(e -> {
			String details = control.getDetails("Ironman");
			Text text = new Text(details);
			text.setTranslateX(-660);
			text.setTranslateY(-95);
			text.setFont(Font.font(14));
			text.setFill(Color.WHITE);
			championsLayout.getChildren().add(text);
			ironmanButton.setOnMouseExited(e1 -> championsLayout.getChildren().remove(text));
		});

		Button spidermanButton = new Button();
		spidermanButton.setGraphic(spidermanImageView);
		spidermanButton.setOnMouseClicked(e -> {
			if (firstPlayerOne.getGraphic() == null) {
				firstPlayerOne.setGraphic(spidermanImageView);
				firstPlayerOne2.setGraphic(spidermanImageView);
				firstPlayerOne2.setText("Spiderman");
				firstPlayerOne2.setGraphicTextGap(-60);
				spidermanButton.setDisable(true);
				control.setTeamOne("Spiderman");
			} else if (firstPlayerTwo.getGraphic() == null) {
				firstPlayerTwo.setGraphic(spidermanImageView);
				firstPlayerTwo2.setGraphic(spidermanImageView);
				firstPlayerTwo2.setText("Spiderman");
				firstPlayerTwo2.setGraphicTextGap(-60);
				spidermanButton.setDisable(true);
				control.setTeamOne("Spiderman");
			} else if (firstPlayerThree.getGraphic() == null) {
				firstPlayerThree.setGraphic(spidermanImageView);
				firstPlayerThree2.setGraphic(spidermanImageView);
				firstPlayerThree2.setText("Spiderman");
				firstPlayerThree2.setGraphicTextGap(-60);
				spidermanButton.setDisable(true);
				control.setTeamOne("Spiderman");
			} else if (secondPlayerOne.getGraphic() == null) {
				secondPlayerOne.setGraphic(spidermanImageView);
				secondPlayerOne2.setGraphic(spidermanImageView);
				secondPlayerOne2.setText("Spiderman");
				secondPlayerOne2.setGraphicTextGap(-60);
				spidermanButton.setDisable(true);
				control.setTeamTwo("Spiderman");
			} else if (secondPlayerTwo.getGraphic() == null) {
				secondPlayerTwo.setGraphic(spidermanImageView);
				secondPlayerTwo2.setGraphic(spidermanImageView);
				secondPlayerTwo2.setText("Spiderman");
				secondPlayerTwo2.setGraphicTextGap(-60);
				spidermanButton.setDisable(true);
				control.setTeamTwo("Spiderman");
			} else if (secondPlayerThree.getGraphic() == null) {
				secondPlayerThree.setGraphic(spidermanImageView);
				secondPlayerThree2.setGraphic(spidermanImageView);
				secondPlayerThree2.setText("Spiderman");
				secondPlayerThree2.setGraphicTextGap(-60);
				spidermanButton.setDisable(true);
				play.setDisable(false);
				control.setTeamTwo("Spiderman");
			}
		});
		spidermanButton.setOnMouseEntered(e -> {
			String details = control.getDetails("Spiderman");
			Text text = new Text(details);
			text.setTranslateX(-660);
			text.setTranslateY(-95);
			text.setFont(Font.font(13));
			text.setFill(Color.WHITE);
			championsLayout.getChildren().add(text);
			spidermanButton.setOnMouseExited(e1 -> championsLayout.getChildren().remove(text));
		});

		Button thorButton = new Button();
		thorButton.setGraphic(thorImageView);
		thorButton.setOnMouseClicked(e -> {
			if (firstPlayerOne.getGraphic() == null) {
				firstPlayerOne.setGraphic(thorImageView);
				firstPlayerOne2.setGraphic(thorImageView);
				firstPlayerOne2.setText("Thor");
				firstPlayerOne2.setGraphicTextGap(-26);
				thorButton.setDisable(true);
				control.setTeamOne("Thor");
			} else if (firstPlayerTwo.getGraphic() == null) {
				firstPlayerTwo.setGraphic(thorImageView);
				firstPlayerTwo2.setGraphic(thorImageView);
				firstPlayerTwo2.setText("Thor");
				firstPlayerTwo2.setGraphicTextGap(-26);
				thorButton.setDisable(true);
				control.setTeamOne("Thor");
			} else if (firstPlayerThree.getGraphic() == null) {
				firstPlayerThree.setGraphic(thorImageView);
				firstPlayerThree2.setGraphic(thorImageView);
				firstPlayerThree2.setText("Thor");
				firstPlayerThree2.setGraphicTextGap(-26);
				thorButton.setDisable(true);
				control.setTeamOne("Thor");
			} else if (secondPlayerOne.getGraphic() == null) {
				secondPlayerOne.setGraphic(thorImageView);
				secondPlayerOne2.setGraphic(thorImageView);
				secondPlayerOne2.setText("Thor");
				secondPlayerOne2.setGraphicTextGap(-26);
				thorButton.setDisable(true);
				control.setTeamTwo("Thor");
			} else if (secondPlayerTwo.getGraphic() == null) {
				secondPlayerTwo.setGraphic(thorImageView);
				secondPlayerTwo2.setGraphic(thorImageView);
				secondPlayerTwo2.setText("Thor");
				secondPlayerTwo2.setGraphicTextGap(-26);
				thorButton.setDisable(true);
				control.setTeamTwo("Thor");
			} else if (secondPlayerThree.getGraphic() == null) {
				secondPlayerThree.setGraphic(thorImageView);
				secondPlayerThree2.setGraphic(thorImageView);
				secondPlayerThree2.setText("Thor");
				secondPlayerThree2.setGraphicTextGap(-26);
				thorButton.setDisable(true);
				play.setDisable(false);
				control.setTeamTwo("Thor");
			}
		});
		thorButton.setOnMouseEntered(e -> {
			String details = control.getDetails("Thor");
			Text text = new Text(details);
			text.setTranslateX(-660);
			text.setTranslateY(-95);
			text.setFont(Font.font(14));
			text.setFill(Color.WHITE);
			championsLayout.getChildren().add(text);
			thorButton.setOnMouseExited(e1 -> championsLayout.getChildren().remove(text));
		});

		Button lokiButton = new Button();
		lokiButton.setGraphic(lokiImageView);
		lokiButton.setOnMouseClicked(e -> {
			if (firstPlayerOne.getGraphic() == null) {
				firstPlayerOne.setGraphic(lokiImageView);
				firstPlayerOne2.setGraphic(lokiImageView);
				firstPlayerOne2.setText("Loki");
				firstPlayerOne2.setGraphicTextGap(-26);
				lokiButton.setDisable(true);
				control.setTeamOne("Loki");
			} else if (firstPlayerTwo.getGraphic() == null) {
				firstPlayerTwo.setGraphic(lokiImageView);
				firstPlayerTwo2.setGraphic(lokiImageView);
				firstPlayerTwo2.setText("Loki");
				firstPlayerTwo2.setGraphicTextGap(-26);
				lokiButton.setDisable(true);
				control.setTeamOne("Loki");
			} else if (firstPlayerThree.getGraphic() == null) {
				firstPlayerThree.setGraphic(lokiImageView);
				firstPlayerThree2.setGraphic(lokiImageView);
				firstPlayerThree2.setText("Loki");
				firstPlayerThree2.setGraphicTextGap(-26);
				lokiButton.setDisable(true);
				control.setTeamOne("Loki");
			} else if (secondPlayerOne.getGraphic() == null) {
				secondPlayerOne.setGraphic(lokiImageView);
				secondPlayerOne2.setGraphic(lokiImageView);
				secondPlayerOne2.setText("Loki");
				secondPlayerOne2.setGraphicTextGap(-26);
				lokiButton.setDisable(true);
				control.setTeamTwo("Loki");
			} else if (secondPlayerTwo.getGraphic() == null) {
				secondPlayerTwo.setGraphic(lokiImageView);
				secondPlayerTwo2.setGraphic(lokiImageView);
				secondPlayerTwo2.setText("Loki");
				secondPlayerTwo2.setGraphicTextGap(-26);
				lokiButton.setDisable(true);
				control.setTeamTwo("Loki");
			} else if (secondPlayerThree.getGraphic() == null) {
				secondPlayerThree.setGraphic(lokiImageView);
				secondPlayerThree2.setGraphic(lokiImageView);
				secondPlayerThree2.setText("Loki");
				secondPlayerThree2.setGraphicTextGap(-26);
				lokiButton.setDisable(true);
				play.setDisable(false);
				control.setTeamTwo("Loki");
			}
		});
		lokiButton.setOnMouseEntered(e -> {
			String details = control.getDetails("Loki");
			Text text = new Text(details);
			text.setTranslateX(-660);
			text.setTranslateY(-95);
			text.setFont(Font.font(14));
			text.setFill(Color.WHITE);
			championsLayout.getChildren().add(text);
			lokiButton.setOnMouseExited(e1 -> championsLayout.getChildren().remove(text));
		});

		Button yellowJacketButton = new Button();
		yellowJacketButton.setGraphic(yellowJacketImageView);
		yellowJacketButton.setOnMouseClicked(e -> {
			if (firstPlayerOne.getGraphic() == null) {
				firstPlayerOne.setGraphic(yellowJacketImageView);
				firstPlayerOne2.setGraphic(yellowJacketImageView);
				firstPlayerOne2.setText("Yellow Jacket");
				firstPlayerOne2.setGraphicTextGap(-70);
				yellowJacketButton.setDisable(true);
				control.setTeamOne("Yellow Jacket");
			} else if (firstPlayerTwo.getGraphic() == null) {
				firstPlayerTwo.setGraphic(yellowJacketImageView);
				firstPlayerTwo2.setGraphic(yellowJacketImageView);
				firstPlayerTwo2.setText("Yellow Jacket");
				firstPlayerTwo2.setGraphicTextGap(-70);
				yellowJacketButton.setDisable(true);
				control.setTeamOne("Yellow Jacket");
			} else if (firstPlayerThree.getGraphic() == null) {
				firstPlayerThree.setGraphic(yellowJacketImageView);
				firstPlayerThree2.setGraphic(yellowJacketImageView);
				firstPlayerThree2.setText("Yellow Jacket");
				firstPlayerThree2.setGraphicTextGap(-70);
				yellowJacketButton.setDisable(true);
				control.setTeamOne("Yellow Jacket");
			} else if (secondPlayerOne.getGraphic() == null) {
				secondPlayerOne.setGraphic(yellowJacketImageView);
				secondPlayerOne2.setGraphic(yellowJacketImageView);
				secondPlayerOne2.setText("Yellow Jacket");
				secondPlayerOne2.setGraphicTextGap(-70);
				yellowJacketButton.setDisable(true);
				control.setTeamTwo("Yellow Jacket");
			} else if (secondPlayerTwo.getGraphic() == null) {
				secondPlayerTwo.setGraphic(yellowJacketImageView);
				secondPlayerTwo2.setGraphic(yellowJacketImageView);
				secondPlayerTwo2.setText("Yellow Jacket");
				secondPlayerTwo2.setGraphicTextGap(-70);
				yellowJacketButton.setDisable(true);
				control.setTeamTwo("Yellow Jacket");
			} else if (secondPlayerThree.getGraphic() == null) {
				secondPlayerThree.setGraphic(yellowJacketImageView);
				secondPlayerThree2.setGraphic(yellowJacketImageView);
				secondPlayerThree2.setText("Yellow Jacket");
				secondPlayerThree2.setGraphicTextGap(-70);
				yellowJacketButton.setDisable(true);
				play.setDisable(false);
				control.setTeamTwo("Yellow Jacket");
			}
		});
		yellowJacketButton.setOnMouseEntered(e -> {
			String details = control.getDetails("Yellow Jacket");
			Text text = new Text(details);
			text.setTranslateX(-660);
			text.setTranslateY(-95);
			text.setFont(Font.font(14));
			text.setFill(Color.WHITE);
			championsLayout.getChildren().add(text);
			yellowJacketButton.setOnMouseExited(e1 -> championsLayout.getChildren().remove(text));
		});

		Button helaButton = new Button();
		helaButton.setGraphic(helaImageView);
		helaButton.setOnMouseClicked(e -> {
			if (firstPlayerOne.getGraphic() == null) {
				firstPlayerOne.setGraphic(helaImageView);
				firstPlayerOne2.setGraphic(helaImageView);
				firstPlayerOne2.setText("Hela");
				firstPlayerOne2.setGraphicTextGap(-26);
				helaButton.setDisable(true);
				control.setTeamOne("Hela");
			} else if (firstPlayerTwo.getGraphic() == null) {
				firstPlayerTwo.setGraphic(helaImageView);
				firstPlayerTwo2.setGraphic(helaImageView);
				firstPlayerTwo2.setText("Hela");
				firstPlayerTwo2.setGraphicTextGap(-26);
				helaButton.setDisable(true);
				control.setTeamOne("Hela");
			} else if (firstPlayerThree.getGraphic() == null) {
				firstPlayerThree.setGraphic(helaImageView);
				firstPlayerThree2.setGraphic(helaImageView);
				firstPlayerThree2.setText("Hela");
				firstPlayerThree2.setGraphicTextGap(-26);
				helaButton.setDisable(true);
				control.setTeamOne("Hela");
			} else if (secondPlayerOne.getGraphic() == null) {
				secondPlayerOne.setGraphic(helaImageView);
				secondPlayerOne2.setGraphic(helaImageView);
				secondPlayerOne2.setText("Hela");
				secondPlayerOne2.setGraphicTextGap(-26);
				helaButton.setDisable(true);
				control.setTeamTwo("Hela");
			} else if (secondPlayerTwo.getGraphic() == null) {
				secondPlayerTwo.setGraphic(helaImageView);
				secondPlayerTwo2.setGraphic(helaImageView);
				secondPlayerTwo2.setText("Hela");
				secondPlayerTwo2.setGraphicTextGap(-26);
				helaButton.setDisable(true);
				control.setTeamTwo("Hela");
			} else if (secondPlayerThree.getGraphic() == null) {
				secondPlayerThree.setGraphic(helaImageView);
				secondPlayerThree2.setGraphic(helaImageView);
				secondPlayerThree2.setText("Hela");
				secondPlayerThree2.setGraphicTextGap(-26);
				helaButton.setDisable(true);
				play.setDisable(false);
				control.setTeamTwo("Hela");
			}
		});
		helaButton.setOnMouseEntered(e -> {
			String details = control.getDetails("Hela");
			Text text = new Text(details);
			text.setTranslateX(-660);
			text.setTranslateY(-95);
			text.setFont(Font.font(13));
			text.setFill(Color.WHITE);
			championsLayout.getChildren().add(text);
			helaButton.setOnMouseExited(e1 -> championsLayout.getChildren().remove(text));
		});

		Button electroButton = new Button();
		electroButton.setGraphic(electroImageView);
		electroButton.setOnMouseClicked(e -> {
			if (firstPlayerOne.getGraphic() == null) {
				firstPlayerOne.setGraphic(electroImageView);
				firstPlayerOne2.setGraphic(electroImageView);
				firstPlayerOne2.setText("Electro");
				firstPlayerOne2.setGraphicTextGap(-38);
				electroButton.setDisable(true);
				control.setTeamOne("Electro");
			} else if (firstPlayerTwo.getGraphic() == null) {
				firstPlayerTwo.setGraphic(electroImageView);
				firstPlayerTwo2.setGraphic(electroImageView);
				firstPlayerTwo2.setText("Electro");
				firstPlayerTwo2.setGraphicTextGap(-38);
				electroButton.setDisable(true);
				control.setTeamOne("Electro");
			} else if (firstPlayerThree.getGraphic() == null) {
				firstPlayerThree.setGraphic(electroImageView);
				firstPlayerThree2.setGraphic(electroImageView);
				firstPlayerThree2.setText("Electro");
				firstPlayerThree2.setGraphicTextGap(-38);
				electroButton.setDisable(true);
				control.setTeamOne("Electro");
			} else if (secondPlayerOne.getGraphic() == null) {
				secondPlayerOne.setGraphic(electroImageView);
				secondPlayerOne2.setGraphic(electroImageView);
				secondPlayerOne2.setText("Electro");
				secondPlayerOne2.setGraphicTextGap(-38);
				electroButton.setDisable(true);
				control.setTeamTwo("Electro");
			} else if (secondPlayerTwo.getGraphic() == null) {
				secondPlayerTwo.setGraphic(electroImageView);
				secondPlayerTwo2.setGraphic(electroImageView);
				secondPlayerTwo2.setText("Electro");
				secondPlayerTwo2.setGraphicTextGap(-38);
				electroButton.setDisable(true);
				control.setTeamTwo("Electro");
			} else if (secondPlayerThree.getGraphic() == null) {
				secondPlayerThree.setGraphic(electroImageView);
				secondPlayerThree2.setGraphic(electroImageView);
				secondPlayerThree2.setText("Electro");
				secondPlayerThree2.setGraphicTextGap(-38);
				electroButton.setDisable(true);
				play.setDisable(false);
				control.setTeamTwo("Electro");
			}
		});
		electroButton.setOnMouseEntered(e -> {
			String details = control.getDetails("Electro");
			Text text = new Text(details);
			text.setTranslateX(-660);
			text.setTranslateY(-95);
			text.setFont(Font.font(14));
			text.setFill(Color.WHITE);
			championsLayout.getChildren().add(text);
			electroButton.setOnMouseExited(e1 -> championsLayout.getChildren().remove(text));
		});

		Button quickSilverButton = new Button();
		quickSilverButton.setGraphic(quickSilverImageView);
		quickSilverButton.setOnMouseClicked(e -> {
			if (firstPlayerOne.getGraphic() == null) {
				firstPlayerOne.setGraphic(quickSilverImageView);
				firstPlayerOne2.setGraphic(quickSilverImageView);
				firstPlayerOne2.setText("Quicksilver");
				firstPlayerOne2.setGraphicTextGap(-60);
				quickSilverButton.setDisable(true);
				control.setTeamOne("Quicksilver");
			} else if (firstPlayerTwo.getGraphic() == null) {
				firstPlayerTwo.setGraphic(quickSilverImageView);
				firstPlayerTwo2.setGraphic(quickSilverImageView);
				firstPlayerTwo2.setText("Quicksilver");
				firstPlayerTwo2.setGraphicTextGap(-60);
				quickSilverButton.setDisable(true);
				control.setTeamOne("Quicksilver");
			} else if (firstPlayerThree.getGraphic() == null) {
				firstPlayerThree.setGraphic(quickSilverImageView);
				firstPlayerThree2.setGraphic(quickSilverImageView);
				firstPlayerThree2.setText("Quicksilver");
				firstPlayerThree2.setGraphicTextGap(-60);
				quickSilverButton.setDisable(true);
				control.setTeamOne("Quicksilver");
			} else if (secondPlayerOne.getGraphic() == null) {
				secondPlayerOne.setGraphic(quickSilverImageView);
				secondPlayerOne2.setGraphic(quickSilverImageView);
				secondPlayerOne2.setText("Quicksilver");
				secondPlayerOne2.setGraphicTextGap(-60);
				quickSilverButton.setDisable(true);
				control.setTeamTwo("Quicksilver");
			} else if (secondPlayerTwo.getGraphic() == null) {
				secondPlayerTwo.setGraphic(quickSilverImageView);
				secondPlayerTwo2.setGraphic(quickSilverImageView);
				secondPlayerTwo2.setText("Quicksilver");
				secondPlayerTwo2.setGraphicTextGap(-60);
				quickSilverButton.setDisable(true);
				control.setTeamTwo("Quicksilver");
			} else if (secondPlayerThree.getGraphic() == null) {
				secondPlayerThree.setGraphic(quickSilverImageView);
				secondPlayerThree2.setGraphic(quickSilverImageView);
				secondPlayerThree2.setText("Quicksilver");
				secondPlayerThree2.setGraphicTextGap(-60);
				quickSilverButton.setDisable(true);
				play.setDisable(false);
				control.setTeamTwo("Quicksilver");
			}
		});
		quickSilverButton.setOnMouseEntered(e -> {
			String details = control.getDetails("Quicksilver");
			Text text = new Text(details);
			text.setTranslateX(-660);
			text.setTranslateY(-95);
			text.setFont(Font.font(14));
			text.setFill(Color.WHITE);
			championsLayout.getChildren().add(text);
			quickSilverButton.setOnMouseExited(e1 -> championsLayout.getChildren().remove(text));
		});

		Button venomButton = new Button();
		venomButton.setGraphic(venomImageView);
		venomButton.setOnMouseClicked(e -> {
			if (firstPlayerOne.getGraphic() == null) {
				firstPlayerOne.setGraphic(venomImageView);
				firstPlayerOne2.setGraphic(venomImageView);
				firstPlayerOne2.setText("Venom");
				firstPlayerOne2.setGraphicTextGap(-40);
				venomButton.setDisable(true);
				control.setTeamOne("Venom");
			} else if (firstPlayerTwo.getGraphic() == null) {
				firstPlayerTwo.setGraphic(venomImageView);
				firstPlayerTwo2.setGraphic(venomImageView);
				firstPlayerTwo2.setText("Venom");
				firstPlayerTwo2.setGraphicTextGap(-40);
				venomButton.setDisable(true);
				control.setTeamOne("Venom");
			} else if (firstPlayerThree.getGraphic() == null) {
				firstPlayerThree.setGraphic(venomImageView);
				firstPlayerThree2.setGraphic(venomImageView);
				firstPlayerThree2.setText("Venom");
				firstPlayerThree2.setGraphicTextGap(-40);
				venomButton.setDisable(true);
				control.setTeamOne("Venom");
			} else if (secondPlayerOne.getGraphic() == null) {
				secondPlayerOne.setGraphic(venomImageView);
				secondPlayerOne2.setGraphic(venomImageView);
				secondPlayerOne2.setText("Venom");
				secondPlayerOne2.setGraphicTextGap(-40);
				venomButton.setDisable(true);
				control.setTeamTwo("Venom");
			} else if (secondPlayerTwo.getGraphic() == null) {
				secondPlayerTwo.setGraphic(venomImageView);
				secondPlayerTwo2.setGraphic(venomImageView);
				secondPlayerTwo2.setText("Venom");
				secondPlayerTwo2.setGraphicTextGap(-40);
				venomButton.setDisable(true);
				control.setTeamTwo("Venom");
			} else if (secondPlayerThree.getGraphic() == null) {
				secondPlayerThree.setGraphic(venomImageView);
				secondPlayerThree2.setGraphic(venomImageView);
				secondPlayerThree2.setText("Venom");
				secondPlayerThree2.setGraphicTextGap(-40);
				venomButton.setDisable(true);
				play.setDisable(false);
				control.setTeamTwo("Venom");
			}
		});
		venomButton.setOnMouseEntered(e -> {
			String details = control.getDetails("Venom");
			Text text = new Text(details);
			text.setTranslateX(-660);
			text.setTranslateY(-95);
			text.setFont(Font.font(13));
			text.setFill(Color.WHITE);
			championsLayout.getChildren().add(text);
			venomButton.setOnMouseExited(e1 -> championsLayout.getChildren().remove(text));
		});

		Button deadpoolButton = new Button();
		deadpoolButton.setGraphic(deadpoolImageView);
		deadpoolButton.setOnMouseClicked(e -> {
			if (firstPlayerOne.getGraphic() == null) {
				firstPlayerOne.setGraphic(deadpoolImageView);
				firstPlayerOne2.setGraphic(deadpoolImageView);
				firstPlayerOne2.setText("Deadpool");
				firstPlayerOne2.setGraphicTextGap(-55);
				deadpoolButton.setDisable(true);
				control.setTeamOne("Deadpool");
			} else if (firstPlayerTwo.getGraphic() == null) {
				firstPlayerTwo.setGraphic(deadpoolImageView);
				firstPlayerTwo2.setGraphic(deadpoolImageView);
				firstPlayerTwo2.setText("Deadpool");
				firstPlayerTwo2.setGraphicTextGap(-55);
				deadpoolButton.setDisable(true);
				control.setTeamOne("Deadpool");
			} else if (firstPlayerThree.getGraphic() == null) {
				firstPlayerThree.setGraphic(deadpoolImageView);
				firstPlayerThree2.setGraphic(deadpoolImageView);
				firstPlayerThree2.setText("Deadpool");
				firstPlayerThree2.setGraphicTextGap(-55);
				deadpoolButton.setDisable(true);
				control.setTeamOne("Deadpool");
			} else if (secondPlayerOne.getGraphic() == null) {
				secondPlayerOne.setGraphic(deadpoolImageView);
				secondPlayerOne2.setGraphic(deadpoolImageView);
				secondPlayerOne2.setText("Deadpool");
				secondPlayerOne2.setGraphicTextGap(-55);
				deadpoolButton.setDisable(true);
				control.setTeamTwo("Deadpool");
			} else if (secondPlayerTwo.getGraphic() == null) {
				secondPlayerTwo.setGraphic(deadpoolImageView);
				secondPlayerTwo2.setGraphic(deadpoolImageView);
				secondPlayerTwo2.setText("Deadpool");
				secondPlayerTwo2.setGraphicTextGap(-55);
				deadpoolButton.setDisable(true);
				control.setTeamTwo("Deadpool");
			} else if (secondPlayerThree.getGraphic() == null) {
				secondPlayerThree.setGraphic(deadpoolImageView);
				secondPlayerThree2.setGraphic(deadpoolImageView);
				secondPlayerThree2.setText("Deadpool");
				secondPlayerThree2.setGraphicTextGap(-55);
				deadpoolButton.setDisable(true);
				play.setDisable(false);
				control.setTeamTwo("Deadpool");
			}
		});
		deadpoolButton.setOnMouseEntered(e -> {
			String details = control.getDetails("Deadpool");
			Text text = new Text(details);
			text.setTranslateX(-660);
			text.setTranslateY(-95);
			text.setFont(Font.font(14));
			text.setFill(Color.WHITE);
			championsLayout.getChildren().add(text);
			deadpoolButton.setOnMouseExited(e1 -> championsLayout.getChildren().remove(text));
		});

		Button ghostRiderButton = new Button();
		ghostRiderButton.setGraphic(ghostRiderImageView);
		ghostRiderButton.setOnMouseClicked(e -> {
			if (firstPlayerOne.getGraphic() == null) {
				firstPlayerOne.setGraphic(ghostRiderImageView);
				firstPlayerOne2.setGraphic(ghostRiderImageView);
				firstPlayerOne2.setText("Ghost Rider");
				firstPlayerOne2.setGraphicTextGap(-65);
				ghostRiderButton.setDisable(true);
				control.setTeamOne("Ghost Rider");
			} else if (firstPlayerTwo.getGraphic() == null) {
				firstPlayerTwo.setGraphic(ghostRiderImageView);
				firstPlayerTwo2.setGraphic(ghostRiderImageView);
				firstPlayerTwo2.setText("Ghost Rider");
				firstPlayerTwo2.setGraphicTextGap(-65);
				ghostRiderButton.setDisable(true);
				control.setTeamOne("Ghost Rider");
			} else if (firstPlayerThree.getGraphic() == null) {
				firstPlayerThree.setGraphic(ghostRiderImageView);
				firstPlayerThree2.setGraphic(ghostRiderImageView);
				firstPlayerThree2.setText("Ghost Rider");
				firstPlayerThree2.setGraphicTextGap(-65);
				ghostRiderButton.setDisable(true);
				control.setTeamOne("Ghost Rider");
			} else if (secondPlayerOne.getGraphic() == null) {
				secondPlayerOne.setGraphic(ghostRiderImageView);
				secondPlayerOne2.setGraphic(ghostRiderImageView);
				secondPlayerOne2.setText("Ghost Rider");
				secondPlayerOne2.setGraphicTextGap(-65);
				ghostRiderButton.setDisable(true);
				control.setTeamTwo("Ghost Rider");
			} else if (secondPlayerTwo.getGraphic() == null) {
				secondPlayerTwo.setGraphic(ghostRiderImageView);
				secondPlayerTwo2.setGraphic(ghostRiderImageView);
				secondPlayerTwo2.setText("Ghost Rider");
				secondPlayerTwo2.setGraphicTextGap(-65);
				ghostRiderButton.setDisable(true);
				control.setTeamTwo("Ghost Rider");
			} else if (secondPlayerThree.getGraphic() == null) {
				secondPlayerThree.setGraphic(ghostRiderImageView);
				secondPlayerThree2.setGraphic(ghostRiderImageView);
				secondPlayerThree2.setText("Ghost Rider");
				secondPlayerThree2.setGraphicTextGap(-65);
				ghostRiderButton.setDisable(true);
				play.setDisable(false);
				control.setTeamTwo("Ghost Rider");
			}
		});
		ghostRiderButton.setOnMouseEntered(e -> {
			String details = control.getDetails("Ghost Rider");
			Text text = new Text(details);
			text.setTranslateX(-660);
			text.setTranslateY(-95);
			text.setFont(Font.font(14));
			text.setFill(Color.WHITE);
			championsLayout.getChildren().add(text);
			ghostRiderButton.setOnMouseExited(e1 -> championsLayout.getChildren().remove(text));
		});

		Button back2 = new Button("BACK");
		back2.setPrefWidth(100);
		back2.setPrefHeight(20);
		back2.setTranslateY(370);
		back2.setShape(rectangle);
		back2.setStyle("-fx-background-color: #A2A2A2; ");
		back2.setOnMouseEntered(e -> back2.setStyle("-fx-background-color: #828282;"));
		back2.setOnMouseExited(e -> back2.setStyle("-fx-background-color: #A2A2A2;"));
		back2.setOnMouseClicked(e -> window.setScene(namesScene));

		firstPlayerTeam.getChildren().addAll(firstPlayerOne, firstPlayerTwo, firstPlayerThree);
		// firstPlayerTeam.setAlignment(Pos.BOTTOM_LEFT);
		firstPlayerTeam.setTranslateX(-1200);
		firstPlayerTeam.setTranslateY(200);

		secondPlayerTeam.getChildren().addAll(secondPlayerOne, secondPlayerTwo, secondPlayerThree);
		// secondPlayerTeam.setAlignment(Pos.BOTTOM_RIGHT);
		secondPlayerTeam.setTranslateX(-255);
		secondPlayerTeam.setTranslateY(380);

		championsHBox1.getChildren().addAll(captainAmericaButton, drStrangeButton, hulkButton, icemanButton,
				ironmanButton);
		championsHBox1.setAlignment(Pos.TOP_CENTER);
		championsHBox1.setTranslateY(100);

		championsHBox2.getChildren().addAll(spidermanButton, thorButton, lokiButton, yellowJacketButton, helaButton,
				secondPlayerTeam);
		championsHBox2.setAlignment(Pos.TOP_CENTER);
		championsHBox2.setTranslateY(280);
		championsHBox2.setTranslateX(255);

		championsHBox3.getChildren().addAll(electroButton, quickSilverButton, venomButton, deadpoolButton,
				ghostRiderButton, firstPlayerTeam);
		championsHBox3.setAlignment(Pos.TOP_CENTER);
		championsHBox3.setTranslateY(455);
		championsHBox3.setTranslateX(255);

		championsLayout.getChildren().addAll(championsLayoutBackground, pickChampion, championsHBox1, championsHBox2,
				championsHBox3, play, back2);

		firstPlayerTeam2.getChildren().addAll(firstPlayerOne2, firstPlayerTwo2, firstPlayerThree2, confirm);
		firstPlayerTeam2.setAlignment(Pos.CENTER);
		pickLeaderLayout.getChildren().addAll(pickLeaderLabel, firstPlayerTeam2, playerOneName);

		firstPlayerOne2.setOnMouseClicked(e -> {
			control.setTeamOneLeader(firstPlayerOne2.getText());
			championOneDetails.setText(control.getChampionDetails3(firstPlayerOne2.getText()));
			championTwoDetails.setText(control.getChampionDetails3(firstPlayerTwo2.getText()));
			championThreeDetails.setText(control.getChampionDetails3(firstPlayerThree2.getText()));
			firstPlayerOne2.setDisable(true);
			firstPlayerTwo2.setDisable(true);
			firstPlayerThree2.setDisable(true);
			confirm.setDisable(false);
		});
		firstPlayerTwo2.setOnMouseClicked(e -> {
			control.setTeamOneLeader(firstPlayerTwo2.getText());
			championOneDetails.setText(control.getChampionDetails3(firstPlayerOne2.getText()));
			championTwoDetails.setText(control.getChampionDetails3(firstPlayerTwo2.getText()));
			championThreeDetails.setText(control.getChampionDetails3(firstPlayerThree2.getText()));
			firstPlayerOne2.setDisable(true);
			firstPlayerTwo2.setDisable(true);
			firstPlayerThree2.setDisable(true);
			confirm.setDisable(false);
		});
		firstPlayerThree2.setOnMouseClicked(e -> {
			control.setTeamOneLeader(firstPlayerThree2.getText());
			championOneDetails.setText(control.getChampionDetails3(firstPlayerOne2.getText()));
			championTwoDetails.setText(control.getChampionDetails3(firstPlayerTwo2.getText()));
			championThreeDetails.setText(control.getChampionDetails3(firstPlayerThree2.getText()));
			firstPlayerOne2.setDisable(true);
			firstPlayerTwo2.setDisable(true);
			firstPlayerThree2.setDisable(true);
			confirm.setDisable(false);
		});

		secondPlayerTeam2.getChildren().addAll(secondPlayerOne2, secondPlayerTwo2, secondPlayerThree2, toTheBoard);
		secondPlayerTeam2.setAlignment(Pos.CENTER);
		pickLeaderLayout2.getChildren().addAll(pickLeaderLabel2, secondPlayerTeam2, playerTwoName);

		secondPlayerOne2.setOnMouseClicked(e -> {
			control.setTeamTwoLeader(secondPlayerOne2.getText());
			championFourDetails.setText(control.getChampionDetails3(secondPlayerOne2.getText()));
			championFiveDetails.setText(control.getChampionDetails3(secondPlayerTwo2.getText()));
			championSixDetails.setText(control.getChampionDetails3(secondPlayerThree2.getText()));
			secondPlayerOne2.setDisable(true);
			secondPlayerTwo2.setDisable(true);
			secondPlayerThree2.setDisable(true);
			toTheBoard.setDisable(false);
		});
		secondPlayerTwo2.setOnMouseClicked(e -> {
			control.setTeamTwoLeader(secondPlayerTwo2.getText());
			championFourDetails.setText(control.getChampionDetails3(secondPlayerOne2.getText()));
			championFiveDetails.setText(control.getChampionDetails3(secondPlayerTwo2.getText()));
			championSixDetails.setText(control.getChampionDetails3(secondPlayerThree2.getText()));
			secondPlayerOne2.setDisable(true);
			secondPlayerTwo2.setDisable(true);
			secondPlayerThree2.setDisable(true);
			toTheBoard.setDisable(false);
		});
		secondPlayerThree2.setOnMouseClicked(e -> {
			control.setTeamTwoLeader(secondPlayerThree2.getText());
			championFourDetails.setText(control.getChampionDetails3(secondPlayerOne2.getText()));
			championFiveDetails.setText(control.getChampionDetails3(secondPlayerTwo2.getText()));
			championSixDetails.setText(control.getChampionDetails3(secondPlayerThree2.getText()));
			secondPlayerOne2.setDisable(true);
			secondPlayerTwo2.setDisable(true);
			secondPlayerThree2.setDisable(true);
			toTheBoard.setDisable(false);
		});

		window.initStyle(StageStyle.UNDECORATED);
		window.setFullScreen(true);
		window.setResizable(false);
		window.setScene(homeScene);
		window.show();
	}

	public GridPane updateMove() {
		Object[][] board = control.getBoard();
		GridPane gridPane = new GridPane();
		gridPane.setVgap(10);
		gridPane.setHgap(10);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				Button button = new Button();
				button.setPrefWidth(100);
				button.setPrefHeight(100);

				if (board[i][j] instanceof Champion) {
					Champion champion = (Champion) board[i][j];
					button.setText(((Champion) board[i][j]).getName() + '\n' + champion.getCurrentHP());
				}
				if (board[i][j] instanceof Cover) {
					Cover cover = (Cover) board[i][j];
					button.setText("Cover" + '\n' + cover.getCurrentHP());
				}

				gridPane.setConstraints(button, j, Math.abs(i - 4));
				gridPane.getChildren().add(button);
			}
		}
		return gridPane;
	}
}