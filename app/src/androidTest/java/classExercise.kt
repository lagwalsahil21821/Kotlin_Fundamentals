class Player(val name: String, val surname: String){
    var totalScore = 0
    var bestScore = 0

    fun fullName(): String{
        return name +" "+surname
    }
}

class Score(){
    fun checkBest(best: Int, current: Int):Int{
        if(current > best) return current
        return best
    }
}

fun main(){
    val p1 = Player("Floyd", "Warshall")
    val p2 = Player("Well" , "Ford")

    val scoring = Score() // instance of the score class to allow access to checkBest function
    var lvlScore = 0      // variable to simulate player level score

    // Level 1
    lvlScore = 12
    p1.totalScore += lvlScore

    // supply the parameters for the checkBest function by accessing the player properties
    p1.bestScore = scoring.checkBest(p1.bestScore, lvlScore)

    lvlScore = 34
    p2.totalScore += lvlScore

    p2.bestScore = scoring.checkBest(p2.bestScore, lvlScore)

    // level 2
    lvlScore = 50
    p1.totalScore += lvlScore

    // supply the parameters for the checkBest function by accessing the player properties
    p1.bestScore = scoring.checkBest(p1.bestScore, lvlScore)

    lvlScore = 70
    p2.totalScore += lvlScore

    p2.bestScore = scoring.checkBest(p2.bestScore, lvlScore)

    // level 3
    lvlScore = 90
    p1.totalScore += lvlScore

    // supply the parameters for the checkBest function by accessing the player properties
    p1.bestScore = scoring.checkBest(p1.bestScore, lvlScore)

    lvlScore = 11
    p2.totalScore += lvlScore

    p2.bestScore = scoring.checkBest(p2.bestScore, lvlScore)

    // check for winner
    if(p1.totalScore > p2.totalScore){
        println("The winner is "+ p1.fullName()+ " with a score of "+p1.totalScore)
        println("Personal Best Score is = " +p1.bestScore)
    }
    else{
        println("The winner is "+ p2.fullName()+ " with a score of "+p2.totalScore)
        println("Personal Best Score is = " +p2.bestScore)
    }

}