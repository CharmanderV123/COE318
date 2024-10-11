
/**
* ComplexNumber models a complex number expressed
* in rectangular form (real and imaginary parts).
ComplexNumber
Page 2 of 5
* It is an <em>immutable</em> object.
*
* @author Your Name
*/
public class ComplexNumber {
//Instance variable declarations
/**
* Construct a ComplexNumber given its
* real and imaginary parts.
* @param re The real component
* @param im The imaginary component
*/

double real_num;
double imaginary_num;

public ComplexNumber(double re, double im) {
//Initialize the instance variables
real_num = re;
imaginary_num = im;
}
/**
* Returns the real component.
* @return the real
*/
public double getReal() {
return real_num; //A stub: to be fixed
}
/**
* Returns the imaginary component.
* @return the imaginary
*/
public double getImaginary() {
return imaginary_num; //A stub: to be fixed
}
/**
* Returns a new ComplexNumber number that is
* the negative of <em>this</em>. Note: the
* original ComplexNumber is <b>NOT</b>
* modified.
* @return -this
*/
public ComplexNumber negate() {
return new ComplexNumber(-real_num, -imaginary_num); //A stub: to be fixed
}
/**
* Returns a new ComplexNumber that is the
* sum of <em>this</em> and <em>z</em>.
* Note: the original ComplexNumber is
* <b>NOT</b> modified.
* @param z
* @return this + z
*/
public ComplexNumber add(ComplexNumber z) {
return new ComplexNumber((real_num + z.real_num),(imaginary_num + z.imaginary_num)); //A stub: to be fixed
}
/**
* Returns a new ComplexNumber that is the
* difference of <em>this</em> and <em>z</em>.
ComplexNumber
Page 3 of 5
* Note: the original ComplexNumber is
* <b>NOT</b> modified.
* @param z
* @return this + z
*/
public ComplexNumber subtract(ComplexNumber z) {
return new ComplexNumber((real_num - z.real_num),(imaginary_num - z.imaginary_num)); //A stub: to be fixed
}
/**
* Returns a new ComplexNumber that is the
* product of <em>this</em> and <em>z</em>.
* Note: the original ComplexNumber is
* <b>NOT</b> modified.
* @param z
* @return this * z
*/
public ComplexNumber multiply(ComplexNumber z) {
return new ComplexNumber(real_num*z.real_num-imaginary_num*z.imaginary_num, real_num*z.imaginary_num+imaginary_num*z.real_num); //A stub: to be fixed
}
/**
* Returns a new ComplexNumber that is
* the reciprocal of <em>this</em>.
* Note: the original ComplexNumber is
* <b>NOT</b> modified.
* @return 1.0 / this
*/
public ComplexNumber reciprocal() {
return new ComplexNumber(real_num/(real_num*real_num + imaginary_num*imaginary_num), -imaginary_num/(real_num*real_num + imaginary_num*imaginary_num)); //A stub: to be fixed
}
/**
* Returns a new ComplexNumber that is
* <em>this</em> divided by <em>z</em>.
* Note: the original ComplexNumber is
* <b>NOT</b> modified.
* @param z
* @return this / z
*/
public ComplexNumber divide(ComplexNumber z) {
return new ComplexNumber((real_num*z.real_num)/((z.real_num*z.real_num + z.imaginary_num*z.imaginary_num)), (imaginary_num*z.real_num)/(z.real_num*z.real_num + z.imaginary_num*z.imaginary_num)); //A stub: to be fixed
}
/**
* Returns a String representation of
* <em>this</em> in the format:
* <pre>
* real +-(optional) i imaginary
* </pre>
* If the imaginary part is zero, only the
* real part is converted to a String.
* A "+" or "-" is placed between the real
* and imaginary parts depending on the
* the sign of the imagrinary part.
* <p>
* Examples:
* <pre>
* ..println(new ComplexNumber(0,0); -> "0.0"
ComplexNumber
Page 4 of 5
* ..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
* ..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
* </pre>
* @return the String representation.
*/
@Override
public String toString() {
//DO NOT MODIFY THIS CODE!
String str = "" + this.getReal();
if (this.getImaginary() == 0.0) {
return str;
}
if (this.getImaginary() > 0) {
return str + " + i" + this.getImaginary();
} else {
return str + " - i" + -this.getImaginary();
}
}
}