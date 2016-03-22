
boolean val = false

for (i in 1..2) {
    println("another loop");

    val = ! val;
    if (val == true) {
        println("line 1");
        println("line 2");
    }
}

