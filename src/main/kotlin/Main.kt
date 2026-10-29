package org.fundamentos

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Calculadora: ")
    print("Digite o Primeiro Numero: ")

    val primeiroNumero = readln().toDouble()
    print("Digite o Segundo Numero: ")
    val segundoNumero = readln().toDouble()

    println("Escolha a Operação:")
    println("1-Multiplicação")
    println("2-Divisão")
    println("3-Soma")
    println("4-Subtração")

    fun multiplicacao(): Double {
        val resultado = primeiroNumero * segundoNumero
        return resultado

    }
    fun divisao(): Double{
        val resultado = primeiroNumero / segundoNumero
        return resultado

    }
    fun soma(): Double{
        val resultado = primeiroNumero + segundoNumero
        return resultado
    }
    fun subtracao(): Double{
        val resultado = primeiroNumero - segundoNumero
        return resultado
    }
    val resultado = readln().toDouble()
    // when para que o usuário escolha a opção de acordo com a escolha
    when(resultado){
        1.0 -> println("Resultado Multiplicacao : $primeiroNumero * $segundoNumero = ${multiplicacao()}")
        2.0 -> println("Resultado Divisao:$primeiroNumero / $segundoNumero = ${divisao()}")
        3.0 -> println("Resultado Soma: $primeiroNumero + $segundoNumero =${soma()}")
        4.0 -> println("Resultado Subtracao:$primeiroNumero - $segundoNumero = ${subtracao()}")
        else -> println("Opção inválida")
    }
}