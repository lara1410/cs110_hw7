//A function that takes at least three arguments and returns the result of some set of operations using those arguments //
const propDis = function(a, b, c){
  return a * (b + c);
};
const result = propDis(2, 5, 6);
console.log(result);
//A function that takes no arguments and returns something//
const empty = function(){
  return 1;
};
const emp = empty();
console.log(emp);
//A function that takes arguments, does something but does not return anything//
const mult = function(a, b){
  console.log(a * b);
};
mult(5, 6);
//A function called fullName that takes as argument first name and last name and returns the full name of the person//
const fullName = function(fName, lName){
  return fName + " " + lName;
};
 const Name = fullName("Joe", "Jonas");
 console.log(Name);
//A function that takes three strings and returns the string that is the longest//
const string =function(s1, s2, s3){
  const a = s1.length;
  const b = s2.length;
  const c = s3.length;
  return Math.max(a, b, c);
};
const str = string("hi","yay","that");
console.log(str);
//A function that takes two numbers and returns 0 if they are equal, 1 if the first is larger and -1 if the second is larger //
const la = function(num1, num2){
  if(num1 === num2){
    return 0;
  } else if(num1 > num2){
    return 1;
  } else {
    return -1;
  }
};
const res = la(4,5);
console.log(res);
//A function that takes three inputs and returns the first truethy value//
const truthy = function(d, e, f){
  return d || e || f;
};
const val = truthy("",NaN,5);
console.log(val);
