# Type Conversion.
 * Also called as Widening conversion , implicit conversion because it take place automatically and with further conversion size become larger.
 * Conversion happens when :
    1. type compatible
    2. destination type > source type

 * byte->short->int->float->long->double.

 * double->int  : X because we converting the data of larger size to a smaller size which can result in lossing some part of it therefore it give error .
 * Thats why we call it as a Lossy Conversion.  
 * Type Conversion also possible when we convert the character to a number.
# Type Casting
 * Also called as the Narrow conversion , explicit conversion because it require to forcefully convert it to specific data type.

 * eg. float b = 45.88888f; int a = (int)b; we get a=45;