public class Complex {
  private double real;
  private double imag;
  
  public Complex() {
    real = 0;
    imag = 0;
  }
  
  public Complex(double r, double i) {
    real = r;
    imag = i;
  }
  
  public double getReal() {
    return this.real;
  }
  
  public double getImag() {
    return this.imag;
  }
  
  private void mod(double r, double i) {
    this = new Complex(r, i);
  }
  
  private Complex inv() {
    return new Complex(this.getReal(), -1 * this.getImag());
  }
  
  private double square() {
    return this.getReal() * this.getReal() - this.getImag() * this.getImag();
  }
  
  public void add(Complex a) {
    this.mod(this.getReal() + a.getReal(), this.getImag() + a.getImag());
  }
  
  public void mult(Complex a) {
    this.mod(this.getReal() * a.getReal() - this.getImag() * a.getImag(), this.getImag() * a.getReal() + this.getReal() * a.getImag());
  }
  
  public void mult(double a) {
    this.mod(this.getReal() * a, this.getImag() * a);
  }
  
  public void div(Complex a) {
    Complex b = this.mult(a.inv).div(a.square);
  }
  
  public void div(double a) {
    this.mod(this.getReal() / a, this.getImag() / a);
  }
  
  public void pow(double a) {
    double r = Math.pow(Math.sqrt(this.getReal() * this.getReal() + this.getImag() * this.getImag()), a);
    double theta = a * Math.atan(this.getImag() / this.getReal());
    this.mod(r * Math.cos(theta), r * Math.sin(theta));
  }
  
  public void disp() {
    System.out.printf("%3.3f + %3.3f i\n", this.getReal(), this.getImag());
  }
  
}
