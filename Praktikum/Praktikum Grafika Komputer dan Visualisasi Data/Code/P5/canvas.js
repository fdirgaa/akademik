var canvas = document.querySelector('canvas')
var c = canvas.getContext('2d');
function drawScreen(){
    c.fillStyle = '#EEEEEE';
    c.fillRect(0, 0, canvas.width, canvas.height);
    c.strokeStyle = '#000000';
    c.strokeRect(1, 1, canvas.width - 2, canvas.height - 2);
    ball.x += xunits;
    ball.y += yunits;
    c.fillStyle = "#000000";
    c.beginPath();
    c.arc(ball.x, ball.y, 15, 0, Math.PI * 2, true);
    c.closePath();
    c.fill();
    if(ball.x > canvas.width -15 || ball.x - 15 < 0){
        sudut = 180 - sudut;
        updateBall();
    } 
    else if(ball.y > canvas.height - 15 || ball.y - 15 < 0){
        sudut = 360 - sudut;
        updateBall();
    }
}
function updateBall(){
    rad = sudut * Math.PI / 180;
    xunits = Math.cos(rad) * speed;
    yunits = Math.sin(rad) * speed;
}
var speed = 5;
var p1 = {x: 20, y: 20};
var sudut = 54;
var rad = 0;
var xunits = 0;
var yunits = 0;
var ball = {x: p1.x, y: p1.y};
updateBall();
function gameLoop(){
    window.setTimeout(gameLoop, 20);
    drawScreen();
}
gameLoop();
















// window.addEventListener('load', eventWindowLoaded, false);
// function eventWindowLoaded(){
//     drawScreen();
// }
// function drawScreen(){
//     c.fillStyle = '#EEEEEE';
//     c.fillRect(0, 0, canvas.width, canvas.height);

//     c.strokeStyle = '#000000';
//     c.strokeRect(1, 1, canvas.width - 2, canvas.height - 2);

//     x += speed;
//     c.fillStyle = "#6ff40d";
//     c.beginPath();
//     c.arc(x, y, 15, 0, Math.PI * 2, true);
//     c.closePath();
//     c.fill();
// }

// var speed = 1;
// var y = 250;
// var x = 250;
// function gameLoop(){
//     window.setTimeout(gameLoop, 20);
//     drawScreen();
// }
// gameLoop();