// package com.nocial; 
// import java.util.ArrayList;
// import java.util.List;
 
// public class EncryptionTest {
 
//     // Declare static list
//     private static List<Integer> myListOfE = new ArrayList<>();
 
//     public static void main(String[] args) {
//         // Call method to print information
//         printFirstInformation();
 
//         // Create an object for my class FindPrimes
//         FindPrimes primeValue = new FindPrimes();
 
//         // Calls public method to get user input for number of rounds
//         int numberOfRounds = primeValue.getRounds();
 
//         // Assigns prime numbers to p and q from the return of public method
//         int p = primeValue.getPrimeNumber(numberOfRounds);
//         int q = primeValue.getPrimeNumber(numberOfRounds);
 
//         // Assigns n value
//         int n = p * q;
 
//         // Call method to find phi(n)
//         int phiOfN = findPhi(p,q);
 
//         // Call method to find co-primes and save them all into a dynamic-sized list called myListOfE
//         findCoPrimes(phiOfN);
 
//         // Randomly pick one of the co-primes from the list myListOfE as e
//         int e = myListOfE.get(primeValue.findRandomInList(myListOfE.size()));
 
//         // Now we need to find d by finding the modular inverse of e with respect to phi(n)
//         int d = findD(phiOfN,e);
 
//         // Call method to print out current information
//         printFindings(p,q,n,phiOfN,e, d);
 
//         // Print public and private keys
//         printKeys(n, e, d);
 
//         EncryptDecrypt newMessage = new EncryptDecrypt();
//         newMessage.encryptMessage(e,n);
 
//     } // END OF MAIN METHOD
 
//     // Find the decrypting exponent
//     public static int findD(int phiOfN, int randomE) {
//         // d = ((phi(n) * i)  + 1) / e
//         int d = 0;
//         for (int i = 1; i <= phiOfN; i++) {
//             int possibleD = ((phiOfN * i) + 1) % randomE;
//             if (possibleD == 0) {
//                 d = ((phiOfN * i) + 1) / randomE;
//                 break;
//             }
//         }
//         printDividingLine();
//         return d;
//     }
 
//     public static void printFindings(int p, int q, int n, int phiOfN, int randomE, int d) {
//         System.out.println(
//                 "p is " + p + "\t\t q is " + q + "\t\tn is " + n + "\t\t phi(n) is " + phiOfN + "\n"
//                         + "e is " + randomE + "\t\td is " + d
//         );
//     }
 
//     public static void printKeys(int n, int e, int d) {
//         printDividingLine();
//         System.out.println("The pair of numbers (" + n + ", " + e + ") make up the public key."  );
//         System.out.println("The pair of numbers (" + n + ", " + d + ") make up the private key."  );
//         printDividingLine();
//     }
 
//     public static void findCoPrimes(int phiOfN) {
 
//         // find e that is relatively prime to (p-1) * (q-1) and is >= 1 and <= phiOfN
//         // A number is relatively prime to another if those two numbers
//         // don't share any other factors except 1
 
//         // e is the encryption exponent. In other words:
//         // Select an integer e, such that e is co-prime to ϕ(n) and 1 < e < <ϕ(n).
//         // The pair of numbers (n,e)(n,e) makes up the public key.
 
//         // This loop is used to find a list of co-primes to phi(n)
//         // I used a list since I couldn't use an array. Arrays are static size in Java and I needed a dynamic size.
 
//         for (int k = 1; k <= phiOfN; k++) {
//             if (gcd(phiOfN, k) == 1) {
//                 // This print lists all co-primes from 1 to phiOfN
// //                System.out.println("e could be " + k);
//                 myListOfE.add(k);
//             }
//         }
//     }
 
//     public static int findPhi(int p, int q) {
//         // This totient function works when the numbers are prime
//         return (p-1) * (q-1);
//     }
 
//     public static int gcd(int a, int b) {
//        /* Basic Euclidean Algorithm for GCD
//        If we subtract a smaller number from a larger (we reduce a larger number), GCD doesn't change.
//        So if we keep subtracting repeatedly the larger of two, we end up with GCD.
//        Now instead of subtraction, if we divide the smaller number, the algorithm stops when we find remainder 0. */
//         if (a == 0) {
//             return b;
//         }
//         return gcd(b%a, a);
//     }
 
//     public static void printFirstInformation() {
//         //Self explanatory--prints the initial information
//         printDividingLine();
//         System.out.println("""
//                 This program will find the values needed for a basic RSA algorithm\s
//                 calculation. The encryption exponent e will be found by randomly picking\s
//                 a number that is a relative prime to phi(n) and is 1 < e < phi(n).\s
//                 We are finding p and q by generating a list of primes and then choosing \s
//                 a random position from that list."""
//         );
//         printDividingLine();
//     }
 
//     public static void printDividingLine() {
//         System.out.println("===========================================================================");
//     }
// }
 
// RAW Paste Data
// package com.nocial;

// import java.util.ArrayList;
// import java.util.List;

// public class EncryptionTest {

//     // Declare static list
//     private static List<Integer> myListOfE = new ArrayList<>();

//     public static void main(String[] args) {
//         // Call method to print information
//         printFirstInformation();

//         // Create an object for my class FindPrimes
//         FindPrimes primeValue = new FindPrimes();

//         // Calls public method to get user input for number of rounds
//         int numberOfRounds = primeValue.getRounds();

//         // Assigns prime numbers to p and q from the return of public method
//         int p = primeValue.getPrimeNumber(numberOfRounds);
//         int q = primeValue.getPrimeNumber(numberOfRounds);

//         // Assigns n value
//         int n = p * q;

//         // Call method to find phi(n)
//         int phiOfN = findPhi(p,q);

//         // Call method to find co-primes and save them all into a dynamic-sized list called myListOfE
//         findCoPrimes(phiOfN);

//         // Randomly pick one of the co-primes from the list myListOfE as e
//         int e = myListOfE.get(primeValue.findRandomInList(myListOfE.size()));

//         // Now we need to find d by finding the modular inverse of e with respect to phi(n)
//         int d = findD(phiOfN,e);

//         // Call method to print out current information
//         printFindings(p,q,n,phiOfN,e, d);

//         // Print public and private keys
//         printKeys(n, e, d);

//         EncryptDecrypt newMessage = new EncryptDecrypt();
//         newMessage.encryptMessage(e,n);

//     } // END OF MAIN METHOD

//     // Find the decrypting exponent
//     public static int findD(int phiOfN, int randomE) {
//         // d = ((phi(n) * i)  + 1) / e
//         int d = 0;
//         for (int i = 1; i <= phiOfN; i++) {
//             int possibleD = ((phiOfN * i) + 1) % randomE;
//             if (possibleD == 0) {
//                 d = ((phiOfN * i) + 1) / randomE;
//                 break;
//             }
//         }
//         printDividingLine();
//         return d;
//     }

//     public static void printFindings(int p, int q, int n, int phiOfN, int randomE, int d) {
//         System.out.println(
//                 "p is " + p + "\t\t q is " + q + "\t\tn is " + n + "\t\t phi(n) is " + phiOfN + "\n"
//                         + "e is " + randomE + "\t\td is " + d
//         );
//     }

//     public static void printKeys(int n, int e, int d) {
//         printDividingLine();
//         System.out.println("The pair of numbers (" + n + ", " + e + ") make up the public key."  );
//         System.out.println("The pair of numbers (" + n + ", " + d + ") make up the private key."  );
//         printDividingLine();
//     }

//     public static void findCoPrimes(int phiOfN) {

//         // find e that is relatively prime to (p-1) * (q-1) and is >= 1 and <= phiOfN
//         // A number is relatively prime to another if those two numbers
//         // don't share any other factors except 1

//         // e is the encryption exponent. In other words:
//         // Select an integer e, such that e is co-prime to ϕ(n) and 1 < e < <ϕ(n).
//         // The pair of numbers (n,e)(n,e) makes up the public key.

//         // This loop is used to find a list of co-primes to phi(n)
//         // I used a list since I couldn't use an array. Arrays are static size in Java and I needed a dynamic size.

//         for (int k = 1; k <= phiOfN; k++) {
//             if (gcd(phiOfN, k) == 1) {
//                 // This print lists all co-primes from 1 to phiOfN
// //                System.out.println("e could be " + k);
//                 myListOfE.add(k);
//             }
//         }
//     }

//     public static int findPhi(int p, int q) {
//         // This totient function works when the numbers are prime
//         return (p-1) * (q-1);
//     }

//     public static int gcd(int a, int b) {
//        /* Basic Euclidean Algorithm for GCD
//        If we subtract a smaller number from a larger (we reduce a larger number), GCD doesn't change.
//        So if we keep subtracting repeatedly the larger of two, we end up with GCD.
//        Now instead of subtraction, if we divide the smaller number, the algorithm stops when we find remainder 0. */
//         if (a == 0) {
//             return b;
//         }
//         return gcd(b%a, a);
//     }

//     public static void printFirstInformation() {
//         //Self explanatory--prints the initial information
//         printDividingLine();
//         System.out.println("""
//                 This program will find the values needed for a basic RSA algorithm\s
//                 calculation. The encryption exponent e will be found by randomly picking\s
//                 a number that is a relative prime to phi(n) and is 1 < e < phi(n).\s
//                 We are finding p and q by generating a list of primes and then choosing \s
//                 a random position from that list."""
//         );
//         printDividingLine();
//     }

//     public static void printDividingLine() {
//         System.out.println("===========================================================================");
//     }
// }
