package me.diegoparias.contenedores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.diegoparias.contenedores.ui.theme.ContenedoresTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {


        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ContentScreen(){

    Column(modifier = Modifier
        .background(Color.LightGray)
        .padding(all = 18.dp)
        .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally

    )
    {


        Row(modifier = Modifier
            .background(Color.Gray)
            .padding(all = 18.dp)
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween

        ){
            Text(
                text = "Inicio",
                fontSize = 25.sp,
                modifier =
                    Modifier
                        .background(Color.Red)
                        .padding(all = 8.dp)
            )
            Text(
                text = "Perfil",
                fontSize = 25.sp,
                modifier = Modifier
                    .background(Color.Yellow)
                    .padding(all = 8.dp)

            )

            Text(
                text = "Configuracion",
                fontSize = 25.sp,
                modifier = Modifier
                    .background(Color.Cyan)
                    .padding(all = 8.dp)

            )
        }

        Text(
            text = "Configuracion",
            fontSize = 25.sp,
            modifier = Modifier
                .background(Color.Cyan)
                .padding(all = 8.dp)

        )
        Text(
            text = "Configuracion",
            fontSize = 25.sp,
            modifier = Modifier
                .background(Color.Cyan)
                .padding(all = 8.dp)

        )
        Text(
            text = "Configuracion",
            fontSize = 25.sp,
            modifier = Modifier
                .background(Color.Cyan)
                .padding(all = 8.dp)

        )

    }



}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TaskCompleted() {
    Column(modifier = Modifier
        .background(Color.White)
        .padding(150.dp)
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val painter = painterResource(id = R.drawable.check)
        Image(painter, contentDescription = null, modifier = Modifier.size(150.dp))

        Text(
            text = "All task completed",
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.padding(10.dp)
        )
        Text(
            text = "Not working",
            modifier = Modifier.padding(5.dp)
        )
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Composable(){
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f)) {
            Column(modifier = Modifier.background(Color(0xFFEADDFF)).weight(1f).fillMaxSize()) {
                Text("Text Composabe")
                Text("Display text and follows the recomended Material Design guidlines"
                )
            }
            Column(modifier = Modifier.background(Color(0xFFD0BCFF)).weight(1f).fillMaxSize()) {
                Text("Text Composabe")
                Text("Display text and follows the recomended Material Design guidlines"
                )
            }
        }
        Row(modifier = Modifier.weight(1f)) {
            Column(modifier = Modifier.background(Color(0xFFD0BCFF)).weight(1f).fillMaxSize()) {
                Text("Text Composabe")
                Text("Display text and follows the recomended Material Design guidlines"
                )
            }
            Column(modifier = Modifier.background(Color(0xFFEADDFF)).weight(1f).fillMaxSize()) {
                Text("Text Composabe")
                Text("Display text and follows the recomended Material Design guidlines"
                )
            }
        }
    }
}