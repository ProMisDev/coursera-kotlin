fun isValidIdentifier(s: String): Boolean {
    if (s == "") {
        return false;
    }
    var valid = when(s[0]) {
        in 'a'..'z', in 'A'..'Z', '_' -> true
        else -> false
    }
    for(i in 1 until s.length) {
        valid = valid && when(s[i]) {
            in 'a'..'z', in 'A'..'Z', in '0'..'9', '_' -> true
            else -> false
        }
    }
    return valid;
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}
