var canvas = document.querySelector('canvas');
var c = canvas.getContext('2d');
var g = 0.1;
var fac = 0.8;
var radius = 20;
var color = "#0000ff";
var x = 50;
var y = 50;
var vx = 2;
var vy = 0;

window.onload = init;
function init(){
    setInterval(update, 1000/600);
};
function update(){
    vy += g;
    x += vx;
    y += vy;
    if(y > canvas.height - radius){
        y = canvas.height - radius;
        vy *= -fac;
    }
    if(x > canvas.width + radius){
        x = -radius;
    }
    drawBall();
};
function drawBall(){
    with(c){
        clearRect(0, 0, canvas.width, canvas.height);
        fillStyle = color;
        beginPath();
        arc(x, y, radius, 0, 2*Math.PI, true);
        closePath();
        fill();
    }
}