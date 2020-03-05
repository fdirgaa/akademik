var canvas = document.querySelector('canvas')
canvas.width = window.innerWidth;
canvas.height = window.innerHeight;

var c = canvas.getContext('2d');
// c.fillStyle = "black";
// c.fillRect(20,20,25,25);

// c.setTransform(1,0,0,1,0,0);
// var nilaiSudut = 45 * Math.PI / 180;
// c.rotate(nilaiSudut);
// c.fillStyle = "red";
// c.fillRect(100,100,50,50);

// c.rotate(20 * Math.PI / 180);
// c.fillStyle = "blue";
// c.fillRect(50,20,100,100);


// Kedua
c.setTransform(1,0,0,1,0,0);
var nilaiSudut = 45 * Math.PI / 180;
var x = 50;
var y = 100;
var width = 40;
var height = 40;
c.translate(x+.5*width, y+.5*height);
c.rotate(nilaiSudut);
c.fillStyle = "red";
c.fillRect(-.5*width,-.5*height , width, height);
c.setTransform(1,0,0,1,0,0);
var nilaiSudut = 75 * Math.PI / 180;
var x = 100;
var y = 100;
var width = 40;
var height = 40;
c.translate(x+.5*width, y+.5*height);
c.rotate(nilaiSudut);
c.fillStyle = "red";
c.fillRect(-.5*width,-.5*height , width, height);
c.setTransform(1,0,0,1,0,0);
var nilaiSudut = 90 * Math.PI / 180;
var x = 150;
var y = 100;
var width = 40;
var height = 40;
c.translate(x+.5*width, y+.5*height);
c.rotate(nilaiSudut);
c.fillStyle = "red";
c.fillRect(-.5*width,-.5*height , width, height);
c.setTransform(1,0,0,1,0,0);
var nilaiSudut = 120 * Math.PI / 180;
var x = 200;
var y = 100;
var width = 40;
var height = 40;
c.translate(x+.5*width, y+.5*height);
c.rotate(nilaiSudut);
c.fillStyle = "red";
c.fillRect(-.5*width,-.5*height , width, height);
