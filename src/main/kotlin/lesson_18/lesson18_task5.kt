package lesson_18

class Circle
class Square
class Point

class Screen() {
    fun draw(figure: Circle, x: Int, y: Int): String {
        return "Был нарисован круг с координатами: x = $x; y = $y"
    }

    fun draw(figure: Circle, x: Float, y: Float): String {
        return "Был нарисован круг с координатами: x = $x; y = $y"
    }

    fun draw(figure: Square, x: Int, y: Int): String {
        return "Был нарисован квадрат с координатами: x = $x; y = $y"
    }

    fun draw(figure: Square, x: Float, y: Float): String {
        return "Был нарисован квадрат с координатами: x = $x; y = $y"
    }

    fun draw(figure: Point, x: Int, y: Int): String {
        return "Была нарисована точка с координатами: x = $x; y = $y"
    }

    fun draw(figure: Point, x: Float, y: Float): String {
        return "Была нарисована точка с координатами: x = $x; y = $y"
    }
}