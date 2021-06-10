package subtask2

class Abbreviation {
    
    fun abbreviationFromA(a: String, b: String): String {

        var pp = ""
        for(arg in a.toUpperCase())
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
