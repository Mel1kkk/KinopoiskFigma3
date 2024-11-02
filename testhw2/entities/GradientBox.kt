import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.testhw2.R

@Composable
fun GradientBox(modifier: Modifier = Modifier, showGradient: Boolean) {
    if (showGradient) {
        Box(
            modifier = modifier.size(111.dp, 156.dp)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0x66B5B5C9),
                            Color(0x66B5B5C9)
                        ),
                        start = Offset(0f, 0f),
                        end = Offset(Float.POSITIVE_INFINITY, 0f)
                    )
                )
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0x003D3BFF),
                            Color(0x663D3BFF)
                        ),
                        start = Offset(0f, 0f),
                        end = Offset(0f, Float.POSITIVE_INFINITY)
                    )
                )
        ) {
            Image(
                painter = painterResource(id = R.drawable.icons_svg),
                contentDescription = null,
                modifier = Modifier
                    .width(21.dp)
                    .height(21.dp)
                    .align(Alignment.BottomEnd)
                    .padding(bottom = 6.dp, end = 6.dp)
            )

        }
    }
}

