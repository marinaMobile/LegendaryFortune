package pvp.survival.rp.white

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_start_game.*
import pvp.survival.rp.R

class StartGame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_game)

        startBtn.setOnClickListener{
            startActivity(Intent(this, Game::class.java))
        }
    }
}