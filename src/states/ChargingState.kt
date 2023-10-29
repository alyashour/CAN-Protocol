package states

import ID

class ChargingState : ID(CHARGING) {
    fun balance(): Int {
        return CHARGING + 1
    }
}