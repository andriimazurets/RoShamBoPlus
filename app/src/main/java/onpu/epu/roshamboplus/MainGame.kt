package onpu.epu.roshamboplus

import onpu.epu.roshamboplus.gameElements.GameElement
import onpu.epu.roshamboplus.gameElements.Paper
import onpu.epu.roshamboplus.gameElements.Rock
import onpu.epu.roshamboplus.gameElements.Scissors

fun randomElement() : GameElement {
    val listGameElement: List<GameElement> = listOf(Paper(), Rock(), Scissors())
    val random: Int = (Math.random() * listGameElement.size).toInt()
    return listGameElement[random]
}

fun defineTheWinner(player: GameElement, pc: GameElement) : Int{
    if(player == pc)
    return 0

    if(player is Rock && pc is Paper)
        return -1
    if(player is Rock && pc is Scissors)
        return 1
    if(player is Paper && pc is Scissors)
        return -1
    if(player is Paper && pc is Rock)
        return 1
    if(player is Scissors && pc is Rock)
        return -1
    if(player is Scissors && pc is Paper)
        return 1

    return 0
}



