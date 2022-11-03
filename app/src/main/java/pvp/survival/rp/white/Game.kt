package pvp.survival.rp.white

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageView
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.activity_game.*
import pvp.survival.rp.R

class Game : AppCompatActivity() {
    val roll= mutableListOf<String>("1","2","3")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        var one: String = ""
        var two: String = ""
        var three: String = ""

        var first: ImageView = findViewById(R.id.first)
        var second: ImageView = findViewById(R.id.second)
        var third: ImageView = findViewById(R.id.third)

        val s : Long = "5".toLong() * 1000

        object : CountDownTimer( s , 1000) {

            override fun onTick(millisUntilFinished: Long) {
                running.text = "${millisUntilFinished / 1000}"
            }

            override fun onFinish() {
               intentr()
            }
        }.start()



        button2.setOnClickListener{
            three = roll.random()
            check(one, first)
            check(three, third)
            check(two, second)
            checkWin(one,two,three)
        }

        button1.setOnClickListener{
            one = roll.random()
            check(one, first)
            check(three, third)
            check(two, second)
            checkWin(one,two,three)
        }
        button3.setOnClickListener{
            two = roll.random()
            check(one, first)
            check(three, third)
            check(two, second)
            checkWin(one,two,three)
        }

    }
    fun check(i:String,im: ImageView){
        if(i=="1"){
            im.setImageResource(R.drawable.d)
        }
        else if(i=="2"){
            im.setImageResource(R.drawable.clo)
        }
        else if (i=="3"){
            im.setImageResource(R.drawable.dia)
        }
    }
    fun checkWin(i:String,i1:String,i2:String){
        if(i=="1"&& i1=="1"&& i2=="1"){
            intentr()
        }
        else if(i=="2"&& i1=="2"&& i2=="2"){
            intentr()

        }
        else if(i=="3"&& i1=="3"&& i2=="3"){
            intentr()
        }
    }


    fun intentr(){
        startActivity(Intent(this,Final::class.java))
    }
}
