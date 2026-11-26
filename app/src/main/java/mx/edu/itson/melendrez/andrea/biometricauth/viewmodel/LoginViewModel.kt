package mx.edu.itson.melendrez.andrea.biometricauth.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import mx.edu.itson.melendrez.andrea.biometricauth.data.authenticate

class LoginViewModel: ViewModel(){
    var authStatus by mutableStateOf("")

    fun login(user: String, password: String, toHome: ()-> Unit){
        if (authenticate(user,password)){
            toHome()
        }
        else{
            authStatus=" Fuera intruse"
        }
    }
}