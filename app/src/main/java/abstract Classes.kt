abstract class ShapeDrawer{
    fun drawSquare(){
        drawLine()
    }
    fun drawRectangle(){
        drawLine()
    }

    internal abstract fun drawLine()
}

class AndroidShapeDrawer: ShapeDrawer(){
    override fun drawLine() {
        //code that draw lines for android platform
        println("Test code -Draw line for  android platform")
    }
}

class DesktopShapeDrawer: ShapeDrawer(){
    override fun drawLine() {
        //code that draw lines for desktop platform
        println("Test code -Draw line for  desktop platform")
    }
}

fun main(){
    val sq:ShapeDrawer = AndroidShapeDrawer()
    sq.drawSquare()
    val desktopDrawer:ShapeDrawer = DesktopShapeDrawer()
    desktopDrawer.drawSquare()
}