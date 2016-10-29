/*
  1. add()
  2. subtract()
  3. multiply()
  4. divide()
*/

// function add(firstNum, secondNum) {
//   return firstNum + secondNum
// }
//
// function subtract(firstNum, secondNum) {
//   return firstNum - secondNum
// }
//
// function multiply(firstNum, secondNum) {
//   return firstNum * secondNum
// }
//
// function divide(firstNum, secondNum) {
//   return firstNum / secondNum
// }

// prototype inheritance

var Calculator = function(num1, num2) {
  this.num1 = num1;
  this.num2 = num2;
}

Calculator.prototype.add = function () {
  return this.num1 + this.num2
};

Calculator.prototype.subtract = function () {
  return this.num1 - this.num2
};

Calculator.prototype.multiply = function () {
  return this.num1 * this.num2
};

Calculator.prototype.divide = function () {
  return this.num1 / this.num2
};

var testCalc = new Calculator(3, 2);
console.log(testCalc.add());
console.log(testCalc.subtract());
console.log(testCalc.multiply());
console.log(testCalc.divide());
