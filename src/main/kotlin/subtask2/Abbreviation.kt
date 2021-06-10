package subtask2

class Abbreviation {
    
    fun abbreviationFromA(a: String, b: String): String {

        val string = a.toUpperCase()
        val result = string.substring(b.length-1)

        return if(result.length == b.length)
            "YES"
        else "NO"
    }
}
