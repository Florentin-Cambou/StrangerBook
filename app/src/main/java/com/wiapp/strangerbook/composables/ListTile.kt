package com.wiapp.strangerbook.composables

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.wiapp.strangerbook.model.Post

@Composable
fun ListTile(post: Post){
    Card(
        modifier = Modifier
            .padding(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            Image(
                painter = painterResource(id = post.user.pictureProfile),
                contentDescription = "Picture profile",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(80.dp)
                    .width(80.dp)
                    .clip(RoundedCornerShape(percent = 50))
            )
            Text(
                text = post.user.pseudo,
                modifier = Modifier
                    .padding(start = 5.dp),
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.weight(1.0F) )
            Icon(imageVector = Icons.Default.Menu, contentDescription = null)

        }
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Image(
            painter = painterResource(id = post.postImage),
            contentDescription = "post image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(percent = 10))
        )

        Row(
            modifier = Modifier.padding(start = 5.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = null,
                modifier = Modifier.padding(5.dp)
            )
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = null,
                modifier = Modifier.padding(5.dp)
            )
            Icon(
                imageVector = Icons.Default.Send,
                contentDescription = null,
                modifier = Modifier.padding(5.dp)
            )
            
            Spacer(modifier = Modifier.weight(1.0F))
            Icon(
                imageVector = Icons.Default.Info,
                contentDescription = null,
                modifier = Modifier.padding(start = 5.dp)
            )
        }
        Text(text = "${post.likes} J'aime")
        Text(
            text = stringResource(id = post.description),
            modifier = Modifier.padding(start = 10.dp)
        )
        Divider(modifier = Modifier.padding(5.dp))
    }
}