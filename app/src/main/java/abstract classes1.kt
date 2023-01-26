/*


class AndroidShapeDrawer {
    fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int) {
        /*...*/
    }
    fun drawSquare(x: Int, y: Int, size: Int) {
        /*...*/
    }
    fun drawRectangle(x: Int, y: Int, height: Int, width: Int) {
        /*...*/
    }
}

class WebsiteShapeDrawer {
    fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int) {
        /*...*/
    }
    fun drawSquare(x: Int, y: Int, size: Int) {
        /*...*/
    }
    fun drawRectangle(x: Int, y: Int, height: Int, width: Int) {
        /*...*/
    }
}

class TerminalShapeDrawer {
    fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int) {
        /*...*/
    }
    fun drawSquare(x: Int, y: Int, size: Int) {
        /*...*/
    }
    fun drawRectangle(x: Int, y: Int, height: Int, width: Int) {
        /*...*/
    }
}

*/

//Each class could implement these functions individually, however, there is another option
abstract class ShapeDrawerX{

    abstract fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int)

    fun drawSquare(x: Int, y: Int, size: Int) {
        drawLine(x, y, x + size, y)
        drawLine(x + size, y, x + size, y + size)
        drawLine(x, y, x, y + size)
        drawLine(x, y + size, x + size, y + size)
    }

    fun drawRectangle(x: Int, y: Int, height: Int, width: Int) {
        drawLine(x, y, x + width, y)
        drawLine(x + width, y, x + width, y + height)
        drawLine(x, y, x, y + height)
        drawLine(x, y + height, x + width, y + height)
    }
}


class AndroidShapeDrawerX: ShapeDrawerX() {
    override fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int) { /*...*/ }
}

class WebsiteShapeDrawerX: ShapeDrawerX() {
    override fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int) { /*...*/ }
}

class TerminalShapeDrawerX: ShapeDrawerX() {
    override fun drawLine(fromX: Int, fromY: Int, toX: Int, toY: Int) { /*...*/ }
}
