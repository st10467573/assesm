package vcmsa.ci.myresturent

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)





        val rbMorning=findViewById<RadioButton>(R.id.rbMorning)
        val rbMmorning=findViewById<RadioButton>(R.id.rbMmorning)
        val rbAfter =findViewById<RadioButton>(R.id.rbAfter)
        val rbMafter=findViewById<RadioButton>(R.id.rbMafter)
        val rbDinner=findViewById<RadioButton>(R.id.rbDinner)
        val rbDesserts=findViewById<RadioButton>(R.id.rbDesserts)
        val btnM =findViewById<Button>(R.id.btnM)
        val btnR =findViewById<Button>(R.id.btnR)
        val txtResults =findViewById<TextView>(R.id.textResults)


        btnM.setOnClickListener{

            var txtMu = txtResults.text.toString()

            if (rbMorning.isChecked){
                txtMu="eggs and baecon with tosted buns"
            }
            else if (rbMmorning.isChecked){

                txtMu="bowl of muesli and yoghurt"
            }
            else if (rbAfter.isChecked){
                txtMu="BBQ beacon burger"
            }
            else if (rbMafter.isChecked){
                txtMu="four wings and can of coke"
            }
            else if (rbDinner.isChecked){
                txtMu="mac and chesse with 300g of ribs"
            }
            else if (rbDesserts.isChecked){
                txtMu="malva pudding and custard"
            }
            txtResults.text= txtMu


        }

        btnR.setOnClickListener {

            txtResults.text =""
        }












        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}