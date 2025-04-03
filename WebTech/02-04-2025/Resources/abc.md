<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <!-- <script defer src="./dom.js"></script> -->
    <style>
       .container{
        width: 100%;
        height: auto
        display: flex;
        flex-wrap: wrap;
        gap: 30px;
        justify-content: space-around;
       }
        .card{
            width: 300px;
            height: 350px;
            background-color: #efefef;
            border-radius: 10px;
            box-shadow: 0px 0px 15px -5px rgb(70, 69, 69);
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: space-evenly;
            padding-top: 10px;
        }
        .card>.image{
            width: 50%;
            height: 40%;
            border-radius: 50%;
            display: flex;
            align-items: center;
            justify-content: center;
            font-size: xx-large;
            color: white;
            font-weight: bolder;
            background-color: gray;
        }
        .card>.btn{
            width: 10%;
            height: 20%;
            display: flex;
            align-items: center;
            justify-content: space-around;
        }
        .card>.btn>button{
            padding: 6px 15px;
            border-radius: 5px;
            border: none;
            cursor: pointer;
        }
        .card>.btn>button:nth-child(1){
            background-color: green;
            color: white;
        }
        .card>.btn>button:nth-child(2){
            background-color: red;
            color: white;
        }
    </style>
</head>
<body>
<!--  
    <p class="para">paragraph 1</p>
    <p class="para">paragraph 2</p>
    <p class="para">paragraph 3</p>

    <ul>
        <li>list 1</li>
        <li>list 2</li>
        <li>list 3</li>
        <li>list 4</li>
    </ul>
    <h2 id="sundari">heading 2</h2>
    <h1 id="sundari">DOM</h1> -->

<!-- 
    <h1 id="demo">Actual html text</h1>
    <div class="box"></div> -->
    <!-- <ul class="list"></ul> -->

     <div class="container"></div>

<script>
    const container=document.querySelector(".container")
for(let i=1;i<=30;i++){
    const card=document.createElement("div")
    card.setAttribute("class","card")
    console.log(card)
    const insidecard=`<div class="image">${i}</div>
    <h2>UserName</h2>
    <p>Email</p>
    <div class="btn">
        <button>Update</button>
        <button>Delete</button>
    </div>`
    card.innerHTML=insidecard
    
    container.append(card)
}
</script>
</body>
</html>