// Canvas 1
var GKChart = document.getElementById('Canvas1').getContext('2d');

var barTotalMahasiswa = [1000, 1530, 900, 999, 1900, 2450];
var lineJurTI = [700, 160, 790, 535, 1400];
var lineJurSI = [300, 870, 110, 464, 1050];
var labels = ["2016", "2017", "2018", "2019", "2020"];

var myChart = new Chart(GKChart, {
    type: 'bar',              
    data: {
        labels: labels, 
        datasets:[{
            label: 'Mahasiswa',
            data: barTotalMahasiswa,
            backgroundColor: [
                'rgba(255, 99, 132, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
                'rgba(75, 192, 192, 0.2)',
                'rgba(153, 102, 255, 0.2)'
            ],
            borderWidth:1},{
            label: 'Jurusan TI',
            data: lineJurTI,
            backgroundColor: '#f443368c',
            borderColor: '#f443368c',

            borderWidth: 1,
            type: 'line',
            fill: false
        },{
            label: 'Jurusan SI',
            data: lineJurSI,
            backgroundColor: '#2196f38c',
            borderColor: '#2196f38c',

            borderWidth: 1,
            type: 'line',
            fill: false
        }]
    },
});


//Canvas 2
var GKChart = document.getElementById('Canvas2').getContext('2d');
var dataChart = new Chart(GKChart, {
    type: 'line',
    data: {
        labels: ["Facebook", "YouTube", "Instagram", "Twitter", "LinkedIn", "Udemy", "Pinterest"],
        datasets: [{
            label: 'Mobile Device',
            fill: true,
            lineTension: 0.2,
            showLine: true,
            borderDash:[0],
            borderDashOffset: 0.0,
            pointBorderColor: 'rgba(75, 70, 200, 1)',
            pointBackgroundColor: 'rbga(100, 200, 10, 1)',
            pointBorderWidth: 1,
            pointHoverRadius: 10,
            pointRadius: 4,
            pointHoverBackgroundColor: 'rgba(100, 20, 200, 1)',
            pointHoverBorderColor: 'rgba(100, 100, 20, 1)',
            pointHoverBorderWidth: 'rgba(200, 100, 200, 1)',
            data: [140000, 200199, 115000, 124040, 194544, 194111, 104000],
            backgroundColor: 'rgba(255, 99, 132, 0.5)',
            borderColor: 'rgba(255, 99, 132, 1)',
            borderWidth: 1,
            borderCapStyle: 'butt',
        },
        {
            label: 'Desktop',
            data: [100000, 240000, 59545, 217588, 208399, 124000, 214170],
            backgroundColor: 'rgba(7, 83, 255, .5)',
            borderColor: 'rgba(7, 83, 255, 1)',
            borderWidth: 1
        }]
    }
});


// Canvas 3
var GKChart = document.getElementById('Canvas3').getContext('2d');

var barTtlMhs = [1000, 1530, 900, 999, 1900, 450];
var lineTI = [700, 160, 790, 535, 1400];
var lineSI = [300, 870, 110, 464, 1050];
var labels = ["2016", "2017", "2018", "2019", "2020"];

function changeData(bar, ln1, ln2){
    var myChart = new Chart(GKChart, {
        type: 'bar',
        data: {
            labels: labels, 
            datasets:[{
                label: 'Mahasiswa',
                data: bar,
                backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(54, 162, 235, 0.2)',
                    'rgba(255, 206, 86, 0.2)',
                    'rgba(75, 192, 192, 0.2)',
                    'rgba(153, 102, 255, 0.2)'
                ],
                borderWidth:1},{
                label: 'Jurusan TI',
                data: ln1,
                backgroundColor: '#f443368c',
                borderColor: '#f443368c',
                
                borderWidth: 1,
                type: 'line',
                fill: false
            },{
                label: 'Jurusan SI',
                data: ln2,
                backgroundColor: '#2196f38c',
                borderColor: '#2196f38c',
                
                borderWidth: 1,
                type: 'line',
                fill: false
            }]
        },
    });
}
changeData(barTtlMhs, lineTI, lineSI);
function data1(){
    barTtlMhs = [1000, 1530, 900, 999, 1900, 450];
    lineTI = [700, 160, 790, 535, 1400];
    lineSI = [300, 870, 110, 464, 1050];
    changeData(barTtlMhs, lineTI, lineSI);
}
function data2(){
    barTtlMhs = [1234, 1530, 1289, 345, 1900, 1900];
    lineTI = [333, 160, 34, 135, 111];
    lineSI = [435, 65, 677, 100, 345];
    changeData(barTtlMhs, lineTI, lineSI);
}
function data3(){
    barTtlMhs = [904, 452, 844, 1223, 2312, 900];
    lineTI = [333, 160, 312, 122, 111];
    lineSI = [435, 65, 127, 344, 645];
    changeData(barTtlMhs, lineTI, lineSI);
}

