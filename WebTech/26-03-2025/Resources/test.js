// console.log("first")
// document.write("hyy");

// const demo = (x)=>x+10; // Function Expression // return x+10 (x)-parameter // If there is only one parametetr there is not required to write parameter
// console.log(demo(10));

// //  Arrow function specially designed for callback function
// console.log("Named Function and Arrow Function as call back")
// function hoc(a,b,task){
// const result = task(a,b)
// console.log(result)
// }
// hoc(10,20,(x,y)=>x+y)
// hoc(10,2,(x,y)=>x-y)
// hoc(10,3,(x,y)=>x*y)
// console.log("Arrow Function as hoc and Arrow Function as call back")

// const demo1 = (a,b,task)=>{ 
// const result = task(a,b);
// console.log(result)
// }

// demo1(10,20,(x,y)=>x+y)
// demo1(10,20,(x,y)=>x-y)
// demo1(10,20,(x,y)=>x*y)
// // Next Movie

// function parent(x){
//     function child(){
//         function grandchild(){
//             console.log("g-child")
//         }
//         console.log("Child ")
//         return grandchild
//     }
//     console.log("Parent ")
//     return child
// }
// parent()()() 

// function parent1(x){
//     function child1(y){
//         function g_child1(z){
//             console.log("Grand child 1  "  + z)
//         }
//         console.log("Child 1  " + y)
//         return g_child1

//     }

//     console.log("Parent 1  " + x)
//     return child1
// }
// parent1(10)(12)(12)

// // parent need to return the child function
// // Firebase Database

// //function inside function
// // each parent returning the child 

// // hacker rank, geek for geek, leet code

// // const  
// // to upper case - 
// const str = "    "


// const str = "radha"
// console.log(str.toUpperCase())

// console.log(str.toLowerCase())




// const str2 = "Abinash, Abinash, Abinash"
// const str = "krishna krishna"
// console.log(str.replaceAll("krishna","radhe"))

// console.log(str2.replace("Abinash", "Abinasi"))
// console.log(str2.replaceAll("Abinash", "Abinasi"))
// console.log(str2)

const mobile = "6500"
console.log(mobile.padStart("aa","*"))
console.log(mobile.padStart(0.3,"*"))
console.log(mobile.padStart("8","*"))

// const num = "1234"
// console.log(mobile.padEnd(10,"*")+num)
// console.log(mobile + num.padStart(6,"*"))


// console.log(str.startsWith("s"))
// console.log(str.endsWith("u"))
// // It accepts two parameter

// console.log(str.startsWith("u", 1))
// console.log(str.charAt(0))
// console.log(str.charAt(1))
// console.log(str.charAt(2))
// console.log(str.charAt(3))
// console.log(str.charAt(4))
// console.log(str.charAt(5))
// console.log(str.charAt(6))
// console.log(str.charAt(7))
// console.log(str.indexOf("w"))
// console.log(str.indexOf("s")) 



// includes
//  repeat
// console.log(str.repeat(100))
// console.log(str.substring(0,3))
// char code at 
// a-97 A - 65
// String from char code 
// nested sub string
// trim  - omit the space
// trim start, trim end
// concat
//comparision === with trim
// 20 
// String into Array