fun main() {
    print("Digite o UUID - ")
    val uuid = readln()
    
    print("Digite o Username - ")
    var username = readln()
    
    print("Digite o BatteryPct: ")
    var batterypct = readln().toInt()
    
    print("Digite a AppVersion- ")
    val appversion = readln()
    
    print("Digite o IsConnected - ")
    val isconnected = readln().toBoolean()
    
    println("")
    
    if (batterypct < 15) {
        println("Alerta: Ative o modo de economia!")
    }
    
    if (batterypct > 15 && batterypct <= 100) {
        println("Nivel de bateria estavel")
}

    if (isconnected == false) {
        println("Aviso: Algumas funcoes podem não funcionar offline")
    
    }
    
    println("")
    
    println("UUID - $uuid")
    println("Username - $username")
    println("BatteryPct - $batterypct")
    println("AppVersion - $appversion")
    println("IsConnected - $isconnected")
    
}
