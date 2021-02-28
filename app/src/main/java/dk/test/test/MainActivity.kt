package dk.test.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dk.test.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.outData.text = "Så står der dette"
    }
}