import kotlin.math.pow

open class ID(private var state: Int) {
    /* Default state-independent methods go here*/
    fun start(): Int { return state + 0b111_111_111 }
    fun stop(): Int { return state + 0b111_111_110 }

    /* State-independent methods end here */

    /**
     * Primary Constructor
     */
    init {
        if (state in states) this.state *= 2f.pow(COMMAND_NUM_BITS).toInt()
        else throw java.lang.IllegalArgumentException("Illegal state. " +
                "It's 1-4 and you gave me $state. Not allowed bbgl.")
    }

    companion object {
        const val STATE_NUM_BITS = 2    // these must add
        const val COMMAND_NUM_BITS = 9  // to 11 or 29
        const val ACTIVE = 0b00         // 0
        const val CHARGING = 0b01       // 1 -> 2^9 or 512
        const val IDLE = 0b10           // 2 -> 2^10 or 1024
        const val DEBUG = 0b11          // 3 -> 3*2^9 or 1536

        // this is for exception checking, so we don't have to change the code if another mode were to be added.
        private val states = listOf(ACTIVE, CHARGING, IDLE, DEBUG)

        /**
         * This returns a full ID given the needed subcomponents state and command.
         * This is the primary method of this class.
         * @param state     the mode. in [0, 2^2]: active, CHARGING, IDLE, or DEBUG.
         * @param command   the command. in [0, 2^9]. specific to the current state.
         * @return          integer of binary id (11 bits),
         * this could be changed to Bitfield in the future to enforce the length
         */
        fun makeID(state: Int, command: Int): Int {
            if (state in states) return state + command
            else throw IllegalArgumentException("State parameter not valid. $state is not a valid state")
        }

        @JvmStatic
        val totalBitCount: Int
            get() = STATE_NUM_BITS + COMMAND_NUM_BITS
    }
}
