var canvas = document.querySelector('canvas');
var c = canvas.getContext('2d');


var x = 10;
var y = 10;
var rad = 10;
var isClicked = false;
var warna = 'black';

function gantibiru() {
    warna = 'blue';
}

function gantimerah() {
    warna = 'red';
}

function gantihijau() {
    warna = 'green';
}

function hapus() {
    warna = 'white';

}

function hitam() {
    warna = 'black';
}


function drawArc(x, y, radius) {
    c.beginPath();
    c.arc(x, y, radius, 0, Math.PI * 2);
    c.closePath();
    c.fillStyle = warna;
    c.fill();
}

function bersihkan() {
    c.clearRect(0, 0, 500, 500);
}

document.onmousedown = function (event) {
    isClicked = true;

    if (event.target.nodeName.toLowerCase() === 'button') {
        //c.clearRect(0, 0, 500, 500) 
    }
}

document.onmouseup = function () {
    isClicked = false;
}

canvas.onmousemove = function (event) {

    x = event.clientX;
    y = event.clientY;
    if (isClicked) {
        drawArc(x, y, rad);
    } else {
        return false;
    }
};
