var GKChart = document.getElementById('Canvasnya').getContext('2d');
var dataChart = new Chart(GKChart, {
    type: 'bar',
    data: {
        labels: ['Jakarta', 'Surabaya', 'Medan', 'Bandung', 'Makasar', 'Semarang'],
        datasets: [{
            label: 'Populasi',
            data: [4647383, 2917688, 2499838, 2440717, 1671001, 1667131],
            backgroundColor: [
                'rgba(255, 99, 132, 1)',
                'rgba(54, 162, 235, 1)',
                'rgba(255, 206, 86, 1)',
                'rgba(75, 192, 192, 1)',
                'rgba(153, 102, 255, 1)',
                'rgba(255, 159, 64, 1)'
            ],
        }]
    }
});


//Tugas
var GKChart = document.getElementById('Tugas').getContext('2d');
var dataChart = new Chart(GKChart, {
    type: 'bar',
    data: {
        labels: ['Facebook', 'YouTube', 'Instagram', 'WeChat', 'Tumblr', 'TikTok', 'Weibo', 'Google+', 'Reddit', 'Twitter', 'Pinterest' ],
        datasets: [{
            label: 'Social Media Users, 2018',
            data: [2260000000, 1900000000, 1000000000, 1000000000, 624000000, 500000000, 431000000, 430000000, 355000000, 329500000, 246500000],
            backgroundColor: [
                'rgba(255, 99, 132, 1)',
                'rgba(54, 162, 235, 1)',
                'rgba(255, 206, 86, 1)',
                'rgba(75, 192, 192, 1)',
                'rgba(153, 102, 255, 1)',
                'rgba(255, 159, 64, 1)',
                'rgba(255, 102, 39, 1)',
                'rgba(20, 200, 90, 1)',
                'rgba(100, 50, 100, 1)',
                'rgba(50, 100, 40, 1)',
                'rgba(90, 172, 192, 1)',
            ],
        }]
    }
});