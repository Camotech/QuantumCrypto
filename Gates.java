public class GateWork { 
  
  /**
  * Multiplies matrices as a * b
  */
  static public Complex[][] mult(Complex[][] a, Complex[][] b) {
    if (a[0].length != b.length) {
      System.out.println("Incorrect Matrix Dimensions: ")
      System.exit(0);
    }
    Complex[][] ret = new Complex[a.length][b[0].length];
    for (int i = 0; i < ret.length; i++) {
      for (int j = 0; j < ret[0].length; j++) {
        ret[i][j] = new Complex();
        for (int k = 0; k < a[0].length; k++) {
          ret[i][j].add(a[j][k] * b[k][j]);
        }
      }
    }
    return ret;
  }
  
  static public Operator mult(Operator a, Operator b) {
    return new Operator(mult(a.getOp(), b.getOp());
  }
  
  static public Operator mult(Operator[] list) {
    if (list.length == 2) {
      return mult(list[1], list[2]);
    }
    else {
      return mult //<-------------------------------------------------------------------------
    }
  }
  
  static public Complex[] mult(Complex[] a, Complex[] b) {
    Complex[] ret = new Complex[a.length + b.length];
    for (int i = 0; i < a.length; i++) {
      ret[i] = a[i];
    }
    for (int i = 0; i < b.length; i++) {
      ret[i + a.length] = b[i];
    }
    return ret;
  }

}
