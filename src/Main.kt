import states.ActiveState
import states.ChargingState
import states.DebugState
import states.IdleState

/*******************************************************************
 * Name: Aly Ashour
 * Date: October 29, 2023,
 * Description:
 * Main
 ******************************************************************/
fun main(args: Array<String>) {
    // make three frames
    val f = Frame(ActiveState().start(), Data(10))
    val g = Frame(IdleState().stop(), Data(20, 30))
    val h = Frame(ChargingState().balance(), Data(40, 50, 60))

    // print three frames
    println(f); println(g); println(h)
}
