//volume of a cube using inline function.

def volofcube = (a : Int) => a*a*a

val inline_cube = (volofcube : (Int) => Int, x : Int) => volofcube(x)

inline_cube(volofcube, 3)  //  ---> 27