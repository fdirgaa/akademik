var GKChart = document.getElementById('Canvasnya').getContext('2d');
var dataChart = new Chart(GKChart, {
    type: 'line',
    data: {
        labels: ["P01", "P02", "P03", "P04", "P05", "P06", "P07", "P08", "P09", "P10"],
        datasets: [{
            label: 'Series 1',
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
            data: [500, 50, 2424, 4040, 14141, 4111, 4544, 47, 5555, 6811],
            backgroundColor: 'rgba(255, 99, 132, 0.5)',
            borderColor: 'rgba(255, 99, 132, 1)',
            borderWidth: 1,
            borderCapStyle: 'butt',
        },
        {
            label: 'Series 2',
            data: [1288, 8942, 4545, 7588, 99, 242, 1417, 5504, 75, 457],
            backgroundColor: 'rgba(7, 83, 255, .5)',
            borderColor: 'rgba(7, 83, 255, 1)',
            borderWidth: 1
        }]
    }
});


var ctx = document.getElementById('myChart').getContext('2d');
var barTotalPopulationData = [22006299, 15834918, 14919501, 14919501, 14797756, 14433147];
var satu = [120000, 15000000, 1454210, 240124, 3358452];
var dua = [5024554, 2001424, 4454201, 4565420, 5659888];
var labels = ["Jakarta", "Surabaya", "Bandung", "Semarang", "Bantul"];

var myChart = new Chart(ctx, {
    type: 'bar',
    data: {
        labels: labels, 
        datasets:[{
            label: 'Penduduk',
            data: barTotalPopulationData,
            backgroundColor: [
                'rgba(255, 99, 132, 0.2)',
                'rgba(54, 162, 235, 0.2)',
                'rgba(255, 206, 86, 0.2)',
                'rgba(75, 192, 192, 0.2)',
                'rgba(153, 102, 255, 0.2)'
            ],
            borderWidth:1
        },
        {
            label: 'Satu',
            data: satu,
            backgroundColor: '#f443368c',
            borderColor: '#f443368c',

            borderWidth: 1,
            type: 'line',
            fill: false
        },
        {
            label: 'Dua',
            data: dua,
            backgroundColor: '#2196f38c',
            borderColor: '#2196f38c',

            borderWidth: 1,
            type: 'line',
            fill: false
        }]
    },
    options: {
        responsive: true,
        maintainAspectRatio: true,
    }
});