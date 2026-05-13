fun main() {
    println("Digite o Username: ")
    var username = readln()
    
    println("Digite a senha: ")
    var senha = readln()
    
    if (username == "admin" && senha == "auth123") {
        println("Acesso concedido. Bem-vindo ao sistema!")
    }
    
    if (username != "admin") {
        while(username != "admin"){
            
            println("USERNAME INCORRETO!! Digite novamente o Username: ")
            username = readln()
        }
        }
        
    if (senha != "auth123") {
        println("VC ACERTOU O USUÀRIO, SO FALTA A SENHA!!!")
        while(senha != "auth123"){
            
            println("SENHA INCORRETA!! Digite novamente a Senha: ")
            senha = readln()
    }
    
    println("Acesso concedido. Bem-vindo ao sistema!")
    
    }
}
