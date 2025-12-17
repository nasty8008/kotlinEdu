package lesson_17

class Folder(
    _name: String,
    _amountOfFiles: Int,
    _isSecret: Boolean,
) {
    val isSecret = _isSecret

    val name = _name
        get() = if (isSecret) "скрытая папка" else field

    val amountOfFiles = _amountOfFiles
        get() = if (isSecret) 0 else field
}

fun main() {
    val secretFolder = Folder(_name = "Личные файлы", _amountOfFiles = 26, _isSecret = true)
    println(secretFolder.name)
    println(secretFolder.amountOfFiles)
}