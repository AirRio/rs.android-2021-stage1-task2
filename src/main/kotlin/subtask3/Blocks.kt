package subtask3

import java.time.LocalDate
import java.util.*
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any? {

        when (blockB) {
            String::class -> {
                var result = ""

                for(arr in blockA)
                {
                    if(arr is String)
                    {
                        result += arr
                    }
                }

                return result
            }
            Int::class -> {
                var result = 0
                for(arr in blockA)
                {
                    if(arr is Int)
                    {
                        result += arr
                    }
                }
                return result
            }
            LocalDate::class -> {

                var isFirst = 0
                var result = ""
                var sum = 0
                var res: LocalDate
                for(arr in blockA)
                {
                    if(arr is LocalDate)
                    {
                        var res1 = ""
                        var res2 = ""
                        var res3 = ""
                        var check = 0

                        for(arg in arr.toString())
                         {
                             if(arg == '-')
                             {
                                 check ++;
                             } else
                             {
                                 if(check == 0)
                                 {
                                     res3 += arg
                                 }
                                 if(check == 1)
                                 {
                                     res2 += arg
                                 }
                                 if(check == 2)
                                 {
                                     res1 += arg
                                 }
                             }
                         }
                        if(isFirst == 0)
                        {
                            result = "$res1.$res2.$res3"
                            isFirst = 1
                            sum = (res3.toInt()-1) * 365 + (res2.toInt()) * 30 + res1.toInt()
                        } else
                        {
                            if(sum < (res3.toInt()-1) * 365 + (res2.toInt()) * 30 + res1.toInt())
                            {
                                result = "$res1.$res2.$res3"
                                sum = (res3.toInt()-1) * 365 + (res2.toInt()) * 30 + res1.toInt()
                            }
                        }
                    }

                }
                return result

            }
        }
        return ""
    }
}
