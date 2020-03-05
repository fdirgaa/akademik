var canvas = document.querySelector('canvas')
canvas.width = window.innerWidth;
canvas.height = window.innerHeight;

var c = canvas.getContext('2d');
// c.strokeStyle = "red";
// c.moveTo(150,20);
// c.lineTo(150,170);
// c.stroke();

// c.strokeStyle = "black";
// c.lineWidth = 10;
// c.lineJoin = 'bevel';
// c.lineCap = 'round';
// c.beginPath();
// c.moveTo(0,0);
// c.lineTo(25,0);
// c.beginPath();
// c.moveTo(0,0);
// c.lineTo(25,0);
// c.lineTo(25,25);
// c.stroke();
// c.closePath();

// c.beginPath();
// c.moveTo(10,50);
// c.lineTo(35,50);
// c.lineTo(35,75);
// c.stroke();
// c.closePath();

// c.lineJoin = 'round';
// c.lineCap = 'butt';
// c.beginPath();
// c.moveTo(10,100);
// c.lineTo(35,100);
// c.lineTo(35,125);
// c.stroke();
// c.closePath();

// c.lineWidth = 2;
// c.beginPath();
// c.moveTo(150,0);
// c.bezierCurveTo(0,125,300,175,150,300);
// c.stroke();

// Tugas
c.strokeStyle = "black";
c.lineWidth = 1;
c.beginPath();
c.moveTo(150,0);
c.bezierCurveTo(0,125,300,175,150,300);
c.stroke();
c.lineWidth = 1;
c.beginPath();
c.moveTo(150,0);
c.bezierCurveTo(300,100,0,200,150,300);
c.stroke();









// var c = canvas.getContext('2d');
// c.fillStyle='#102bff';
// c.fillRect(100,100,100,100);
// c.fillRect(400,100,100,100);
// c.fillStyle='#ff10b5';
// c.fillRect(250,300,100,100);

// var i = canvas.getContext('2d');
// i.fillStyle = '#40ff30';
// i.strokeStyle = '#0000ff';
// i.fillRect(10,10,30,30);
// i.strokeRect(20,20,70,80);
// i.fillStyle = '#000';
// i.fillText("FERDI DIRGANTARA",20,50,400);

// var context = canvas.getContext('2d');
// context.fillStyle = '#000';
// context.strokeStyle = '#ff00ff';
// context.lineWidth = 2;
// context.fillRect(280,210,40,40);
// context.strokeRect(270,200,60,60);
// context.clearRect(20,20,20,20);
