package com.gl4.tp0


fun showList(list: List<String>){
        // Complétez la fonction pour afficher les éléments de la liste
        for (i in 0..list.size-1){
            print("${list[i]} ")
        }
    }

    fun oddNumbersTo10(){
        // Complétez la fonction pour afficher les nombres impairs jusqu'à 10
        for(k in 1..10){
            if(k % 2 != 0){
                print("$k ")
            }
        }
    }

    fun calcul(x:Int, y:Int, op: String): Int{
        when(op){
            "+" -> return x+y
            "-" -> return x-y
            "*" -> return x*y
            "/" -> return if (y != 0) x/y else 0
            "%" -> return x%y
            else -> print("mauvais operateur")
        }
        return 0
    }
    private val languages = listOf("java","kotlin","javascript")

    fun main(args: Array<String>) {

        println("Languages :")
        showList(languages)
        println("\nOdd Numbers to 10 :")
        oddNumbersTo10()
        print("\n")
        print(calcul(4,5, "+"))
    }


