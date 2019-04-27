package sample;

import javafx.animation.AnimationTimer;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import static javafx.application.Application.launch;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.util.Duration;


public class Main extends Application {

    public int rand;
    public Label randResult;

    public int cirPos[][] = new int [10][10];
    public int leadderPosition[][] = new int[6][3];

    public static final int Tile_Size = 60;
    public static final int width = 10;
    public static final int height = 10;

    public Circle player1;
    public Circle player2;

    public int playerPosition1 = 1;
    public int playerPosition2 = 1;

    public boolean player1Turn = true;
    public boolean player2Turn = true;



    public static int player1Xpos = 30;
    public static int player1Ypos = 570;

    public static int player2Xpos = 30;
    public static int player2Ypos = 570;

    public int posCir1 = 1;
    public int posCir2 = 1;

    public boolean gameStart = false;
    public Button gameButton;


    private Group tileGroup = new Group();

    private Parent createConetent(){
        Pane root = new Pane();
        root.setPrefSize(width*Tile_Size,(height * Tile_Size)+60);
        root.getChildren().addAll(tileGroup);

        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                Tile tile = new Tile(Tile_Size,Tile_Size);
                tile.setTranslateX(j * Tile_Size);
                tile.setTranslateY(i * Tile_Size);
                tileGroup.getChildren().add(tile);

                cirPos[i][j] = j*(Tile_Size - 30);
            }
        }

        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                System.out.print(cirPos[i][j]+" ");
            }
            System.out.println();
        }


        player1 = new Circle(30);
        player1.setId("player1");
        player1.setFill(Color.AQUA);
        player1.getStyleClass().add("sample/style.css");
        player1.setTranslateX(player1Xpos);
        player1.setTranslateY(player1Ypos);


        player2 = new Circle(30);
        player2.setId("player2");
        player2.setFill(Color.CHOCOLATE);
        player2.getStyleClass().add("sample/style.css");
        player2.setTranslateX(player2Xpos);
        player2.setTranslateY(player2Ypos);

        Button button2Player = new Button ( "Player2");
        button2Player.setTranslateX(500);
        button2Player.setTranslateY(620);
        button2Player.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(gameStart) {
                    if (player1Turn) {
                        getDiceValue();
                        randResult.setText(String.valueOf(rand));
                        move2Player();
                        traslatePlayer(player2Xpos, player2Ypos, player2);
                        player2Turn = true;
                        player1Turn = false;
                        playerPosition2 += rand;

                       if(player2Xpos == 150 && player2Ypos == 570) {
                            traslatePlayer(player2Xpos = 90, player2Ypos = 390, player2);


                        if(player2Xpos == 570 && player2Ypos == 570) {
                              traslatePlayer(player2Xpos = 500, player2Ypos = 500, player2);

                        if (player2Xpos == 390 && player2Ypos == 450) {
                            traslatePlayer(player2Xpos = 450, player2Ypos = 270, player2);

                            if (player2Xpos == 270 && player2Ypos == 510) {
                                traslatePlayer(player2Xpos = 450, player2Ypos = 500, player2);

                                if (player2Xpos == 570 && player2Ypos == 390) {
                                    traslatePlayer(player2Xpos = 210, player2Ypos = 560, player2);

                                    if (player2Xpos == 390 && player2Ypos == 330) {
                                        traslatePlayer(player2Xpos = 270, player2Ypos = 440, player2);

                                        if (player2Xpos == 330 && player2Ypos == 210) {
                                            traslatePlayer(player2Xpos = 510, player2Ypos = 280, player2);

                                           if (player2Xpos == 270 && player2Ypos == 270) {
                                               traslatePlayer(player2Xpos = 210, player2Ypos = 100, player2);

                                            if (player2Xpos == 150 && player2Ypos == 210) {
                                                traslatePlayer(player2Xpos = 30, player2Ypos = 280, player2);

                                           if (player2Xpos == 30 && player2Ypos == 210) {
                                               traslatePlayer(player2Xpos = 90, player2Ypos = 40, player2);

                                           if (player2Xpos == 510 && player2Ypos == 150) {
                                               traslatePlayer(player2Xpos = 570, player2Ypos = 100, player2);

                                               if (player1Xpos == 210 && player1Ypos == 30) {
                                                   traslatePlayer(player1Xpos = 330, player1Ypos = 150, player1);

                                               }
                                           }
                                           }
                                            }
                                           }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                }


                }
            }
        });



        Button button1Player = new Button("Player1");
        button1Player.setTranslateX(70);
        button1Player.setTranslateY(620);
        button1Player.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent event) {
                                    if (gameStart) {
                                        if (player2Turn) {
                                            getDiceValue();
                                            randResult.setText(String.valueOf(rand));
                                            move1Player();
                                            traslatePlayer(player1Xpos, player1Ypos, player1);
                                            player1Turn = true;
                                            player2Turn = false;
                                            playerPosition1 += rand;


                                            if (player1Xpos == 150 && player2Ypos == 570) {
                                                traslatePlayer(player1Xpos = 90, player1Ypos = 390, player1);


                                                if (player1Xpos == 570 && player1Ypos == 570) {
                                                    traslatePlayer(player1Xpos = 500, player1Ypos = 500, player1);

                                                    if (player1Xpos == 390 && player1Ypos == 450) {
                                                        traslatePlayer(player1Xpos = 450, player1Ypos = 270, player1);

                                                        if (player1Xpos == 270 && player1Ypos == 510) {
                                                            traslatePlayer(player1Xpos = 450, player1Ypos = 500, player1);

                                                            if (player1Xpos == 570 && player1Ypos == 390) {
                                                                traslatePlayer(player1Xpos = 210, player1Ypos = 560, player1);

                                                                if (player1Xpos == 390 && player1Ypos == 330) {
                                                                    traslatePlayer(player1Xpos = 270, player1Ypos = 440, player1);

                                                                    if (player1Xpos == 330 && player1Ypos == 210) {
                                                                        traslatePlayer(player1Xpos = 510, player1Ypos = 280, player1);

                                                                        if (player1Xpos == 270 && player1Ypos == 270) {
                                                                            traslatePlayer(player1Xpos = 210, player1Ypos = 100, player1);

                                                                            if (player1Xpos == 150 && player1Ypos == 210) {
                                                                                traslatePlayer(player1Xpos = 30, player1Ypos = 280, player1);

                                                                                if (player1Xpos == 30 && player1Ypos == 210) {
                                                                                    traslatePlayer(player1Xpos = 90, player1Ypos = 40, player1);

                                                                                    if (player1Xpos == 510 && player1Ypos == 150) {
                                                                                        traslatePlayer(player1Xpos = 570, player1Ypos = 100, player1);

                                                                                        if (player1Xpos == 210 && player1Ypos == 30) {
                                                                                            traslatePlayer(player1Xpos = 330, player1Ypos = 150, player1);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }}}});

        gameButton = new Button ( "Start Game");
        gameButton.setTranslateX(320);
        gameButton.setTranslateY(620);
        gameButton.setOnAction(new EventHandler<ActionEvent>() {
                                   @Override
                                   public void handle(ActionEvent event) {
                                       gameButton.setText("Game Stated");
                                       player1Xpos = 30;
                                       player1Ypos = 570;

                                       player2Xpos = 30;
                                       player2Ypos = 570;

                                       player1.setTranslateX(player1Xpos);
                                       player1.setTranslateY(player1Ypos);
                                       player2.setTranslateX(player2Xpos);
                                       player2.setTranslateY(player2Ypos);
                                       gameStart = true;
                                   }
                               });

                randResult = new Label ("0");
                randResult.setTranslateX(230);
                randResult.setTranslateY(620);

        Image img = new Image ("snakeg.jpg");
        ImageView bgImage = new ImageView();
        bgImage.setImage(img);
        bgImage.setFitHeight(600);
        bgImage.setFitWidth(600);


        tileGroup.getChildren().addAll(bgImage,player1,player2,button2Player,button1Player,gameButton,randResult);
        return root;

    }



         private void getDiceValue(){
              rand =(int)(Math.random()*1+1);

         }

           private void move1Player(){
               for(int i = 0; i < rand; i++){
                   if(posCir1 % 2 == 1) {
                       player1Xpos += 60;
                   }
                   if(posCir1 % 2 == 0) {
                       player1Xpos-= 60;
                   }
                   if(player1Xpos > 570) {
                       player1Ypos -=60;
                       player1Xpos -=60;
                       posCir1++;
                   }

                   if(player1Xpos < 30) {
                       player1Ypos-=60;
                       player1Xpos+=60;
                       posCir1++;
                   }

                   if(player1Xpos < 30 || player1Ypos < 30 ){
                       player1Xpos = 30;
                       player1Ypos = 30;
                       gameStart = false;
                       randResult.setText("player one won");
                       gameButton.setText("start again");
                   }
               }
         }

    private void move2Player(){
        for(int i = 0; i < rand; i++){
            if(posCir2 % 2 == 1) {
                player2Xpos += 60;
            }
            if(posCir2 % 2 == 0) {
                player2Xpos-= 60;
            }
            if(player2Xpos > 570) {
                player2Ypos -=60;
                player2Xpos -=60;
                posCir2++;
            }

            if(player2Xpos < 30) {
                player2Ypos-=60;
                player2Xpos+=60;
                posCir2++;
            }

            if(player2Xpos < 30 || player2Ypos < 30 ){
                player2Xpos = 30;
                player2Ypos = 30;
                gameStart = false;
                randResult.setText("player two won");
                gameButton.setText("start again");
            }
        }
    }



    private void traslatePlayer(int x, int y, Circle b){
             TranslateTransition animate = new TranslateTransition(Duration.millis(1000),b);
             animate.setToX(x);
             animate.setToY(y);
             animate.setAutoReverse(false);
             animate.play();
         }



    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(createConetent());
        primaryStage.setTitle("snake and leadder");
        primaryStage.setScene(scene);
        primaryStage.show();


    }


    public static void main(String[] args) {launch(args);
    }

}