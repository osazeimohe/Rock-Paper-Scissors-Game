import java.util.*

//return element at random index
fun getGameChoice(options: Array<String>): String = options[(Math.random()*options.size).toInt()]

fun getUserChoice(options: Array<String>): String{
    var isValidChoice = false
    var userChoice = ""
    //repeat until the choice is valid

    while(!isValidChoice) {

        //ask the user for their choice
        print("Please enter one of the following: ")
        //loop through the array
        for (choice in options) print(" $choice")
        println(".")
        //read users choice from the output window
        val userInput = readLine()
        //validate the users choice
        if(userInput!= null && userInput in options){
            //stop the while loop
            isValidChoice =  true
            //keep the user choice
            userChoice = userInput
        }
        //tell user to re-do the while loop
        if (!isValidChoice) println("Please enter a valid choice")
    }
    return userChoice
}
fun printResult(gameChoice: String, userChoice: String): Unit{
    //check if the choices are the same
    if(gameChoice == userChoice) println("It was a tie")
    //if they are print "We had a tie"
    else if((userChoice == "Scissors" && gameChoice == "Rock")||(userChoice == "Rock" && gameChoice == "Scissors")||(userChoice == "Paper" && gameChoice == "Rock"))
    //if they are different,check if you won
        println("You win:You choose $userChoice, I chose $gameChoice")
    //print "you won"
    else
        println("You lose: I chose $gameChoice, You chose $userChoice")
    //if not print "you lose"
}

fun main(){
    val options = arrayOf("Rock","Paper","Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(gameChoice,userChoice)


}