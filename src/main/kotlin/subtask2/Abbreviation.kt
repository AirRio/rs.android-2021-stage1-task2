package subtask2

class Abbreviation {
    
    fun abbreviationFromA(a: String, b: String): String {

        var string = a.toUpperCase()
        var pp = ""

        for(arg in string)
        {
            for(p in b)
            {
                if(arg == p)
                {
                    pp += arg
                }
            }
        }

        return if(pp == b)
            "YES"
        else "NO"
    }
}
