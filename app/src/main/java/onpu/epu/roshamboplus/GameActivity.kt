package onpu.epu.roshamboplus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import onpu.epu.roshamboplus.gameElements.GameElement
import onpu.epu.roshamboplus.gameElements.Paper
import onpu.epu.roshamboplus.gameElements.Rock
import onpu.epu.roshamboplus.gameElements.Scissors

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        val textView: TextView = findViewById(R.id.text_game_mainText)
        val buttonToMain: Button = findViewById(R.id.button_game_menu)
        val listView: ListView = findViewById(R.id.list_game_list)
        val buttonRock: Button = findViewById(R.id.button_game_rock)
        val buttonPaper: Button = findViewById(R.id.button_game_paper)
        val buttonScissors: Button = findViewById(R.id.button_game_scissors)
        val textScorePlayer: TextView = findViewById(R.id.text_count_player_count)
        val textScorePc: TextView = findViewById(R.id.text_count_pc_count)
        var scorePlayer: Int = 0
        var scorePc: Int = 0

        var text: String = ""
        val todos: MutableList<String> = mutableListOf()
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, todos)
        listView.adapter = adapter

        buttonRock.setOnClickListener {
            val rock: GameElement = Rock()
            when (defineTheWinner(rock, randomElement())) {
                1 -> {
                    scorePlayer++
                    textScorePlayer.text = scorePlayer.toString()
                    text = "Player win! Score: $scorePlayer - $scorePc"
                    textView.text = "Player win!"
                }
                -1 -> {
                    scorePc++
                    textScorePc.text = scorePc.toString()
                    text = "Computer win! Score: $scorePlayer - $scorePc"
                    textView.text = "Computer win!"
                }
                else -> {
                    text = "It's a tie! Score: $scorePlayer - $scorePc"
                    textView.text = "It's a tie!"
                }
            }

            adapter.insert(text, 0)
        }

        buttonPaper.setOnClickListener {
            val paper: GameElement = Paper()
            when (defineTheWinner(paper, randomElement())) {
                1 -> {
                    scorePlayer++
                    textScorePlayer.text = scorePlayer.toString()
                    text = "Player win! Score: $scorePlayer - $scorePc"
                    textView.text = "Player win!"
                }
                -1 -> {
                    scorePc++
                    textScorePc.text = scorePc.toString()
                    text = "Computer win! Score: $scorePlayer - $scorePc"
                    textView.text = "Computer win!"
                }
                else -> {
                    text = "It's a tie! Score: $scorePlayer - $scorePc"
                    textView.text = "It's a tie!"
                }
            }
            adapter.insert(text, 0)
        }

        buttonScissors.setOnClickListener {
            val scissors: GameElement = Scissors()
            when (defineTheWinner(scissors, randomElement())) {
                1 -> {
                    scorePlayer++
                    textScorePlayer.text = scorePlayer.toString()
                    text = "Player win! Score: $scorePlayer - $scorePc"
                    textView.text = "Player win!"
                }
                -1 -> {
                    scorePc++
                    textScorePc.text = scorePc.toString()
                    text = "Computer win! Score: $scorePlayer - $scorePc"
                    textView.text = "Computer win!"
                }
                else -> {
                    text = "It's a tie! Score: $scorePlayer - $scorePc"
                    textView.text = "It's a tie!"
                }
            }
            adapter.insert(text, 0)
        }

        buttonToMain.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}