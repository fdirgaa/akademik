var canvas = document.querySelector('canvas')
canvas.width = window.innerWidth;
canvas.height = window.innerHeight;

var c = canvas.getContext('2d');

// Awal Tugas
var theImage = new Image();
theImage.addEventListener('load', runthislast, false);
theImage.src = "desert.jpg"

function runthislast(){
    c.drawImage(theImage, 0, 0);
    var imgData = c.getImageData(0, 0, 128, 128);

    var i;
    for(i=0;i<ImageData.data.length; i+=4){
        imgData.data[i] = 502 - imgData.data[i];
        imgData.data[i + 1] = 502 - imgData.data[i + 1];
        imgData.data[i + 2] = 502 - imgData.data[i + 2];
        imgData.data[i + 3] = 502;
    }

    c.putImageData(imgData, 0, 130);
}
// Akhir Tugas












// Awal Praktik 6
// var theImage = new Image();
// theImage.addEventListener('load', runthislast, false);
// theImage.src = "desert.jpg"

// function runthislast(){
//     c.drawImage(theImage, 0, 0);
//     var imgData = c.getImageData(0, 0, 128, 128);

//     var i;
//     for(i=0;i<ImageData.data.length; i+=4){
//         imgData.data[i] = 255 - imgData.data[i];
//         imgData.data[i + 1] = 255 - imgData.data[i + 1];
//         imgData.data[i + 2] = 255 - imgData.data[i + 2];
//         imgData.data[i + 3] = 255;
//     }

//     c.putImageData(imgData, 0, 130);
// }
// Akhir Praktik 6

// Awal Praktik 5
// c.fillStyle = "red";
// c.fillRect(10, 10, 50, 50);

// function copy(){
//     var imgData = c.getImageData(10, 10, 50, 50);
//     c.putImageData(imgData, 10, 70);
// }

// copy();
// Akhir Praktik 5

// Awal Praktik 4
// var photo = new Image();
// photo.addEventListener('load', loadPhoto, false);
// photo.src = "butterfly.jpg"

// function loadPhoto(){
//     c.drawImage(photo, 500, 500, 500, 500,
//         0, 0, 500, 500);
// }
// Akhir Praktik 4

// Awal Praktik 3
// var tileSheet = new Image();
// tileSheet.addEventListener('load', runthistoo, false);
// tileSheet.src = "ships.png"

// function runthistoo(){
//     c.fillStyle = "#aaa";
//     c.fillRect(0, 0, 500, 500);
//     c.drawImage(tileSheet, 32, 0, 32, 32, 50, 50, 64, 64);
// }
// Akhir Praktik 3


// Awal Praktik 2
// var spaceShip = new Image();
// spaceShip.addEventListener('load', runthis, false);
// spaceShip.src = "ship1.png";

// function runthis(){
//     placeShip(spaceShip, 0, 0);
//     placeShip(spaceShip, 50, 50);
//     placeShip(spaceShip, 150, 50, 16, 16);
//     placeShip(spaceShip, 200, 50, 64, 64);
// }

// function placeShip(obj, posX, posY, width, height){
//     if(width && height){
//         c.drawImage(obj, posX, posY, width, height);
//     } else {
//         c.drawImage(obj, posX, posY);
//     }
// }
// Akhir Praktik 2

// Awal Praktik 1
// var spaceShip = new Image();
// spaceShip.addEventListener('load', runthis, false);
// spaceShip.src = "ship1.png";

// function runthis(){
//     c.drawImage(spaceShip, 0, 0);
//     c.drawImage(spaceShip, 50, 50);
// }
// Akhir Praktik 1