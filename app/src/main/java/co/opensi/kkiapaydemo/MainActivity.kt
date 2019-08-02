package co.opensi.kkiapaydemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import co.opensi.kkiapay.uikit.Kkiapay
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init
        Kkiapay.get()
            .setListener{ status, transactionId  ->
                Toast.makeText(this, "Transaction: ${status.name} -> $transactionId", Toast.LENGTH_LONG).show()
            }


        button.setOnClickListener {
            Kkiapay.get()
                .requestPayment(this, "100", "Test", "Arcadius", "22997307803")

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Kkiapay.get().handleActivityResult(requestCode, resultCode, data)
    }
}
