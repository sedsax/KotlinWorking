import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.google.firebase.database.FirebaseDatabase

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun YoklamaSayfa() {
    Column(verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier.fillMaxSize()
    ) {
        val db = FirebaseDatabase.getInstance()
        val refStudents = db.getReference("referans").child("referansınCocugu").child("referansınCocugununCocuğu")

        var name by remember { mutableStateOf("aaa") }
        var no by remember { mutableStateOf("bbb") }

        val newStudent = Students(name,no)

        refStudents?.push()?.setValue(newStudent)

    }
}

/*
-------OUTPUT------
-referans
    -referansınCocugu
          -referansınCocugununCocuğu
                  -aaa
                  -bbb
*/
