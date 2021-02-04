package com.example.lab2a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int playerScore, computerScore;

    private WeaponChoice player,computer;

    private TextView instructionView,scoreboardView,humanView,computerView,winView;
    private Button rockButton,paperButton,scissorsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerScore = 0;
        computerScore = 0;

        instructionView = (TextView)findViewById(R.id.instructionDisplay);
        scoreboardView = (TextView)findViewById(R.id.scoreboardDisplay);
        humanView = (TextView)findViewById(R.id.playerDisplay);
        computerView = (TextView)findViewById(R.id.computerDisplay);
        winView = (TextView)findViewById(R.id.winMessage);

        rockButton = (Button)findViewById(R.id.rockButton);
        paperButton = (Button)findViewById(R.id.paperButton);
        scissorsButton = (Button)findViewById(R.id.scissorsButton);

        scoreboardView.setText("Player: " + playerScore + " : Computer: " + computerScore);

        rockButton.setOnClickListener(this::onClick);
        paperButton.setOnClickListener(this::onClick);
        scissorsButton.setOnClickListener(this::onClick);

    }

    public void onClick(View v){
        Random random = new Random();
        int numberR;
        numberR = random.nextInt(3);


        if(numberR == 0){
            computer = new WeaponChoice(Weapon.ROCK);
        }
        else if(numberR == 1) {
            computer = new WeaponChoice(Weapon.PAPER);
        }
        else if (numberR == 2){
            computer = new WeaponChoice(Weapon.SCISSORS);
        }

        if (v.getId() == R.id.rockButton){

            player = new WeaponChoice(Weapon.ROCK);

            winner(player,computer);

        }
        else if (v.getId() == R.id.paperButton){
            player = new WeaponChoice(Weapon.PAPER);

            winner(player,computer);
        }
        else if (v.getId() == R.id.scissorsButton){
            player = new WeaponChoice(Weapon.SCISSORS);
            winner(player,computer);
        }

    }

    public class WeaponChoice{
        Weapon weapon;

        public WeaponChoice(Weapon weapon) {
            this.weapon = weapon;
        }

        @Override
        public String toString() {
            return weapon.toString();
        }
    }



        public void winner(WeaponChoice player, WeaponChoice Computer){

            if (player.toString().equals("Rock")){

                if (Computer.toString().equals("Rock")){

                    scoreboardView.setText("Player: " + playerScore + " : Computer: " + computerScore);
                    humanView.setText("Player picked: " + player.toString());
                    computerView.setText("Computer picked: " + computer.toString());
                    winView.setText("Tied chose the same weapon!");


                }
                else if(Computer.toString().equals("Paper")){
                    computerScore = computerScore +1;
                    scoreboardView.setText("Player: " + playerScore + " : Computer: " + computerScore);
                    humanView.setText("Player picked: " + player.toString());
                    computerView.setText("Computer picked: " + computer.toString());
                    winView.setText("Computer Wins: Paper covers Rock");
                }
                else if(Computer.toString().equals("Scissors")) {
                    playerScore = playerScore + 1;
                    scoreboardView.setText("Player: " + playerScore + " : Computer: " + computerScore);
                    humanView.setText("Player picked: " + player.toString());
                    computerView.setText("Computer picked: " + computer.toString());
                    winView.setText("Player Wins: Rock smashes Scissors");

                }

            }
            else if (player.toString().equals("Paper")){
                if (Computer.toString().equals("Rock")){
                    playerScore = playerScore + 1;
                    scoreboardView.setText("Player: " + playerScore + " : Computer: " + computerScore);
                    humanView.setText("Player picked: " + player.toString());
                    computerView.setText("Computer picked: " + computer.toString());
                    winView.setText("Player Wins: Paper covers Rock");
                }
                else if(Computer.toString().equals("Paper")){
                    scoreboardView.setText("Player: " + playerScore + " : Computer: " + computerScore);
                    humanView.setText("Player picked: " + player.toString());
                    computerView.setText("Computer picked: " + computer.toString());
                    winView.setText("Tied chose the same weapon!");
                }
                else if(Computer.toString().equals("Scissors")) {
                    computerScore = computerScore +1;
                    scoreboardView.setText("Player: " + playerScore + " : Computer: " + computerScore);
                    humanView.setText("Player picked: " + player.toString());
                    computerView.setText("Computer picked: " + computer.toString());
                    winView.setText("Computer Wins: Scissors cuts Paper");
                }


            }
            else if (player.toString().equals("Scissors")){
                if (Computer.toString().equals("Rock")){
                    computerScore = computerScore +1;
                    scoreboardView.setText("Player: " + playerScore + " : Computer: " + computerScore);
                    humanView.setText("Player picked: " + player.toString());
                    computerView.setText("Computer picked: " + computer.toString());
                    winView.setText("Computer Wins: Rock smashes Scissors");
                }
                else if(Computer.toString().equals("Paper")){
                    playerScore = playerScore + 1;
                    scoreboardView.setText("Player: " + playerScore + " : Computer: " + computerScore);
                    humanView.setText("Player picked: " + player.toString());
                    computerView.setText("Computer picked: " + computer.toString());
                    winView.setText("Player Wins: Scissors cuts Paper");
                }
                else if(Computer.toString().equals("Scissors")) {
                    scoreboardView.setText("Player: " + playerScore + " : Computer: " + computerScore);
                    humanView.setText("Player picked: " + player.toString());
                    computerView.setText("Computer picked: " + computer.toString());
                    winView.setText("Tied chose the same weapon!");
                }
            }
        }

    public enum Weapon {
        ROCK("Rock"),
        PAPER("Paper"),
        SCISSORS("Scissors");
        private String message;

        private Weapon(String msg) { message = msg; }

        @Override
        public String toString() { return message; }
    }

}