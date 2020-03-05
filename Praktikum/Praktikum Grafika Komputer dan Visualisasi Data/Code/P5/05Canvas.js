var canvas = document.querySelector('canvas');
var c = canvas.getContext("2d");
window.addEventListener('load', eventWindowLoaded, false);

function eventWindowLoaded() {
    drawScreen();
}

function drawScreen() {
    c.fillStyle = '#EEEEEE';
    c.fillRect(0, 0, canvas.width, canvas.height);
    c.strokeStyle = '#000000';
    c.strokeRect(1, 1, canvas.width - 2, canvas.height - 2);
    c.fillStyle = "#000000";
    var ball;
    for (var i = 0; i < balls.length; i++) {
        ball = balls[i];
        ball.x += ball.xunits;
        ball.y += ball.yunits;
        c.beginPath();
        c.arc(ball.x, ball.y, ball.radius, 0, Math.PI * 2, true);
        c.closePath();
        c.fill();
        if (ball.x > canvas.width || ball.x < 0) {
            ball.sudut = 180 - ball.sudut;
            updateBall(ball);
        } else if (ball.y > canvas.height || ball.y < 0) {
            ball.sudut = 360 - ball.sudut;
            updateBall(ball);
        }
    }
}

function updateBall(ball) {
    ball.rad = ball.sudut * Math.PI / 180;
    ball.xunits = Math.cos(ball.rad) * ball.speed;
    ball.yunits = Math.sin(ball.rad) * ball.speed;
}

var numBalls = 100;
var maxSize = 8;
var minSize = 5;
var maxSpeed = maxSize + 5;
var balls = new Array();
var tempBall;
var tempX;
var tempY;
var tempSpeed;
var tempsudut;
var tempRadius;
var temprad;
var tempXunits;
var tempYunits;
for (var i = 0; i < numBalls; i++) {
    tempRadius = Math.floor(Math.random() * maxSize) + minSize;
    tempX = tempRadius * 2 + (Math.floor(Math.random() * canvas.width) - tempRadius * 2);
    tempY = tempRadius * 2 + (Math.floor(Math.random() * canvas.height) - tempRadius * 2);
    tempSpeed = maxSpeed - tempRadius;
    tempsudut = Math.floor(Math.random() * 360);
    temprad = tempsudut * Math.PI / 180;
    tempXunits = Math.cos(temprad) * tempSpeed;
    tempYunits = Math.sin(temprad) * tempSpeed;
    tempBall = {
        x: tempX,
        y: tempY,
        radius: tempRadius,
        speed: tempSpeed,
        sudut: tempsudut,
        xunits: tempXunits,
        yunits: tempYunits
    }
    balls.push(tempBall);
}

function gameLoop() {
    window.setTimeout(gameLoop, 20);
    drawScreen()
}
gameLoop();
