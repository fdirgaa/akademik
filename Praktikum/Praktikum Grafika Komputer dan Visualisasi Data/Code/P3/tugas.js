var canvas = document.querySelector('canvas')
canvas.width = window.innerWidth;
canvas.height = window.innerHeight;

var c = canvas.getContext('2d');
var d = canvas.getContext('2d');

// Gradient Vertical
// var hr = c.createLinearGradient(0,0,100,0);
// hr.addColorStop(0,'rgb(255,0,0)');
// hr.addColorStop(.5,'rgb(0,255,0)');
// hr.addColorStop(1,'rgb(0,0,255)');
// c.fillStyle = hr;
// c.fillRect(0,0,100,100);

// // Gradient Horizontal
// var vr = d.createLinearGradient(0,0,0,100);
// vr.addColorStop(0,'rgb(255,0,0)');
// vr.addColorStop(.5,'rgb(0,255,0)');
// vr.addColorStop(1,'rgb(0,0,255)');
// d.fillStyle = vr;
// d.fillRect(100,0,100,100);

// var gr = c.createLinearGradient(0,0,100,100);
// gr.addColorStop(0,'rgb(255,0,0)');
// gr.addColorStop(.5,'rgb(0,255,0)');
// gr.addColorStop(1,'rgb(0,0,255)');
// c.fillStyle = gr;
// c.fillRect(0,0,100,100);

var gr = c.createRadialGradient(50,50,25,50,50,100)
gr.addColorStop(0,'rgb(20,20,90)');
gr.addColorStop(.5,'rgb(50,255,100)');
gr.addColorStop(1,'rgb(120,20,255)');
c.fillStyle = gr;
c.fillRect(0,0,200,200);