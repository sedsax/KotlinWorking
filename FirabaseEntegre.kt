/*
=> Kasım Adalan Udemy Kursu
Android Projesine Firebase projesini entegre etme ve ilk veriyi kaydedip Firebase' de otomatik kaydını görme amaçlı yazılmış bir kod
*/


// Students sınıfı

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Students(var std_name: String? = "",
                    var std_surname: String? = "",
                    var std_no: String? = "",
                    var std_department: String? =""
)

// MainActivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ankauniss.firebaseproject.ui.theme.FirebaseProjectTheme
import com.google.firebase.database.FirebaseDatabase

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirebaseProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Sayfa()
                }
            }
        }
    }
}

@Composable
fun Sayfa(){
    ekle()
}

fun ekle() {
    val db = FirebaseDatabase.getInstance()
    val refStudents = db.getReference("students")

    val newStudent = Students("Ahmet Emin", "Karataş", "22002911", "Bilgisayar Mühendisliği %100 İngilizce")
    refStudents.push().setValue(newStudent)
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FirebaseProjectTheme {
        Sayfa()
    }
}
