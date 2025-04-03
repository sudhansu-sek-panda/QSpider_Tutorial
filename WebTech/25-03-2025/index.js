// console.log(x) 
// let x=10; 

// console.log("Hello!")

// for(let i = 10;i>0;i--){
//     console.log("iteration  " + i)
// }
// 1947 - 
// 1950 - 
// demo()
// GEC - Global Execution Context
// callstack
// 1- First time - Declaration
// 2 - Initialization and Execution
// TDZ - Temporal Dead Zone
// THe ZOne between Declaration and Initialization is known as TDZ\// Hoisting is there but by the engine
// 
// 

// types of functions
// HOC - Accepting another function as an argument in a function

// function demo(x){
// console.log(x)
// }
// demo(10)

// demo(child(y))
// function demo(x){ // High order function
//     x()
// }
// function child(y){ // call back function
//  console.log(y)
// }

// Functions
// ````````````````````
// Named FUnction
// function QSpider(){
//     console.log("Named function QSpider "+" Learning Java and Python")
// }
// QSpider()
// Anonymous FUnction
// function (){
//     console.log("Anpnymous FUnction"+" ")
// }
// Function Expression
// let fn = function (){ // Anonymus function as function expression
//     console.log("Function Expression")
// }
// console.log(fn()) //WHat is the purpose of it
// fn() 


let fn1 = function demo(){ // Anonymus function as function expression
    console.log("named Function Demo as function expression")
}
console.log(fn1()) //WHat is the purpose of it //not returning 
fn1() 
demo()
function demo1(){ // Anonymus function as function expression
    console.log("named Function Demo as function expression")
}
let fne = demo1;
fne()
demo1()
// IIFE - Imediate Invoke Function Expression
// Arrow Function
// High Order Function
// Callback function




+""