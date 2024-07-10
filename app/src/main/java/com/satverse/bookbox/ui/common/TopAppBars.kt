package com.satverse.bookbox.ui.common

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.satverse.bookbox.R
import com.satverse.bookbox.ui.theme.remBold

@Composable
fun CustomTopAppBar(headerText: String, iconRes: Int) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, top = 10.dp, bottom = 8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = headerText,
                fontSize = 28.sp,
                modifier = Modifier.padding(bottom = 16.dp),
                color = MaterialTheme.colorScheme.onBackground,
                fontFamily = remBold
            )
            Icon(
                imageVector = ImageVector.vectorResource(id = iconRes),
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.size(28.dp)
            )
        }
        Divider(
            color = MaterialTheme.colorScheme.surfaceColorAtElevation(4.dp),
            thickness = 2.dp,
        )
    }
}

@Composable
fun CustomTopAppBar(headerText: String, onBackButtonClicked: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, top = 16.dp, bottom = 8.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
        ) {
            TopBarActionItem(icon = Icons.Outlined.ArrowBack, onclick = onBackButtonClicked)
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = headerText,
                modifier = Modifier.padding(bottom = 16.dp),
                color = MaterialTheme.colorScheme.onBackground,
                fontStyle = MaterialTheme.typography.headlineMedium.fontStyle,
                fontFamily = remBold,
                fontSize = 24.sp
            )
            Spacer(modifier = Modifier.weight(2f))
        }
        Divider(
            color = MaterialTheme.colorScheme.surfaceColorAtElevation(4.dp),
            thickness = 2.dp,
        )
    }
}

@Composable
fun CustomTopAppBar(
    headerText: String,
    actionIconRes: Int,
    onBackButtonClicked: () -> Unit,
    onActionClicked: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, top = 16.dp, bottom = 8.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
        ) {
            TopBarActionItem(icon = Icons.Outlined.ArrowBack, onclick = onBackButtonClicked)
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = headerText,
                modifier = Modifier.padding(bottom = 16.dp),
                color = MaterialTheme.colorScheme.onBackground,
                fontStyle = MaterialTheme.typography.headlineMedium.fontStyle,
                fontFamily = remBold,
                fontSize = 24.sp
            )
            Spacer(modifier = Modifier.weight(1f))
            TopBarActionItem(
                icon = ImageVector.vectorResource(id = actionIconRes),
                onclick = onActionClicked
            )
        }
        Divider(
            color = MaterialTheme.colorScheme.surfaceColorAtElevation(4.dp),
            thickness = 2.dp,
        )
    }

}

@Composable
private fun TopBarActionItem(icon: ImageVector, onclick: () -> Unit) {
    Box(modifier = Modifier
        .padding(top = 2.dp, bottom = 18.dp, end = 16.dp)
        .clip(CircleShape)
        .background(MaterialTheme.colorScheme.surfaceColorAtElevation(4.dp))
        .clickable { onclick() }) {
        Icon(
            imageVector = icon,
            contentDescription = stringResource(id = R.string.back_button_desc),
            tint = MaterialTheme.colorScheme.onSurface,
            modifier = Modifier.padding(10.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TopAppBarsPV() {
    Column(Modifier.fillMaxSize()) {
        CustomTopAppBar(headerText = "Something", iconRes = R.drawable.ic_nav_categories)
        CustomTopAppBar(headerText = "Something", onBackButtonClicked = {})
        CustomTopAppBar(
            headerText = "Something",
            actionIconRes = R.drawable.ic_sort_language,
            onBackButtonClicked = { /*TODO*/ }, onActionClicked = {})
    }
}