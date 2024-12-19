package com.example.artspace_app

import android.R.id.underline
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.unpackInt1
import com.example.artspace_app.ui.theme.ArtSpace_AppTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpace_AppTheme {
                ArtSpaceTheme()

            }
        }
    }
}

@Composable
fun ArtSpace() {
    var result by remember { mutableStateOf(1) }
    var imageResource = when (result) {
        1 -> R.drawable.pexels_rachel_claire_7263897
        2 -> R.drawable.pexels_mnannapaneni_13819269
        3 -> R.drawable.pexels_sahil_pathan_333884631_13919567
        else -> R.drawable.pexels_nikhil_singh_144470522_17804313
    }


    Column(modifier = Modifier.fillMaxSize()){
        Text(
            text="Developed By:Shashank"
        )
        Spacer(modifier = Modifier.padding(33.dp))

Row(modifier = Modifier.fillMaxWidth().shadow(82.dp,RoundedCornerShape(12.dp), ambientColor = Color.Red, spotColor = Color.Cyan),
    horizontalArrangement = Arrangement.Center

    ) {
    Image(
        painter = painterResource(imageResource),
        contentDescription = null,
        modifier = Modifier.size(400.dp)

        )

}
        Spacer(modifier = Modifier.padding(12.dp))
        Row(modifier= Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
    if(imageResource==R.drawable.pexels_rachel_claire_7263897){

        Text(
            stringResource(R.string.TajMahal),
            fontWeight = Bold

        )


    }

            else if(imageResource==R.drawable.pexels_mnannapaneni_13819269){
        Text(
            stringResource(R.string.IndiaGate),
            fontWeight = Bold

        )

    }
            else if(imageResource==R.drawable.pexels_sahil_pathan_333884631_13919567){
        Text(
            stringResource(R.string.QutabMinar),
            fontWeight = Bold

        )

    }
            else if(imageResource==R.drawable.pexels_nikhil_singh_144470522_17804313){
        Text(
            stringResource(R.string.LotusTemple),
            fontWeight = Bold

        )

    }

}
        Spacer(modifier = Modifier.padding(8.dp))
        Row(modifier = Modifier.fillMaxWidth()){
            if(imageResource==R.drawable.pexels_rachel_claire_7263897){
                Text(
                    stringResource(R.string.AboutTajaMahal),
                    modifier=Modifier.padding(start=10.dp)

                    )


            }
            else if(imageResource==R.drawable.pexels_mnannapaneni_13819269){
                Text(
                    stringResource(R.string.AboutIndiaGate),
                    modifier=Modifier.padding(start=10.dp)

                )

            }
            else if(imageResource==R.drawable.pexels_sahil_pathan_333884631_13919567){
                Text(
                    stringResource(R.string.AboutQutabMinar),
                    modifier=Modifier.padding(start=10.dp),
                    fontSize = 12.sp
                )

            }
            else if(imageResource==R.drawable.pexels_nikhil_singh_144470522_17804313){
                Text(
                    stringResource(R.string.AboutLotusTemple),
                    modifier=Modifier.padding(start=10.dp),
                    fontSize = 12.sp
                )

            }

        }
        Spacer(modifier = Modifier.padding(8.dp))
        Row(modifier= Modifier.fillMaxWidth()){
            if(imageResource==R.drawable.pexels_rachel_claire_7263897){
                Text(
                    stringResource(R.string.Estd_Tajmahal),
                    modifier=Modifier.padding(start=10.dp),
                    fontWeight = Bold,
                    textDecoration = TextDecoration.Underline,
                    color = Color.Red


                    )


            }
            else if(imageResource==R.drawable.pexels_mnannapaneni_13819269){
                Text(
                    stringResource(R.string.ESTDIndiaGate),
                    modifier=Modifier.padding(start=10.dp),
                    fontWeight = Bold,
                    textDecoration = TextDecoration.Underline,
                    color = Color.Red

                )

            }
            else if(imageResource==R.drawable.pexels_sahil_pathan_333884631_13919567){
                Text(
                    stringResource(R.string.ESTDQutabMinar),
                    modifier=Modifier.padding(start=10.dp),
                    fontWeight = Bold,
                    textDecoration = TextDecoration.Underline,
                    color = Color.Red

                )

            }
            else if(imageResource==R.drawable.pexels_nikhil_singh_144470522_17804313){
                Text(
                    stringResource(R.string.ESTDLotusTemple),
                    modifier=Modifier.padding(start=10.dp),
                    fontWeight = Bold,
                    textDecoration = TextDecoration.Underline,
                    color = Color.Red

                )

            }

        }

        Row(modifier = Modifier.fillMaxSize().padding(bottom=53.dp),
            verticalAlignment = Alignment.Bottom

            ){


Button(onClick = {
    imageResource=(1..4).count()
    result--


}, modifier = Modifier.size(125.dp,33.dp)
    ) { 
    Text(
        stringResource(R.string.previous)
    )

}
            Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth()) {
                Button(
                    onClick = {
                        imageResource=(1..4).count()
                        result++
                    }, modifier = Modifier.size(125.dp, 33.dp)
                ) {
                    Text(
                        stringResource(R.string.next)
                    )


                }
            }

        }
    }
}



@Preview(showBackground = true)
@Composable
fun ArtSpaceTheme(){
    ArtSpace()

}