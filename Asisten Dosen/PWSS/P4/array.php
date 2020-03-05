<?php
    $hobbies = ['Basketball', 'Football', 'Badminton', 'Volly', 'Yoga'];
    $months = ['Jan', 'Feb', 'Mar','Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'];
    $days = [];
    $years = [];
    for($day=1;$day<=31; $day++){
        array_push($days, $day);
    }
    for($year=2025;$year>=1990; $year--){
        array_push($years, $year);
    }
    
?>