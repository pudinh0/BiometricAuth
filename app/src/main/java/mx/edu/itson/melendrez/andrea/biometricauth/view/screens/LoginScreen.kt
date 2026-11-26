package mx.edu.itson.melendrez.andrea.biometricauth.view.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.InputTransformation.Companion.keyboardOptions
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.SecureTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(innerPadding : PaddingValues, onSuccessfulLogin: ()-> Unit){

    var user = remember{TextFieldState()}
    var password = remember{ TextFieldState() }

    Column(Modifier.fillMaxSize()
        .padding(innerPadding)
        .padding(15.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)) {

        TextField(user, label = { Text("Correo electrónico")}
            ,//keyboardOptions(keyboardType = KeyboardType.Email))
        )

        SecureTextField(password,
            label = {Text("Password")})

        Button(onSuccessfulLogin) {
            Text("Iniciar sesión")
        }
    }
}