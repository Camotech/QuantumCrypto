public class Operator {
  private Complex[][] matrix;
  final private double r2 = 1 / Math.sqrt(2);
  final private Complex[][] X = {{new Complex(), new Complex(1, 0)},{new Complex(1, 0), new Complex()}};
  final private Complex[][] Y = {{new Complex(), new Complex(0, -1)},{new Complex(0, 1), new Complex()}};
  final private Complex[][] Z = {{new Complex(1, 0), new Complex()},{new Complex(), new Complex(-1, 0)}};
  final private Complex[][] H = {{new Complex(r2, 0), new Complex(r2, 0)},{new Complex(r2, 0), new Complex(-r2, 0)}};
  final private Complex[][] S = {{new Complex(1, 0), new Complex()},{new Complex(), new Complex(0, 1)}};
  final private Complex[][] T = {{new Complex(1, 0), new Complex()},{new Complex(), new Complex(r2, r2)}};
  
  public Operator(int a, int b) {
    matrix = new Complex[a][b];
  }
  
  public Operator(Complex[][] a) {
    matrix = a;
  }
  
  public Operator(char gate) {
    Switch(gate) {
      case "X":
        matrix = X;
        break;
      case "Y":
        matrix = Y;
        break;
      case "Z":
        matrix = Z;
        break;
      case "H":
        matrix = H;
        break;
      case "S":
        matrix = S;
        break;
      case "T":
        matrix = T;
        break;
    }
  }
  
  public Complex[][] getOp() {
    return matrix;
  }
}
