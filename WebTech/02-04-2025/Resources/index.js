// console.log("first")
// const demo = document.querySelector("#demo")
// console.log(demo)

// demo.innerText = "HEay" // updation
// demo.style.color = "red" // updation
// demo.style.backgroundColor = "black" // updation 


// target the element
// add the properties
//    if css - style
// if text - inner text
//  appendCHild()
// createElement() //! to create an element
// parentElement.appndChild(childElement)

// dynamic creation of the table.
// const demo = document.querySelector("#demo") // target the element
// for(let i=0;i<=5;i++){ // 5 time createElement()
//     const h1 = document.createElement("h1")
//     h1.innerText = "Hello"
//     h1.style.backgroundColor = "red"  
//     demo.appendChild(h1)  
//     console.log(demo)
// }
// console.log(demo)

// const print = document.getElementsByClassName("print")
// const usernumber = Number(prompt("enter the number"))
// for(let i=0;i<=usernumber;i++){
// const li =document.createElement(li)
// li.innerText = `He He ${i}`
// print.appendChild(li)
// }

const container = document.querySelector(".container")
console.log(container)
const h1 = document.createElement("h1")
h1.innerText= "heading 1"
const h2 = document.createElement("h2")
h2.innerText= "heading 2"
const h3 = document.createElement("h3")
h3.innerText= "heading 3"
const h4 = document.createElement("h4")
h4.innerText= "heading 4"

container.appendChild(h1) //one child at a chil
container.appendChild(h2)
container.appendChild(h3)



container.append(h1,h2,h3,h4)

// only one element 

// createElement("element_name")
// appendChild(element)
// append(element1, element2)
// setAttribute("attribute_name","value1 value2")
// getAttribute("attribute_name")
// removeAttribute(element)
// classList()
// classList() is possible without setAttribute()
// innerText innerHtml

