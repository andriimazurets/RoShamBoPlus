package onpu.epu.roshamboplus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.media.MediaPlayer;


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.music_fastppp)
        val exit: TextView = findViewById(R.id.text_main_exit)
        val play: TextView = findViewById(R.id.text_main_play)
        val support: TextView = findViewById(R.id.text_main_support)
        val setting: TextView = findViewById(R.id.text_main_setting)

        mediaPlayer?.isLooping = true
        mediaPlayer?.start()

        exit.setOnClickListener {
            finishAffinity()
        }
        support.setOnClickListener {
            val intent = Intent(this, SupportActivity::class.java)
            startActivity(intent)
        }
        setting.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }
        play.setOnClickListener {
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
        }
    }
}