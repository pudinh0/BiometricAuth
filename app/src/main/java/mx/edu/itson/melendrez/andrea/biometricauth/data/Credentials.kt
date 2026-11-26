package mx.edu.itson.melendrez.andrea.biometricauth.data

val USER = "adel.mendez@gmail.com"
val PASSWORD = "123456"

fun authenticate(user:String, password:String): Boolean{
    if (user.equals(USER, true) && password.equals(PASSWORD)) {
        return true
    }
    return false

}