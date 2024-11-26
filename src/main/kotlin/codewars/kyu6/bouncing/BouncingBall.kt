package codewars.kyu6.bouncing

object BouncingBall {
    fun bouncingBall(
        h: Double,
        bounce: Double,
        window: Double,
    ): Int =
        try {
            require(h > 0)
            require(bounce > 0.0 && bounce < 1.0)
            require(window < h)

            var count = 1
            var ballHeight = h
            while (ballHeight * bounce > window) {
                count += 2
                ballHeight *= bounce
            }
            count
        } catch (e: IllegalArgumentException) {
            -1
        }
}
